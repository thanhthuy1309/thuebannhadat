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
 * @PG_ID : FooterLinkThue
 * @createDate : 09.09.2016
 */
@Entity
@Table(name = "tbl_footerlinkthue")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class FooterLinkThue extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idFooterLinkThue **/
  @Id
  @Column(name = "id_footerlinkthue", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idFooterLinkThue;

  /** Init urlFooterLinkThue **/
  @Column(name = "url_footerlinkthue", nullable = false, length = 250)
  private String urlFooterLinkThue;

  /** Init tenFooterLinkThue **/
  @Column(name = "ten_footerlinkthue", length = 250, nullable = false)
  private String tenFooterLinkThue;

  public Integer getIdFooterLinkThue() {
    return idFooterLinkThue;
  }

  public void setIdFooterLinkThue(Integer idFooterLinkThue) {
    this.idFooterLinkThue = idFooterLinkThue;
  }

  public String getUrlFooterLinkThue() {
    return urlFooterLinkThue;
  }

  public void setUrlFooterLinkThue(String urlFooterLinkThue) {
    this.urlFooterLinkThue = urlFooterLinkThue;
  }

  public String getTenFooterLinkThue() {
    return tenFooterLinkThue;
  }

  public void setTenFooterLinkThue(String tenFooterLinkThue) {
    this.tenFooterLinkThue = tenFooterLinkThue;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

}
