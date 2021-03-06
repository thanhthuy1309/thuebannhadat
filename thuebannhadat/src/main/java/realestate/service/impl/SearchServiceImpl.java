package realestate.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import realestate.dao.AbstractDao;
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
import realestate.enumerator.StatusRecordEnum;
import realestate.service.SearchService;
import realestate.utils.SqlConstants;

/**
 * @author : ThuyTran
 * @PG_ID : SearchServiceImpl
 * @createDate : 20.08.2018
 */
@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private AbstractDao abstractDao;

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    @Override
    public List<City> getAllCity() {
        return abstractDao.findAllByStatus(StatusRecordEnum.ACTIVE.getValue(), City.class);
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    @Override
    public List<District> getDistrictByCondition(SelectAddress selectAddress) {

        // Set parameters
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(SqlConstants.CITY_ID, selectAddress.getCityId());
        parameters.put(SqlConstants.STATUS, StatusRecordEnum.ACTIVE.getValue());

        return abstractDao.findAllByParameter(District.class, parameters, "HomeDao.getDistrictByCondition", null, null);
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    @Override
    public List<Ward> getWardByCondition(SelectAddress selectAddress) {

        // Set parameters
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(SqlConstants.CITY_ID, selectAddress.getCityId());
        parameters.put(SqlConstants.STATUS, StatusRecordEnum.ACTIVE.getValue());
        parameters.put(SqlConstants.DISTRICT_ID, selectAddress.getDistrictId());

        return abstractDao.findAllByParameter(Ward.class, parameters, "HomeDao.getWardByCondition", null, null);
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    @Override
    public List<Street> getStreetByCondition(SelectAddress selectAddress) {

        // Set parameters
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(SqlConstants.STATUS, StatusRecordEnum.ACTIVE.getValue());
        parameters.put(SqlConstants.CITY_ID, selectAddress.getCityId());
        parameters.put(SqlConstants.DISTRICT_ID, selectAddress.getDistrictId());

        return abstractDao.findAllByParameter(Street.class, parameters, "HomeDao.getStreetByCondition", null, null);
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    @Override
    public List<LandType> getAllLandType() {
        return abstractDao.findAllByStatus(StatusRecordEnum.ACTIVE.getValue(), LandType.class);
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    @Override
    public List<HousingType> getAllHousingType() {
        return abstractDao.findAllByStatus(StatusRecordEnum.ACTIVE.getValue(), HousingType.class);
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    @Override
    public List<HouseDirection> getHouseDirection() {
        return abstractDao.findAllByStatus(StatusRecordEnum.ACTIVE.getValue(), HouseDirection.class);
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    @Override
    public List<SearchLandArea> getSearchLandArea() {
        return abstractDao.findAllByStatus(StatusRecordEnum.ACTIVE.getValue(), SearchLandArea.class);
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    @Override
    public List<SearchLandPrice> getSearchLandPrice() {
        return abstractDao.findAllByStatus(StatusRecordEnum.ACTIVE.getValue(), SearchLandPrice.class);
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    @Override
    public List<AddOns> getAddOns() {
        return abstractDao.findAllByStatus(StatusRecordEnum.ACTIVE.getValue(), AddOns.class);
    }

}
