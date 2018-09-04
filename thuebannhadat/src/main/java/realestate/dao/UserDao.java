/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.dao;

import realestate.entity.User;

/**
 * @author : DUNGPT
 * @PG_ID  : UserDao
 * @createDate : 09.01.2016
 */
public interface UserDao extends AbstractDao {

  /**
   * Them nguoi dung
   *
   * @param User
   * @return nguoiDung
   */
  public User addUser(User user);

  /**
   * Lay thong tin nguoi dung dua vao key dienThoai
   *
   * @param phoneNumber
   * 
   * @return NguoiDung
   */
  public User getUserByPhone(String phoneNumber);

  /**
   * Lay thong tin nguoi dung dua vao email
   *
   * @param email
   * 
   * @return NguoiDung
   */
  public User getUserByEmail(String email);

  /**
   * Cap nhat thong tin nguoi dung
   *
   * @param user
   * @return true, if successful
   */
  public boolean updateUser(User user);

  /**
   * Check dang nhap nguoi dung bang dienthoai
   *
   * @param phoneNumber
   * @param  password
   * 
   * @return NguoiDung
   */
  public User checkLoginByPhone(String phoneNumber, String password);

  /**
   * lay nguoi dung theo idNguoiDung
   * 
   * @param idNguoiDung
   * @return nguoidung
   */
  public User getUserByID(Integer idNguoiDung);
}
