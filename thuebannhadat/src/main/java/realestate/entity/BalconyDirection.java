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
 * @PG_ID : BalconyDirection(HuongBanCong)
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_balcony_direction")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class BalconyDirection extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idHuongBanCong **/
  @Id
  @Column(name = "balcony_direction_id", nullable = false, length = 250)
  private String balconyDirectionId;

  /** Init tenHuongBanCong **/
  @Column(name = "balcony_direction_name", length = 250, nullable = false, unique = true)
  private String balconyDirectionName;

  public String getBalconyDirectionId() {
    return balconyDirectionId;
  }

  public void setBalconyDirectionId(String balconyDirectionId) {
    this.balconyDirectionId = balconyDirectionId;
  }

  public String getBalconyDirectionName() {
    return balconyDirectionName;
  }

  public void setBalconyDirectionName(String balconyDirectionName) {
    this.balconyDirectionName = balconyDirectionName;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
