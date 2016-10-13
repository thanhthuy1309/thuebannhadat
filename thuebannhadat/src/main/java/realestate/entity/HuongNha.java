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
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author : DungPT
 * @PG_ID : HuongNha
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_huongnha")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class HuongNha implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idHuongNha **/
  @Id
  @Column(name = "id_huongnha", nullable = false, length = 250)
  private String idHuongNha;

  /** Init tenHuongNha **/
  @Column(name = "ten_huongnha", length = 250, nullable = false, unique = true)
  private String tenHuongNha;

  /** Init trangThai **/
  @Column(name = "trangthai", length = 1, nullable = false)
  private Integer trangThai;

  public String getTenHuongNha() {
    return tenHuongNha;
  }

  public void setTenHuongNha(String tenHuongNha) {
    this.tenHuongNha = tenHuongNha;
  }

  public Integer getTrangThai() {
    return trangThai;
  }

  public void setTrangThai(Integer trangThai) {
    this.trangThai = trangThai;
  }

  public String getIdHuongNha() {
    return idHuongNha;
  }

  public void setIdHuongNha(String idHuongNha) {
    this.idHuongNha = idHuongNha;
  }

}
