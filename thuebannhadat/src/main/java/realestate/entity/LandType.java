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
 * @PG_ID : LandType
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_land_type")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class LandType extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idLoaiHinhDat **/
  @Id
  @Column(name = "land_type_id", nullable = false, length = 250)
  private String landTypeId;

  /** Init tenLoaiHinhDat **/
  @Column(name = "land_type_name", length = 250, nullable = false)
  private String landTypeName;

  /** Init listLoaiNhaDat **/
  @OneToMany(mappedBy = "landType", cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = HousingType.class)
  private List<HousingType> housingTypeList;

  public String getLandTypeId() {
    return landTypeId;
  }

  public void setLandTypeId(String landTypeId) {
    this.landTypeId = landTypeId;
  }

  public String getLandTypeName() {
    return landTypeName;
  }

  public void setLandTypeName(String landTypeName) {
    this.landTypeName = landTypeName;
  }

  public List<HousingType> getHousingTypeList() {
    return housingTypeList;
  }

  public void setHousingTypeList(List<HousingType> housingTypeList) {
    this.housingTypeList = housingTypeList;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
