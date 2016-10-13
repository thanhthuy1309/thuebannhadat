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
 * @PG_ID : HinhAnhTin
 * @createDate : 21.08.2016
 */
@Entity
@Table(name = "tbl_hinhanhtin")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class HinhAnhTin implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idHinhAnhTin **/
  @Id
  @Column(name = "id_hinhanhtin", length = 250, nullable = false)
  private String idHinhAnhTin;

  /** Init trangThai **/
  @Column(name = "trangthai", length = 1, nullable = false)
  private Integer trangThai;

  /** Init idMauTin **/
  @Column(name = "id_mautin", nullable = false, length = 250)
  private String idMauTin;

  /** Init tenHinhAnh **/
  @Column(name = "ten_hinhanhtin", nullable = false, length = 250)
  private String tenHinhAnh;

  /** Init thuTu **/
  @Column(name = "thutu", length = 2, nullable = false)
  private Integer thuTu;

  public Integer getTrangThai() {
    return trangThai;
  }

  public void setTrangThai(Integer trangThai) {
    this.trangThai = trangThai;
  }

  public String getIdMauTin() {
    return idMauTin;
  }

  public void setIdMauTin(String idMauTin) {
    this.idMauTin = idMauTin;
  }

  public String getIdHinhAnhTin() {
    return idHinhAnhTin;
  }

  public void setIdHinhAnhTin(String idHinhAnhTin) {
    this.idHinhAnhTin = idHinhAnhTin;
  }

  public String getTenHinhAnh() {
    return tenHinhAnh;
  }

  public void setTenHinhAnh(String tenHinhAnh) {
    this.tenHinhAnh = tenHinhAnh;
  }

  public Integer getThuTu() {
    return thuTu;
  }

  public void setThuTu(Integer thuTu) {
    this.thuTu = thuTu;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
