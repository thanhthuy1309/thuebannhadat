/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

import realestate.entity.PK.LoaiNhaDat_PK;

/**
 * @author : DungPT
 * @PG_ID : LoaiNhaDat
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_loainhadat")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@IdClass(LoaiNhaDat_PK.class)
@Where(clause = "trangthai = 1")
public class LoaiNhaDat extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idLoaiNhaDat **/
  @Id
  @Column(name = "id_loainhadat", nullable = false, length = 250)
  private String idLoaiNhaDat;

  @Id
  @Column(name = "id_loaihinhdat", nullable = false, length = 250)
  private String idLoaiHinhDat;

  /** Init tenLoaiNhaDat **/
  @Column(name = "ten_loainhadat", length = 250, nullable = false)
  private String tenLoaiNhaDat;

  /** Init loaiHinhDat **/
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_loaihinhdat", insertable = false, updatable = false)
  private LoaiHinhDat loaiHinhDat;

  public String getIdLoaiNhaDat() {
    return idLoaiNhaDat;
  }

  public void setIdLoaiNhaDat(String idLoaiNhaDat) {
    this.idLoaiNhaDat = idLoaiNhaDat;
  }

  public String getTenLoaiNhaDat() {
    return tenLoaiNhaDat;
  }

  public void setTenLoaiNhaDat(String tenLoaiNhaDat) {
    this.tenLoaiNhaDat = tenLoaiNhaDat;
  }

  public LoaiHinhDat getLoaiHinhDat() {
    return loaiHinhDat;
  }

  public void setLoaiHinhDat(LoaiHinhDat loaiHinhDat) {
    this.loaiHinhDat = loaiHinhDat;
  }

  public String getIdLoaiHinhDat() {
    return idLoaiHinhDat;
  }

  public void setIdLoaiHinhDat(String idLoaiHinhDat) {
    this.idLoaiHinhDat = idLoaiHinhDat;
  }
}
