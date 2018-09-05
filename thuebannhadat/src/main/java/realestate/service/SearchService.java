package realestate.service;

import java.util.List;

import realestate.dto.SelectAddress;
import realestate.entity.AddOns;
import realestate.entity.City;
import realestate.entity.District;
import realestate.entity.HouseDirection;
import realestate.entity.HousingType;
import realestate.entity.LandType;
import realestate.entity.SearchLandArea;
import realestate.entity.SearchLandPrice;
import realestate.entity.Street;
import realestate.entity.Ward;

/**
 * @author : ThuyTran
 * @PG_ID : SearchService
 * @createDate : 20.08.2018
 */
public interface SearchService {

    List<City> getAllCity();

    List<District> getDistrictByCondition(SelectAddress selectAddress);

    List<Ward> getWardByCondition(SelectAddress selectAddress);

    List<Street> getStreetByCondition(SelectAddress selectAddress);

    List<LandType> getAllLandType();

    List<HousingType> getAllHousingType();

    List<HouseDirection> getHouseDirection();

    List<SearchLandArea> getSearchLandArea();

    List<SearchLandPrice> getSearchLandPrice();

    List<AddOns> getAddOns();
}
