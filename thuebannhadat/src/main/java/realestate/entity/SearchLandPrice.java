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
 * @PG_ID : SearchLandPrice(SearchGiaTin)
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_search_land_price")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class SearchLandPrice extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idSearchGiaTin **/
  @Id
  @Column(name = "search_land_price_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer searchLandPriceId;

  /** Init loaiGiaTin **/
  @Column(name = "search_land_price_value", nullable = false)
  private Long searchLandPriceValue;

  /** Init loaiGiaTin **/
  @Column(name = "search_land_price_name", nullable = false)
  private String searchLandPriceName;

  public Integer getSearchLandPriceId() {
    return searchLandPriceId;
  }

  public void setSearchLandPriceId(Integer searchLandPriceId) {
    this.searchLandPriceId = searchLandPriceId;
  }

  public Long getSearchLandPriceValue() {
    return searchLandPriceValue;
  }

  public void setSearchLandPriceValue(Long searchLandPriceValue) {
    this.searchLandPriceValue = searchLandPriceValue;
  }

  public String getSearchLandPriceName() {
    return searchLandPriceName;
  }

  public void setSearchLandPriceName(String searchLandPriceName) {
    this.searchLandPriceName = searchLandPriceName;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
