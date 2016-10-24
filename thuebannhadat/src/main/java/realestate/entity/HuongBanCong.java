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
 * @PG_ID : HuongBanCong
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_huongbancong")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class HuongBanCong extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idHuongBanCong **/
  @Id
  @Column(name = "id_huongbancong", nullable = false, length = 250)
  private String idHuongBanCong;

  /** Init tenHuongBanCong **/
  @Column(name = "ten_huongbancong", length = 250, nullable = false, unique = true)
  private String tenHuongBanCong;

  public String getTenHuongBanCong() {
    return tenHuongBanCong;
  }

  public void setTenHuongBanCong(String tenHuongBanCong) {
    this.tenHuongBanCong = tenHuongBanCong;
  }

  public String getIdHuongBanCong() {
    return idHuongBanCong;
  }

  public void setIdHuongBanCong(String idHuongBanCong) {
    this.idHuongBanCong = idHuongBanCong;
  }

}
