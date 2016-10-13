package realestate.controller;

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
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth20Service;
import com.github.scribejava.core.oauth.OAuthService;

@Controller
@RequestMapping(value = "/facebook")
public class FacebookController {

  private static final String API_KEY = "1746218202296248";
  private static final String API_SECRET = "a2ed17e49edc064dc88450098f722616";

  private static final String HOST = "http://localhost:8080/thuebannhadat";
  private static final String CALLBACK_URL = "/facebook/callback";

  // API End point
  private static final String USER_PROFILE_API = "https://graph.facebook.com/v2.8/me";
  private static final String QUERY = "?fields=id,name,first_name,last_name,gender,birthday,email";

  @RequestMapping(value = "/signin", method = RequestMethod.GET)
  public void signin(HttpServletRequest request, HttpServletResponse response) throws IOException {

    String secretState = "secret" + new Random().nextInt(999_999);
    request.getSession().setAttribute("SECRET_STATE", secretState);

    OAuthService service = new ServiceBuilder().apiKey(API_KEY).apiSecret(API_SECRET).callback(HOST + CALLBACK_URL)
        .scope("public_profile user_birthday email").state(secretState).connectTimeout(10)
        .build(FacebookApi.instance());

    String redirectURL = ((OAuth20Service) service).getAuthorizationUrl();

    response.sendRedirect(redirectURL);
  }

  @RequestMapping(value = "/callback", method = RequestMethod.GET)
  public String callback(@RequestParam(value = "code") String code,
      @RequestParam(value = "state") String state, HttpServletRequest request,
      HttpServletResponse response, Model model) throws IOException {
    if (code != null) {
      OAuthService service = new ServiceBuilder().apiKey(API_KEY).apiSecret(API_SECRET).callback(HOST + CALLBACK_URL)
          .build(FacebookApi.instance());

      final String requestUrl = USER_PROFILE_API + QUERY;

      OAuth2AccessToken accessToken = ((OAuth20Service) service).getAccessToken(code);

      final OAuthRequest oauthRequest = new OAuthRequest(Verb.GET, requestUrl, service);
      ((OAuth20Service) service).signRequest(accessToken, oauthRequest);

      final Response resourceResponse = oauthRequest.send();

      JSONObject obj = new JSONObject(resourceResponse.getBody());

      String facdebookId = obj.getString("id");
      String name = obj.getString("name");
      String email = obj.getString("email");

      model.addAttribute("id", facdebookId);
      model.addAttribute("name", name);
      model.addAttribute("email", email);

      request.getSession().setAttribute("FACEBOOK_ACCESS_TOKEN", accessToken);

      return "detailgoogle";
    }
    return "redirect:/index";
  }

}