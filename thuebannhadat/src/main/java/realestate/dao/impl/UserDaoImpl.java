/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.dao.impl;

import realestate.dao.UserDao;
import realestate.entity.NguoiDung;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author : DUNGPT
 * @PG_ID : UserDaoImpl
 * @createDate : 09.01.2016
 */
@Repository
public class UserDaoImpl implements UserDao {

  /** Init LOGGER. */
  private static final Logger LOGGER = Logger.getLogger(UserDaoImpl.class);

  /** Init sessionFactory */
  @Autowired
  private SessionFactory sessionFactory;

  /**
   * Them nguoi dung moi
   * 
   * @param NguoiDung
   * @return true, if successful
   */
  public boolean addUser(NguoiDung nguoiDung) {
    Session session = this.sessionFactory.getCurrentSession();

    try {
      // create nguoiDung
      session.persist(nguoiDung);
    } catch (Exception e) {
      LOGGER.error("#addUser: " + e);
      return false;
    }
    return true;
  }

  /**
   * Lay thong tin nguoi dung dua vao key dienThoai
   * 
   * @param phoneNumber
   * 
   * @return NguoiDung
   */
  public NguoiDung getUserByPhone(String phoneNumber) {
    Session session = this.sessionFactory.getCurrentSession();
    // Query get get NguoiDung
    Query query = session.getNamedQuery("UserDao.getUserByPhone");

    // Set parameter
    query.setString("phoneNumber", phoneNumber);

    NguoiDung nguoiDung = (NguoiDung) query.uniqueResult();

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
  public boolean updateUser(NguoiDung nguoiDung) {
    Session session = this.sessionFactory.getCurrentSession();

    try {
      // update nguoiDung
      session.merge(nguoiDung);
    } catch (Exception e) {
      LOGGER.error("#updateUser: " + e);
      return false;
    }
    return true;
  }

  /**
   * Lay thong tin nguoi dung dua vao email
   * 
   * @param email
   * 
   * @return NguoiDung
   */
  public NguoiDung getUserByEmail(String email) {
    Session session = this.sessionFactory.getCurrentSession();
    // Query get get NguoiDung
    Query query = session.getNamedQuery("UserDao.getUserByEmail");

    // Set parameter
    query.setString("email", email);

    NguoiDung nguoiDung = (NguoiDung) query.uniqueResult();

    if (nguoiDung != null) {
      return nguoiDung;
    }

    return null;
  }

  /**
   * Check dang nhap nguoi dung bang dienthoai
   *
   * @param phoneNumber
   * @param  password
   * 
   * @return NguoiDung
   */
  public NguoiDung checkLoginByPhone(String phoneNumber, String password) {
    Session session = this.sessionFactory.getCurrentSession();
    // Query get get NguoiDung
    Query query = session.getNamedQuery("UserDao.checkLoginByPhone");

    // Set parameter
    query.setString("phoneNumber", phoneNumber);
    query.setString("password", password);

    NguoiDung nguoiDung = (NguoiDung) query.uniqueResult();

    if (nguoiDung != null) {
      return nguoiDung;
    }

    return null;
  }
}
