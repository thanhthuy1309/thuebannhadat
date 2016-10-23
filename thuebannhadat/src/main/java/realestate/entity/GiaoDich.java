/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

/**
 * @author : DungPT
 * @PG_ID : GiaoDich
 * @createDate : 09.01.2016
 */
@Entity
@Table(name = "tbl_giaodich")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "trangthai = 1")
public class GiaoDich extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idGiaoDich **/
  @Id
  @Column(name = "id_giaodich", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idGiaoDich;

  /** Init idLoaiGiaoDich **/
  @Column(name = "id_loaigiaodich", nullable = false)
  private Integer idLoaiGiaoDich;

  /** Init tienGiaoDich **/
  @Column(name = "tien_giaodich", columnDefinition = "DECIMAL(19,2) DEFAULT '0.00'")
  private BigDecimal tienGiaoDich;

  /** Init tienNap **/
  @Column(name = "tien_nap", columnDefinition = "DECIMAL(19,2) DEFAULT '0.00'")
  private BigDecimal tienNap;

  public Integer getIdGiaoDich() {
    return idGiaoDich;
  }

  public void setIdGiaoDich(Integer idGiaoDich) {
    this.idGiaoDich = idGiaoDich;
  }

  public Integer getIdLoaiGiaoDich() {
    return idLoaiGiaoDich;
  }

  public void setIdLoaiGiaoDich(Integer idLoaiGiaoDich) {
    this.idLoaiGiaoDich = idLoaiGiaoDich;
  }

  public BigDecimal getTienGiaoDich() {
    return tienGiaoDich;
  }

  public void setTienGiaoDich(BigDecimal tienGiaoDich) {
    this.tienGiaoDich = tienGiaoDich;
  }

  public BigDecimal getTienNap() {
    return tienNap;
  }

  public void setTienNap(BigDecimal tienNap) {
    this.tienNap = tienNap;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

}
