package realestate.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.scribejava.apis.GoogleApi20;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth20Service;
import com.github.scribejava.core.oauth.OAuthService;

import realestate.entity.NguoiDung;
import realestate.service.UserService;

@Controller
@RequestMapping(value = "/google")
public class GoogleController {

  @Autowired
  private UserService userService;

  private static final String API_KEY = "328338891021-gbve64t0s6agm7avid0vj4omb7i85286.apps.googleusercontent.com";
  private static final String API_SECRET = "W60sDp2j-m2ywaZrXA_cwSgJ";

  private static final String HOST = "http://localhost:8080/thuebannhadat";
  private static final String CALLBACK_URL = "/google/callback";

  private static final String USER_PROFILE_API = "https://www.googleapis.com/oauth2/v1/userinfo";
  private static final String QUERY = "?fields=id,name,email";

  @RequestMapping(value = "/signin", method = RequestMethod.GET)
  public void signin(HttpServletRequest request, HttpServletResponse response) throws IOException {

    String secretState = "secret" + new Random().nextInt(999_999);
    request.getSession().setAttribute("SECRET_STATE", secretState);

    OAuthService service = new ServiceBuilder().apiKey(API_KEY).apiSecret(API_SECRET).callback(HOST + CALLBACK_URL)
        .scope("profile email").state(secretState).connectTimeout(10).build(GoogleApi20.instance());

    String redirectURL = ((OAuth20Service) service).getAuthorizationUrl();

    response.sendRedirect(redirectURL);
  }

  @RequestMapping(value = "/callback", method = RequestMethod.GET)
  public String callback(@RequestParam(value = "code") String code, @RequestParam(value = "state") String state,
      HttpServletRequest request, HttpServletResponse response, Model model, HttpSession session) throws IOException {
    if (code != null) {
      OAuthService service = new ServiceBuilder().apiKey(API_KEY).apiSecret(API_SECRET).callback(HOST + CALLBACK_URL)
          .build(GoogleApi20.instance());

      String requestUrl = USER_PROFILE_API + QUERY;

      OAuth2AccessToken accessToken = ((OAuth20Service) service).getAccessToken(code);

      final OAuthRequest oauthRequest = new OAuthRequest(Verb.GET, requestUrl, service);
      ((OAuth20Service) service).signRequest(accessToken, oauthRequest);

      final Response resourceResponse = oauthRequest.send();

      final JSONObject obj = new JSONObject(resourceResponse.getBody());

      String googleid = obj.getString("id");
      String name = obj.getString("name");
      String email = obj.getString("email");

      NguoiDung nguoiDung = userService.getUserByEmail(email);

      if (nguoiDung == null) {
        session.setAttribute("name", name);
        session.setAttribute("email", email);
        return "redirect:/register_social_step_1";
      } else {
        session.setAttribute("nguoiDung", nguoiDung);
      }

      request.getSession().setAttribute("GOOGLE_ACCESS_TOKEN", accessToken);

      return "redirect:/register_social_step_1";
    }
    return "redirect:/index";
  }
}
