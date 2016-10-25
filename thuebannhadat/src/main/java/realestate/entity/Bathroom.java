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
 * @PG_ID : Bathroom(SoToilet)
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_bathroom")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class Bathroom extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idSoToilet **/
  @Id
  @Column(name = "bathroom_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer bathroomId;

  /** Init soToilet **/
  @Column(name = "bathroom_amount", length = 10, nullable = false, unique = true)
  private String bathroomAmount;

  public Integer getBathroomId() {
    return bathroomId;
  }

  public void setBathroomId(Integer bathroomId) {
    this.bathroomId = bathroomId;
  }

  public String getBathroomAmount() {
    return bathroomAmount;
  }

  public void setBathroomAmount(String bathroomAmount) {
    this.bathroomAmount = bathroomAmount;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
