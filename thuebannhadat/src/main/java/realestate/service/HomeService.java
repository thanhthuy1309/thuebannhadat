package realestate.service;

import java.util.List;

import realestate.entity.MainMenu;
import realestate.entity.Notification;
import realestate.entity.SubMenu;

/**
 * @author : ThuyTran
 * @PG_ID : HomeService
 * @createDate : 20.08.2018
 */
public interface HomeService {

    List<MainMenu> getAllMainMenu();

    List<SubMenu> getAllSubMenu();

    List<Notification> getAllNotificationByUserName(String userName);

}
