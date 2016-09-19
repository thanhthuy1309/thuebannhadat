package nhadat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {

	/**
	 * Page upload.
	 * 
	 * @return upload
	 */
	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public String notFound() {

		return "upload";
	}

	public static void main(String[] args) {
		
	}
}
