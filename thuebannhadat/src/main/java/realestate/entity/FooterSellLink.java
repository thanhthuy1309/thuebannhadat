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
 * @PG_ID : FooterSellLink
 * @createDate : 09.09.2016
 */
@Entity
@Table(name = "tbl_footer_sell_link")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class FooterSellLink extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idFooterLinkBan **/
  @Id
  @Column(name = "footer_sell_link_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer footerSellLinkId;

  /** Init urlFooterLinkBan **/
  @Column(name = "footer_sell_link_url", nullable = false, length = 250)
  private String footerSellLinkUrl;

  /** Init tenFooterLinkBan **/
  @Column(name = "footer_sell_link_name", length = 250, nullable = false)
  private String footerSellLinkName;

  public Integer getFooterSellLinkId() {
    return footerSellLinkId;
  }

  public void setFooterSellLinkId(Integer footerSellLinkId) {
    this.footerSellLinkId = footerSellLinkId;
  }

  public String getFooterSellLinkUrl() {
    return footerSellLinkUrl;
  }

  public void setFooterSellLinkUrl(String footerSellLinkUrl) {
    this.footerSellLinkUrl = footerSellLinkUrl;
  }

  public String getFooterSellLinkName() {
    return footerSellLinkName;
  }

  public void setFooterSellLinkName(String footerSellLinkName) {
    this.footerSellLinkName = footerSellLinkName;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

}
