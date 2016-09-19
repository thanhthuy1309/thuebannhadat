/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package nhadat.dto;

import java.io.Serializable;

/**
 * @author : DUNGPT
 * @PG_ID : DangKyDto
 * @createDate : 09.01.2016
 */
public class DangKyDto implements Serializable {

  /** Init serialVersionUID is 6666905163744174682L **/
  private static final long serialVersionUID = 6666905163744174682L;

  /** Init dienThoai **/
  private String dienThoai;

  /** Init matKhau **/
  private String matKhau;

  /** Init maCodeKichHoat **/
  private String maCodeKichHoat;
  
  public String getDienThoai() {
    return dienThoai;
  }

  public void setDienThoai(String dienThoai) {
    this.dienThoai = dienThoai;
  }

  public String getMatKhau() {
    return matKhau;
  }

  public void setMatKhau(String matKhau) {
    this.matKhau = matKhau;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

  public String getMaCodeKichHoat() {
    return maCodeKichHoat;
  }

  public void setMaCodeKichHoat(String maCodeKichHoat) {
    this.maCodeKichHoat = maCodeKichHoat;
  }
}
