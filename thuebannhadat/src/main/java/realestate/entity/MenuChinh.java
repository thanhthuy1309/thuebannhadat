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

/**
 * @author : DungPT
 * @PG_ID : MenuChinh
 * @createDate : 20.08.2016
 */
@Entity
@Table(name = "tbl_menuchinh")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class MenuChinh implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idMenuChinh **/
  @Id
  @Column(name = "id_menuchinh", nullable = false, length = 250)
  private String idMenuChinh;

  /** Init tenMenuChinh **/
  @Column(name = "ten_menuchinh", length = 250, nullable = false)
  private String tenMenuChinh;

  /** Init trangThai **/
  @Column(name = "trangthai", length = 1, nullable = false)
  private Integer trangThai;

  /** Init thuTu **/
  @Column(name = "thutu", length = 2, nullable = false)
  private Integer thuTu;

  /** Init url **/
  @Column(name = "url", length = 250, nullable = false)
  private String url;

  /** Init listMenuCon **/
  @OneToMany(mappedBy = "menuChinh", cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = MenuCon.class)
  private List<MenuCon> listMenuCon;
  
  public String getIdMenuChinh() {
    return idMenuChinh;
  }

  public void setIdMenuChinh(String idMenuChinh) {
    this.idMenuChinh = idMenuChinh;
  }

  public String getTenMenuChinh() {
    return tenMenuChinh;
  }

  public void setTenMenuChinh(String tenMenuChinh) {
    this.tenMenuChinh = tenMenuChinh;
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

  public List<MenuCon> getListMenuCon() {
    return listMenuCon;
  }

  public void setListMenuCon(List<MenuCon> listMenuCon) {
    this.listMenuCon = listMenuCon;
  }

}
