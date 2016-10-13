/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author : DungPT
 * @PG_ID : ThoiHanTin
 * @createDate : 21.08.2016
 */
@Entity
@Table(name = "tbl_thoihantin")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ThoiHanTin implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idThoiHanTin **/
  @Id
  @Column(name = "id_thoihantin", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idThoiHanTin;

  /** Init thoiHan **/
  @Column(name = "thoihan", length = 2)
  private Integer thoiHan;

  /** Init status **/
  @Column(name = "trangthai", length = 1, nullable = false)
  private Integer trangThai;

  public Integer getIdThoiHanTin() {
    return idThoiHanTin;
  }

  public void setIdThoiHanTin(Integer idThoiHanTin) {
    this.idThoiHanTin = idThoiHanTin;
  }

  public Integer getThoiHan() {
    return thoiHan;
  }

  public void setThoiHan(Integer thoiHan) {
    this.thoiHan = thoiHan;
  }

  public Integer getTrangThai() {
    return trangThai;
  }

  public void setTrangThai(Integer trangThai) {
    this.trangThai = trangThai;
  }

}