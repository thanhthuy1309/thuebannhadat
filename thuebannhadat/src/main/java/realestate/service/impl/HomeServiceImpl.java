package realestate.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import realestate.dao.AbstractDao;
import realestate.entity.MainMenu;
import realestate.entity.Notification;
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

        return abstractDao.findAllByParameter(Notification.class, parameters, "HomeDao.getAllNotificationByUserName");
    }

}
