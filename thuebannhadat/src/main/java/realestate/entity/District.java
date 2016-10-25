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
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

import realestate.entity.PK.District_PK;

/**
 * @author : DungPT
 * @PG_ID : District(QuanHuyen)
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_district")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@IdClass(District_PK.class)
@Where(clause = "status = 1")
public class District implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idQuanHuyen **/
  @Id
  @Column(name = "district_id", nullable = false, length = 250)
  private String districtId;

  @Id
  @Column(name = "city_id", nullable = false, length = 250)
  private String cityId;
  
  /** Init tenQuanHuyen **/
  @Column(name = "district_name", length = 250, nullable = false)
  private String districtName;

  /** Init trangThai **/
  @Column(name = "status", length = 1, nullable = false, columnDefinition = "TINYINT(1) UNSIGNED DEFAULT 0")
  private Integer status;

  /** Init thanhPho **/
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "city_id", referencedColumnName = "city_id" , insertable = false, updatable = false)
  private City city;

  /** Init listPhuongXa **/
  @OneToMany(mappedBy = "district", cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Ward.class)
  private List<Ward> wardList;

  /** Init listDuong **/
  @OneToMany(mappedBy = "district", cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Street.class)
  private List<Street> streetList;

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

  public String getDistrictName() {
    return districtName;
  }

  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public List<Ward> getWardList() {
    return wardList;
  }

  public void setWardList(List<Ward> wardList) {
    this.wardList = wardList;
  }

  public List<Street> getStreetList() {
    return streetList;
  }

  public void setStreetList(List<Street> streetList) {
    this.streetList = streetList;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
