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
 * @PG_ID : LoaiNhaDat_PK
 * @createDate : 09.01.2016
 */
public class LoaiNhaDat_PK implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idLoaiNhaDat **/
  private String idLoaiNhaDat;

  /** Init idLoaiHinhDat **/
  private String idLoaiHinhDat;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((idLoaiNhaDat == null) ? 0 : idLoaiNhaDat.hashCode());
    result = prime * result + ((idLoaiHinhDat == null) ? 0 : idLoaiHinhDat.hashCode());
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

    LoaiNhaDat_PK other = (LoaiNhaDat_PK) obj;

    if (idLoaiNhaDat == null) {
      if (other.idLoaiNhaDat != null) {
        return false;
      }
    } else if (!idLoaiNhaDat.equals(other.idLoaiNhaDat)) {
      return false;
    }

    if (idLoaiHinhDat == null) {
      if (other.idLoaiHinhDat != null) {
        return false;
      }
    } else if (!idLoaiHinhDat.equals(other.idLoaiHinhDat)) {
      return false;
    }
    return true;
  }

  public String getIdLoaiNhaDat() {
    return idLoaiNhaDat;
  }

  public void setIdLoaiNhaDat(String idLoaiNhaDat) {
    this.idLoaiNhaDat = idLoaiNhaDat;
  }

  public String getIdLoaiHinhDat() {
    return idLoaiHinhDat;
  }

  public void setIdLoaiHinhDat(String idLoaiHinhDat) {
    this.idLoaiHinhDat = idLoaiHinhDat;
  }

}
