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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author : DungPT
 * @PG_ID : LoaiGiaoDich
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_loaigiaodich")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class LoaiGiaoDich implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idLoaiGiaoDich **/
  @Id
  @Column(name = "id_loaigiaodich", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idLoaiGiaoDich;

  /** Init tenLoaiGiaoDich **/
  @Column(name = "ten_loaigiaodich", length = 250, nullable = false)
  private String tenLoaiGiaoDich;

  /** Init trangThai **/
  @Column(name = "trangthai", length = 1, nullable = false)
  private Integer trangThai;

  public Integer getIdLoaiGiaoDich() {
    return idLoaiGiaoDich;
  }

  public void setIdLoaiGiaoDich(Integer idLoaiGiaoDich) {
    this.idLoaiGiaoDich = idLoaiGiaoDich;
  }

  public String getTenLoaiGiaoDich() {
    return tenLoaiGiaoDich;
  }

  public void setTenLoaiGiaoDich(String tenLoaiGiaoDich) {
    this.tenLoaiGiaoDich = tenLoaiGiaoDich;
  }

  public Integer getTrangThai() {
    return trangThai;
  }

  public void setTrangThai(Integer trangThai) {
    this.trangThai = trangThai;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
