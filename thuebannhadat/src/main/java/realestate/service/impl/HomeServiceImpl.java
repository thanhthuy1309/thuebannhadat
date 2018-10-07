package realestate.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import realestate.dao.AbstractDao;
import realestate.entity.Advertisement;
import realestate.entity.MainMenu;
import realestate.entity.Notification;
import realestate.entity.PostSpecification;
import realestate.entity.PostType;
import realestate.entity.SubMenu;
import realestate.enumerator.StatusRecordEnum;
import realestate.service.HomeService;
import realestate.utils.SqlConstants;

/**
 * @author : ThuyTran
 * @PG_ID : HomeServiceImpl
 * @createDate : 20.08.2018
 */
@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private AbstractDao abstractDao;

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<MainMenu> getAllMainMenu() {
		return abstractDao.findAllByStatus(StatusRecordEnum.ACTIVE.getValue(), MainMenu.class);
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<SubMenu> getAllSubMenu() {
		return abstractDao.findAllByStatus(StatusRecordEnum.ACTIVE.getValue(), SubMenu.class);
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<Notification> getAllNotificationByUserName(String userName) {

		// Set parameters
		Map<String, Object> parameters = new HashMap<>();
		parameters.put(SqlConstants.STATUS, StatusRecordEnum.ACTIVE.getValue());
		parameters.put(SqlConstants.USER_NAME, userName);

		return abstractDao.findAllByParameterNotification(parameters, "HomeDao.getAllNotificationByUserName",
				null, null);
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<Advertisement> getAllAdvertisement() {
		return abstractDao.findAllByStatus(StatusRecordEnum.ACTIVE.getValue(), Advertisement.class);
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public List<PostType> getPostType() {
		return abstractDao.findAllByStatus(StatusRecordEnum.ACTIVE.getValue(), PostType.class);
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@Override
	public List<PostSpecification> getPostSpecification(Integer postTypeId, Date endDate, int limit, int offset) {
		// Set parameters
		Map<String, Object> parameters = new HashMap<>();
		parameters.put(SqlConstants.STATUS, StatusRecordEnum.ACTIVE.getValue());
		parameters.put(SqlConstants.POST_TYPE_ID, postTypeId);
		parameters.put(SqlConstants.END_DATE, endDate);

		return abstractDao.findAllByParameter(PostSpecification.class, parameters, "HomeDao.getPostSpecification",
				limit, offset);
	}

}
