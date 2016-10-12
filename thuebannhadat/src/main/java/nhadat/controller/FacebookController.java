package nhadat.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.scribejava.apis.FacebookApi;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Token;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.model.Verifier;
import com.github.scribejava.core.oauth.OAuthService;

@Controller
@RequestMapping(value = "/facebook")
public class FacebookController {

  private static final String YOUR_API_KEY = "1746218202296248";
  private static final String YOUR_API_SECRET = "a2ed17e49edc064dc88450098f722616";

  private static final String HOST = "http://localhost:8080/thuebannhadat";
  private static final String CALLBACK_URL = "/facebook/callback";
  private static final Token EMPTY_TOKEN = null;

  //API End point
  private static final String USER_PROFILE_API = "https://graph.facebook.com/v2.5/me";
  private static final String QUERY = "?fields=id,name,first_name,last_name,gender,birthday,email";

  @RequestMapping(value ="/signin", method = RequestMethod.GET)
  public void signin(HttpServletRequest request, HttpServletResponse response) throws IOException {

    String secretState = "secret" + new Random().nextInt(999_999);
    request.getSession().setAttribute("SECRET_STATE", secretState);

    OAuthService service = new ServiceBuilder()
      .provider(FacebookApi.class)
      .apiKey(YOUR_API_KEY)
      .apiSecret(YOUR_API_SECRET)
      .callback(HOST + CALLBACK_URL)
      .scope("public_profile user_birthday email")
      .state(secretState)
      .grantType("code")
      .connectTimeout(10)
      .build();

    String redirectURL = service.getAuthorizationUrl(EMPTY_TOKEN);

    response.sendRedirect(redirectURL);
  }

  @RequestMapping(value ="/callback", method = RequestMethod.GET)
  public String callback(@RequestParam(value = "code", required = false) String code,
      @RequestParam(value = "state", required = false) String state,
      HttpServletRequest request, HttpServletResponse response, Model model) {

    OAuthService service = new ServiceBuilder()
      .provider(FacebookApi.class)
      .apiKey(YOUR_API_KEY)
      .apiSecret(YOUR_API_SECRET)
      .callback(HOST + CALLBACK_URL)
      .build();

    final String requestUrl = USER_PROFILE_API + QUERY;

    final Verifier verifier = new Verifier(code);
    final Token accessToken = service.getAccessToken(EMPTY_TOKEN, verifier);

    final OAuthRequest oauthRequest = new OAuthRequest(Verb.GET, requestUrl, service);
    service.signRequest(accessToken, oauthRequest);

    final Response resourceResponse = oauthRequest.send();

    final JSONObject obj = new JSONObject(resourceResponse.getBody());

    String facdebookId = obj.getString("id");
    String name = obj.getString("name");
    String email = obj.getString("email");

    model.addAttribute("id", facdebookId);
    model.addAttribute("name", name);
    model.addAttribute("email", email);

    request.getSession().setAttribute("FACEBOOK_ACCESS_TOKEN", accessToken);

    return "detailgoogle";
  }

}