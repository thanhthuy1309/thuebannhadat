/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

/**
 * @author : DungPT
 * @PG_ID : NguoiDung
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_nguoidung")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "trangthai = 1")
public class NguoiDung extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idNguoiDung **/
  @Id
  @Column(name = "id_nguoidung", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idNguoiDung;

  /** Init email **/
  @Column(name = "email", length = 50, columnDefinition = "VARCHAR(50) DEFAULT ''")
  private String email;

  /** Init dienThoai **/
  @Column(name = "dienthoai", length = 15, unique = true)
  private String dienThoai;

  /** Init userName **/
  @Column(name = "hoten", length = 500, columnDefinition = "VARCHAR(500) DEFAULT ''")
  private String hoTen;

  /** Init password **/
  @Column(name = "matkhau", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
  private String matKhau;

  @Column(name = "id_phanquyen", nullable = false)
  private Integer idPhanQuyen;

  /** so lan lay ma code kich hoat toi da la 5 lan trong 1 ngay **/
  @Column(name = "socode_kichhoat")
  private Integer soCodeKichHoat;

  /** so lan lay ma code quen mat khau toi da la 5 lan trong 1 ngay **/
  @Column(name = "socode_matkhau")
  private Integer soCodeMatKhau;

  @Column(name = "gioitinh")
  private Boolean gioiTinh;

  @Column(name = "ngaysinh")
  @Temporal(TemporalType.DATE)
  private Date ngaySinh;

  /** Init phanQuyen **/
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_phanquyen", insertable = false, updatable = false)
  private PhanQuyen phanQuyen;

  /** Init diaChi **/
  @Column(name = "diachi", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
  private String diaChi;
  
  /** Init viTien **/
  @Column(name = "vitien")
  private BigDecimal viTien;

  /** Init maCodeKichHoat **/
  @Column(name = "macode_kichhoat", length = 5, columnDefinition = "VARCHAR(5) DEFAULT ''")
  private String maCodeKichHoat;

  /** Su dung khi quen mat khau **/
  @Column(name = "macode_matkhau", length = 5, columnDefinition = "VARCHAR(5) DEFAULT ''")
  private String maCodeMatKhau;

  public Integer getIdNguoiDung() {
    return idNguoiDung;
  }

  public void setIdNguoiDung(Integer idNguoiDung) {
    this.idNguoiDung = idNguoiDung;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDienThoai() {
    return dienThoai;
  }

  public void setDienThoai(String dienThoai) {
    this.dienThoai = dienThoai;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public String getMatKhau() {
    return matKhau;
  }

  public void setMatKhau(String matKhau) {
    this.matKhau = matKhau;
  }

  public Integer getIdPhanQuyen() {
    return idPhanQuyen;
  }

  public void setIdPhanQuyen(Integer idPhanQuyen) {
    this.idPhanQuyen = idPhanQuyen;
  }

  public PhanQuyen getPhanQuyen() {
    return phanQuyen;
  }

  public void setPhanQuyen(PhanQuyen phanQuyen) {
    this.phanQuyen = phanQuyen;
  }

  public BigDecimal getViTien() {
    return viTien;
  }

  public void setViTien(BigDecimal viTien) {
    this.viTien = viTien;
  }

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public Boolean getGioiTinh() {
    return gioiTinh;
  }

  public void setGioiTinh(Boolean gioiTinh) {
    this.gioiTinh = gioiTinh;
  }

  public Date getNgaySinh() {
    return ngaySinh;
  }

  public void setNgaySinh(Date ngaySinh) {
    this.ngaySinh = ngaySinh;
  }

  public String getMaCodeKichHoat() {
    return maCodeKichHoat;
  }

  public void setMaCodeKichHoat(String maCodeKichHoat) {
    this.maCodeKichHoat = maCodeKichHoat;
  }

  public String getMaCodeMatKhau() {
    return maCodeMatKhau;
  }

  public void setMaCodeMatKhau(String maCodeMatKhau) {
    this.maCodeMatKhau = maCodeMatKhau;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

  public Integer getSoCodeKichHoat() {
    return soCodeKichHoat;
  }

  public void setSoCodeKichHoat(Integer soCodeKichHoat) {
    this.soCodeKichHoat = soCodeKichHoat;
  }

  public Integer getSoCodeMatKhau() {
    return soCodeMatKhau;
  }

  public void setSoCodeMatKhau(Integer soCodeMatKhau) {
    this.soCodeMatKhau = soCodeMatKhau;
  }

}
