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

import org.hibernate.annotations.Type;

/**
 * @author : DungPT
 * @PG_ID : FooterLinkBan
 * @createDate : 17.10.2016
 */
@MappedSuperclass
public class AbstractEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Trang thai tin. 0: chua kich thoat 1: kich hoat
   */
  @Column(name = "trangthai", length = 1, nullable = false, columnDefinition = "TINYINT(1) UNSIGNED DEFAULT 0")
  @Type(type = "org.hibernate.type.NumericBooleanType")
  private boolean trangThai;

  /** Init ngayTao **/
  @Column(name = "ngaytao")
  private Date ngayTao;

  /** Init ngaycapnhat **/
  @Column(name = "ngaycapnhat")
  private Date ngayCapNhat;

  @Column(name = "nguoitao", length = 250)
  private String nguoiTao;

  @Column(name = "nguoicapnhat", length = 250)
  private String nguoiCapNhat;
}
