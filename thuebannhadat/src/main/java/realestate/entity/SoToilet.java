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
 * @PG_ID : SoToilet
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_sotoilet")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "trangthai = 1")
public class SoToilet extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idSoToilet **/
  @Id
  @Column(name = "id_sotoilet", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idSoToilet;

  /** Init soToilet **/
  @Column(name = "sotoilet", length = 10, nullable = false, unique = true)
  private String soToilet;

  public Integer getIdSoToilet() {
    return idSoToilet;
  }

  public void setIdSoToilet(Integer idSoToilet) {
    this.idSoToilet = idSoToilet;
  }

  public String getSoToilet() {
    return soToilet;
  }

  public void setSoToilet(String soToilet) {
    this.soToilet = soToilet;
  }
}
