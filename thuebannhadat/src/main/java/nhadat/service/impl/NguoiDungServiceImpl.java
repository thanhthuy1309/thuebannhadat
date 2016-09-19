/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package nhadat.service.impl;

import java.math.BigDecimal;

import nhadat.common.ValidStatusEnum;
import nhadat.constants.ValueConstants;
import nhadat.dao.NguoiDungDao;
import nhadat.dto.DangKyDto;
import nhadat.dto.DangNhapDto;
import nhadat.dto.KichHoatDto;
import nhadat.dto.MatKhauDto;
import nhadat.entity.NguoiDung;
import nhadat.service.NguoiDungService;
import nhadat.utils.DateUtils;
import nhadat.utils.MD5Utils;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : DUNGPT
 * @PG_ID : NguoiDungServiceImpl
 * @createDate : 09.01.2016
 */
@Service
public class NguoiDungServiceImpl implements NguoiDungService {

  /** Init LOGGER. */
  private static final Logger LOGGER = Logger.getLogger(NguoiDungServiceImpl.class);

  @Autowired
  private NguoiDungDao nguoiDungDao;

  /**
   * Lay thong tin nguoi dung dua vao key dienThoai
   * 
   * @param dienThoai
   * 
   * @return NguoiDung
   */
  @Override
  @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
  public NguoiDung getNguoiDungExistByDienThoai(String dienThoai) {
    return nguoiDungDao.getNguoiDungExistByDienThoai(dienThoai);
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
  public NguoiDung getNguoiDungByEmail(String email) {
    return nguoiDungDao.getNguoiDungByEmail(email);
  }

  /**
   * dang ky nguoi dung chua kich hoat tai khoan
   * 
   * @param dangKyDto
   * @return true, if successful
   */
  @Override
  @Transactional
  public boolean dangkyNguoiDung(DangKyDto dangKyDto) {
    if (dangKyDto != null) {
      try {
        NguoiDung nguoiDung = new NguoiDung();

        nguoiDung.setDienThoai(dangKyDto.getDienThoai());
        nguoiDung.setMatKhau(MD5Utils.encrypt(dangKyDto.getMatKhau()));
        nguoiDung.setTrangThai(ValidStatusEnum.FAILED.getValue());
        nguoiDung.setSoCodeKichHoat(0);
        nguoiDung.setSoCodeMatKhau(0);

        nguoiDung.setIdPhanQuyen(ValueConstants.CONST_ROLE_USER);
        nguoiDung.setViTien(new BigDecimal(0));
        nguoiDung.setMaCodeKichHoat(dangKyDto.getMaCodeKichHoat());
        nguoiDung.setNgayTao(DateUtils.now());

        return nguoiDungDao.addNguoiDung(nguoiDung);
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
  public boolean kichhoatNguoiDung(KichHoatDto kichHoatDto) {
    if (kichHoatDto != null) {
      try {
        NguoiDung nd = nguoiDungDao.getNguoiDungExistByDienThoai(kichHoatDto.getDienThoai());
        if (nd != null) {
          if (nd.getMaCodeKichHoat().equals(kichHoatDto.getMaCodeKichHoat())) {
            // set trang thai dc kich hoat la 1
            nd.setTrangThai(ValidStatusEnum.SUCCESSFUL.getValue());
            // reset lai ma kich hoat
            nd.setMaCodeKichHoat("");
            return nguoiDungDao.updateNguoiDung(nd);
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
  public NguoiDung dangNhapByDienThoai(DangNhapDto dangNhapDto) {
    if (dangNhapDto != null) {
      try {
        return nguoiDungDao.checkLoginByDienThoai(dangNhapDto.getDienThoai(),
            MD5Utils.encrypt(dangNhapDto.getMatKhau()));
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
  public boolean layCodeKichHoat(String maCode, NguoiDung nd) {
    if (nd != null) {
      try {
        nd.setMaCodeKichHoat(maCode);
        // tang so lan lay ma code
        // chi duoc lay 5 lan trong 1 ngay
        nd.setSoCodeKichHoat(nd.getSoCodeKichHoat() + 1);
        return nguoiDungDao.updateNguoiDung(nd);
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
  public boolean layCodeQuenMatKhau(String maCode, NguoiDung nd) {
    if (nd != null) {
      try {
        nd.setMaCodeMatKhau(maCode);
        // tang so lan lay ma code
        // chi duoc lay 5 lan trong 1 ngay
        nd.setSoCodeMatKhau(nd.getSoCodeMatKhau() + 1);
        return nguoiDungDao.updateNguoiDung(nd);
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
  public boolean checkMaCodeMatKhau(MatKhauDto matKhauDto) {
    if (matKhauDto != null) {
      try {
        NguoiDung nd = nguoiDungDao.getNguoiDungExistByDienThoai(matKhauDto.getDienThoai());
        if (nd != null) {
          if (nd.getMaCodeMatKhau().equals(matKhauDto.getMaCodeMatKhau())) {
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
  public boolean capNhatQuenMatKhau(DangNhapDto dangNhapDto) {
    if (dangNhapDto != null) {
      try {
        NguoiDung nd = nguoiDungDao.getNguoiDungExistByDienThoai(dangNhapDto.getDienThoai());
        if (nd != null) {
            nd.setMatKhau(MD5Utils.encrypt(dangNhapDto.getDienThoai()));
            // reset lai ma mat khau
            nd.setMaCodeMatKhau("");
            return nguoiDungDao.updateNguoiDung(nd);
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
