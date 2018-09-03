package realestate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import realestate.dao.HomeDao;
import realestate.dao.generic.IGenericDao;
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
import realestate.enumerator.StatusRecordEnum;
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

	@Autowired
	private IGenericDao genericDao;

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<City> getAllCity() {
		return genericDao.findAllByStatus(StatusRecordEnum.ACTIVE.getValue(), City.class);
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
		return genericDao.findAllByStatus(StatusRecordEnum.ACTIVE.getValue(), MainMenu.class);
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<SubMenu> getAllSubMenu() {
		return genericDao.findAllByStatus(StatusRecordEnum.ACTIVE.getValue(), SubMenu.class);
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<LandType> getAllLandType() {
		return genericDao.findAllByStatus(StatusRecordEnum.ACTIVE.getValue(), LandType.class);
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<HousingType> getAllHousingType() {
		return genericDao.findAllByStatus(StatusRecordEnum.ACTIVE.getValue(), HousingType.class);
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<Notification> getAllNotificationByUserName(String userName) {
		return homedao.getAllNotificationByUserName(userName);
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<HouseDirection> getHouseDirection() {
		return genericDao.findAllByStatus(StatusRecordEnum.ACTIVE.getValue(), HouseDirection.class);
	}

}
