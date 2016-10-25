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

import realestate.entity.PK.HousingType_PK;

/**
 * @author : DungPT
 * @PG_ID : HousingType(LoaiNhaDat)
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_housing_type")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@IdClass(HousingType_PK.class)
@Where(clause = "status = 1")
public class HousingType extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idLoaiNhaDat **/
  @Id
  @Column(name = "housing_type_id", nullable = false, length = 250)
  private String housingTypeId;

  @Id
  @Column(name = "land_type_id", nullable = false, length = 250)
  private String landTypeId;

  /** Init tenLoaiNhaDat **/
  @Column(name = "housing_type_name", length = 250, nullable = false)
  private String housingTypeName;

  /** Init loaiHinhDat **/
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "land_type_id", insertable = false, updatable = false)
  private LandType landType;

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

  public String getHousingTypeName() {
    return housingTypeName;
  }

  public void setHousingTypeName(String housingTypeName) {
    this.housingTypeName = housingTypeName;
  }

  public LandType getLandType() {
    return landType;
  }

  public void setLandType(LandType landType) {
    this.landType = landType;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
