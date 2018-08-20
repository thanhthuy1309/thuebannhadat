package realestate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import realestate.dao.HomeDao;
import realestate.entity.City;
import realestate.entity.District;
import realestate.entity.Street;
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

	@Override
	public List<District> getDistrictByCityId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Street> getStreetByDistrictId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<District> getAllDistrict() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Street> getAllStreet() {
		// TODO Auto-generated method stub
		return null;
	}

}
