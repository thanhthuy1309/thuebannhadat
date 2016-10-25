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
 * @PG_ID : PostExpiration(ThoiHanTin)
 * @createDate : 21.08.2016
 */
@Entity
@Table(name = "tbl_post_expiration")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class PostExpiration extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idThoiHanTin **/
  @Id
  @Column(name = "post_expiration_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer postExpirationId;

  /** Init thoiHan **/
  @Column(name = "post_expiration_time", length = 2, columnDefinition = "TINYINT(2) UNSIGNED")
  private Integer postExpirationTime;

  /** Init postExpirationName **/
  @Column(name = "post_expiration_name", length = 10, columnDefinition = "VARCHAR(10) DEFAULT ''")
  private String postExpirationName;

  /** Init discount **/
  @Column(name = "discount", nullable = false)
  private Float discount;

  public Integer getPostExpirationId() {
    return postExpirationId;
  }

  public void setPostExpirationId(Integer postExpirationId) {
    this.postExpirationId = postExpirationId;
  }

  public Integer getPostExpirationTime() {
    return postExpirationTime;
  }

  public void setPostExpirationTime(Integer postExpirationTime) {
    this.postExpirationTime = postExpirationTime;
  }

  public String getPostExpirationName() {
    return postExpirationName;
  }

  public void setPostExpirationName(String postExpirationName) {
    this.postExpirationName = postExpirationName;
  }

  public Float getDiscount() {
    return discount;
  }

  public void setDiscount(Float discount) {
    this.discount = discount;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
