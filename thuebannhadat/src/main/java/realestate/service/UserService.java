/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.service;

import realestate.dto.ActivationDto;
import realestate.dto.LoginDto;
import realestate.dto.PasswordDto;
import realestate.dto.RegisterDto;
import realestate.dto.RegisterSocialDto;
import realestate.entity.NguoiDung;

/**
 * @author : DUNGPT
 * @PG_ID  : UserService.
 * @createDate : 09.01.2016
 */
public interface UserService {

  /**
   * Lay thong tin nguoi dung dua vao key dienThoai
   * 
   * @param phoneNumber
   * 
   * @return NguoiDung
   */
  public NguoiDung getUserByPhone(String phoneNumber);

  /**
   * Lay thong tin nguoi dung dua vao email
   * 
   * @param email
   * 
   * @return NguoiDung
   */
  public NguoiDung getUserByEmail(String email);
  
  /**
   * dang ky nguoi dung chua kich hoat tai khoan
   * 
   * @param registerDto
   * @return true, if successful
   */
  public boolean registerUser(RegisterDto registerDto);

  /**
   * kich hoat tai khoan
   * 
   * @param activationDto
   * @return true, if successful
   */
  public boolean activateUser(ActivationDto activationDto);

  /**
   * dang nhap bang so dien thoai
   *
   * @param loginDto
   * 
   * @return NguoiDung
   */
  public NguoiDung loginByPhone(LoginDto loginDto);


  /**
   * truong hop nguoi dung da dang ky roi nhung tai khoan chua dc kich hoat.
   * quen ma kich hoat tai khoan
   * 
   * @param nd
   * @param maCode
   * 
   * @return true, if successful
   */
  public boolean getActivationCode(String activationCode, NguoiDung user);

  /**
   * truong hop lay ma code khi quen mat khau
   * 
   * @param nd
   * @param maCode
   * 
   * @return true, if successful
   */
  public boolean getActivationCodeIfForgotPassword(String maCode, NguoiDung nd);

  /**
   * check ma code mat khau co dung khong
   * 
   * @param passwordDto
   * @return true, if successful
   */
  public boolean checkPassword(PasswordDto passwordDto);

  /**
   * cap nhat quen mat khau
   * 
   * @param loginDto
   * @return true, if successful
   */
  public boolean updateIfForgotPassword(LoginDto loginDto);

  /**
   * dang ky nguoi dung chua kich hoat tai khoan
   * 
   * @param registerSocialDto
   * @return nguoidung
   */
  public NguoiDung registerSocial(RegisterSocialDto registerSocialDto);
}
