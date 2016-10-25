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
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

/**
 * @author : DungPT
 * @PG_ID : HouseDirection(HuongNha)
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_house_direction")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class HouseDirection extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idHuongNha **/
  @Id
  @Column(name = "house_direction_id", nullable = false, length = 250)
  private String houseDirectionId;

  /** Init tenHuongNha **/
  @Column(name = "house_direction_name", length = 250, nullable = false, unique = true)
  private String houseDirectionName;

  public String getHouseDirectionId() {
    return houseDirectionId;
  }

  public void setHouseDirectionId(String houseDirectionId) {
    this.houseDirectionId = houseDirectionId;
  }

  public String getHouseDirectionName() {
    return houseDirectionName;
  }

  public void setHouseDirectionName(String houseDirectionName) {
    this.houseDirectionName = houseDirectionName;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
