/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author : DungPT
 * @PG_ID : AbstractEntity
 * @createDate : 17.10.2016
 */
@MappedSuperclass
public class AbstractEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Trang thai tin : 0 chua kich thoat. 1 kich hoat
   */
  @Column(name = "status", length = 1, nullable = false, columnDefinition = "TINYINT(1) UNSIGNED DEFAULT 0")
  private Integer status;

  /** Init ngayTao **/
  @Column(name = "createdate", columnDefinition = "TIMESTAMP  DEFAULT 0")
  private Date createDate;

  /** Init ngaycapnhat **/
  @Column(name = "updatedate", columnDefinition = "TIMESTAMP  DEFAULT 0")
  private Date updateDate;

  @Column(name = "createuser", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
  private String createUser;

  @Column(name = "updateuser", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
  private String updateUser;

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public String getUpdateUser() {
    return updateUser;
  }

  public void setUpdateUser(String updateUser) {
    this.updateUser = updateUser;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }
}
