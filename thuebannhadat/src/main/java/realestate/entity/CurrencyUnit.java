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
 * @PG_ID : (CurrencyUnit)DonViGia
 * @createDate : 21.08.2016
 */
@Entity
@Table(name = "tbl_currency_unit")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class CurrencyUnit extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idDonViGia **/
  @Id
  @Column(name = "currency_unit_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer currencyUnitId;

  /** Init tenDonViGia **/
  @Column(name = "currency_unit_name", length = 50, nullable = false)
  private String currencyUnitName;

  public Integer getCurrencyUnitId() {
    return currencyUnitId;
  }

  public void setCurrencyUnitId(Integer currencyUnitId) {
    this.currencyUnitId = currencyUnitId;
  }

  public String getCurrencyUnitName() {
    return currencyUnitName;
  }

  public void setCurrencyUnitName(String currencyUnitName) {
    this.currencyUnitName = currencyUnitName;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
