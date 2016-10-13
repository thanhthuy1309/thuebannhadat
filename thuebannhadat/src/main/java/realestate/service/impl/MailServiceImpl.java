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
package realestate.service.impl;

import realestate.constants.ValueConstants;
import realestate.service.MailService;
import realestate.utils.RSAUtils;
import realestate.utils.Utils;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @author : TA
 * @PG_ID  : MailServiceImpl.java
 * @createDate : 08.08.2016
 */
@Service
public class MailServiceImpl implements MailService {

  protected static final Logger LOGGER = Logger.getLogger(MailServiceImpl.class);

  @Autowired
  private JavaMailSender mailSender;

  public JavaMailSender getMailSender() {
    return mailSender;
  }

  @Override
  public boolean sendMailActiveUser(String customerId, String toEmail) {

    boolean isSent = false;

    if (!Utils.isEmptyString(customerId)) {

      try {
        StringBuilder body = new StringBuilder();
        body.append(ValueConstants.CONST_CONTENT);
        body.append("\n");
        body.append(ValueConstants.CONST_KEY_SERVER_PATH);
        body.append(ValueConstants.CONST_LINK_ACTIVE);
        body.append("customerId");
        body.append("=");
        body.append(RSAUtils.encrypt(customerId));
        body.append("&");
        body.append("toEmail");
        body.append("=");
        body.append(RSAUtils.encrypt(toEmail));
  
        isSent = this.sendMail(ValueConstants.CONST_FROM_MAIL, toEmail, ValueConstants.CONST_SUBJECT, body.toString());

      } catch(Exception e) {
        LOGGER.error("#sendMailActiveCustomer" + e);
      }
    }
    return isSent;
  }


  /**
   * Process send mail.
   *
   * @param fromEmail the from email
   * @param toEmail the to email
   * @param subject the subject
   * @param content the content
   * @return true, if successful
   */
  private boolean sendMail(String fromEmail, String toEmail, String subject, String content) {

    try {
      // Set content for email
      SimpleMailMessage message = new SimpleMailMessage();
      message.setFrom(fromEmail);
      message.setTo(toEmail);
      message.setSubject(subject);
      message.setText(content);
      message.setReplyTo(fromEmail);

      // Send email
      mailSender.send(message);
      return true;
    } catch (Exception e) {
      LOGGER.error("Exception : ", e);
      return false;
    }
  }
}
