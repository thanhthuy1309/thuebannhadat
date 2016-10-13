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
 * @author : thuyttt
 * @PG_ID : Line_PK
 * @createDate : 04.08.2016
 */
public class Line_PK implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init stadiumId **/
  private Integer stadiumId;

  /** Init standId **/
  private Integer standId;

  /** Init floorId **/
  private Integer floorId;

  /** Init gateId **/
  private Integer gateId;

  /** Init lineNumber **/
  private Integer lineNumber;

  /** Init lineSide **/
  private Integer lineSide;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((stadiumId == null) ? 0 : stadiumId.hashCode());
    result = prime * result + ((standId == null) ? 0 : standId.hashCode());
    result = prime * result + ((floorId == null) ? 0 : floorId.hashCode());
    result = prime * result + ((gateId == null) ? 0 : gateId.hashCode());
    result = prime * result + ((lineNumber == null) ? 0 : lineNumber.hashCode());
    result = prime * result + ((lineSide == null) ? 0 : lineSide.hashCode());
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

    Line_PK other = (Line_PK) obj;

    if (stadiumId == null) {
      if (other.stadiumId != null) {
        return false;
      }
    } else if (!stadiumId.equals(other.stadiumId)) {
      return false;
    }

    if (standId == null) {
      if (other.standId != null) {
        return false;
      }
    } else if (!standId.equals(other.standId)) {
      return false;
    }

    if (floorId == null) {
      if (other.floorId != null) {
        return false;
      }
    } else if (!floorId.equals(other.floorId)) {
      return false;
    }

    if (gateId == null) {
      if (other.gateId != null) {
        return false;
      }
    } else if (!gateId.equals(other.gateId)) {
      return false;
    }

    if (lineNumber == null) {
      if (other.lineNumber != null) {
        return false;
      }
    } else if (!lineNumber.equals(other.lineNumber)) {
      return false;
    }
    
    if (lineSide == null) {
      if (other.lineSide != null) {
        return false;
      }
    } else if (!lineSide.equals(other.lineSide)) {
      return false;
    }
    return true;
  }

  /**
   * @return the stadiumId
   */
  public Integer getStadiumId() {
    return stadiumId;
  }

  /**
   * @param stadiumId the stadiumId to set
   */
  public void setStadiumId(Integer stadiumId) {
    this.stadiumId = stadiumId;
  }

  /**
   * @return the standId
   */
  public Integer getStandId() {
    return standId;
  }

  /**
   * @param standId the standId to set
   */
  public void setStandId(Integer standId) {
    this.standId = standId;
  }

  /**
   * @return the floorId
   */
  public Integer getFloorId() {
    return floorId;
  }

  /**
   * @param floorId the floorId to set
   */
  public void setFloorId(Integer floorId) {
    this.floorId = floorId;
  }

  /**
   * @return the gateId
   */
  public Integer getGateId() {
    return gateId;
  }

  /**
   * @param gateId the gateId to set
   */
  public void setGateId(Integer gateId) {
    this.gateId = gateId;
  }

  /**
   * @return the lineNumber
   */
  public Integer getLineNumber() {
    return lineNumber;
  }

  /**
   * @param lineNumber the lineNumber to set
   */
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  /**
   * @return the lineSide
   */
  public Integer getLineSide() {
    return lineSide;
  }

  /**
   * @param lineSide the lineSide to set
   */
  public void setLineSide(Integer lineSide) {
    this.lineSide = lineSide;
  }

}
