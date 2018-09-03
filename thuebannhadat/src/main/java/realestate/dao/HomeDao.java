package realestate.dao;

import java.util.List;

import realestate.dto.SelectAddress;
import realestate.entity.District;
import realestate.entity.Notification;
import realestate.entity.Street;
import realestate.entity.Ward;

/**
 * @author : ThuyTran
 * @PG_ID : HomeDao
 * @createDate : 20.08.2018
 */
public interface HomeDao {

	List<District> getDistrictByCondition(SelectAddress selectAddress);

	List<Ward> getWardByCondition(SelectAddress selectAddress);

	List<Street> getStreetByCondition(SelectAddress selectAddress);

	List<Notification> getAllNotificationByUserName(String userName);

}
