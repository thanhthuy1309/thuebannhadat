package realestate.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import realestate.dto.SelectAddress;
import realestate.entity.AddOns;
import realestate.entity.City;
import realestate.entity.District;
import realestate.entity.HouseDirection;
import realestate.entity.HousingType;
import realestate.entity.LandType;
import realestate.entity.MainMenu;
import realestate.entity.Notification;
import realestate.entity.PostSpecification;
import realestate.entity.PostType;
import realestate.entity.SearchLandArea;
import realestate.entity.SearchLandPrice;
import realestate.entity.Street;
import realestate.entity.SubMenu;
import realestate.entity.Ward;
import realestate.service.HomeService;
import realestate.service.SearchService;
import realestate.utils.DateUtils;
import realestate.utils.SqlConstants;

/**
 * @author : ThuyTran
 * @PG_ID : HomeController
 * @createDate : 20.08.2018
 */
@Controller
public class HomeController {

	@Autowired
	private HomeService homeService;

	@Autowired
	private SearchService searchService;

	/** Init LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(HomeController.class);

	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	public String trangchu(Model model, HttpSession session) {

//		SelectAddress selectAddress = new SelectAddress();
//
//		// initialization menu
		initMenu(model, session);
//
//		// initialization search
//		initSearch(model, selectAddress);
//
//		// initialization advertisement
//		initAd(model);

		// initialization content
		//initContent(model);

		return "trang-chu";
	}

	private void initContent(Model model) {

		List<PostType> lsPostTypes = homeService.getPostType();

		// Highlight
		PostType postTypeVip = lsPostTypes.stream().filter(x -> x.getPostTypeName().equals(SqlConstants.POST_TYPE_VIP))
				.findFirst().orElse(null);
		getPostSpecificationsByCondition(model, postTypeVip, 8, 0);
	}

	/**
	 * Gets the post specifications by condition.
	 *
	 * @param model
	 *            the model
	 * @param postType
	 *            the post type
	 * @param limit
	 *            the limit
	 * @return the post specifications by condition
	 */
	private void getPostSpecificationsByCondition(Model model, PostType postType, int limit, int offset) {
		// get expiration
		List<PostSpecification> lstPostSpecification = homeService.getPostSpecification(postType.getPostTypeId(),
				Timestamp.valueOf(LocalDateTime.now()), limit, offset);
		
		//List<PostSpecification> post1 = lstPostSpecification.stream().limit(2).skip(0).collect(Collectors.toList());
		for (PostSpecification postSpecification : lstPostSpecification) {
			System.out.println(postSpecification.getCity().getCityName());
		}
		//model.addAttribute("lstHighlight1", post1);
		model.addAttribute("lstHighlight2", lstPostSpecification.stream().limit(2).skip(2).collect(Collectors.toList()));
		model.addAttribute("lstHighlight3", lstPostSpecification.stream().limit(2).skip(4).collect(Collectors.toList()));
		model.addAttribute("lstHighlight4", lstPostSpecification.stream().limit(2).skip(6).collect(Collectors.toList()));
	}

	/**
	 * Inits the ad.
	 *
	 * @param model
	 *            the model
	 */
	private void initAd(Model model) {
		model.addAttribute("lstAds", homeService.getAllAdvertisement());
	}

	/**
	 * Inits the search.
	 *
	 * @param model
	 *            the model
	 * @param selectAddress
	 *            the select address
	 */
	private void initSearch(Model model, SelectAddress selectAddress) {

		// get all City with status = 1
		List<City> lstCity = searchService.getAllCity();

		// initialization condition
		selectAddress.setCityId(lstCity.stream().findFirst().get().getCityId());

		// get all District by city_id
		List<District> lstDistrict = searchService.getDistrictByCondition(selectAddress);
		selectAddress.setDistrictId(lstDistrict.stream().findFirst().get().getDistrictId());

		// get all Ward by city_id and district_id
		List<Ward> lstWard = searchService.getWardByCondition(selectAddress);
		selectAddress.setWardId(lstWard.stream().findFirst().get().getWardId());

		// get all Street by city_id and district_id
		List<Street> listStreet = searchService.getStreetByCondition(selectAddress);

		// get all LandType
		List<LandType> lstLandType = searchService.getAllLandType();

		SelectAddress selectLandType = new SelectAddress();
		selectLandType.setLandTypeId(lstLandType.stream().findFirst().get().getLandTypeId());

		// get all HousingType
		List<HousingType> lstHousingType = searchService.getAllHousingType();

		// Filter by first landTypeId
		lstHousingType = lstHousingType.stream()
				.filter(housingType -> housingType.getLandTypeId().equals(selectLandType.getLandTypeId()))
				.collect(Collectors.toList());

		List<HouseDirection> lstHouseDirection = searchService.getHouseDirection();
		List<SearchLandArea> lstSearchLandArea = searchService.getSearchLandArea();
		List<SearchLandPrice> lstSearchLandPrice = searchService.getSearchLandPrice();
		List<AddOns> lstAddOns = searchService.getAddOns();

		// sort base on order
		// Comparator<HousingType> byHousingOrder = (e1, e2) ->
		// Integer.compare(e1.getOrder(), e2.getOrder());
		// lstHousingType.sort(byHousingOrder);

		// Add model attribute
		model.addAttribute("selectAddress", selectLandType);
		model.addAttribute("lstCity", lstCity);
		model.addAttribute("lstDistrict", lstDistrict);
		model.addAttribute("lstWard", lstWard);
		model.addAttribute("listStreet", listStreet);
		model.addAttribute("lstLandType", lstLandType);
		model.addAttribute("lstHousingType", lstHousingType);
		model.addAttribute("lstHouseDirection", lstHouseDirection);
		model.addAttribute("lstSearchLandArea", lstSearchLandArea);
		model.addAttribute("lstSearchLandPrice", lstSearchLandPrice);
		model.addAttribute("lstAddOns", lstAddOns);
	}

	private void initMenu(Model model, HttpSession session) {
//
//		// get all menu status = 1
//		List<MainMenu> lstMainMenu = homeService.getAllMainMenu();
//
//		List<SubMenu> lstSubMenu = homeService.getAllSubMenu();
//
//		lstMainMenu.stream().forEach(e -> e.setSubMenuList(lstSubMenu.stream()
//				.filter(subMenu -> subMenu.getMainMenuId().equals(e.getMainMenuId())).collect(Collectors.toList())));
//
//		model.addAttribute("lstMainMenu", lstMainMenu);

		// String userName = Utils.getUserName(model, session);
		// TODO: hardcode userName
		String userName = "admin";
		if (StringUtils.isNotBlank(userName)) {
			List<Notification> lstNotification = homeService.getAllNotificationByUserName(userName);
			model.addAttribute("lstNotification", lstNotification);
			System.out.println("AAAAAAAAAAA: "+ lstNotification.get(0).getUser().getUserName());
		}
	}
}
