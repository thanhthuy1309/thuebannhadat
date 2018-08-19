/*
 * Copyright(C) 2016 GMO-Z.com RUNSYSTEM JSC. All rights reserved.
 *
 * (1)このソフトウェアは、GMO株式会社に帰属する機密情報 であり開示を固く禁じます。
 * (2)この情報を使用するには、GMO株式会社とのライセンス 契約が必要となります。
 *
 * This software is the confidential and proprietary information of
 * GMO-Z.com RUNSYSTEM. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with GMO-Z.com RUNSYSTEM.
 */
package realestate.controller;

import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : dungpt
 * @PG_ID : ErrorController
 * @createDate : 11.08.2016
 */
@Controller
@RequestMapping(value = ErrorController.ERROR_URL)
public class ErrorController {

  /** The constant ERROR_URL. */
  public static final String ERROR_URL = "/error";

  /** The constant TILE_ERROR. */
  public static final String TILE_ERROR = "error";

  /** Init messages. */
  private ResourceBundle messages = ResourceBundle.getBundle("messages");

  private static final Logger LOGGER = Logger.getLogger(ErrorController.class);

  /**
   * Page Not Found.
   * 
   * @return Home Page
   */
  @RequestMapping(value = "/404")
  public ModelAndView notFound() {
    ModelAndView model = new ModelAndView(TILE_ERROR);
    model.addObject("message", "Đường dẫn không tồn tại");
    return model;
  }

  /**
   * Error page.
   * 
   * @return the model and view
   */
  @RequestMapping(value = "/400")
  public ModelAndView errorPage() {
    ModelAndView model = new ModelAndView(TILE_ERROR);
    model.addObject("message", "Đường dẫn không tồn tại");
    return model;
  }

  /**
   * not support page.
   * 
   * @return the model and view
   */
  @RequestMapping(value = "/405")
  public ModelAndView notSupport() {
    ModelAndView model = new ModelAndView(TILE_ERROR);
    model.addObject("message", "Đường dẫn không tồn tại");

    return model;
  }
}
