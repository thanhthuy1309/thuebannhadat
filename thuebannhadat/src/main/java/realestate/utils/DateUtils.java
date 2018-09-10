/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.apache.log4j.Logger;

/**
 * @author : DUNGPT
 * @PG_ID : DateUtils
 * @createDate : 02.08.2016
 */
public class DateUtils {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(DateUtils.class);

	/**
	 * Get now time.
	 *
	 * @return the date
	 */
	public static Date now() {
		return Calendar.getInstance().getTime();
	}

	/**
	 * Format date to String.
	 *
	 * @param date
	 *            the date
	 * @param format
	 *            the format
	 * @param locale
	 *            the locale
	 * @return the string
	 */
	public static String format(Date date, String format, Locale locale) {

		if (date != null && format != null && locale != null) {
			return new SimpleDateFormat(format, Locale.ENGLISH).format(date);
		}
		return null;
	}

	/**
	 * Gets the time by format.
	 *
	 * @param date
	 *            the date
	 * @param format
	 *            the format
	 * @return the time by format
	 */
	public static String getTimeByFormat(Date date, String format) {
		return format(date, format, Locale.ENGLISH);
	}

	/**
	 * Gets the date by format.
	 *
	 * @param date
	 *            the date
	 * @param format
	 *            the format
	 * @return the date by format
	 */
	public static String getDateByFormat(Date date, String format) {
		return format(date, format, Locale.ENGLISH);
	}

	public static Date getEndDate(int expirationTime) {
		LocalDateTime now = LocalDateTime.now();
		return Date.from(now.plusHours(expirationTime * 24).atZone(ZoneId.systemDefault()).toInstant());
	}
}
