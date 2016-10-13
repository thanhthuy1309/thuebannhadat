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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import realestate.entity.PK.MenuCon_PK;

/**
 * @author : DungPT
 * @PG_ID : MenuCon
 * @createDate : 21.08.2016
 */
@Entity
@Table(name = "tbl_menucon")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@IdClass(MenuCon_PK.class)
public class MenuCon implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idMenuCon **/
  @Id
  @Column(name = "id_menucon", nullable = false, length = 250)
  private String idMenuCon;

  /** Init idMenuChinh **/
  @Id
  @Column(name = "id_menuchinh", nullable = false, length = 250)
  private String idMenuChinh;
  
  /** Init tenMenuCon **/
  @Column(name = "ten_menuchinh", length = 250, nullable = false)
  private String tenMenuCon;

  /** Init trangThai **/
  @Column(name = "trangthai", length = 1, nullable = false)
  private Integer trangThai;

  /** Init thuTu **/
  @Column(name = "thutu", length = 2, nullable = false, unique = true)
  private Integer thuTu;

  /** Init url **/
  @Column(name = "url", length = 250, nullable = false)
  private String url;

  /** Init menuChinh **/
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_menuchinh", referencedColumnName = "id_menuchinh", insertable = false, updatable = false)
  private MenuChinh menuChinh;

  public String getIdMenuCon() {
    return idMenuCon;
  }

  public void setIdMenuCon(String idMenuCon) {
    this.idMenuCon = idMenuCon;
  }

  public String getTenMenuCon() {
    return tenMenuCon;
  }

  public void setTenMenuCon(String tenMenuCon) {
    this.tenMenuCon = tenMenuCon;
  }

  public Integer getTrangThai() {
    return trangThai;
  }

  public void setTrangThai(Integer trangThai) {
    this.trangThai = trangThai;
  }

  public Integer getThuTu() {
    return thuTu;
  }

  public void setThuTu(Integer thuTu) {
    this.thuTu = thuTu;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getIdMenuChinh() {
    return idMenuChinh;
  }

  public void setIdMenuChinh(String idMenuChinh) {
    this.idMenuChinh = idMenuChinh;
  }

  public MenuChinh getMenuChinh() {
    return menuChinh;
  }

  public void setMenuChinh(MenuChinh menuChinh) {
    this.menuChinh = menuChinh;
  }
  
}
