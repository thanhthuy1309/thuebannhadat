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
 * @PG_ID : Advertisement(QuangCao)
 * @createDate : 20.08.2016
 */
@Entity
@Table(name = "tbl_advertisement")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class Advertisement extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idQuangCao **/
  @Id
  @Column(name = "advertisement_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer advertisementId;

  /** Init urlWeb **/
  @Column(name = "advertisement_web_url", length = 250, nullable = false)
  private String advertisementWebUrl;

  /** Init urlHinhAnh **/
  @Column(name = "advertisement_image_url", length = 1000, nullable = false)
  private String advertisementImageUrl;

  /** Init tieude **/
  @Column(name = "advertisement_title", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
  private String advertisementTitle;

  public Integer getAdvertisementId() {
    return advertisementId;
  }

  public void setAdvertisementId(Integer advertisementId) {
    this.advertisementId = advertisementId;
  }

  public String getAdvertisementWebUrl() {
    return advertisementWebUrl;
  }

  public void setAdvertisementWebUrl(String advertisementWebUrl) {
    this.advertisementWebUrl = advertisementWebUrl;
  }

  public String getAdvertisementImageUrl() {
    return advertisementImageUrl;
  }

  public void setAdvertisementImageUrl(String advertisementImageUrl) {
    this.advertisementImageUrl = advertisementImageUrl;
  }

  public String getAdvertisementTitle() {
    return advertisementTitle;
  }

  public void setAdvertisementTitle(String advertisementTitle) {
    this.advertisementTitle = advertisementTitle;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
