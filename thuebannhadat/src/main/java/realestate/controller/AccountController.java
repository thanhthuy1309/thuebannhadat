package realestate.controller;

import java.util.ResourceBundle;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import realestate.dao.impl.UserDaoImpl;
import realestate.entity.NguoiDung;
import realestate.service.SmsService;
import realestate.service.UserService;

@Controller
public class AccountController {

  /** Init logger. */
  private static Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

  @Autowired
  private UserService userService;

  @Autowired
  private SmsService smsService;

  /** Init messages. */
  private ResourceBundle messages = ResourceBundle.getBundle("messages");

  public static void main(String[] args) {
    logger.info("aa");
  }
  /* START: account */

  /**
   * di chuyen den man hinh tai khoan
   * 
   * @param session
   * @param model
   * @return
   */
  @RequestMapping(value = "/taikhoan", method = RequestMethod.GET)
  public String trangtaikhoan(HttpSession session, Model model) {
    NguoiDung nguoiDung = (NguoiDung) session.getAttribute("nguoiDung");

    if (nguoiDung != null) {
      model.addAttribute("nguoiDung", nguoiDung);
      return "account";
    }
    return "redirect:/trangchu";
  }
}
