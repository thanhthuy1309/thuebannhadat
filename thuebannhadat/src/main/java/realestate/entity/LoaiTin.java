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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

/**
 * @author : DungPT
 * @PG_ID : LoaiTin
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_loaitin")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "trangthai = 1")
public class LoaiTin extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idLoaiTin **/
  @Id
  @Column(name = "id_loaitin", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idLoaiTin;

  /** Init tenLoaiTin **/
  @Column(name = "ten_loaitin", length = 250, nullable = false, unique = true)
  private String tenLoaiTin;

  @Column(name = "id_giatin", nullable = false, length = 250)
  private Integer idGiaTin;

  /** Init giaTin **/
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_giatin", insertable = false, updatable = false)
  private GiaTin giaTin;

  public Integer getIdLoaiTin() {
    return idLoaiTin;
  }

  public void setIdLoaiTin(Integer idLoaiTin) {
    this.idLoaiTin = idLoaiTin;
  }

  public String getTenLoaiTin() {
    return tenLoaiTin;
  }

  public void setTenLoaiTin(String tenLoaiTin) {
    this.tenLoaiTin = tenLoaiTin;
  }

  public Integer getIdGiaTin() {
    return idGiaTin;
  }

  public void setIdGiaTin(Integer idGiaTin) {
    this.idGiaTin = idGiaTin;
  }

  public GiaTin getGiaTin() {
    return giaTin;
  }

  public void setGiaTin(GiaTin giaTin) {
    this.giaTin = giaTin;
  }
}
