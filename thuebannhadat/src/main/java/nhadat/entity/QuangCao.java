/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package nhadat.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author : DungPT
 * @PG_ID : QuangCao
 * @createDate : 20.08.2016
 */
@Entity
@Table(name = "tbl_quangcao")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class QuangCao implements Serializable {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idQuangCao **/
  @Id
  @Column(name = "id_quangcao", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idQuangCao;

  /** Init urlWeb **/
  @Column(name = "urlweb", length = 250, nullable = false)
  private String urlWeb;

  /** Init trangThai **/
  @Column(name = "trangthai", length = 1, nullable = false)
  private Integer trangThai;

  /** Init urlHinhAnh **/
  @Column(name = "urlhinhanh", length = 1000, nullable = false)
  private String urlHinhAnh;

  /** Init tieude **/
  @Column(name = "tieude", length = 250)
  private String tieude;

  public Integer getIdQuangCao() {
    return idQuangCao;
  }

  public void setIdQuangCao(Integer idQuangCao) {
    this.idQuangCao = idQuangCao;
  }

  public String getUrlWeb() {
    return urlWeb;
  }

  public void setUrlWeb(String urlWeb) {
    this.urlWeb = urlWeb;
  }

  public Integer getTrangThai() {
    return trangThai;
  }

  public void setTrangThai(Integer trangThai) {
    this.trangThai = trangThai;
  }

  public String getUrlHinhAnh() {
    return urlHinhAnh;
  }

  public void setUrlHinhAnh(String urlHinhAnh) {
    this.urlHinhAnh = urlHinhAnh;
  }

  public String getTieude() {
    return tieude;
  }

  public void setTieude(String tieude) {
    this.tieude = tieude;
  }
}
