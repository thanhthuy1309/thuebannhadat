/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.entity.PK;

import java.io.Serializable;

/**
 * @author : DUNGPT
 * @PG_ID : SubMenu_PK
 * @createDate : 04.08.2016
 */
public class SubMenu_PK implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init subMenuId **/
  private String subMenuId;

  /** Init mainMenuId **/
  private String mainMenuId;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((subMenuId == null) ? 0 : subMenuId.hashCode());
    result = prime * result + ((mainMenuId == null) ? 0 : mainMenuId.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null) {
      return false;
    }

    if (getClass() != obj.getClass()) {
      return false;
    }

    SubMenu_PK other = (SubMenu_PK) obj;

    if (subMenuId == null) {
      if (other.subMenuId != null) {
        return false;
      }
    } else if (!subMenuId.equals(other.subMenuId)) {
      return false;
    }

    if (mainMenuId == null) {
      if (other.mainMenuId != null) {
        return false;
      }
    } else if (!mainMenuId.equals(other.mainMenuId)) {
      return false;
    }
    return true;
  }

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

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
