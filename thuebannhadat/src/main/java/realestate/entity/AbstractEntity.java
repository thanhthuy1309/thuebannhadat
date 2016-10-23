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
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author : DungPT
 * @PG_ID : FooterLinkBan
 * @createDate : 17.10.2016
 */
@MappedSuperclass
public class AbstractEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Trang thai tin. 0: chua kich thoat 1: kich hoat
   */
  @Column(name = "trangthai", length = 1, nullable = false, columnDefinition = "TINYINT(1) UNSIGNED DEFAULT 0")
  private Integer trangThai;

  /** Init ngayTao **/
  @Column(name = "ngaytao", columnDefinition = "TIMESTAMP  DEFAULT 0")
  private Date ngayTao;

  /** Init ngaycapnhat **/
  @Column(name = "ngaycapnhat", columnDefinition = "TIMESTAMP  DEFAULT 0")
  private Date ngayCapNhat;

  @Column(name = "nguoitao", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
  private String nguoiTao;

  @Column(name = "nguoicapnhat", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
  private String nguoiCapNhat;

  public Integer getTrangThai() {
    return trangThai;
  }

  public void setTrangThai(Integer trangThai) {
    this.trangThai = trangThai;
  }

  public Date getNgayTao() {
    return ngayTao;
  }

  public void setNgayTao(Date ngayTao) {
    this.ngayTao = ngayTao;
  }

  public Date getNgayCapNhat() {
    return ngayCapNhat;
  }

  public void setNgayCapNhat(Date ngayCapNhat) {
    this.ngayCapNhat = ngayCapNhat;
  }

  public String getNguoiTao() {
    return nguoiTao;
  }

  public void setNguoiTao(String nguoiTao) {
    this.nguoiTao = nguoiTao;
  }

  public String getNguoiCapNhat() {
    return nguoiCapNhat;
  }

  public void setNguoiCapNhat(String nguoiCapNhat) {
    this.nguoiCapNhat = nguoiCapNhat;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

}
