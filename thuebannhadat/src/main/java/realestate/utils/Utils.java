/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.utils;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.ui.Model;

import realestate.entity.User;

/**
 * @author : DUNGPT
 * @PG_ID : Utils
 * @createDate : 08.08.2016
 */
public class Utils {

	private static final Logger LOGGER = Logger.getLogger(Utils.class);

	public static boolean isEmptyString(String str) {
		boolean isEmpty = true;

		// check string not empty
		if (str != null && !"".equals(str)) {
			isEmpty = false;
		}

		return isEmpty;
	}

	/**
	 * tao ra so khong bi trung
	 * 
	 * @param length
	 *            chieu dai dai so muon tao ra
	 * @return long
	 */
	public static long generateRandom(int length) {
		Random random = new Random();
		char[] digits = new char[length];
		digits[0] = (char) (random.nextInt(9) + '1');
		for (int i = 1; i < length; i++) {
			digits[i] = (char) (random.nextInt(10) + '0');
		}
		return Long.parseLong(new String(digits));
	}

	/**
	 * 
	 * @param model
	 * @param session
	 * @return userName
	 */
	public static String getUserName(Model model, HttpSession session) {

		User user = (User) session.getAttribute("user");
		if (user != null) {
			return user.getUserName();
		}
		return null;
	}
}
