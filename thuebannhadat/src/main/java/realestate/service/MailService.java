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
package realestate.service;

import javax.servlet.http.HttpServletRequest;


/**
 * @author : TA
 * @PG_ID  : MailService
 * @createDate : 08.08.2016
 */
public interface MailService {

  /**
   * Send mail active user.
   *
   * @param email the email
   * @return true, if successful
   */
  public boolean sendMailActiveUser(String customerName, String customerId, String toEmail, String password,
      String token, HttpServletRequest request);
}
