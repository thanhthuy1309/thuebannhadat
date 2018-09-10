package realestate.service;

import java.util.Date;
import java.util.List;

import realestate.entity.Advertisement;
import realestate.entity.MainMenu;
import realestate.entity.Notification;
import realestate.entity.PostSpecification;
import realestate.entity.PostType;
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

	List<Advertisement> getAllAdvertisement();

	List<PostType> getPostType();

	List<PostSpecification> getPostSpecification(Integer postTypeId, Date endDate, int limit);

}
