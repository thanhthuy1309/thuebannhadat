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
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

import realestate.entity.PK.SubMenu_PK;

/**
 * @author : DungPT
 * @PG_ID : SubMenu
 * @createDate : 21.08.2016
 */
@Entity
@Table(name = "tbl_sub_menu")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@IdClass(SubMenu_PK.class)
@Where(clause = "status = 1")
public class SubMenu extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idMenuCon **/
  @Id
  @Column(name = "sub_menu_id", nullable = false, length = 250)
  private String subMenuId;

  /** Init idMenuChinh **/
  @Id
  @Column(name = "main_menu_id", nullable = false, length = 250)
  private String mainMenuId;

  /** Init tenMenuCon **/
  @Column(name = "sub_menu_name", length = 250, nullable = false)
  private String subMenuName;

  /** Init thuTu **/
  @Column(name = "order", length = 2, nullable = false, columnDefinition = "TINYINT(2) UNSIGNED")
  private Short order;

  /** Init url **/
  @Column(name = "url", length = 250, nullable = false)
  private String url;

  /** Init menuChinh **/
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "main_menu_id", referencedColumnName = "main_menu_id", insertable = false, updatable = false)
  private MainMenu mainMenu;

  public String getSubMenuId() {
    return subMenuId;
  }

  public void setSubMenuId(String subMenuId) {
    this.subMenuId = subMenuId;
  }

  public String getMainMenuId() {
    return mainMenuId;
  }

  public void setMainMenuId(String mainMenuId) {
    this.mainMenuId = mainMenuId;
  }

  public String getSubMenuName() {
    return subMenuName;
  }

  public void setSubMenuName(String subMenuName) {
    this.subMenuName = subMenuName;
  }

  public Short getOrder() {
    return order;
  }

  public void setOrder(Short order) {
    this.order = order;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public MainMenu getMainMenu() {
    return mainMenu;
  }

  public void setMainMenu(MainMenu mainMenu) {
    this.mainMenu = mainMenu;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
