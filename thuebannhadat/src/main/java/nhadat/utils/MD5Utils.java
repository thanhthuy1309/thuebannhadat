/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package nhadat.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import nhadat.constants.ValueConstants;

import org.apache.log4j.Logger;

/**
 * @author : DUNGPT
 * @PG_ID  : MD5Utils
 * @createDate : 03.08.2016
 */
public class MD5Utils {

  /** The Constant LOGGER. */
  public static final Logger LOGGER = Logger.getLogger(MD5Utils.class);

  /**
   * Use MD5 to encrypt a string
   *
   * @param value the value
   * @return the string
   */
  public static String encrypt(String text) {

    String result = null;
    try {

      MessageDigest messageDigest = MessageDigest.getInstance(ValueConstants.CONST_MD5_ALGORITHM);
      messageDigest.update(text.getBytes());

      byte[] byteData = messageDigest.digest();

      StringBuffer stringBuffer = new StringBuffer(500);
      for (int i = 0; i < byteData.length; i++) {
        stringBuffer.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
      }

      result = stringBuffer.toString();

    } catch (NoSuchAlgorithmException e) {
      LOGGER.error("#MD5Utils Enctypt", e);
    }

    return result;
  }
}
