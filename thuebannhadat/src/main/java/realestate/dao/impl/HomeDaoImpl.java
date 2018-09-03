package realestate.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import realestate.dao.HomeDao;
import realestate.dto.SelectAddress;
import realestate.entity.District;
import realestate.entity.Notification;
import realestate.entity.Street;
import realestate.entity.User;
import realestate.entity.Ward;
import realestate.enumerator.StatusRecordEnum;
import realestate.utils.SQLUtils;

/**
 * @author : ThuyTran
 * @PG_ID : HomeDaoImpl
 * @createDate : 20.08.2018
 */
@Repository
public class HomeDaoImpl extends AbstractDaoImpl<User, Integer> implements HomeDao {

	/** Init logger. */
	private Logger LOGGER = Logger.getLogger(HomeDaoImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	public List<District> getDistrictByCondition(SelectAddress selectAddress) {
		List<District> result = new ArrayList<>();
		Session session = getSession();

		// Query get district by city_id
		Query query = session.getNamedQuery("HomeDao.getDistrictByCondition");

		// Set parameter
		query.setInteger(SQLUtils.STATUS, StatusRecordEnum.ACTIVE.getValue());
		query.setString(SQLUtils.CITY_ID, selectAddress.getCityId());

		try {
			result = query.list();
			LOGGER.info("#getDistrictByCondition: successfull");
		} catch (Exception e) {
			LOGGER.error("#getDistrictByCondition_Error: " + e.getMessage());
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ward> getWardByCondition(SelectAddress selectAddress) {
		List<Ward> result = new ArrayList<>();
		Session session = getSession();

		// Query get ward by city_id and district_id
		Query query = session.getNamedQuery("HomeDao.getWardByCondition");

		// Set parameter
		query.setInteger(SQLUtils.STATUS, StatusRecordEnum.ACTIVE.getValue());
		query.setString(SQLUtils.CITY_ID, selectAddress.getCityId());
		query.setString(SQLUtils.DISTRICT_ID, selectAddress.getDistrictId());

		try {
			result = query.list();
			LOGGER.info("#getWardByCondition: successfull");
		} catch (Exception e) {
			LOGGER.error("#getWardByCondition_Error: " + e.getMessage());
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Street> getStreetByCondition(SelectAddress selectAddress) {
		List<Street> result = new ArrayList<>();
		Session session = getSession();

		// Query get all city
		Query query = session.getNamedQuery("HomeDao.getStreetByCondition");

		// Set parameter
		query.setInteger(SQLUtils.STATUS, StatusRecordEnum.ACTIVE.getValue());
		query.setString(SQLUtils.CITY_ID, selectAddress.getCityId());
		query.setString(SQLUtils.DISTRICT_ID, selectAddress.getDistrictId());

		try {
			result = query.list();
			LOGGER.info("#getStreetByCondition: successfull");
		} catch (Exception e) {
			LOGGER.error("#getStreetByCondition_Error: " + e.getMessage());
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Notification> getAllNotificationByUserName(String userName) {
		List<Notification> result = new ArrayList<>();
		Session session = getSession();

		// Query get all HousingType
		Query query = session.getNamedQuery("HomeDao.getAllNotificationByUserName");

		// Set parameter
		query.setInteger(SQLUtils.STATUS, StatusRecordEnum.ACTIVE.getValue());
		query.setString(SQLUtils.USER_NAME, userName);

		try {
			result = query.list();
			LOGGER.info("#getAllNotificationByUserName: successfull");
		} catch (Exception e) {
			LOGGER.error("#getAllNotificationByUserName_Error: " + e.getMessage());
		}
		return result;
	}

}
