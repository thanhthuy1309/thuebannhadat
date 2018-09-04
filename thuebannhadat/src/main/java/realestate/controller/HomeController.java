package realestate.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
import realestate.entity.SearchLandArea;
import realestate.entity.SearchLandPrice;
import realestate.entity.Street;
import realestate.entity.SubMenu;
import realestate.entity.Ward;
import realestate.service.HomeService;

/**
 * @author : ThuyTran
 * @PG_ID : HomeController
 * @createDate : 20.08.2018
 */
@Controller
public class HomeController {

	@Autowired
	private HomeService homeService;

	/** Init LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(HomeController.class);

	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	public String trangchu(Model model, HttpSession session) {

		SelectAddress selectAddress = new SelectAddress();

		// initialization menu
		initMenu(model, session);

		// initialization search
		initSearch(model, selectAddress);

		return "trang-chu";
	}

	@RequestMapping(value = "/selectAddress", method = RequestMethod.POST)
	public String selectAddress(Model model, @ModelAttribute("selectAddress") SelectAddress selectAddress,
			HttpSession session) {

		return "trang-chu";
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
		List<City> lstCity = homeService.getAllCity();

		// initialization condition
		selectAddress.setCityId(lstCity.stream().findFirst().get().getCityId());

		// get all District by city_id
		List<District> lstDistrict = homeService.getDistrictByCondition(selectAddress);
		selectAddress.setDistrictId(lstDistrict.stream().findFirst().get().getDistrictId());

		// get all Ward by city_id and district_id
		List<Ward> lstWard = homeService.getWardByCondition(selectAddress);
		selectAddress.setWardId(lstWard.stream().findFirst().get().getWardId());

		// get all Street by city_id and district_id
		List<Street> listStreet = homeService.getStreetByCondition(selectAddress);

		// get all LandType
		List<LandType> lstLandType = homeService.getAllLandType();

		SelectAddress selectLandType = new SelectAddress();
		selectLandType.setLandTypeId(lstLandType.stream().findFirst().get().getLandTypeId());

		// get all HousingType
		List<HousingType> lstHousingType = homeService.getAllHousingType();

		// Filter by first landTypeId
		lstHousingType = lstHousingType.stream()
				.filter(housingType -> housingType.getLandTypeId().equals(selectLandType.getLandTypeId()))
				.collect(Collectors.toList());

		List<HouseDirection> lstHouseDirection = homeService.getHouseDirection();
		List<SearchLandArea> lstSearchLandArea = homeService.getSearchLandArea();
		List<SearchLandPrice> lstSearchLandPrice = homeService.getSearchLandPrice();
		List<AddOns> lstAddOns = homeService.getAddOns();

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

		// get all menu status = 1
		List<MainMenu> lstMainMenu = homeService.getAllMainMenu();

		List<SubMenu> lstSubMenu = homeService.getAllSubMenu();

		lstMainMenu.stream().forEach(e -> e.setSubMenuList(lstSubMenu.stream()
				.filter(subMenu -> subMenu.getMainMenuId().equals(e.getMainMenuId())).collect(Collectors.toList())));

		model.addAttribute("lstMainMenu", lstMainMenu);

		// String userName = Utils.getUserName(model, session);
		// TODO: hardcode userName
		String userName = "admin";
		if (StringUtils.isNotBlank(userName)) {
			List<Notification> lstNotification = homeService.getAllNotificationByUserName(userName);
			model.addAttribute("lstNotification", lstNotification);
		}
	}
}
