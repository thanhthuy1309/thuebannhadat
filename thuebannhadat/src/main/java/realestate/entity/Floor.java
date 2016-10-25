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
 * @PG_ID : Floor(SoTang)
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_floor")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class Floor extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idSoTang **/
  @Id
  @Column(name = "floor_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer floorId;

  /** Init soTang **/
  @Column(name = "floor_amount", length = 10, nullable = false, unique = true)
  private String floorAmount;

  public Integer getFloorId() {
    return floorId;
  }

  public void setFloorId(Integer floorId) {
    this.floorId = floorId;
  }

  public String getFloorAmount() {
    return floorAmount;
  }

  public void setFloorAmount(String floorAmount) {
    this.floorAmount = floorAmount;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

}
