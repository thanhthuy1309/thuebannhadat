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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

/**
 * @author : DungPT
 * @PG_ID : LoaiGiaoDich
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_loaigiaodich")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "trangthai = 1")
public class LoaiGiaoDich extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idLoaiGiaoDich **/
  @Id
  @Column(name = "id_loaigiaodich", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idLoaiGiaoDich;

  /** Init tenLoaiGiaoDich **/
  @Column(name = "ten_loaigiaodich", length = 250, nullable = false)
  private String tenLoaiGiaoDich;

  public Integer getIdLoaiGiaoDich() {
    return idLoaiGiaoDich;
  }

  public void setIdLoaiGiaoDich(Integer idLoaiGiaoDich) {
    this.idLoaiGiaoDich = idLoaiGiaoDich;
  }

  public String getTenLoaiGiaoDich() {
    return tenLoaiGiaoDich;
  }

  public void setTenLoaiGiaoDich(String tenLoaiGiaoDich) {
    this.tenLoaiGiaoDich = tenLoaiGiaoDich;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
