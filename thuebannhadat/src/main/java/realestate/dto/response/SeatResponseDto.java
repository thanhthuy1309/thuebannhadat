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

import java.util.List;


/**
 * @author : thuyttt
 * @PG_ID : SeatResponseDto
 * @createDate : 10.08.2016
 */
public class SeatResponseDto extends BaseResponseDto {
  private String customerId;
  private Integer seatId;
  private boolean stateSeat;
  private Integer seatValue;
  private Integer matchId;
  private boolean flagNew;
  private List<String> arrRemove;

  /**
   * @return the seatId
   */
  public Integer getSeatId() {
    return seatId;
  }

  /**
   * @param seatId
   *          the seatId to set
   */
  public void setSeatId(Integer seatId) {
    this.seatId = seatId;
  }

  /**
   * @return the stateSeat
   */
  public boolean isStateSeat() {
    return stateSeat;
  }

  /**
   * @param stateSeat
   *          the stateSeat to set
   */
  public void setStateSeat(boolean stateSeat) {
    this.stateSeat = stateSeat;
  }

  /**
   * @return the customerId
   */
  public String getCustomerId() {
    return customerId;
  }

  /**
   * @param customerId
   *          the customerId to set
   */
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   * @return the seatValue
   */
  public Integer getSeatValue() {
    return seatValue;
  }

  /**
   * @param seatValue
   *          the seatValue to set
   */
  public void setSeatValue(Integer seatValue) {
    this.seatValue = seatValue;
  }

  /**
   * @return the matchId
   */
  public Integer getMatchId() {
    return matchId;
  }

  /**
   * @param matchId
   *          the matchId to set
   */
  public void setMatchId(Integer matchId) {
    this.matchId = matchId;
  }

  /**
   * @return the flagNew
   */
  public boolean isFlagNew() {
    return flagNew;
  }

  /**
   * @param flagNew the flagNew to set
   */
  public void setFlagNew(boolean flagNew) {
    this.flagNew = flagNew;
  }

  /**
   * @return the arrRemove
   */
  public List<String> getArrRemove() {
    return arrRemove;
  }

  /**
   * @param arrRemove the arrRemove to set
   */
  public void setArrRemove(List<String> arrRemove) {
    this.arrRemove = arrRemove;
  }

}
