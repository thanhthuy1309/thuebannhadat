package realestate.controller;

import java.util.ResourceBundle;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import realestate.dto.RegisterSocialDto;
import realestate.entity.User;
import realestate.enumerator.ValidStatusEnum;
import realestate.service.SmsService;
import realestate.service.UserService;
import realestate.utils.StringUtils;

@Controller
public class RegisterController {

  @Autowired
  private UserService userService;

  @Autowired
  private SmsService smsService;

  /** Init messages. */
  private ResourceBundle messages = ResourceBundle.getBundle("messages");

  /* START: dang-ky-xa-hoi-buoc-1 */

  /**
   * 
   * @param session
   * @param model
   * @return dang-ky-xa-hoi-buoc-1
   */
  @RequestMapping(value = "/dang-ky-xa-hoi-buoc-1", method = RequestMethod.GET)
  public String registerSocialStep_1(HttpSession session, Model model) {
    String email = (String) session.getAttribute("email");
    String name = (String) session.getAttribute("name");

    if (!email.equals("") && !name.equals("")) {
      model.addAttribute("registerSocialDto", new RegisterSocialDto(email, name));
      return "dang-ky-xa-hoi-buoc-1";
    }
    return "redirect:/trang-chu";
  }

  /**
   * khi bam nut huy o dang ky buoc 1
   * 
   * @param registerSocialDto
   * @param session
   * @return trang chu
   */
  @RequestMapping(value = "/huy-dang-ky", method = RequestMethod.POST)
  public String registerStep1Cancel(@ModelAttribute("registerSocialDto")
  RegisterSocialDto registerSocialDto, HttpSession session) {

    registerSocialDto.setUserPhone(null);
    registerSocialDto.setStatus(ValidStatusEnum.NOACTICEPHONE.getValue());
    User nguoiDung = userService.registerSocial(registerSocialDto);
    session.setAttribute("nguoiDung", nguoiDung);

    return "redirect:/trang-chu";
  }

  /**
   * khi bam nut chap nhan o dang ky buoc 1
   * 
   * @param registerSocialDto
   * @param session
   * @param model
   * @return dang ky theo ma xa hoi buoc 2
   */
  @RequestMapping(value = "/xac-nhan", method = RequestMethod.POST)
  public String registerStep1Approve(@ModelAttribute("registerSocialDto")
  RegisterSocialDto registerSocialDto, HttpSession session, Model model) {

    String ActivationCode = StringUtils.randomKey(5);
    // gui ma code den sdt
    // boolean isSend = smsService.sendSmsCodeRegister(
    // registerSocialDto.getUserPhone(), ActivationCode);
    boolean isSend = true;

    if (isSend) {
      registerSocialDto.setActivationCodeTimes(0);
      registerSocialDto.setActivationCode(ActivationCode);
      registerSocialDto.setStatus(ValidStatusEnum.NOACTICEPHONE.getValue());

      User nguoiDung = userService.registerSocial(registerSocialDto);

      registerSocialDto.setUserId(nguoiDung.getUserId());
      model.addAttribute("UserId", nguoiDung.getUserId());

      return "dang-ky-xa-hoi-buoc-2";
    } else {
      model.addAttribute("error", messages.getString("MSG.ERROR_PHONE"));
      model.addAttribute("registerSocialDto", registerSocialDto);

      return "dang-ky-xa-hoi-buoc-1";
    }
  }

  /* END: dang-ky-xa-hoi-buoc-1 */

  /* START: dang-ky-xa-hoi-buoc-2 */

  /**
   * khi bam nut lay lai ma
   * 
   * @param registerSocialDto
   * @param session
   * @return
   */
  @RequestMapping(value = "/lay-lai-ma", method = RequestMethod.POST)
  public String getCodeAgain(@ModelAttribute("registerSocialDto")
  RegisterSocialDto registerSocialDto, HttpSession session, Model model) {
    String email = (String) session.getAttribute("email");
    String name = (String) session.getAttribute("name");

    if (!email.equals("") && !name.equals("")) {
      model.addAttribute("registerSocialDto", new RegisterSocialDto(email, name));
      return "dang-ky-xa-hoi-buoc-1";
    }
    return "redirect:/trang-chu";
  }

  /**
   * khi bam nut gu ma code
   * 
   * @param registerSocialDto
   * @param session
   * @return
   */
  @RequestMapping(value = "/gui-ma", method = RequestMethod.POST)
  public String submitCode(@ModelAttribute("registerSocialDto")
  RegisterSocialDto registerSocialDto, HttpSession session, Model model) {

    User nguoiDung = userService.findByPK(registerSocialDto.getUserId());

    if (nguoiDung.getActivationCode().equals(registerSocialDto.getActivationCode())) {

      Integer ActivationCodeTimes = nguoiDung.getActivationCodeTimes();
      nguoiDung.setActivationCodeTimes(ActivationCodeTimes + 1);
      nguoiDung.setStatus(ValidStatusEnum.SUCCESSFUL.getValue());

      userService.activateUser(nguoiDung);

      session.setAttribute("nguoiDung", nguoiDung);
      return "dang-ky-xa-hoi-buoc-3";
    }
    model.addAttribute("registerSocialDto",
        new RegisterSocialDto(registerSocialDto.getUserEmail(), registerSocialDto.getUserName()));
    return "dang-ky-xa-hoi-buoc-1";

  }
  /* END: dang-ky-xa-hoi-buoc-2 */

}
