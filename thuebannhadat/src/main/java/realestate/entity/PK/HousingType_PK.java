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
 * @PG_ID :HousingType_PK (LoaiNhaDat_PK)
 * @createDate : 09.01.2016
 */
public class HousingType_PK implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init housingTypeId **/
  private String housingTypeId;

  /** Init landTypeId **/
  private String landTypeId;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((housingTypeId == null) ? 0 : housingTypeId.hashCode());
    result = prime * result + ((landTypeId == null) ? 0 : landTypeId.hashCode());
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

    HousingType_PK other = (HousingType_PK) obj;

    if (housingTypeId == null) {
      if (other.housingTypeId != null) {
        return false;
      }
    } else if (!housingTypeId.equals(other.housingTypeId)) {
      return false;
    }

    if (landTypeId == null) {
      if (other.landTypeId != null) {
        return false;
      }
    } else if (!landTypeId.equals(other.landTypeId)) {
      return false;
    }
    return true;
  }

  public String getHousingTypeId() {
    return housingTypeId;
  }

  public void setHousingTypeId(String housingTypeId) {
    this.housingTypeId = housingTypeId;
  }

  public String getLandTypeId() {
    return landTypeId;
  }

  public void setLandTypeId(String landTypeId) {
    this.landTypeId = landTypeId;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
