/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

/**
 * @author : DungPT
 * @PG_ID : Transaction(GiaoDich)
 * @createDate : 09.01.2016
 */
@Entity
@Table(name = "tbl_transaction")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class Transaction extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idGiaoDich **/
  @Id
  @Column(name = "transaction_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer transactionId;

  @Column(name = "user_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  private Integer userId;

  /** Init idLoaiGiaoDich **/
  @Column(name = "transaction_type_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  private Integer transactionTypeId;

  /** Init tienGiaoDich **/
  @Column(name = "transaction_amount", columnDefinition = "INT(11) UNSIGNED DEFAULT 0")
  private Integer transactionAmount;

  /** Init tienNap **/
  @Column(name = "capital_amount", columnDefinition = "INT(11) UNSIGNED DEFAULT 0")
  private Integer capitalAmount;

  public Integer getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Integer transactionId) {
    this.transactionId = transactionId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getTransactionTypeId() {
    return transactionTypeId;
  }

  public void setTransactionTypeId(Integer transactionTypeId) {
    this.transactionTypeId = transactionTypeId;
  }

  public Integer getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(Integer transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public Integer getCapitalAmount() {
    return capitalAmount;
  }

  public void setCapitalAmount(Integer capitalAmount) {
    this.capitalAmount = capitalAmount;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
