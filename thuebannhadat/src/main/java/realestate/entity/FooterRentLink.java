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
 * @PG_ID : FooterRentLink
 * @createDate : 09.09.2016
 */
@Entity
@Table(name = "tbl_footer_rent_link")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class FooterRentLink extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idFooterLinkThue **/
  @Id
  @Column(name = "footer_rent_link_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer footerRentLinkId;

  /** Init urlFooterLinkThue **/
  @Column(name = "footer_rent_link_url", nullable = false, length = 250)
  private String footerRentLinkUrl;

  /** Init tenFooterLinkThue **/
  @Column(name = "footer_rent_link_name", length = 250, nullable = false)
  private String footerRentLinkName;

  public Integer getFooterRentLinkId() {
    return footerRentLinkId;
  }

  public void setFooterRentLinkId(Integer footerRentLinkId) {
    this.footerRentLinkId = footerRentLinkId;
  }

  public String getFooterRentLinkUrl() {
    return footerRentLinkUrl;
  }

  public void setFooterRentLinkUrl(String footerRentLinkUrl) {
    this.footerRentLinkUrl = footerRentLinkUrl;
  }

  public String getFooterRentLinkName() {
    return footerRentLinkName;
  }

  public void setFooterRentLinkName(String footerRentLinkName) {
    this.footerRentLinkName = footerRentLinkName;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
