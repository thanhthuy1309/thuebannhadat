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

import java.text.MessageFormat;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import realestate.constants.ValueConstants;
import realestate.service.MailService;
import realestate.utils.FileUtils;
import realestate.utils.MD5Utils;
import realestate.utils.StringUtils;
import realestate.utils.Utils;

/**
 * @author : TA
 * @PG_ID : MailServiceImpl.java
 * @createDate : 08.08.2016
 */
@Service
public class MailServiceImpl implements MailService {

  private static final Logger LOGGER = Logger.getLogger(MailServiceImpl.class);

  @Autowired
  private JavaMailSender mailSender;

  public JavaMailSender getMailSender() {
    return mailSender;
  }

  /**
   * Send mail active user.
   *
   * @param customerName
   * @param customerId
   * @param toEmail
   * @param request
   * @param password
   * @return true, if successful
   */
  @Override
  public boolean sendMailActiveUser(String customerName, String customerId, String toEmail, String password,
      String token, HttpServletRequest request) {

    boolean isSent = false;

    if (!Utils.isEmptyString(customerId)) {

      try {
        StringBuilder url = new StringBuilder();
        url.append(StringUtils.getURLWithContextPath(request));
        url.append(ValueConstants.CONST_LINK_ACTIVE);
        url.append("customerId");
        url.append("=");
        url.append(customerId);
        url.append("&");
        url.append("token");
        url.append("=");
        url.append(token);
        url.append("&");
        url.append("toEmail");
        url.append("=");
        url.append(MD5Utils.encrypt(toEmail));

        StringBuilder body = new StringBuilder();
        body.append(MessageFormat.format(FileUtils.getProperties().getProperty("mail.content"), customerName, toEmail,
            password, url.toString()));

        isSent = this.sendMail(ValueConstants.CONST_FROM_MAIL, toEmail, ValueConstants.CONST_SUBJECT, body.toString());

      } catch (Exception e) {
        LOGGER.error("#sendMailActiveCustomer" + e);
      }
    }
    return isSent;
  }

  /**
   * Process send mail.
   *
   * @param fromEmail
   *          the from email
   * @param toEmail
   *          the to email
   * @param subject
   *          the subject
   * @param content
   *          the content
   * @return true, if successful
   */
  private boolean sendMail(String fromEmail, String toEmail, String subject, String content) {

    try {

      MimeMessage message = mailSender.createMimeMessage();
      message.setSubject(subject);
      MimeMessageHelper helper;
      helper = new MimeMessageHelper(message, true);
      helper.setFrom(fromEmail);
      helper.setTo(toEmail);
      helper.setText(content, true);

      // Send email
      mailSender.send(message);

      return true;
    } catch (Exception e) {
      LOGGER.error("Exception : ", e);
      return false;
    }
  }

}
