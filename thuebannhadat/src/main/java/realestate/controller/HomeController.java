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
		List<City> lstCity = homeService.getAllCity();
		List<District> lstDistrict = lstCity.stream().findFirst().get().getDistrictList();
		List<Street> listStreet = lstDistrict.stream().findFirst().get().getStreetList();

		model.addAttribute("lstCity", lstCity);
		model.addAttribute("lstDistrict", lstDistrict);
		model.addAttribute("listStreet", listStreet);
		return "trang-chu";
	}

	@RequestMapping(value = "/selectAddress", method = RequestMethod.POST)
	public String selectAddress(Model model, @ModelAttribute("selectAddress") SelectAddress selectAddress,
			HttpSession session) {

		return "trang-chu";
	}
}
