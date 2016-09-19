/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package nhadat.service;

import nhadat.dto.DangKyDto;
import nhadat.dto.DangNhapDto;
import nhadat.dto.KichHoatDto;
import nhadat.dto.MatKhauDto;
import nhadat.entity.NguoiDung;

/**
 * @author : DUNGPT
 * @PG_ID  : NguoiDungService.
 * @createDate : 09.01.2016
 */
public interface NguoiDungService {

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
   * dang ky nguoi dung chua kich hoat tai khoan
   * 
   * @param dangKyDto
   * @return true, if successful
   */
  public boolean dangkyNguoiDung(DangKyDto dangKyDto);

  /**
   * kich hoat tai khoan
   * 
   * @param kichHoatDto
   * @return true, if successful
   */
  public boolean kichhoatNguoiDung(KichHoatDto kichHoatDto);

  /**
   * dang nhap bang so dien thoai
   *
   * @param dangNhapDto
   * 
   * @return NguoiDung
   */
  public NguoiDung dangNhapByDienThoai(DangNhapDto dangNhapDto);


  /**
   * truong hop nguoi dung da dang ky roi nhung tai khoan chua dc kich hoat.
   * quen ma kich hoat tai khoan
   * 
   * @param nd
   * @param maCode
   * 
   * @return true, if successful
   */
  public boolean layCodeKichHoat(String maCode, NguoiDung nd);

  /**
   * truong hop lay ma code khi quen mat khau
   * 
   * @param nd
   * @param maCode
   * 
   * @return true, if successful
   */
  public boolean layCodeQuenMatKhau(String maCode, NguoiDung nd);

  /**
   * check ma code mat khau co dung khong
   * 
   * @param matKhauDto
   * @return true, if successful
   */
  public boolean checkMaCodeMatKhau(MatKhauDto matKhauDto);

  /**
   * cap nhat quen mat khau
   * 
   * @param dangNhapDto
   * @return true, if successful
   */
  public boolean capNhatQuenMatKhau(DangNhapDto dangNhapDto);
}
