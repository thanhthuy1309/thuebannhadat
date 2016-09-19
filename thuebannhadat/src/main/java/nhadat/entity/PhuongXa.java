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

import nhadat.entity.PK.PhuongXa_PK;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author : DungPT
 * @PG_ID : PhuongXa
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_phuongxa")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@IdClass(PhuongXa_PK.class)
public class PhuongXa implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idPhuongXa **/
  @Id
  @Column(name = "id_phuongxa", nullable = false, length = 250)
  private String idPhuongXa;

  /** Init idQuanHuyen **/
  @Id
  @Column(name = "id_quanhuyen", nullable = false, length = 250)
  private String idQuanHuyen;

  @Id
  @Column(name = "id_thanhpho", nullable = false, length = 250)
  private String idThanhPho;

  /** Init tenPhuongXa **/
  @Column(name = "ten_phuongxa", length = 250, nullable = false)
  private String tenPhuongXa;

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

  public String getTenPhuongXa() {
    return tenPhuongXa;
  }

  public void setTenPhuongXa(String tenPhuongXa) {
    this.tenPhuongXa = tenPhuongXa;
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

  public String getIdPhuongXa() {
    return idPhuongXa;
  }

  public void setIdPhuongXa(String idPhuongXa) {
    this.idPhuongXa = idPhuongXa;
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
