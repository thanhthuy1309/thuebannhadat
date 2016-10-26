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
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.Where;

/**
 * @author : DungPT
 * @PG_ID : PostSpecification(MauTin)
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_post_specification")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class PostSpecification extends AbstractEntity {

  /** Init serialVersionUID is 1L **/
  private static final long serialVersionUID = 1L;

  /** Init idMauTin **/
  @Id
  @Column(name = "post_specification_id", nullable = false, length = 250)
  private String postSpecificationId;

  @Column(name = "user_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
  private Integer userId;

  /** Init tenMauTin **/
  @Column(name = "post_specification_name", length = 250, nullable = false)
  private String postSpecificationName;

  /** Init idLoaiHinhDat **/
  @Column(name = "land_type_id", nullable = false, length = 250)
  private String landTypeId;

  /** Init idLoaiNhaDat **/
  @Column(name = "housing_type_id", nullable = false, length = 250)
  private String housingTypeId;

  /** Init idThanhPho **/
  @Column(name = "city_id", nullable = false, length = 250)
  private String cityId;

  /** Init idQuanHuyen **/
  @Column(name = "district_id", nullable = false, length = 250)
  private String districtId;

  @Column(name = "ward_id", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
  private String wardId;

  @Column(name = "street_id", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
  private String streetId;

  /** Init diaChi **/
  @Column(name = "address", length = 250, nullable = false)
  private String address;

  /** Init linkYoutube **/
  @Column(name = "link_youtube", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
  private String linkYoutube;

  /** Init dienTich **/
  @Column(name = "land_area", nullable = false)
  private Float landArea;

  /** Init giaDat **/
  @Column(name = "land_price", nullable = false, columnDefinition = "BIGINT(19)")
  private Long landPrice;

  /** Init idDonViGia **/
  @Column(name = "currency_unit_id", nullable = false)
  private Integer currencyUnitId;

  /** Init tongGiaTien **/
  @Column(name = "land_price_summary", length = 250, columnDefinition = "VARCHAR(250) DEFAULT 0")
  private String landPriceSummary;

  /** Init matTien **/
  @Column(name = "street_front")
  private Float streetFront;

  /** Init loGioi **/
  @Column(name = "street_front_usage")
  private Float streetFrontUsage;

  /** Init idHuongNha **/
  @Column(name = "house_direction_id", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
  private String houseDirectionId;

  /** Init idHuongBanCong **/
  @Column(name = "balcony_direction_id", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
  private String balconyDirectionId;

  /** Init idSoTang **/
  @Column(name = "floor_id", columnDefinition = "INT(11) DEFAULT 0")
  private Integer floorId;

  /** Init idSoPhongNgu **/
  @Column(name = "bedroom_id", columnDefinition = "INT(11) DEFAULT 0")
  private Integer bedroomId;

  /** Init idSoToilet **/
  @Column(name = "bathroom_id", columnDefinition = "INT(11) DEFAULT 0")
  private Integer bathroomId;

  /** Init idLoaiTin **/
  @Column(name = "post_type_id", nullable = false)
  private Integer postTypeId;

  @Column(name = "post_expiration_id", nullable = false)
  private Integer postExpirationId;

  /** Init tongTienTin **/
  @Column(name = "post_cost_total", nullable = false)
  private Long postCostTotal;

  /** Init hemxehoi **/
  @Column(name = "is_car_access", columnDefinition = "TINYINT(1) UNSIGNED DEFAULT 0")
  @Type(type = "org.hibernate.type.NumericBooleanType")
  private Boolean isCarAccess;

  /** Init chinhchu **/
  @Column(name = "is_private_property", columnDefinition = "TINYINT(1) UNSIGNED DEFAULT 0")
  @Type(type = "org.hibernate.type.NumericBooleanType")
  private Boolean isPrivateProperty;

  /** Init khuAnNinh **/
  @Column(name = "is_secure", columnDefinition = "TINYINT(1) UNSIGNED DEFAULT 0")
  @Type(type = "org.hibernate.type.NumericBooleanType")
  private Boolean isSecure;

  /** Init moTaTin **/
  @Column(name = "post_spec_description", nullable = false, columnDefinition = "TEXT")
  private String postSpecDescription;

  public String getPostSpecificationId() {
    return postSpecificationId;
  }

  public void setPostSpecificationId(String postSpecificationId) {
    this.postSpecificationId = postSpecificationId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getPostSpecificationName() {
    return postSpecificationName;
  }

  public void setPostSpecificationName(String postSpecificationName) {
    this.postSpecificationName = postSpecificationName;
  }

  public String getLandTypeId() {
    return landTypeId;
  }

  public void setLandTypeId(String landTypeId) {
    this.landTypeId = landTypeId;
  }

  public String getHousingTypeId() {
    return housingTypeId;
  }

  public void setHousingTypeId(String housingTypeId) {
    this.housingTypeId = housingTypeId;
  }

  public String getCityId() {
    return cityId;
  }

  public void setCityId(String cityId) {
    this.cityId = cityId;
  }

  public String getDistrictId() {
    return districtId;
  }

  public void setDistrictId(String districtId) {
    this.districtId = districtId;
  }

  public String getWardId() {
    return wardId;
  }

  public void setWardId(String wardId) {
    this.wardId = wardId;
  }

  public String getStreetId() {
    return streetId;
  }

  public void setStreetId(String streetId) {
    this.streetId = streetId;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getLinkYoutube() {
    return linkYoutube;
  }

  public void setLinkYoutube(String linkYoutube) {
    this.linkYoutube = linkYoutube;
  }

  public Float getLandArea() {
    return landArea;
  }

  public void setLandArea(Float landArea) {
    this.landArea = landArea;
  }

  public Long getLandPrice() {
    return landPrice;
  }

  public void setLandPrice(Long landPrice) {
    this.landPrice = landPrice;
  }

  public Integer getCurrencyUnitId() {
    return currencyUnitId;
  }

  public void setCurrencyUnitId(Integer currencyUnitId) {
    this.currencyUnitId = currencyUnitId;
  }

  public String getLandPriceSummary() {
    return landPriceSummary;
  }

  public void setLandPriceSummary(String landPriceSummary) {
    this.landPriceSummary = landPriceSummary;
  }

  public Float getStreetFront() {
    return streetFront;
  }

  public void setStreetFront(Float streetFront) {
    this.streetFront = streetFront;
  }

  public Float getStreetFrontUsage() {
    return streetFrontUsage;
  }

  public void setStreetFrontUsage(Float streetFrontUsage) {
    this.streetFrontUsage = streetFrontUsage;
  }

  public String getHouseDirectionId() {
    return houseDirectionId;
  }

  public void setHouseDirectionId(String houseDirectionId) {
    this.houseDirectionId = houseDirectionId;
  }

  public String getBalconyDirectionId() {
    return balconyDirectionId;
  }

  public void setBalconyDirectionId(String balconyDirectionId) {
    this.balconyDirectionId = balconyDirectionId;
  }

  public Integer getFloorId() {
    return floorId;
  }

  public void setFloorId(Integer floorId) {
    this.floorId = floorId;
  }

  public Integer getBedroomId() {
    return bedroomId;
  }

  public void setBedroomId(Integer bedroomId) {
    this.bedroomId = bedroomId;
  }

  public Integer getBathroomId() {
    return bathroomId;
  }

  public void setBathroomId(Integer bathroomId) {
    this.bathroomId = bathroomId;
  }

  public Integer getPostTypeId() {
    return postTypeId;
  }

  public void setPostTypeId(Integer postTypeId) {
    this.postTypeId = postTypeId;
  }

  public Integer getPostExpirationId() {
    return postExpirationId;
  }

  public void setPostExpirationId(Integer postExpirationId) {
    this.postExpirationId = postExpirationId;
  }

  public Long getPostCostTotal() {
    return postCostTotal;
  }

  public void setPostCostTotal(Long postCostTotal) {
    this.postCostTotal = postCostTotal;
  }

  public Boolean getIsCarAccess() {
    return isCarAccess;
  }

  public void setIsCarAccess(Boolean isCarAccess) {
    this.isCarAccess = isCarAccess;
  }

  public Boolean getIsPrivateProperty() {
    return isPrivateProperty;
  }

  public void setIsPrivateProperty(Boolean isPrivateProperty) {
    this.isPrivateProperty = isPrivateProperty;
  }

  public Boolean getIsSecure() {
    return isSecure;
  }

  public void setIsSecure(Boolean isSecure) {
    this.isSecure = isSecure;
  }

  public String getPostSpecDescription() {
    return postSpecDescription;
  }

  public void setPostSpecDescription(String postSpecDescription) {
    this.postSpecDescription = postSpecDescription;
  }
}
