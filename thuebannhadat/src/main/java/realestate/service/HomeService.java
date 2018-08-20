package realestate.service;

import java.util.List;

import realestate.entity.City;
import realestate.entity.District;
import realestate.entity.Street;

/**
 * @author : ThuyTran
 * @PG_ID : HomeService
 * @createDate : 20.08.2018
 */
public interface HomeService {

	List<City> getAllCity();

	List<District> getAllDistrict();

	List<Street> getAllStreet();

	List<District> getDistrictByCityId();

	List<Street> getStreetByDistrictId();
}
