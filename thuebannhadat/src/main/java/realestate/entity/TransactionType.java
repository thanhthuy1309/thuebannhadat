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
 * @PG_ID : TransactionType(LoaiGiaoDich)
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_transaction_type")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class TransactionType extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idLoaiGiaoDich **/
  @Id
  @Column(name = "transaction_type_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer transactionTypeId;

  /** Init tenLoaiGiaoDich **/
  @Column(name = "transaction_type_name", length = 250, nullable = false)
  private String transactionTypeName;

  public Integer getTransactionTypeId() {
    return transactionTypeId;
  }

  public void setTransactionTypeId(Integer transactionTypeId) {
    this.transactionTypeId = transactionTypeId;
  }

  public String getTransactionTypeName() {
    return transactionTypeName;
  }

  public void setTransactionTypeName(String transactionTypeName) {
    this.transactionTypeName = transactionTypeName;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
