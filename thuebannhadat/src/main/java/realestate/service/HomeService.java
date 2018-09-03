package realestate.service;

import java.util.List;

import realestate.dto.SelectAddress;
import realestate.entity.City;
import realestate.entity.District;
import realestate.entity.HouseDirection;
import realestate.entity.HousingType;
import realestate.entity.LandType;
import realestate.entity.MainMenu;
import realestate.entity.Notification;
import realestate.entity.Street;
import realestate.entity.SubMenu;
import realestate.entity.Ward;

/**
 * @author : ThuyTran
 * @PG_ID : HomeService
 * @createDate : 20.08.2018
 */
public interface HomeService {

	List<City> getAllCity();

	List<District> getDistrictByCondition(SelectAddress selectAddress);

	List<Ward> getWardByCondition(SelectAddress selectAddress);

	List<Street> getStreetByCondition(SelectAddress selectAddress);

	List<MainMenu> getAllMainMenu();

	List<SubMenu> getAllSubMenu();

	List<LandType> getAllLandType();

	List<HousingType> getAllHousingType();

	List<Notification> getAllNotificationByUserName(String userName);
 
	List<HouseDirection> getHouseDirection();
}
