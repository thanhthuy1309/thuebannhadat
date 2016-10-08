/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package nhadat.utils;

import java.io.IOException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import nhadat.constants.ValueConstants;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author : DUNGPT
 * @PG_ID : StringUtils
 * @createDate : 05.08.2016
 */
public class StringUtils {

  /**
   * Convert object to json string
   * 
   * @param obj
   *          is object
   * @return string
   */
  public static String convertObjToJson(Object obj) {
    ObjectMapper mapper = new ObjectMapper();
    try {
      return mapper.writeValueAsString(obj);
    } catch (JsonGenerationException e) {
      e.printStackTrace();
    } catch (JsonMappingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return null;
  }

  /**
   * random ra mot chuoi ngau nhien
   * 
   * @param length
   *          chieu dai cua chuoi se generate
   * @return string
   */
  public static String randomString(int length) {
    SecureRandom rnd = new SecureRandom();
    StringBuilder sb = new StringBuilder(length);
    for (int i = 0; i < length; i++) {
      sb.append(ValueConstants.ALPHABET.charAt(rnd.nextInt(ValueConstants.ALPHABET.length())));
    }
    return sb.toString();
  }

  /**
   * bo ky tu dac biet thay bang -
   * 
   * @param title
   *          chuoi se duoc bo
   * @return string
   */
  public static String replaceTitleSpecial(String title) {
    String removeString = VNCharacterUtils.removeAccent(title);
    return (removeString.toLowerCase().replaceAll("đ", "d").replaceAll("[^a-zA-Z0-9\\s+]", "").replaceAll(" ", "-"));
  }

  /**
   * tao ra primary key tu title mau tin va generate length
   * 
   * @param title
   *          chuoi se duoc bo
   * @param length
   *          chieu dai cua chuoi se generate
   * @return string
   */
  public static String generateTitleKey(String title, int length) {
    StringBuilder result = new StringBuilder();
    result.append(replaceTitleSpecial(title));
    result.append("-");
    result.append(randomString(length));
    return result.toString();
  }

  /**
   * tao ten cua hinh anh khong bi trung
   * 
   * @param name
   *          ten cua hinh
   * @return string
   */
  public static String nameImage(String name) {

    StringBuilder result = new StringBuilder();

    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();
    result.append(randomUUIDString);
    result.append("-");

    Date dNow = new Date();
    SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss");
    result.append(ft.format(dNow));

    return result.toString();
  }
}
