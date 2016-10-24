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
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

/**
 * @author : DungPT
 * @PG_ID : HinhAnhTin
 * @createDate : 21.08.2016
 */
@Entity
@Table(name = "tbl_hinhanhtin")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class HinhAnhTin extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idHinhAnhTin **/
  @Id
  @Column(name = "id_hinhanhtin", length = 250, nullable = false)
  private String idHinhAnhTin;

  /** Init idMauTin **/
  @Column(name = "id_mautin", nullable = false, length = 250)
  private String idMauTin;

  /** Init tenHinhAnh **/
  @Column(name = "ten_hinhanhtin", nullable = false, length = 250)
  private String tenHinhAnh;

  /** Init order **/
  @Column(name = "order", length = 2, nullable = false, columnDefinition = "TINYINT(2) UNSIGNED")
  private Integer order;

  public String getIdMauTin() {
    return idMauTin;
  }

  public void setIdMauTin(String idMauTin) {
    this.idMauTin = idMauTin;
  }

  public String getIdHinhAnhTin() {
    return idHinhAnhTin;
  }

  public void setIdHinhAnhTin(String idHinhAnhTin) {
    this.idHinhAnhTin = idHinhAnhTin;
  }

  public String getTenHinhAnh() {
    return tenHinhAnh;
  }

  public void setTenHinhAnh(String tenHinhAnh) {
    this.tenHinhAnh = tenHinhAnh;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
