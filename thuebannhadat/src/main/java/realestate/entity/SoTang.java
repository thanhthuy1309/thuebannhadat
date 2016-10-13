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
 * @PG_ID : SoTang
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_sotang")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SoTang implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idSoTang **/
  @Id
  @Column(name = "id_sotang", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idSoTang;

  /** Init soTang **/
  @Column(name = "sotang", length = 10, nullable = false, unique = true)
  private String soTang;

  /** Init trangThai **/
  @Column(name = "trangthai", length = 1, nullable = false)
  private Integer trangThai;

  public Integer getIdSoTang() {
    return idSoTang;
  }

  public void setIdSoTang(Integer idSoTang) {
    this.idSoTang = idSoTang;
  }

  public String getSoTang() {
    return soTang;
  }

  public void setSoTang(String soTang) {
    this.soTang = soTang;
  }

  public Integer getTrangThai() {
    return trangThai;
  }

  public void setTrangThai(Integer trangThai) {
    this.trangThai = trangThai;
  }
}
