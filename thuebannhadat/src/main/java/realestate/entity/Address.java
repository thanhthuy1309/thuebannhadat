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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

import realestate.entity.PK.Duong_PK;

/**
 * @author : DungPT
 * @PG_ID : (Address)Duong
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_address")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@IdClass(Duong_PK.class)
@Where(clause = "status = 1")
public class Address extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idDuong **/
  @Id
  @Column(name = "address_id", nullable = false, length = 250)
  private String addressId;

  /** Init idQuanHuyen **/
  @Id
  @Column(name = "district_id", nullable = false, length = 250)
  private String districtId;

  @Id
  @Column(name = "city_id", nullable = false, length = 250)
  private String city_Id;

  /** Init tenDuong **/
  @Column(name = "address_name", length = 250, nullable = false)
  private String addressName;

  /** Init quanHuyen **/
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumns({
      @JoinColumn(name = "city_id", referencedColumnName = "city_id", insertable = false, updatable = false),
      @JoinColumn(name = "district_id", referencedColumnName = "district_id", insertable = false, updatable = false) })
  private QuanHuyen district;
}
