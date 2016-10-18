/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.entity;

import java.math.BigDecimal;

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
 * @PG_ID : GiaTin
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_giatin")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "trangthai = 1")
public class GiaTin extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idGiaTin **/
  @Id
  @Column(name = "id_giatin", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idGiaTin;

  /** Init giaTin **/
  @Column(name = "giatin", nullable = false, unique = true)
  private BigDecimal giaTin;

  public Integer getIdGiaTin() {
    return idGiaTin;
  }

  public void setIdGiaTin(Integer idGiaTin) {
    this.idGiaTin = idGiaTin;
  }

  public BigDecimal getGiaTin() {
    return giaTin;
  }

  public void setGiaTin(BigDecimal giaTin) {
    this.giaTin = giaTin;
  }
}
