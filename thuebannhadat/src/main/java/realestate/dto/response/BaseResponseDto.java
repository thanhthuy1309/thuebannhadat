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
package realestate.dto.response;

/**
 * @author : dungpt
 * @PG_ID : BaseResponseDto
 * @createDate : 05.08.2016
 */
public abstract class BaseResponseDto {

  private String status;

  private String message;

  /**
   * Get status
   * 
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Set status
   * 
   * @param status
   *          the status to set
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Get message
   * 
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Set message
   * 
   * @param message
   *          the message to set
   */
  public void setMessage(String message) {
    this.message = message;
  }
}
