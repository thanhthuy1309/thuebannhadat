package realestate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import realestate.dto.RegisterSocialDto;
import realestate.service.UserService;

public class RegisterController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/registerSocial", method = RequestMethod.POST)
  public String registerSocial(@ModelAttribute("registerSocialDto") RegisterSocialDto registerSocialDto) {
    
    
    return "redirect:/trangchu";
  }
}
