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
 * @PG_ID : DonViGia
 * @createDate : 21.08.2016
 */
@Entity
@Table(name = "tbl_donvigia")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "trangthai = 1")
public class DonViGia extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idDonViGia **/
  @Id
  @Column(name = "id_donvigia", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idDonViGia;

  /** Init tenDonViGia **/
  @Column(name = "ten_donvigia", length = 50)
  private String tenDonViGia;

  public Integer getIdDonViGia() {
    return idDonViGia;
  }

  public void setIdDonViGia(Integer idDonViGia) {
    this.idDonViGia = idDonViGia;
  }

  public String getTenDonViGia() {
    return tenDonViGia;
  }

  public void setTenDonViGia(String tenDonViGia) {
    this.tenDonViGia = tenDonViGia;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
