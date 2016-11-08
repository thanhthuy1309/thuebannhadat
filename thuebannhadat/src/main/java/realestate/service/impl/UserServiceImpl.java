/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import realestate.constants.ValueConstants;
import realestate.dao.AbstractDao;
import realestate.dao.UserDao;
import realestate.dto.LoginDto;
import realestate.dto.PasswordDto;
import realestate.dto.RegisterDto;
import realestate.dto.RegisterSocialDto;
import realestate.entity.User;
import realestate.enumerator.ValidStatusEnum;
import realestate.service.UserService;
import realestate.utils.DateUtils;
import realestate.utils.MD5Utils;

/**
 * @author : DUNGPT
 * @PG_ID : UserServiceImpl
 * @createDate : 09.01.2016
 */
@Service
public class UserServiceImpl extends AbstractServiceImpl<User, Integer> implements UserService {

  private static final Logger LOGGER = Logger.getLogger(UserServiceImpl.class);

  private UserDao userDao;

  public UserServiceImpl() {

  }

  @Autowired
  public UserServiceImpl(@Qualifier("userDaoImpl") AbstractDao<User, Integer> abstractDao) {
    super(abstractDao);
    this.userDao = (UserDao) abstractDao;
  }

  /**
   * Lay thong tin nguoi dung dua vao key UserPhone
   * 
   * @param UserPhone
   * 
   * @return NguoiDung
   */
  @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
  @Override
  public User getUserByPhone(String UserPhone) {
    return userDao.getUserByPhone(UserPhone);
  }

  /**
   * Lay thong tin nguoi dung dua vao UserEmail
   * 
   * @param UserEmail
   * 
   * @return NguoiDung
   */
  @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
  @Override
  public User getUserByEmail(String email) {
    return userDao.getUserByEmail(email);
  }

  /**
   * dang ky nguoi dung chua kich hoat tai khoan
   * 
   * @param dangKyDto
   * @return true, if successful
   */
  @Transactional
  @Override
  public boolean registerUser(RegisterDto dangKyDto) {
    if (dangKyDto != null) {
      try {
        User nguoiDung = new User();

        nguoiDung.setUserPhone(dangKyDto.getActivationCode());
        nguoiDung.setUserPassword(MD5Utils.encrypt(dangKyDto.getPassword()));
        nguoiDung.setStatus(ValidStatusEnum.FAILED.getValue());

        nguoiDung.setRoleId(ValueConstants.CONST_ROLE_USER);
        nguoiDung.setActivationCode(dangKyDto.getActivationCode());
        nguoiDung.setCreateDate(DateUtils.now());

        User nd = userDao.addUser(nguoiDung);
        if (nd != null) {
          return true;
        }
      } catch (Exception e) {
        LOGGER.error("#dangkyNguoiDung: " + e);
        return false;
      }
    }
    return false;
  }

  /**
   * kich hoat tai khoan
   * 
   * @param kichHoatDto
   * @return true, if successful
   */
  @Transactional
  @Override
  public boolean activateUser(User nguoiDung) {
    if (nguoiDung != null) {
      try {
        return userDao.updateUser(nguoiDung);
      } catch (Exception e) {
        LOGGER.error("#kichhoatNguoiDung: " + e);
      }
    }
    return false;
  }

  /**
   * dang nhap bang so dien thoai
   * 
   * @param dangNhapDto
   * 
   * @return NguoiDung
   */
  @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
  @Override
  public User loginByPhone(LoginDto dangNhapDto) {
    if (dangNhapDto != null) {
      try {
        return userDao.checkLoginByPhone(dangNhapDto.getPhoneNumber(), MD5Utils.encrypt(dangNhapDto.getPassword()));
      } catch (Exception e) {
        LOGGER.error("#dangNhapByUserPhone: " + e);
        return null;
      }
    }
    return null;
  }

  /**
   * truong hop nguoi dung da dang ky roi nhung tai khoan chua dc kich hoat.
   * quen ma kich hoat tai khoan
   * 
   * @param nd
   * @param maCode
   * 
   * @return true, if successful
   */
  @Transactional
  @Override
  public boolean getActivationCode(String maCode, User nd) {
    if (nd != null) {
      try {
        nd.setActivationCode(maCode);
        // tang so lan lay ma code
        // chi duoc lay 5 lan trong 1 ngay
        nd.setActivationCodeTimes(nd.getActivationCodeTimes() + 1);
        return userDao.updateUser(nd);
      } catch (Exception e) {
        LOGGER.error("#layCodeKichHoat: " + e);
        return false;
      }
    }
    return false;
  }

  /**
   * truong hop lay ma code khi quen mat khau
   * 
   * @param nd
   * @param maCode
   * 
   * @return true, if successful
   */
  @Transactional
  @Override
  public boolean getActivationCodeIfForgotPassword(String maCode, User nd) {
    if (nd != null) {
      try {
        nd.setPasswordCode(maCode);
        // tang so lan lay ma code
        // chi duoc lay 5 lan trong 1 ngay
        nd.setPasswordCodeTimes(nd.getPasswordCodeTimes() + 1);
        return userDao.updateUser(nd);
      } catch (Exception e) {
        LOGGER.error("#layCodeQuenUserPassword: " + e);
        return false;
      }
    }
    return false;
  }

  /**
   * check ma code mat khau co dung khong Neu dung thi chuyen sang man hinh nhap
   * mat khau moi
   * 
   * @param UserPasswordDto
   * @return true, if successful
   */
  @Override
  @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
  public boolean checkPassword(PasswordDto UserPasswordDto) {
    if (UserPasswordDto != null) {
      try {
        User nd = userDao.getUserByPhone(UserPasswordDto.getPhoneNumber());
        if (nd != null) {
          if (nd.getPasswordCode().equals(UserPasswordDto.getPassword())) {
            return true;
          }
          return false;
        }
        return false;
      } catch (Exception e) {
        LOGGER.error("#checkPasswordCode: " + e);
        return false;
      }
    }
    return false;
  }

  /**
   * cap nhat mat khau
   * 
   * @param dangNhapDto
   * @return true, if successful
   */
  @Override
  @Transactional
  public boolean updateIfForgotPassword(LoginDto dangNhapDto) {
    if (dangNhapDto != null) {
      try {
        User nd = userDao.getUserByPhone(dangNhapDto.getPhoneNumber());
        if (nd != null) {
          nd.setUserPassword(MD5Utils.encrypt(dangNhapDto.getPassword()));
          // reset lai ma mat khau
          nd.setPasswordCode("");
          return userDao.updateUser(nd);
        }
        return false;
      } catch (Exception e) {
        LOGGER.error("#capNhatUserPassword: " + e);
        return false;
      }
    }
    return false;
  }

  @Override
  @Transactional
  public User registerSocial(RegisterSocialDto registerSocialDto) {
    User nguoiDung = new User();
    if (registerSocialDto != null) {
      try {

        nguoiDung.setUserPhone(registerSocialDto.getUserPhone());
        nguoiDung.setUserName(registerSocialDto.getUserName());
        nguoiDung.setUserEmail(registerSocialDto.getUserEmail());
        nguoiDung.setStatus(registerSocialDto.getStatus());
        nguoiDung.setActivationCodeTimes(registerSocialDto.getActivationCodeTimes());
        nguoiDung.setActivationCode(registerSocialDto.getActivationCode());

        nguoiDung.setRoleId(ValueConstants.CONST_ROLE_USER);
        nguoiDung.setCreateDate(DateUtils.now());

        userDao.addUser(nguoiDung);
      } catch (Exception e) {
        LOGGER.error("#dangkyNguoiDung: " + e);
      }
    }
    return nguoiDung;
  }
}
