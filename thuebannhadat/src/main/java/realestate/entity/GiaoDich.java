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
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author : DungPT
 * @PG_ID : GiaoDich
 * @createDate : 09.01.2016
 */
@Entity
@Table(name = "tbl_giaodich")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class GiaoDich implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idGiaoDich **/
  @Id
  @Column(name = "id_giaodich", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idGiaoDich;

  /** Init idLoaiGiaoDich **/
  @Column(name = "id_loaigiaodich", nullable = false)
  private Integer idLoaiGiaoDich;

  /** Init tienGiaoDich **/
  @Column(name = "tien_giaodich")
  private BigDecimal tienGiaoDich;

  /** Init tienNap **/
  @Column(name = "tien_nap")
  private BigDecimal tienNap;

  /** Init thoiGian **/
  @Column(name = "thoigian", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date thoiGian;

  /** Init trangThai **/
  @Column(name = "trangthai", length = 1, nullable = false)
  private Integer trangThai;

  public Integer getIdGiaoDich() {
    return idGiaoDich;
  }

  public void setIdGiaoDich(Integer idGiaoDich) {
    this.idGiaoDich = idGiaoDich;
  }

  public Integer getIdLoaiGiaoDich() {
    return idLoaiGiaoDich;
  }

  public void setIdLoaiGiaoDich(Integer idLoaiGiaoDich) {
    this.idLoaiGiaoDich = idLoaiGiaoDich;
  }

  public BigDecimal getTienGiaoDich() {
    return tienGiaoDich;
  }

  public void setTienGiaoDich(BigDecimal tienGiaoDich) {
    this.tienGiaoDich = tienGiaoDich;
  }

  public BigDecimal getTienNap() {
    return tienNap;
  }

  public void setTienNap(BigDecimal tienNap) {
    this.tienNap = tienNap;
  }

  public Date getThoiGian() {
    return thoiGian;
  }

  public void setThoiGian(Date thoiGian) {
    this.thoiGian = thoiGian;
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
