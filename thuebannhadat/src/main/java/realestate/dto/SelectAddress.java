package realestate.dto;

/**
 * @author : ThuyTran
 * @PG_ID : SelectAddress
 * @createDate : 20.08.2018
 */
public class SelectAddress {

	private String cityId;
	private String districtId;
	private String wardId;
	private String streetId;
	private String landTypeId;
	private String housingTypeId;
	private String price;
	private String area;
	private String direction;
	private Integer floor;
	private Integer bedroom;
	private Integer bathromm;

	/**
	 * @return the cityId
	 */
	public String getCityId() {
		return cityId;
	}

	/**
	 * @param cityId
	 *            the cityId to set
	 */
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	/**
	 * @return the districtId
	 */
	public String getDistrictId() {
		return districtId;
	}

	/**
	 * @param districtId
	 *            the districtId to set
	 */
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	/**
	 * @return the streetId
	 */
	public String getStreetId() {
		return streetId;
	}

	/**
	 * @param streetId
	 *            the streetId to set
	 */
	public void setStreetId(String streetId) {
		this.streetId = streetId;
	}

	/**
	 * @return the wardId
	 */
	public String getWardId() {
		return wardId;
	}

	/**
	 * @param wardId
	 *            the wardId to set
	 */
	public void setWardId(String wardId) {
		this.wardId = wardId;
	}

	/**
	 * @return the landTypeId
	 */
	public String getLandTypeId() {
		return landTypeId;
	}

	/**
	 * @param landTypeId
	 *            the landTypeId to set
	 */
	public void setLandTypeId(String landTypeId) {
		this.landTypeId = landTypeId;
	}

	/**
	 * @return the housingTypeId
	 */
	public String getHousingTypeId() {
		return housingTypeId;
	}

	/**
	 * @param housingTypeId
	 *            the housingTypeId to set
	 */
	public void setHousingTypeId(String housingTypeId) {
		this.housingTypeId = housingTypeId;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area
	 *            the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * @param direction
	 *            the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * @return the floor
	 */
	public Integer getFloor() {
		return floor;
	}

	/**
	 * @param floor
	 *            the floor to set
	 */
	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	/**
	 * @return the bedroom
	 */
	public Integer getBedroom() {
		return bedroom;
	}

	/**
	 * @param bedroom
	 *            the bedroom to set
	 */
	public void setBedroom(Integer bedroom) {
		this.bedroom = bedroom;
	}

	/**
	 * @return the bathromm
	 */
	public Integer getBathromm() {
		return bathromm;
	}

	/**
	 * @param bathromm
	 *            the bathromm to set
	 */
	public void setBathromm(Integer bathromm) {
		this.bathromm = bathromm;
	}

}
