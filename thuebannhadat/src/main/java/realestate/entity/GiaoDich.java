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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

/**
 * @author : DungPT
 * @PG_ID : GiaoDich
 * @createDate : 09.01.2016
 */
@Entity
@Table(name = "tbl_giaodich")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class GiaoDich extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idGiaoDich **/
  @Id
  @Column(name = "id_giaodich", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idGiaoDich;

  @Column(name = "id_nguoidung", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  private Integer idNguoiDung;

  /** Init idLoaiGiaoDich **/
  @Column(name = "id_loaigiaodich", nullable = false)
  private Integer idLoaiGiaoDich;

  /** Init tienGiaoDich **/
  @Column(name = "tien_giaodich", columnDefinition = "INT(11) UNSIGNED DEFAULT 0")
  private Integer tienGiaoDich;

  /** Init tienNap **/
  @Column(name = "tien_nap", columnDefinition = "INT(11) UNSIGNED DEFAULT 0")
  private Integer tienNap;
}
