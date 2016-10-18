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
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

import realestate.entity.PK.QuanHuyen_PK;

/**
 * @author : DungPT
 * @PG_ID : QuanHuyen
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_quanhuyen")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@IdClass(QuanHuyen_PK.class)
@Where(clause = "trangthai = 1")
public class QuanHuyen implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idQuanHuyen **/
  @Id
  @Column(name = "id_quanhuyen", nullable = false, length = 250)
  private String idQuanHuyen;

  @Id
  @Column(name = "id_thanhpho", nullable = false, length = 250)
  private String idThanhPho;
  
  /** Init tenQuanHuyen **/
  @Column(name = "ten_quanhuyen", length = 250, nullable = false)
  private String tenQuanHuyen;

  /** Init trangThai **/
  @Column(name = "trangthai", length = 1, nullable = false)
  private Integer trangThai;

  /** Init thanhPho **/
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_thanhpho", referencedColumnName = "id_thanhpho" , insertable = false, updatable = false)
  private ThanhPho thanhPho;

  /** Init listPhuongXa **/
  @OneToMany(mappedBy = "quanHuyen", cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = PhuongXa.class)
  private List<PhuongXa> listPhuongXa;

  /** Init listDuong **/
  @OneToMany(mappedBy = "quanHuyen", cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Duong.class)
  private List<Duong> listDuong;

  public String getTenQuanHuyen() {
    return tenQuanHuyen;
  }

  public void setTenQuanHuyen(String tenQuanHuyen) {
    this.tenQuanHuyen = tenQuanHuyen;
  }

  public Integer getTrangThai() {
    return trangThai;
  }

  public void setTrangThai(Integer trangThai) {
    this.trangThai = trangThai;
  }

  public ThanhPho getThanhPho() {
    return thanhPho;
  }

  public void setThanhPho(ThanhPho thanhPho) {
    this.thanhPho = thanhPho;
  }

  public List<PhuongXa> getListPhuongXa() {
    return listPhuongXa;
  }

  public void setListPhuongXa(List<PhuongXa> listPhuongXa) {
    this.listPhuongXa = listPhuongXa;
  }

  public List<Duong> getListDuong() {
    return listDuong;
  }

  public void setListDuong(List<Duong> listDuong) {
    this.listDuong = listDuong;
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
