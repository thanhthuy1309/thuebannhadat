package realestate.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import realestate.dto.SelectAddress;

/**
 * @author : ThuyTran
 * @PG_ID : SearchController
 * @createDate : 05.09.2018
 */
@Controller
public class SearchController {

	@RequestMapping(value = "/selectAddress", method = RequestMethod.POST)
	public String selectAddress(Model model, @ModelAttribute("selectAddress") SelectAddress selectAddress,
			HttpSession session) {

		return "trang-chu";
	}
}
