/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

/**
 * The Class PostSpecification.
 *
 * @author : DungPT
 * @PG_ID : PostSpecification(MauTin)
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_post_specification")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class PostSpecification extends AbstractEntity {

	/**  Init serialVersionUID is 1L *. */
	private static final long serialVersionUID = 1L;

	/**  Init idMauTin *. */
	@Id
	@Column(name = "post_specification_id", nullable = false, length = 250)
	private String postSpecificationId;

	/** The user id. */
	@Column(name = "user_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
	private Integer userId;

	/**  Init tenMauTin *. */
	@Column(name = "post_specification_name", length = 250, nullable = false)
	private String postSpecificationName;

	/**  Init idLoaiHinhDat *. */
	@Column(name = "land_type_id", nullable = false, length = 250)
	private String landTypeId;

	/**  Init idLoaiNhaDat *. */
	@Column(name = "housing_type_id", nullable = false, length = 250)
	private String housingTypeId;

	/**  Init idThanhPho *. */
	@Column(name = "city_id", nullable = false, length = 250)
	private String cityId;

	/**  Init idQuanHuyen *. */
	@Column(name = "district_id", nullable = false, length = 250)
	private String districtId;

	/** The ward id. */
	@Column(name = "ward_id", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
	private String wardId;

	/** The street id. */
	@Column(name = "street_id", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
	private String streetId;

	/**  Init diaChi *. */
	@Column(name = "address", length = 250, nullable = false)
	private String address;

	/**  Init linkYoutube *. */
	@Column(name = "link_youtube", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
	private String linkYoutube;

	/**  Init dienTich *. */
	@Column(name = "land_area", nullable = false)
	private Float landArea;

	/**  Init giaDat *. */
	@Column(name = "land_price", nullable = false, columnDefinition = "BIGINT(19)")
	private Long landPrice;

	/**  Init idDonViGia *. */
	@Column(name = "currency_unit_id", nullable = false)
	private Integer currencyUnitId;

	/**  Init tongGiaTien *. */
	@Column(name = "land_price_summary", length = 250, columnDefinition = "VARCHAR(250) DEFAULT 0")
	private String landPriceSummary;

	/**  Init matTien *. */
	@Column(name = "street_front")
	private Float streetFront;

	/**  Init loGioi *. */
	@Column(name = "street_front_usage")
	private Float streetFrontUsage;

	/**  Init idHuongNha *. */
	@Column(name = "house_direction_id", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
	private String houseDirectionId;

	/**  Init SoTang *. */
	@Column(name = "floor", columnDefinition = "INT(11) DEFAULT 0")
	private Integer floor;

	/**  Init SoPhongNgu *. */
	@Column(name = "bedroom", columnDefinition = "INT(11) DEFAULT 0")
	private Integer bedroom;

	/**  Init SoToilet *. */
	@Column(name = "bathroom", columnDefinition = "INT(11) DEFAULT 0")
	private Integer bathroom;

	/**  Init idLoaiTin *. */
	@Column(name = "post_type_id", nullable = false)
	private Integer postTypeId;

	/**  Init tongTienTin *. */
	@Column(name = "post_cost_total", nullable = false)
	private Long postCostTotal;

	/**  Init moTaTin *. */
	@Column(name = "post_spec_description", nullable = false, columnDefinition = "TEXT")
	private String postSpecDescription;

	/** The post expiration id. */
	@Column(name = "post_expiration_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
	private String postExpirationId;

	/**  Init thanhPho *. */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "street_id", referencedColumnName = "street_id", insertable = false, updatable = false),
			@JoinColumn(name = "city_id", referencedColumnName = "city_id", insertable = false, updatable = false),
			@JoinColumn(name = "district_id", referencedColumnName = "district_id", insertable = false, updatable = false) })
	private Street street;

	/** The ward. */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "ward_id", referencedColumnName = "ward_id", insertable = false, updatable = false),
			@JoinColumn(name = "city_id", referencedColumnName = "city_id", insertable = false, updatable = false),
			@JoinColumn(name = "district_id", referencedColumnName = "district_id", insertable = false, updatable = false) })
	private Ward ward;

	/** The district. */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "district_id", referencedColumnName = "district_id", insertable = false, updatable = false),
			@JoinColumn(name = "city_id", referencedColumnName = "city_id", insertable = false, updatable = false)})
	private District district;

	/** The city. */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "city_id", referencedColumnName = "city_id", insertable = false, updatable = false) })
	private City city;

	/** The house direction. */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "house_direction_id", referencedColumnName = "house_direction_id", insertable = false, updatable = false) })
	private HouseDirection houseDirection;

	/** The housing type. */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "housing_type_id", referencedColumnName = "housing_type_id", insertable = false, updatable = false),
			@JoinColumn(name = "land_type_id", referencedColumnName = "land_type_id", insertable = false, updatable = false)})
	private HousingType housingType;

	/** The land type. */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "land_type_id", referencedColumnName = "land_type_id", insertable = false, updatable = false) })
	private LandType landType;

	/** The post type. */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "post_type_id", referencedColumnName = "post_type_id", insertable = false, updatable = false) })
	private PostType postType;

	/** The user. */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false) })
	private User user;

	/** The post expiration. */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "post_expiration_id", referencedColumnName = "post_expiration_id", insertable = false, updatable = false) })
	private PostExpiration postExpiration;

	/** The post image list. */
	@OneToMany(mappedBy = "postSpecification", cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = PostImage.class)
	private List<PostImage> postImageList;

	/**
	 * Gets the post specification id.
	 *
	 * @return the post specification id
	 */
	public String getPostSpecificationId() {
		return postSpecificationId;
	}

	/**
	 * Sets the post specification id.
	 *
	 * @param postSpecificationId the new post specification id
	 */
	public void setPostSpecificationId(String postSpecificationId) {
		this.postSpecificationId = postSpecificationId;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * Gets the post specification name.
	 *
	 * @return the post specification name
	 */
	public String getPostSpecificationName() {
		return postSpecificationName;
	}

	/**
	 * Sets the post specification name.
	 *
	 * @param postSpecificationName the new post specification name
	 */
	public void setPostSpecificationName(String postSpecificationName) {
		this.postSpecificationName = postSpecificationName;
	}

	/**
	 * Gets the land type id.
	 *
	 * @return the land type id
	 */
	public String getLandTypeId() {
		return landTypeId;
	}

	/**
	 * Sets the land type id.
	 *
	 * @param landTypeId the new land type id
	 */
	public void setLandTypeId(String landTypeId) {
		this.landTypeId = landTypeId;
	}

	/**
	 * Gets the housing type id.
	 *
	 * @return the housing type id
	 */
	public String getHousingTypeId() {
		return housingTypeId;
	}

	/**
	 * Sets the housing type id.
	 *
	 * @param housingTypeId the new housing type id
	 */
	public void setHousingTypeId(String housingTypeId) {
		this.housingTypeId = housingTypeId;
	}

	/**
	 * Gets the city id.
	 *
	 * @return the city id
	 */
	public String getCityId() {
		return cityId;
	}

	/**
	 * Sets the city id.
	 *
	 * @param cityId the new city id
	 */
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	/**
	 * Gets the district id.
	 *
	 * @return the district id
	 */
	public String getDistrictId() {
		return districtId;
	}

	/**
	 * Sets the district id.
	 *
	 * @param districtId the new district id
	 */
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	/**
	 * Gets the ward id.
	 *
	 * @return the ward id
	 */
	public String getWardId() {
		return wardId;
	}

	/**
	 * Sets the ward id.
	 *
	 * @param wardId the new ward id
	 */
	public void setWardId(String wardId) {
		this.wardId = wardId;
	}

	/**
	 * Gets the street id.
	 *
	 * @return the street id
	 */
	public String getStreetId() {
		return streetId;
	}

	/**
	 * Sets the street id.
	 *
	 * @param streetId the new street id
	 */
	public void setStreetId(String streetId) {
		this.streetId = streetId;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the link youtube.
	 *
	 * @return the link youtube
	 */
	public String getLinkYoutube() {
		return linkYoutube;
	}

	/**
	 * Sets the link youtube.
	 *
	 * @param linkYoutube the new link youtube
	 */
	public void setLinkYoutube(String linkYoutube) {
		this.linkYoutube = linkYoutube;
	}

	/**
	 * Gets the land area.
	 *
	 * @return the land area
	 */
	public Float getLandArea() {
		return landArea;
	}

	/**
	 * Sets the land area.
	 *
	 * @param landArea the new land area
	 */
	public void setLandArea(Float landArea) {
		this.landArea = landArea;
	}

	/**
	 * Gets the land price.
	 *
	 * @return the land price
	 */
	public Long getLandPrice() {
		return landPrice;
	}

	/**
	 * Sets the land price.
	 *
	 * @param landPrice the new land price
	 */
	public void setLandPrice(Long landPrice) {
		this.landPrice = landPrice;
	}

	/**
	 * Gets the currency unit id.
	 *
	 * @return the currency unit id
	 */
	public Integer getCurrencyUnitId() {
		return currencyUnitId;
	}

	/**
	 * Sets the currency unit id.
	 *
	 * @param currencyUnitId the new currency unit id
	 */
	public void setCurrencyUnitId(Integer currencyUnitId) {
		this.currencyUnitId = currencyUnitId;
	}

	/**
	 * Gets the land price summary.
	 *
	 * @return the land price summary
	 */
	public String getLandPriceSummary() {
		return landPriceSummary;
	}

	/**
	 * Sets the land price summary.
	 *
	 * @param landPriceSummary the new land price summary
	 */
	public void setLandPriceSummary(String landPriceSummary) {
		this.landPriceSummary = landPriceSummary;
	}

	/**
	 * Gets the street front.
	 *
	 * @return the street front
	 */
	public Float getStreetFront() {
		return streetFront;
	}

	/**
	 * Sets the street front.
	 *
	 * @param streetFront the new street front
	 */
	public void setStreetFront(Float streetFront) {
		this.streetFront = streetFront;
	}

	/**
	 * Gets the street front usage.
	 *
	 * @return the street front usage
	 */
	public Float getStreetFrontUsage() {
		return streetFrontUsage;
	}

	/**
	 * Sets the street front usage.
	 *
	 * @param streetFrontUsage the new street front usage
	 */
	public void setStreetFrontUsage(Float streetFrontUsage) {
		this.streetFrontUsage = streetFrontUsage;
	}

	/**
	 * Gets the house direction id.
	 *
	 * @return the house direction id
	 */
	public String getHouseDirectionId() {
		return houseDirectionId;
	}

	/**
	 * Sets the house direction id.
	 *
	 * @param houseDirectionId the new house direction id
	 */
	public void setHouseDirectionId(String houseDirectionId) {
		this.houseDirectionId = houseDirectionId;
	}

	/**
	 * Gets the floor.
	 *
	 * @return the floor
	 */
	public Integer getFloor() {
		return floor;
	}

	/**
	 * Sets the floor.
	 *
	 * @param floor the new floor
	 */
	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	/**
	 * Gets the bedroom.
	 *
	 * @return the bedroom
	 */
	public Integer getBedroom() {
		return bedroom;
	}

	/**
	 * Sets the bedroom.
	 *
	 * @param bedroom the new bedroom
	 */
	public void setBedroom(Integer bedroom) {
		this.bedroom = bedroom;
	}

	/**
	 * Gets the bathroom.
	 *
	 * @return the bathroom
	 */
	public Integer getBathroom() {
		return bathroom;
	}

	/**
	 * Sets the bathroom.
	 *
	 * @param bathroom the new bathroom
	 */
	public void setBathroom(Integer bathroom) {
		this.bathroom = bathroom;
	}

	/**
	 * Gets the post type id.
	 *
	 * @return the post type id
	 */
	public Integer getPostTypeId() {
		return postTypeId;
	}

	/**
	 * Sets the post type id.
	 *
	 * @param postTypeId the new post type id
	 */
	public void setPostTypeId(Integer postTypeId) {
		this.postTypeId = postTypeId;
	}

	/**
	 * Gets the post cost total.
	 *
	 * @return the post cost total
	 */
	public Long getPostCostTotal() {
		return postCostTotal;
	}

	/**
	 * Sets the post cost total.
	 *
	 * @param postCostTotal the new post cost total
	 */
	public void setPostCostTotal(Long postCostTotal) {
		this.postCostTotal = postCostTotal;
	}

	/**
	 * Gets the post spec description.
	 *
	 * @return the post spec description
	 */
	public String getPostSpecDescription() {
		return postSpecDescription;
	}

	/**
	 * Sets the post spec description.
	 *
	 * @param postSpecDescription the new post spec description
	 */
	public void setPostSpecDescription(String postSpecDescription) {
		this.postSpecDescription = postSpecDescription;
	}

	/**
	 * Gets the post expiration id.
	 *
	 * @return the postExpirationId
	 */
	public String getPostExpirationId() {
		return postExpirationId;
	}

	/**
	 * Sets the post expiration id.
	 *
	 * @param postExpirationId the postExpirationId to set
	 */
	public void setPostExpirationId(String postExpirationId) {
		this.postExpirationId = postExpirationId;
	}

	/**
	 * Gets the street.
	 *
	 * @return the street
	 */
	public Street getStreet() {
		return street;
	}

	/**
	 * Sets the street.
	 *
	 * @param street the street to set
	 */
	public void setStreet(Street street) {
		this.street = street;
	}

	/**
	 * Gets the ward.
	 *
	 * @return the ward
	 */
	public Ward getWard() {
		return ward;
	}

	/**
	 * Sets the ward.
	 *
	 * @param ward the ward to set
	 */
	public void setWard(Ward ward) {
		this.ward = ward;
	}

	/**
	 * Gets the district.
	 *
	 * @return the district
	 */
	public District getDistrict() {
		return district;
	}

	/**
	 * Sets the district.
	 *
	 * @param district the district to set
	 */
	public void setDistrict(District district) {
		this.district = district;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * Gets the house direction.
	 *
	 * @return the houseDirection
	 */
	public HouseDirection getHouseDirection() {
		return houseDirection;
	}

	/**
	 * Sets the house direction.
	 *
	 * @param houseDirection the houseDirection to set
	 */
	public void setHouseDirection(HouseDirection houseDirection) {
		this.houseDirection = houseDirection;
	}

	/**
	 * Gets the housing type.
	 *
	 * @return the housingType
	 */
	public HousingType getHousingType() {
		return housingType;
	}

	/**
	 * Sets the housing type.
	 *
	 * @param housingType the housingType to set
	 */
	public void setHousingType(HousingType housingType) {
		this.housingType = housingType;
	}

	/**
	 * Gets the land type.
	 *
	 * @return the landType
	 */
	public LandType getLandType() {
		return landType;
	}

	/**
	 * Sets the land type.
	 *
	 * @param landType the landType to set
	 */
	public void setLandType(LandType landType) {
		this.landType = landType;
	}

	/**
	 * Gets the post type.
	 *
	 * @return the postType
	 */
	public PostType getPostType() {
		return postType;
	}

	/**
	 * Sets the post type.
	 *
	 * @param postType the postType to set
	 */
	public void setPostType(PostType postType) {
		this.postType = postType;
	}

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Sets the user.
	 *
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Gets the post expiration.
	 *
	 * @return the postExpiration
	 */
	public PostExpiration getPostExpiration() {
		return postExpiration;
	}

	/**
	 * Sets the post expiration.
	 *
	 * @param postExpiration the postExpiration to set
	 */
	public void setPostExpiration(PostExpiration postExpiration) {
		this.postExpiration = postExpiration;
	}

	/**
	 * Gets the post image list.
	 *
	 * @return the postImageList
	 */
	public List<PostImage> getPostImageList() {
		return postImageList;
	}

	/**
	 * Sets the post image list.
	 *
	 * @param postImageList the postImageList to set
	 */
	public void setPostImageList(List<PostImage> postImageList) {
		this.postImageList = postImageList;
	}

}
