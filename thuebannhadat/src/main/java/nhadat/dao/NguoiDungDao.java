/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package nhadat.dao;

import nhadat.entity.NguoiDung;

/**
 * @author : DUNGPT
 * @PG_ID  : NguoiDungDao
 * @createDate : 09.01.2016
 */
public interface NguoiDungDao {

  /**
   * Them nguoi dung
   *
   * @param NguoiDung
   * @return true, if successful
   */
  public boolean addNguoiDung(NguoiDung nguoiDung);

  /**
   * Lay thong tin nguoi dung dua vao key dienThoai
   *
   * @param dienThoai
   * 
   * @return NguoiDung
   */
  public NguoiDung getNguoiDungExistByDienThoai(String dienThoai);

  /**
   * Lay thong tin nguoi dung dua vao email
   *
   * @param email
   * 
   * @return NguoiDung
   */
  public NguoiDung getNguoiDungByEmail(String email);

  /**
   * Cap nhat thong tin nguoi dung
   *
   * @param nguoiDung
   * @return true, if successful
   */
  public boolean updateNguoiDung(NguoiDung nguoiDung);

  /**
   * Check dang nhap nguoi dung bang dienthoai
   *
   * @param dienThoai
   * @param  matKhau
   * 
   * @return NguoiDung
   */
  public NguoiDung checkLoginByDienThoai(String dienThoai, String matKhau);
}
