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
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * @author : DUNGPT
 * @PG_ID  : FileUtils
 * @createDate : 03.08.2016
 */
public class FileUtils {

  protected static final Logger LOGGER = Logger.getLogger(FileUtils.class);

  /**
   * Gets the properties.
   *
   * @return the properties
   */
  public static Properties getProperties() {

    Properties properties = new Properties();
    try {
      InputStream inputStream = FileUtils.class.getResourceAsStream("/application.properties");
      properties.load(inputStream);
    } catch (IOException e) {
      LOGGER.error("#getProperties: " + e);
      return null;
    }
    return properties;
  }
}
