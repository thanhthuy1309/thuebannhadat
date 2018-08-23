/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author : thuy.tran
 * @PG_ID : Notification (Thong bao)
 * @createDate : 23.08.2018
 */
@Entity
@Table(name = "tbl_notification")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Notification extends AbstractEntity {

	/** Init serialVersionUID is 1L **/
	private static final long serialVersionUID = 1L;

	/** Init notificationId **/
	@Id
	@Column(name = "notification_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer notificationId;

	/** Init notificationTitle **/
	@Column(name = "notification_title", length = 255, columnDefinition = "VARCHAR(255) DEFAULT ''")
	private String notificationTitle;

	/** Init notificationContent **/
	@Column(name = "notification_content", length = 500, columnDefinition = "VARCHAR(500) DEFAULT ''")
	private String notificationContent;

	/**
	 * @return the notificationId
	 */
	public Integer getNotificationId() {
		return notificationId;
	}

	/**
	 * @param notificationId
	 *            the notificationId to set
	 */
	public void setNotificationId(Integer notificationId) {
		this.notificationId = notificationId;
	}

	/**
	 * @return the notificationTitle
	 */
	public String getNotificationTitle() {
		return notificationTitle;
	}

	/**
	 * @param notificationTitle
	 *            the notificationTitle to set
	 */
	public void setNotificationTitle(String notificationTitle) {
		this.notificationTitle = notificationTitle;
	}

	/**
	 * @return the notificationContent
	 */
	public String getNotificationContent() {
		return notificationContent;
	}

	/**
	 * @param notificationContent
	 *            the notificationContent to set
	 */
	public void setNotificationContent(String notificationContent) {
		this.notificationContent = notificationContent;
	}

	public static long getSerialversionuid() {
	    return serialVersionUID;
	  }
}
