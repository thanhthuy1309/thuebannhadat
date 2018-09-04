/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.dao.impl;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import realestate.dao.UserDao;
import realestate.entity.User;
import realestate.enumerator.ValidStatusEnum;

/**
 * @author : DUNGPT
 * @PG_ID : UserDaoImpl
 * @createDate : 09.01.2016
 */
@Repository
public class UserDaoImpl extends AbstractDaoImpl implements UserDao {

  /** Init logger. */
  private Logger LOGGER = Logger.getLogger(UserDaoImpl.class);

  /**
   * Them nguoi dung moi
   * 
   * @param User
   * @return nguoiDung
   */
  public User addUser(User nguoiDung) {
    Session session = getSession();

    try {
      // create nguoiDung
      session.save(nguoiDung);
    } catch (Exception e) {
      LOGGER.error("#addUser: " + e);
    }
    return nguoiDung;
  }

  /**
   * Lay thong tin nguoi dung dua vao key dienThoai
   * 
   * @param phoneNumber
   * 
   * @return NguoiDung
   */
  public User getUserByPhone(String phoneNumber) {
    Session session = getSession();
    // Query get get NguoiDung
    Query query = session.getNamedQuery("UserDao.getUserByPhone");

    // Set parameter
    query.setString("userPhone", phoneNumber);

    User nguoiDung = (User) query.uniqueResult();

    if (nguoiDung != null) {
      return nguoiDung;
    }

    return null;
  }

  /**
   * Cap nhat thong tin nguoi dung
   * 
   * @param nguoiDung
   * @return true, if successful
   */
  public boolean updateUser(User nd) {
    Session session = getSession();

    User nguoiDung = (User) session.get(User.class, nd.getUserId());
    if (nguoiDung != null) {
      try {
        nguoiDung.setActivationCode(null);
        nguoiDung.setStatus(ValidStatusEnum.SUCCESSFUL.getValue());
        nguoiDung.setActivationCodeTimes(nd.getActivationCodeTimes());
        // update nguoiDung
        session.merge(nguoiDung);
        return true;
      } catch (Exception e) {
        LOGGER.error("#updateUser: " + e);
      }
    }
    return false;
  }

  /**
   * Lay thong tin nguoi dung dua vao email
   * 
   * @param email
   * 
   * @return NguoiDung
   */
  public User getUserByEmail(String email) {
    Session session = getSession();
    // Query get get NguoiDung
    Query query = session.getNamedQuery("UserDao.getUserByEmail");

    // Set parameter
    query.setString("userEmail", email);
    query.setInteger("status", 1);

    User nguoiDung = (User) query.uniqueResult();

    if (nguoiDung != null) {
      return nguoiDung;
    }

    return null;
  }

  /**
   * Check dang nhap nguoi dung bang dienthoai
   *
   * @param phoneNumber
   * @param password
   * 
   * @return NguoiDung
   */
  public User checkLoginByPhone(String phoneNumber, String password) {
    Session session = getSession();
    // Query get get NguoiDung
    Query query = session.getNamedQuery("UserDao.checkLoginByPhone");

    // Set parameter
    query.setString("userPhone", phoneNumber);
    query.setString("userPassword", password);

    User nguoiDung = (User) query.uniqueResult();

    if (nguoiDung != null) {
      return nguoiDung;
    }

    return null;
  }

  /**
   * lay nguoi dung theo idNguoiDung
   * 
   * @param idNguoiDung
   * @return nguoidung
   */
  @Override
  public User getUserByID(Integer idNguoiDung) {
    Session session = getSession();
    return (User) session.get(User.class, idNguoiDung);
  }
}
