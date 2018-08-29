package realestate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import realestate.dao.HomeDao;
import realestate.dto.SelectAddress;
import realestate.entity.BalconyDirection;
import realestate.entity.City;
import realestate.entity.District;
import realestate.entity.HousingType;
import realestate.entity.LandType;
import realestate.entity.MainMenu;
import realestate.entity.Notification;
import realestate.entity.Street;
import realestate.entity.SubMenu;
import realestate.entity.Ward;
import realestate.service.HomeService;

/**
 * @author : ThuyTran
 * @PG_ID : HomeServiceImpl
 * @createDate : 20.08.2018
 */
@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private HomeDao homedao;

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<City> getAllCity() {
		return homedao.getAllCity();
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<District> getDistrictByCondition(SelectAddress selectAddress) {
		return homedao.getDistrictByCondition(selectAddress);
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<Ward> getWardByCondition(SelectAddress selectAddress) {
		return homedao.getWardByCondition(selectAddress);
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<Street> getStreetByCondition(SelectAddress selectAddress) {
		return homedao.getStreetByCondition(selectAddress);
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<MainMenu> getAllMainMenu() {
		return homedao.getAllMainMenu();
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<SubMenu> getAllSubMenu() {
		return homedao.getAllSubMenu();
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<LandType> getAllLandType() {
		return homedao.getAllLandType();
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<HousingType> getAllHousingType() {
		return homedao.getAllHousingType();
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<Notification> getAllNotificationByUserName(String userName) {
		return homedao.getAllNotificationByUserName(userName);
	}

	@Override
	public List<BalconyDirection> getBalconyDirection() {
		return homedao.getBalconyDirection();
	}

}
