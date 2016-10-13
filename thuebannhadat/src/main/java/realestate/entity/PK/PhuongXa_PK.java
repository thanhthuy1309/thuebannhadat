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
 * @PG_ID : PhuongXa_PK
 * @createDate : 04.08.2016
 */
public class PhuongXa_PK implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idQuanHuyen **/
  private String idQuanHuyen;

  /** Init idThanhPho **/
  private String idThanhPho;
  
  /** Init idPhuongXa **/
  private String idPhuongXa;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((idQuanHuyen == null) ? 0 : idQuanHuyen.hashCode());
    result = prime * result + ((idThanhPho == null) ? 0 : idThanhPho.hashCode());
    result = prime * result + ((idPhuongXa == null) ? 0 : idPhuongXa.hashCode());
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

    PhuongXa_PK other = (PhuongXa_PK) obj;

    if (idQuanHuyen == null) {
      if (other.idQuanHuyen != null) {
        return false;
      }
    } else if (!idQuanHuyen.equals(other.idQuanHuyen)) {
      return false;
    }

    if (idThanhPho == null) {
      if (other.idThanhPho != null) {
        return false;
      }
    } else if (!idThanhPho.equals(other.idThanhPho)) {
      return false;
    }
    
    if (idPhuongXa == null) {
      if (other.idPhuongXa != null) {
        return false;
      }
    } else if (!idPhuongXa.equals(other.idPhuongXa)) {
      return false;
    }
    return true;
  }

  public String getIdQuanHuyen() {
    return idQuanHuyen;
  }

  public void setIdQuanHuyen(String idQuanHuyen) {
    this.idQuanHuyen = idQuanHuyen;
  }

  public String getIdThanhPho() {
    return idThanhPho;
  }

  public void setIdThanhPho(String idThanhPho) {
    this.idThanhPho = idThanhPho;
  }

  public String getIdPhuongXa() {
    return idPhuongXa;
  }

  public void setIdPhuongXa(String idPhuongXa) {
    this.idPhuongXa = idPhuongXa;
  }
}
