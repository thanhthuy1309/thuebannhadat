/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package nhadat.dao.impl;

import nhadat.dao.NguoiDungDao;
import nhadat.entity.NguoiDung;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author : DUNGPT
 * @PG_ID : NguoiDungDaoImpl
 * @createDate : 09.01.2016
 */
@Repository
public class NguoiDungDaoImpl implements NguoiDungDao {

  /** Init LOGGER. */
  private static final Logger LOGGER = Logger.getLogger(NguoiDungDaoImpl.class);

  /** Init sessionFactory */
  @Autowired
  private SessionFactory sessionFactory;

  /**
   * Them nguoi dung moi
   * 
   * @param NguoiDung
   * @return true, if successful
   */
  public boolean addNguoiDung(NguoiDung nguoiDung) {
    Session session = this.sessionFactory.getCurrentSession();

    try {
      // create nguoiDung
      session.persist(nguoiDung);
    } catch (Exception e) {
      LOGGER.error("#addNguoiDung: " + e);
      return false;
    }
    return true;
  }

  /**
   * Lay thong tin nguoi dung dua vao key dienThoai
   * 
   * @param dienThoai
   * 
   * @return NguoiDung
   */
  public NguoiDung getNguoiDungExistByDienThoai(String dienThoai) {
    Session session = this.sessionFactory.getCurrentSession();
    // Query get get NguoiDung
    Query query = session.getNamedQuery("NguoiDungDao.getNguoiDungExistByDienThoai");

    // Set parameter
    query.setString("dienThoai", dienThoai);

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
  public boolean updateNguoiDung(NguoiDung nguoiDung) {
    Session session = this.sessionFactory.getCurrentSession();

    try {
      // update nguoiDung
      session.merge(nguoiDung);
    } catch (Exception e) {
      LOGGER.error("#updateNguoiDung: " + e);
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
  public NguoiDung getNguoiDungByEmail(String email) {
    Session session = this.sessionFactory.getCurrentSession();
    // Query get get NguoiDung
    Query query = session.getNamedQuery("NguoiDungDao.getNguoiDungByEmail");

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
   * @param dienThoai
   * @param  matKhau
   * 
   * @return NguoiDung
   */
  public NguoiDung checkLoginByDienThoai(String dienThoai, String matKhau) {
    Session session = this.sessionFactory.getCurrentSession();
    // Query get get NguoiDung
    Query query = session.getNamedQuery("NguoiDungDao.checkLoginByDienThoai");

    // Set parameter
    query.setString("dienThoai", dienThoai);
    query.setString("matKhau", matKhau);

    NguoiDung nguoiDung = (NguoiDung) query.uniqueResult();

    if (nguoiDung != null) {
      return nguoiDung;
    }

    return null;
  }
}
