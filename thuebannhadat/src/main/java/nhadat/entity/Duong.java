/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package nhadat.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import nhadat.entity.PK.Duong_PK;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author : DungPT
 * @PG_ID : Duong
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_duong")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@IdClass(Duong_PK.class)
public class Duong implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idDuong **/
  @Id
  @Column(name = "id_duong", nullable = false, length = 250)
  private String idDuong;

  /** Init idQuanHuyen **/
  @Id
  @Column(name = "id_quanhuyen", nullable = false, length = 250)
  private String idQuanHuyen;

  @Id
  @Column(name = "id_thanhpho", nullable = false, length = 250)
  private String idThanhPho;

  /** Init tenDuong **/
  @Column(name = "ten_duong", length = 250, nullable = false)
  private String tenDuong;

  /** Init trangThai **/
  @Column(name = "trangthai", length = 1, nullable = false)
  private Integer trangThai;

  /** Init quanHuyen **/
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumns({
    @JoinColumn(name = "id_thanhpho", referencedColumnName="id_thanhpho", insertable = false, updatable = false),
    @JoinColumn(name = "id_quanhuyen", referencedColumnName="id_quanhuyen", insertable = false, updatable = false)
  })
  private QuanHuyen quanHuyen;

  public String getTenDuong() {
    return tenDuong;
  }

  public void setTenDuong(String tenDuong) {
    this.tenDuong = tenDuong;
  }

  public Integer getTrangThai() {
    return trangThai;
  }

  public void setTrangThai(Integer trangThai) {
    this.trangThai = trangThai;
  }

  public QuanHuyen getQuanHuyen() {
    return quanHuyen;
  }

  public void setQuanHuyen(QuanHuyen quanHuyen) {
    this.quanHuyen = quanHuyen;
  }

  public String getIdDuong() {
    return idDuong;
  }

  public void setIdDuong(String idDuong) {
    this.idDuong = idDuong;
  }

  public String getIdQuanHuyen() {
    return idQuanHuyen;
  }

  public void setIdQuanHuyen(String idQuanHuyen) {
    this.idQuanHuyen = idQuanHuyen;
  }

  public String getIdThanhPho() {
    return idThanhPho;
  }

  public void setIdThanhPho(String idThanhPho) {
    this.idThanhPho = idThanhPho;
  }

}
