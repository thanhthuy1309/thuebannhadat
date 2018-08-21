package realestate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import realestate.dao.HomeDao;
import realestate.dto.SelectAddress;
import realestate.entity.City;
import realestate.entity.District;
import realestate.entity.Street;
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

}
