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
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

/**
 * @author : DungPT
 * @PG_ID : ThanhPho
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_thanhpho")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "trangthai = 1")
public class ThanhPho implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idThanhPho **/
  @Id
  @Column(name = "id_thanhpho", nullable = false, length = 250)
  private String idThanhPho;

  /** Init tenThanhPho **/
  @Column(name = "ten_thanhpho", length = 250, nullable = false)
  private String tenThanhPho;

  /** Init trangThai **/
  @Column(name = "trangthai", length = 1, nullable = false)
  private Integer trangThai;

  /** Init listQuanHuyen **/
  @OneToMany(mappedBy = "thanhPho", cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = QuanHuyen.class)
  private List<QuanHuyen> listQuanHuyen;

  /** Init thuTu **/
  @Column(name = "thutu", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer thuTu;

  public String getTenThanhPho() {
    return tenThanhPho;
  }

  public void setTenThanhPho(String tenThanhPho) {
    this.tenThanhPho = tenThanhPho;
  }

  public Integer getTrangThai() {
    return trangThai;
  }

  public void setTrangThai(Integer trangThai) {
    this.trangThai = trangThai;
  }

  public List<QuanHuyen> getListQuanHuyen() {
    return listQuanHuyen;
  }

  public void setListQuanHuyen(List<QuanHuyen> listQuanHuyen) {
    this.listQuanHuyen = listQuanHuyen;
  }

  public String getIdThanhPho() {
    return idThanhPho;
  }

  public void setIdThanhPho(String idThanhPho) {
    this.idThanhPho = idThanhPho;
  }

  public Integer getThuTu() {
    return thuTu;
  }

  public void setThuTu(Integer thuTu) {
    this.thuTu = thuTu;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
