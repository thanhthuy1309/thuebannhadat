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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

/**
 * @author : DungPT
 * @PG_ID : City(ThanhPho)
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_city")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class City implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idThanhPho **/
  @Id
  @Column(name = "city_id", nullable = false, length = 250)
  private String cityId;

  /** Init tenThanhPho **/
  @Column(name = "city_name", length = 250, nullable = false)
  private String cityName;

  /** Init trangThai **/
  @Column(name = "status", length = 1, nullable = false, columnDefinition = "TINYINT(1) UNSIGNED DEFAULT 0")
  private Integer status;

  /** Init listQuanHuyen **/
  @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = District.class)
  private List<District> districtList;

  /** Init thuTu **/
  @Column(name = "city_order", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer cityOrder;

  public String getCityId() {
    return cityId;
  }

  public void setCityId(String cityId) {
    this.cityId = cityId;
  }

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public List<District> getDistrictList() {
    return districtList;
  }

  public void setDistrictList(List<District> districtList) {
    this.districtList = districtList;
  }

  public Integer getCityOrder() {
    return cityOrder;
  }

  public void setCityOrder(Integer cityOrder) {
    this.cityOrder = cityOrder;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
