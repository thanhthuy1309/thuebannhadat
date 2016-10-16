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
import realestate.entity.NguoiDung;
import realestate.service.SmsService;
import realestate.service.UserService;
import realestate.utils.StringUtils;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

  @Autowired
  private UserService userService;

  @Autowired
  private SmsService smsService;

  /** Init messages. */
  private ResourceBundle messages = ResourceBundle.getBundle("messages");

  /* START: register_social_step_1 */

  /**
   * khi bam nut huy o dang ky buoc 1
   * 
   * @param registerSocialDto
   * @param session
   * @return trang chu
   */
  @RequestMapping(value = "/registerStep1Cancel", method = RequestMethod.POST)
  public String registerStep1Cancel(@ModelAttribute("registerSocialDto")
  RegisterSocialDto registerSocialDto, HttpSession session) {

    registerSocialDto.setDienThoai(null);
    NguoiDung nguoiDung = userService.registerSocial(registerSocialDto);
    session.setAttribute("nguoiDung", nguoiDung);

    return "redirect:/trangchu";
  }

  /**
   * khi bam nut chap nhan o dang ky buoc 1
   * 
   * @param registerSocialDto
   * @param session
   * @param model
   * @return dang ky theo ma xa hoi buoc 2
   */
  @RequestMapping(value = "/registerStep1Approve", method = RequestMethod.POST)
  public String registerStep1Approve(@ModelAttribute("registerSocialDto")
  RegisterSocialDto registerSocialDto, HttpSession session, Model model) {

    String maCodeKichHoat = StringUtils.randomKey(5);
    // gui ma code den sdt
    boolean isSend = smsService.sendSmsCodeRegister(registerSocialDto.getDienThoai(), maCodeKichHoat);

    if (isSend) {
      registerSocialDto.setSoCodeKichHoat(1);
      registerSocialDto.setMaCodeKichHoat(maCodeKichHoat);

      NguoiDung nguoiDung = userService.registerSocial(registerSocialDto);

      registerSocialDto.setIdNguoiDung(nguoiDung.getIdNguoiDung());
      model.addAttribute("registerSocialDto", nguoiDung.getIdNguoiDung());

      return "register_social_step_2";
    } else {
      model.addAttribute("error", messages.getString("MSG.ERROR_PHONE"));
      model.addAttribute("registerSocialDto", registerSocialDto);

      return "register_social_step_1";
    }
  }

  /* END: register_social_step_1 */

  /* START: register_social_step_2 */
  
  /**
   * khi bam nut lay lai mat khau
   * 
   * @param registerSocialDto
   * @param session
   * @return
   */
  @RequestMapping(value = "/getCodeAgain", method = RequestMethod.POST)
  public String getCodeAgain(@ModelAttribute("registerSocialDto")
  RegisterSocialDto registerSocialDto, HttpSession session, Model model) {

    model.addAttribute("registerSocialDto", new RegisterSocialDto(registerSocialDto.getEmail(), registerSocialDto.getHoTen()));
    return "register_social_step_1";
  }

  /**
   * khi bam nut gu ma code
   * 
   * @param registerSocialDto
   * @param session
   * @return
   */
  @RequestMapping(value = "/submitCode", method = RequestMethod.POST)
  public String submitCode(@ModelAttribute("registerSocialDto")
  RegisterSocialDto registerSocialDto, HttpSession session, Model model) {

    NguoiDung nguoiDung = userService.getUserByID(registerSocialDto.getIdNguoiDung());
    if (nguoiDung.getMaCodeKichHoat().equals(registerSocialDto.getMaCodeKichHoat())) {
      session.setAttribute("nguoiDung", nguoiDung);
      return "register_social_step_3";
    }
    model.addAttribute("registerSocialDto", new RegisterSocialDto(registerSocialDto.getEmail(), registerSocialDto.getHoTen()));
    return "register_social_step_1";

  }
  /* END: register_social_step_2 */

}
