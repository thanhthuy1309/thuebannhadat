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
	 * @param wardId the wardId to set
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

}
