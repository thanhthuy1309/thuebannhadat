/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package nhadat.utils;

import java.text.Normalizer;
import java.util.regex.Pattern;

/**
 * @author : DUNGPT
 * @PG_ID : VNCharacterUtils
 * @createDate : 20.08.2016
 */
public class VNCharacterUtils {
  /**
   * Bo dau 1 chuoi
   * 
   * @param s
   * @return
   */
  public static String removeAccent(String s) {
    String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
    Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    return pattern.matcher(temp).replaceAll("");
  }
}
