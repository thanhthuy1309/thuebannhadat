/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

import realestate.entity.PK.Street_PK;

/**
 * @author : DungPT
 * @PG_ID : (Street)Duong
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_street")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@IdClass(Street_PK.class)
@Where(clause = "status = 1")
public class Street implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idDuong **/
  @Id
  @Column(name = "street_id", nullable = false, length = 250)
  private String streetId;

  /** Init idQuanHuyen **/
  @Id
  @Column(name = "district_id", nullable = false, length = 250)
  private String districtId;

  @Id
  @Column(name = "city_id", nullable = false, length = 250)
  private String cityId;

  /** Init tenDuong **/
  @Column(name = "street_name", length = 250, nullable = false)
  private String streetName;

  /** Init trangThai **/
  @Column(name = "status", length = 1, nullable = false, columnDefinition = "TINYINT(1) UNSIGNED DEFAULT 0")
  private Integer status;

  /** Init quanHuyen **/
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumns({
      @JoinColumn(name = "city_id", referencedColumnName = "city_id", insertable = false, updatable = false),
      @JoinColumn(name = "district_id", referencedColumnName = "district_id", insertable = false, updatable = false) })
  private District district;

  public String getStreetId() {
    return streetId;
  }

  public void setStreetId(String streetId) {
    this.streetId = streetId;
  }

  public String getDistrictId() {
    return districtId;
  }

  public void setDistrictId(String districtId) {
    this.districtId = districtId;
  }

  public String getCityId() {
    return cityId;
  }

  public void setCityId(String cityId) {
    this.cityId = cityId;
  }

  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public District getDistrict() {
    return district;
  }

  public void setDistrict(District district) {
    this.district = district;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
