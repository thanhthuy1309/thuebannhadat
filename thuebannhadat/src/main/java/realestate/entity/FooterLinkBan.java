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
 * @PG_ID : FooterLinkBan
 * @createDate : 09.09.2016
 */
@Entity
@Table(name = "tbl_footerlinkban")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "trangthai = 1")
public class FooterLinkBan extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idFooterLinkBan **/
  @Id
  @Column(name = "id_footerlinkban", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idFooterLinkBan;

  /** Init urlFooterLinkBan **/
  @Column(name = "url_footerlinkban", nullable = false, length = 250)
  private String urlFooterLinkBan;

  /** Init tenFooterLinkBan **/
  @Column(name = "ten_footerlinkban", length = 250, nullable = false)
  private String tenFooterLinkBan;

  public Integer getIdFooterLinkBan() {
    return idFooterLinkBan;
  }

  public void setIdFooterLinkBan(Integer idFooterLinkBan) {
    this.idFooterLinkBan = idFooterLinkBan;
  }

  public String getUrlFooterLinkBan() {
    return urlFooterLinkBan;
  }

  public void setUrlFooterLinkBan(String urlFooterLinkBan) {
    this.urlFooterLinkBan = urlFooterLinkBan;
  }

  public String getTenFooterLinkBan() {
    return tenFooterLinkBan;
  }

  public void setTenFooterLinkBan(String tenFooterLinkBan) {
    this.tenFooterLinkBan = tenFooterLinkBan;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
