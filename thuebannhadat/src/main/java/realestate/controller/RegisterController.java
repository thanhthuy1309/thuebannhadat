package realestate.controller;

import java.util.ResourceBundle;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import realestate.common.ValidStatusEnum;
import realestate.dto.RegisterSocialDto;
import realestate.entity.NguoiDung;
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

    registerSocialDto.setDienThoai(null);
    registerSocialDto.setTrangThai(ValidStatusEnum.NOACTICEPHONE.getValue());
    NguoiDung nguoiDung = userService.registerSocial(registerSocialDto);
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

    String maCodeKichHoat = StringUtils.randomKey(5);
    // gui ma code den sdt
    // boolean isSend = smsService.sendSmsCodeRegister(
    // registerSocialDto.getDienThoai(), maCodeKichHoat);
    boolean isSend = true;

    if (isSend) {
      registerSocialDto.setSoCodeKichHoat(0);
      registerSocialDto.setMaCodeKichHoat(maCodeKichHoat);
      registerSocialDto.setTrangThai(ValidStatusEnum.NOACTICEPHONE.getValue());

      NguoiDung nguoiDung = userService.registerSocial(registerSocialDto);

      registerSocialDto.setIdNguoiDung(nguoiDung.getIdNguoiDung());
      model.addAttribute("idNguoiDung", nguoiDung.getIdNguoiDung());

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

    NguoiDung nguoiDung = userService.getUserByID(registerSocialDto.getIdNguoiDung());

    if (nguoiDung.getMaCodeKichHoat().equals(registerSocialDto.getMaCodeKichHoat())) {

      Integer soCodeKichHoat = nguoiDung.getSoCodeKichHoat();
      nguoiDung.setSoCodeKichHoat(soCodeKichHoat + 1);
      nguoiDung.setTrangThai(ValidStatusEnum.SUCCESSFUL.getValue());
      
      userService.activateUser(nguoiDung);

      session.setAttribute("nguoiDung", nguoiDung);
      return "dang-ky-xa-hoi-buoc-3";
    }
    model.addAttribute("registerSocialDto",
        new RegisterSocialDto(registerSocialDto.getEmail(), registerSocialDto.getHoTen()));
    return "dang-ky-xa-hoi-buoc-1";

  }
  /* END: dang-ky-xa-hoi-buoc-2 */

}
