/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.service.impl;

import java.math.BigDecimal;

import realestate.common.ValidStatusEnum;
import realestate.constants.ValueConstants;
import realestate.dao.UserDao;
import realestate.dto.RegisterDto;
import realestate.dto.LoginDto;
import realestate.dto.ActivationDto;
import realestate.dto.PasswordDto;
import realestate.entity.NguoiDung;
import realestate.service.UserService;
import realestate.utils.DateUtils;
import realestate.utils.MD5Utils;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : DUNGPT
 * @PG_ID : UserServiceImpl
 * @createDate : 09.01.2016
 */
@Service
public class UserServiceImpl implements UserService {

  /** Init LOGGER. */
  private static final Logger LOGGER = Logger.getLogger(UserServiceImpl.class);

  @Autowired
  private UserDao userDao;

  /**
   * Lay thong tin nguoi dung dua vao key dienThoai
   * 
   * @param dienThoai
   * 
   * @return NguoiDung
   */
  @Override
  @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
  public NguoiDung getUserByPhone(String dienThoai) {
    return userDao.getUserByPhone(dienThoai);
  }

  /**
   * Lay thong tin nguoi dung dua vao email
   * 
   * @param email
   * 
   * @return NguoiDung
   */
  @Override
  @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
  public NguoiDung getUserByEmail(String email) {
    return userDao.getUserByEmail(email);
  }

  /**
   * dang ky nguoi dung chua kich hoat tai khoan
   * 
   * @param dangKyDto
   * @return true, if successful
   */
  @Override
  @Transactional
  public boolean registerUser(RegisterDto dangKyDto) {
    if (dangKyDto != null) {
      try {
        NguoiDung nguoiDung = new NguoiDung();

        nguoiDung.setDienThoai(dangKyDto.getActivationCode());
        nguoiDung.setMatKhau(MD5Utils.encrypt(dangKyDto.getPassword()));
        nguoiDung.setTrangThai(ValidStatusEnum.FAILED.getValue());
        nguoiDung.setSoCodeKichHoat(0);
        nguoiDung.setSoCodeMatKhau(0);

        nguoiDung.setIdPhanQuyen(ValueConstants.CONST_ROLE_USER);
        nguoiDung.setViTien(new BigDecimal(0));
        nguoiDung.setMaCodeKichHoat(dangKyDto.getActivationCode());
        nguoiDung.setNgayTao(DateUtils.now());

        return userDao.addUser(nguoiDung);
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
  @Override
  @Transactional
  public boolean activateUser(ActivationDto kichHoatDto) {
    if (kichHoatDto != null) {
      try {
        NguoiDung nd = userDao.getUserByPhone(kichHoatDto.getPhoneNumber());
        if (nd != null) {
          if (nd.getMaCodeKichHoat().equals(kichHoatDto.getActivationCode())) {
            // set trang thai dc kich hoat la 1
            nd.setTrangThai(ValidStatusEnum.SUCCESSFUL.getValue());
            // reset lai ma kich hoat
            nd.setMaCodeKichHoat("");
            return userDao.updateUser(nd);
          }
        }
        return false;
      } catch (Exception e) {
        LOGGER.error("#kichhoatNguoiDung: " + e);
        return false;
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
  @Override
  @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
  public NguoiDung loginByPhone(LoginDto dangNhapDto) {
    if (dangNhapDto != null) {
      try {
        return userDao.checkLoginByPhone(dangNhapDto.getPhoneNumber(),
            MD5Utils.encrypt(dangNhapDto.getPassword()));
      } catch (Exception e) {
        LOGGER.error("#dangNhapByDienThoai: " + e);
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
  @Override
  @Transactional
  public boolean getActivationCode(String maCode, NguoiDung nd) {
    if (nd != null) {
      try {
        nd.setMaCodeKichHoat(maCode);
        // tang so lan lay ma code
        // chi duoc lay 5 lan trong 1 ngay
        nd.setSoCodeKichHoat(nd.getSoCodeKichHoat() + 1);
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
  @Override
  @Transactional
  public boolean getActivationCodeIfForgotPassword(String maCode, NguoiDung nd) {
    if (nd != null) {
      try {
        nd.setMaCodeMatKhau(maCode);
        // tang so lan lay ma code
        // chi duoc lay 5 lan trong 1 ngay
        nd.setSoCodeMatKhau(nd.getSoCodeMatKhau() + 1);
        return userDao.updateUser(nd);
      } catch (Exception e) {
        LOGGER.error("#layCodeQuenMatKhau: " + e);
        return false;
      }
    }
    return false;
  }

  /**
   * check ma code mat khau co dung khong
   * Neu dung thi chuyen sang man hinh nhap mat khau moi
   * 
   * @param matKhauDto
   * @return true, if successful
   */
  @Override
  @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
  public boolean checkPassword(PasswordDto matKhauDto) {
    if (matKhauDto != null) {
      try {
        NguoiDung nd = userDao.getUserByPhone(matKhauDto.getPhoneNumber());
        if (nd != null) {
          if (nd.getMaCodeMatKhau().equals(matKhauDto.getPassword())) {
            return true;
          }
          return false;
        }
        return false;
      } catch (Exception e) {
        LOGGER.error("#checkMaCodeMatKhau: " + e);
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
        NguoiDung nd = userDao.getUserByPhone(dangNhapDto.getPhoneNumber());
        if (nd != null) {
            nd.setMatKhau(MD5Utils.encrypt(dangNhapDto.getPassword()));
            // reset lai ma mat khau
            nd.setMaCodeMatKhau("");
            return userDao.updateUser(nd);
        }
        return false;
      } catch (Exception e) {
        LOGGER.error("#capNhatMatKhau: " + e);
        return false;
      }
    }
    return false;
  }

}
