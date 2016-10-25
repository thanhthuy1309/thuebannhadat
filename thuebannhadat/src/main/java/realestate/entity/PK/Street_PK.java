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
 * @PG_ID : Street_PK
 * @createDate : 04.08.2016
 */
public class Street_PK implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init districtId **/
  private String districtId;

  /** Init cityId **/
  private String cityId;
  
  /** Init streetId **/
  private String streetId;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((districtId == null) ? 0 : districtId.hashCode());
    result = prime * result + ((cityId == null) ? 0 : cityId.hashCode());
    result = prime * result + ((streetId == null) ? 0 : streetId.hashCode());
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

    Street_PK other = (Street_PK) obj;

    if (districtId == null) {
      if (other.districtId != null) {
        return false;
      }
    } else if (!districtId.equals(other.districtId)) {
      return false;
    }

    if (cityId == null) {
      if (other.cityId != null) {
        return false;
      }
    } else if (!cityId.equals(other.cityId)) {
      return false;
    }
    
    if (streetId == null) {
      if (other.streetId != null) {
        return false;
      }
    } else if (!streetId.equals(other.streetId)) {
      return false;
    }
    return true;
  }

  public String getDistrictId() {
    return districtId;
  }

  public void setDistrictId(String districtId) {
    this.districtId = districtId;
  }

  public String getCityId() {
    return cityId;
  }

  public void setCityId(String cityId) {
    this.cityId = cityId;
  }

  public String getStreetId() {
    return streetId;
  }

  public void setStreetId(String streetId) {
    this.streetId = streetId;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
