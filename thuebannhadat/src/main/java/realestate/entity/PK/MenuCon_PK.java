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
 * @PG_ID : MenuCon_PK
 * @createDate : 04.08.2016
 */
public class MenuCon_PK implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idMenuCon **/
  private String idMenuCon;

  /** Init idMenuChinh **/
  private String idMenuChinh;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((idMenuCon == null) ? 0 : idMenuCon.hashCode());
    result = prime * result + ((idMenuChinh == null) ? 0 : idMenuChinh.hashCode());
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

    MenuCon_PK other = (MenuCon_PK) obj;

    if (idMenuCon == null) {
      if (other.idMenuCon != null) {
        return false;
      }
    } else if (!idMenuCon.equals(other.idMenuCon)) {
      return false;
    }

    if (idMenuChinh == null) {
      if (other.idMenuChinh != null) {
        return false;
      }
    } else if (!idMenuChinh.equals(other.idMenuChinh)) {
      return false;
    }
    return true;
  }
}
