package realestate.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import realestate.dto.SelectAddress;
import realestate.entity.City;
import realestate.entity.District;
import realestate.entity.Street;
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

		// initialization search
		initSearch(model);

		return "trang-chu";
	}

	@RequestMapping(value = "/selectAddress", method = RequestMethod.POST)
	public String selectAddress(Model model, @ModelAttribute("selectAddress") SelectAddress selectAddress,
			HttpSession session) {

		return "trang-chu";
	}

	private void initSearch(Model model) {

		// get all City with status = 1
		List<City> lstCity = homeService.getAllCity();

		// initialization condition
		SelectAddress selectAddress = new SelectAddress();
		selectAddress.setCityId(lstCity.stream().findFirst().get().getCityId());

		// get all District by city_id
		List<District> lstDistrict = homeService.getDistrictByCondition(selectAddress);
		selectAddress.setDistrictId(lstDistrict.stream().findFirst().get().getDistrictId());

		// get all Ward by city_id and district_id
		List<Ward> lstWard = homeService.getWardByCondition(selectAddress);
		selectAddress.setWard(lstWard.stream().findFirst().get().getWardId());

		// get all Street by city_id and district_id
		List<Street> listStreet = homeService.getStreetByCondition(selectAddress);

		// Add model attribute
		model.addAttribute("lstCity", lstCity);
		model.addAttribute("lstDistrict", lstDistrict);
		model.addAttribute("lstWard", lstWard);
		model.addAttribute("listStreet", listStreet);
	}
}
