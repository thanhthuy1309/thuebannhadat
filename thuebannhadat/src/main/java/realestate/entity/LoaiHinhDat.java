/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

/**
 * @author : DungPT
 * @PG_ID : LoaiHinhDat
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_loaihinhdat")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class LoaiHinhDat extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idLoaiHinhDat **/
  @Id
  @Column(name = "id_loaihinhdat", nullable = false, length = 250)
  private String idLoaiHinhDat;

  /** Init tenLoaiHinhDat **/
  @Column(name = "ten_loaihinhdat", length = 250, nullable = false)
  private String tenLoaiHinhDat;

  /** Init listLoaiNhaDat **/
  @OneToMany(mappedBy = "loaiHinhDat", cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = LoaiNhaDat.class)
  private List<LoaiNhaDat> listLoaiNhaDat;

  public String getTenLoaiHinhDat() {
    return tenLoaiHinhDat;
  }

  public void setTenLoaiHinhDat(String tenLoaiHinhDat) {
    this.tenLoaiHinhDat = tenLoaiHinhDat;
  }

  public List<LoaiNhaDat> getListLoaiNhaDat() {
    return listLoaiNhaDat;
  }

  public void setListLoaiNhaDat(List<LoaiNhaDat> listLoaiNhaDat) {
    this.listLoaiNhaDat = listLoaiNhaDat;
  }

  public String getIdLoaiHinhDat() {
    return idLoaiHinhDat;
  }

  public void setIdLoaiHinhDat(String idLoaiHinhDat) {
    this.idLoaiHinhDat = idLoaiHinhDat;
  }

}
