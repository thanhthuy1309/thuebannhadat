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
 * @PG_ID : SearchDienTich
 * @createDate : 21.08.2016
 */
@Entity
@Table(name = "tbl_searchdientich")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SearchDienTich implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idSearchDienTich **/
  @Id
  @Column(name = "id_searchdientich", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idSearchDienTich;

  /** Init loaiDienTich **/
  @Column(name = "loaidientich", nullable = false, unique = true)
  private Float loaiDienTich;

  /** Init trangThai **/
  @Column(name = "trangthai", length = 1, nullable = false)
  private Integer trangThai;

  public Integer getIdSearchDienTich() {
    return idSearchDienTich;
  }

  public void setIdSearchDienTich(Integer idSearchDienTich) {
    this.idSearchDienTich = idSearchDienTich;
  }

  public Float getLoaiDienTich() {
    return loaiDienTich;
  }

  public void setLoaiDienTich(Float loaiDienTich) {
    this.loaiDienTich = loaiDienTich;
  }

  public Integer getTrangThai() {
    return trangThai;
  }

  public void setTrangThai(Integer trangThai) {
    this.trangThai = trangThai;
  }

}
