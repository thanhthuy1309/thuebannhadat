/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package nhadat.constants;

import java.util.Properties;

import nhadat.utils.FileUtils;

/**
 * @author : DungPT
 * @PG_ID : ValidStatusEnum
 * @createDate : 16.08.2016
 */
public class ValueConstants {

  public static final Properties CONFIG_PROPS = FileUtils.getProperties();

  /** The Constant CONST_DATE_FORMAT. */
  public static final String CONST_DATE_FORMAT = "dd/mm/yyyy";

  /** The Constant CONST_TIME_FORMAT. */
  public static final String CONST_TIME_FORMAT = "hh:mm";

  /** The Constant CONST_PRIVATE_KEY. */
  public static final String CONST_PRIVATE_KEY = "/keys/private.key";

  /** The Constant CONST_PUBLIC_KEY. */
  public static final String CONST_PUBLIC_KEY = "/keys/public.key";

  /** The Constant CONST_MD5_ALGORITHM. */
  public static final String CONST_MD5_ALGORITHM = "MD5";

  /** The Constant CONST_RSA_ALGORITHM. */
  public static final String CONST_RSA_ALGORITHM = "RSA";

  /** The Constant CONST_STATUS_VALUES_ON. */
  public static final Integer CONST_STATUS_VALUES_ON = 1;

  /** The Constant CONST_RESULT_STATUS_OK. */
  public static final String CONST_RESULT_STATUS_OK = "OK";

  /** The Constant CONST_RESULT_STATUS_NG. */
  public static final String CONST_RESULT_STATUS_NG = "NG";

  /** The Constant CONST_KEY_SERVER_PATH. */
  public static final String CONST_KEY_SERVER_PATH = CONFIG_PROPS.getProperty("server.path.url");

  /** Constant key parameters for sending email */
  public static final Integer CONST_HOUR_VALID_LINK_RESET_PASSWORD = 1;

  public static final String CONST_FROM_MAIL = CONFIG_PROPS.getProperty("mail.username");

  public static final String CONST_SUBJECT = CONFIG_PROPS.getProperty("mail.subject");

  public static final String CONST_CONTENT = CONFIG_PROPS.getProperty("mail.content");

  public static final String CONST_LINK_ACTIVE = CONFIG_PROPS.getProperty("mail.link.active");

  public static final String ALPHABET = "qwertyuiopasdfghjklzxcvbnm0123456789";

  /** The Constant CONST_ROLE_ADMIN */
  public static final int CONST_ROLE_ADMIN = 1;

  /** The Constant CONST_ROLE_USER */
  public static final int CONST_ROLE_USER = 2;
}
