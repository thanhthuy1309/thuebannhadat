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
 * @PG_ID : SearchLandArea(SearchDienTich)
 * @createDate : 21.08.2016
 */
@Entity
@Table(name = "tbl_search_land_area")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class SearchLandArea extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idSearchDienTich **/
  @Id
  @Column(name = "search_land_area_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer searchLandAreaId;

  /** Init loaiDienTich **/
  @Column(name = "search_land_area_value", nullable = false)
  private Float searchLandAreaValue;

  /** Init searchLandAreaName **/
  @Column(name = "search_land_area_name", nullable = false)
  private String searchLandAreaName;

  public Integer getSearchLandAreaId() {
    return searchLandAreaId;
  }

  public void setSearchLandAreaId(Integer searchLandAreaId) {
    this.searchLandAreaId = searchLandAreaId;
  }

  public Float getSearchLandAreaValue() {
    return searchLandAreaValue;
  }

  public void setSearchLandAreaValue(Float searchLandAreaValue) {
    this.searchLandAreaValue = searchLandAreaValue;
  }

  public String getSearchLandAreaName() {
    return searchLandAreaName;
  }

  public void setSearchLandAreaName(String searchLandAreaName) {
    this.searchLandAreaName = searchLandAreaName;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
