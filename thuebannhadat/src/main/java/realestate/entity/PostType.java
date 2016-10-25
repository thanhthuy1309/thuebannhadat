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
 * @PG_ID : PostType(LoaiTin)
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_post_type")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class PostType extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idLoaiTin **/
  @Id
  @Column(name = "post_type_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer postTypeId;

  /** Init tenLoaiTin **/
  @Column(name = "post_type_name", length = 250, nullable = false, unique = true)
  private String postTypeName;

  /** Init giaTin **/
  @Column(name = "price", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  private Integer price;

  public Integer getPostTypeId() {
    return postTypeId;
  }

  public void setPostTypeId(Integer postTypeId) {
    this.postTypeId = postTypeId;
  }

  public String getPostTypeName() {
    return postTypeName;
  }

  public void setPostTypeName(String postTypeName) {
    this.postTypeName = postTypeName;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
