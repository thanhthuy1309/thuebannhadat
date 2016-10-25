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
 * @PG_ID : Bedroom(SoPhongNgu)
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_bedroom")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class Bedroom extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idSoPhongNgu **/
  @Id
  @Column(name = "bedroom_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer bedroomId;

  /** Init soPhongNgu **/
  @Column(name = "bedroom_amount", length = 10, nullable = false, unique = true)
  private String bedroomAmount;

  public Integer getBedroomId() {
    return bedroomId;
  }

  public void setBedroomId(Integer bedroomId) {
    this.bedroomId = bedroomId;
  }

  public String getBedroomAmount() {
    return bedroomAmount;
  }

  public void setBedroomAmount(String bedroomAmount) {
    this.bedroomAmount = bedroomAmount;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
