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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

/**
 * @author : DungPT
 * @PG_ID : MauTin
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_mautin")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "trangthai = 1")
public class MauTin extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idMauTin **/
  @Id
  @Column(name = "id_mautin", nullable = false, length = 250)
  private String idMauTin;

  /** Init tenMauTin **/
  @Column(name = "ten_mautin", length = 250, nullable = false)
  private String tenMauTin;

  /** Init idLoaiHinhDat **/
  @Column(name = "id_loaihinhdat", nullable = false, length = 250)
  private String idLoaiHinhDat;

  /** Init idLoaiNhaDat **/
  @Column(name = "id_loainhadat", nullable = false, length = 250)
  private String idLoaiNhaDat;

  /** Init idThanhPho **/
  @Column(name = "id_thanhpho", nullable = false, length = 250)
  private String idThanhPho;
  
  /** Init idQuanHuyen **/
  @Column(name = "id_quanhuyen", nullable = false, length = 250)
  private String idQuanHuyen;

  @Column(name = "id_phuongxa",length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
  private String idPhuongXa;

  @Column(name = "id_duong", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
  private String idDuong;

  /** Init diaChi **/
  @Column(name = "diachi", length = 250, nullable = false)
  private String diaChi;

  /** Init linkYoutube **/
  @Column(name = "link_youtube", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
  private String linkYoutube;

  /** Init dienTich **/
  @Column(name = "dientich", nullable = false)
  private Float dienTich;

  /** Init giaDat **/
  @Column(name = "giadat", nullable = false)
  private BigDecimal giaDat;

  /** Init idDonViGia **/
  @Column(name = "id_donvigia", nullable = false)
  private Integer idDonViGia;

  /** Init tongGiaTien **/
  @Column(name = "tong_giatien", length = 250, columnDefinition = "VARCHAR(250) DEFAULT 0")
  private String tongGiaTienDat;

  /** Init matTien **/
  @Column(name = "mattien")
  private Float matTien;

  /** Init loGioi **/
  @Column(name = "logioi")
  private Float loGioi;

  /** Init idHuongNha **/
  @Column(name = "id_huongnha", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
  private String idHuongNha;

  /** Init idHuongBanCong **/
  @Column(name = "id_huongbancong", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
  private String idHuongBanCong;

  /** Init idSoTang **/
  @Column(name = "id_sotang", columnDefinition = "INT(11) DEFAULT 0")
  private Integer idSoTang;

  /** Init idSoPhongNgu **/
  @Column(name = "id_sophongngu", columnDefinition = "INT(11) DEFAULT 0")
  private Integer idSoPhongNgu;

  /** Init idSoToilet **/
  @Column(name = "id_sotoilet", columnDefinition = "INT(11) DEFAULT 0")
  private Integer idSoToilet;

  /** Init idLoaiTin **/
  @Column(name = "id_loaitin", nullable = false)
  private Integer idLoaiTin;

  @Column(name = "id_thoihantin", nullable = false)
  private Integer idThoiHanTin;

  /** Init tongTienTin **/
  @Column(name = "tongtientin", nullable = false)
  private BigDecimal tongTienTin;

  /** Init hemxehoi **/
  @Column(name = "hemxehoi")
  private Boolean hemXeHoi;

  /** Init chinhchu **/
  @Column(name = "chinhchu")
  private Boolean chinhChu;

  /** Init khuAnNinh **/
  @Column(name = "khuanninh")
  private Boolean khuAnNinh;

  /** Init moTaTin **/
  @Column(name = "motatin", length = 5000, nullable = false)
  private String moTaTin;

  public String getIdMauTin() {
    return idMauTin;
  }

  public void setIdMauTin(String idMauTin) {
    this.idMauTin = idMauTin;
  }

  public String getTenMauTin() {
    return tenMauTin;
  }

  public void setTenMauTin(String tenMauTin) {
    this.tenMauTin = tenMauTin;
  }

  public String getIdLoaiHinhDat() {
    return idLoaiHinhDat;
  }

  public void setIdLoaiHinhDat(String idLoaiHinhDat) {
    this.idLoaiHinhDat = idLoaiHinhDat;
  }

  public String getIdLoaiNhaDat() {
    return idLoaiNhaDat;
  }

  public void setIdLoaiNhaDat(String idLoaiNhaDat) {
    this.idLoaiNhaDat = idLoaiNhaDat;
  }

  public String getIdThanhPho() {
    return idThanhPho;
  }

  public void setIdThanhPho(String idThanhPho) {
    this.idThanhPho = idThanhPho;
  }

  public String getIdQuanHuyen() {
    return idQuanHuyen;
  }

  public void setIdQuanHuyen(String idQuanHuyen) {
    this.idQuanHuyen = idQuanHuyen;
  }

  public String getIdPhuongXa() {
    return idPhuongXa;
  }

  public void setIdPhuongXa(String idPhuongXa) {
    this.idPhuongXa = idPhuongXa;
  }

  public String getIdDuong() {
    return idDuong;
  }

  public void setIdDuong(String idDuong) {
    this.idDuong = idDuong;
  }

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public String getLinkYoutube() {
    return linkYoutube;
  }

  public void setLinkYoutube(String linkYoutube) {
    this.linkYoutube = linkYoutube;
  }

  public Float getDienTich() {
    return dienTich;
  }

  public void setDienTich(Float dienTich) {
    this.dienTich = dienTich;
  }

  public BigDecimal getGiaDat() {
    return giaDat;
  }

  public void setGiaDat(BigDecimal giaDat) {
    this.giaDat = giaDat;
  }

  public Integer getIdDonViGia() {
    return idDonViGia;
  }

  public void setIdDonViGia(Integer idDonViGia) {
    this.idDonViGia = idDonViGia;
  }

  public String getTongGiaTienDat() {
    return tongGiaTienDat;
  }

  public void setTongGiaTienDat(String tongGiaTienDat) {
    this.tongGiaTienDat = tongGiaTienDat;
  }

  public String getIdHuongNha() {
    return idHuongNha;
  }

  public void setIdHuongNha(String idHuongNha) {
    this.idHuongNha = idHuongNha;
  }

  public String getIdHuongBanCong() {
    return idHuongBanCong;
  }

  public void setIdHuongBanCong(String idHuongBanCong) {
    this.idHuongBanCong = idHuongBanCong;
  }

  public Integer getIdSoTang() {
    return idSoTang;
  }

  public void setIdSoTang(Integer idSoTang) {
    this.idSoTang = idSoTang;
  }

  public Integer getIdSoPhongNgu() {
    return idSoPhongNgu;
  }

  public void setIdSoPhongNgu(Integer idSoPhongNgu) {
    this.idSoPhongNgu = idSoPhongNgu;
  }

  public Integer getIdSoToilet() {
    return idSoToilet;
  }

  public void setIdSoToilet(Integer idSoToilet) {
    this.idSoToilet = idSoToilet;
  }

  public Integer getIdLoaiTin() {
    return idLoaiTin;
  }

  public void setIdLoaiTin(Integer idLoaiTin) {
    this.idLoaiTin = idLoaiTin;
  }

  public Integer getIdThoiHanTin() {
    return idThoiHanTin;
  }

  public void setIdThoiHanTin(Integer idThoiHanTin) {
    this.idThoiHanTin = idThoiHanTin;
  }

  public BigDecimal getTongTienTin() {
    return tongTienTin;
  }

  public void setTongTienTin(BigDecimal tongTienTin) {
    this.tongTienTin = tongTienTin;
  }

  public String getMoTaTin() {
    return moTaTin;
  }

  public void setMoTaTin(String moTaTin) {
    this.moTaTin = moTaTin;
  }

  public Float getMatTien() {
    return matTien;
  }

  public void setMatTien(Float matTien) {
    this.matTien = matTien;
  }

  public Float getLoGioi() {
    return loGioi;
  }

  public void setLoGioi(Float loGioi) {
    this.loGioi = loGioi;
  }

  public Boolean getHemXeHoi() {
    return hemXeHoi;
  }

  public void setHemXeHoi(Boolean hemXeHoi) {
    this.hemXeHoi = hemXeHoi;
  }

  public Boolean getChinhChu() {
    return chinhChu;
  }

  public void setChinhChu(Boolean chinhChu) {
    this.chinhChu = chinhChu;
  }

  public Boolean getKhuAnNinh() {
    return khuAnNinh;
  }

  public void setKhuAnNinh(Boolean khuAnNinh) {
    this.khuAnNinh = khuAnNinh;
  }

}
