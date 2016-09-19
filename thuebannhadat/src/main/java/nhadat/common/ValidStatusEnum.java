/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package nhadat.common;

/**
 * @author : DungPT
 * @PG_ID : ValidStatusEnum
 * @createDate : 16.08.2016
 */
public enum ValidStatusEnum {

  FAILED(0), SUCCESSFUL(1);

  /** Init value. */
  private int value;

  /**
   * Instantiates a new valid status enum.
   *
   * @param value the value
   */
  private ValidStatusEnum(int value) {
    this.value = value;
  }

  /**
   * @return the value
   */
  public int getValue() {
    return this.value;
  }

  /**
   * @return the status
   */
  public String getStatus() {
    return name().toUpperCase();
  }
}
