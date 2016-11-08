/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.enumerator;

/**
 * @author : DungPT
 * @PG_ID : StatusRecordEnum
 * @createDate : 16.08.2016
 */
public enum StatusRecordEnum {

  INACTIVE(0), ACTIVE(1), DELETE(9);

  /** Init value. */
  private int value;

  /**
   * @param value
   *          the value
   */
  private StatusRecordEnum(int value) {
    this.value = value;
  }

  /**
   * @return the value
   */
  public int getValue() {
    return this.value;
  }
}
