/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import realestate.common.ValidStatusEnum;
import realestate.dao.UserDao;
import realestate.entity.NguoiDung;

/**
 * @author : DUNGPT
 * @PG_ID : UserDaoImpl
 * @createDate : 09.01.2016
 */
@Repository
public class UserDaoImpl extends AbstractDaoImpl<NguoiDung, Integer> implements UserDao {

  /** Init logger. */
  private Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

  /**
   * Them nguoi dung moi
   * 
   * @param NguoiDung
   * @return nguoiDung
   */
  public NguoiDung addUser(NguoiDung nguoiDung) {
    Session session = getSession();

    try {
      // create nguoiDung
      session.save(nguoiDung);
    } catch (Exception e) {
      logger.error("#addUser: " + e);
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
  public NguoiDung getUserByPhone(String phoneNumber) {
    Session session = getSession();
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
  public boolean updateUser(NguoiDung nd) {
    Session session = getSession();

    NguoiDung nguoiDung = (NguoiDung) session.get(NguoiDung.class, nd.getIdNguoiDung());
    if (nguoiDung != null) {
      try {
        nguoiDung.setMaCodeKichHoat(null);
        nguoiDung.setTrangThai(ValidStatusEnum.SUCCESSFUL.getValue());
        nguoiDung.setSoCodeKichHoat(nd.getSoCodeKichHoat());
        // update nguoiDung
        session.merge(nguoiDung);
        return true;
      } catch (Exception e) {
        logger.error("#updateUser: " + e);
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
  public NguoiDung getUserByEmail(String email) {
    Session session = getSession();
    // Query get get NguoiDung
    Query query = session.getNamedQuery("UserDao.getUserByEmail");

    // Set parameter
    query.setString("email", email);
    query.setInteger("trangThai", 1);

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
    Session session = getSession();
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

  /**
   * lay nguoi dung theo idNguoiDung
   * 
   * @param idNguoiDung
   * @return nguoidung
   */
  @Override
  public NguoiDung getUserByID(Integer idNguoiDung) {
    Session session = getSession();
    return (NguoiDung) session.get(NguoiDung.class, idNguoiDung);
  }
}
