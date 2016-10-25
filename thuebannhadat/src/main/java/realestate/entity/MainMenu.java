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
 * @PG_ID : MainMenu
 * @createDate : 20.08.2016
 */
@Entity
@Table(name = "tbl_main_menu")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class MainMenu extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idMenuChinh **/
  @Id
  @Column(name = "main_menu_id", nullable = false, length = 250)
  private String mainMenuId;

  /** Init tenMenuChinh **/
  @Column(name = "main_menu_name", length = 250, nullable = false)
  private String mainMenuName;

  /** Init thuTu **/
  @Column(name = "order", length = 2, nullable = false, columnDefinition = "TINYINT(2) UNSIGNED")
  private Short order;

  /** Init url **/
  @Column(name = "url", length = 250, nullable = false)
  private String url;

  /** Init listMenuCon **/
  @OneToMany(mappedBy = "mainMenu", cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = SubMenu.class)
  private List<SubMenu> subMenuList;

  public String getMainMenuId() {
    return mainMenuId;
  }

  public void setMainMenuId(String mainMenuId) {
    this.mainMenuId = mainMenuId;
  }

  public String getMainMenuName() {
    return mainMenuName;
  }

  public void setMainMenuName(String mainMenuName) {
    this.mainMenuName = mainMenuName;
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

  public List<SubMenu> getSubMenuList() {
    return subMenuList;
  }

  public void setSubMenuList(List<SubMenu> subMenuList) {
    this.subMenuList = subMenuList;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
