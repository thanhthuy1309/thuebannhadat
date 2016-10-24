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
 * @PG_ID : PhanQuyen
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_phanquyen")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class PhanQuyen extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init phanQuyenId **/
  /* co 2 quyen 1 : admin, 2 : user */
  @Id
  @Column(name = "id_phanquyen", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idPhanQuyen;

  /** Init tenPhanQuyen **/
  @Column(name = "ten_phanquyen", length = 250, nullable = false, unique = true)
  private String tenPhanQuyen;

  public Integer getIdPhanQuyen() {
    return idPhanQuyen;
  }

  public void setIdPhanQuyen(Integer idPhanQuyen) {
    this.idPhanQuyen = idPhanQuyen;
  }

  public String getTenPhanQuyen() {
    return tenPhanQuyen;
  }

  public void setTenPhanQuyen(String tenPhanQuyen) {
    this.tenPhanQuyen = tenPhanQuyen;
  }
}
