/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;

/**
 * @author : DungPT
 * @PG_ID : User
 * @createDate : 16.08.2016
 */
@Entity
@Table(name = "tbl_user")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class User extends AbstractEntity {

	/** Init serialVersionUID is 1L **/
	private static final long serialVersionUID = 1L;

	/** Init idNguoiDung **/
	@Id
	@Column(name = "user_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;

	/** Init email **/
	@Column(name = "user_email", length = 50, columnDefinition = "VARCHAR(50) DEFAULT ''")
	private String userEmail;

	/** Init dienThoai **/
	@Column(name = "user_phone", length = 15, unique = true)
	private String userPhone;

	/** Init userName **/
	@Column(name = "user_name", length = 500, columnDefinition = "VARCHAR(500) DEFAULT ''")
	private String userName;

	/** Init password **/
	@Column(name = "user_password", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
	private String userPassword;

	@Column(name = "role_id", nullable = false)
	private Integer roleId;

	/** so lan lay ma code kich hoat toi da la 5 lan trong 1 ngay **/
	@Column(name = "activation_code_times", length = 5, columnDefinition = "TINYINT(1) UNSIGNED DEFAULT 0")
	private Integer activationCodeTimes;

	/** so lan lay ma code quen mat khau toi da la 5 lan trong 1 ngay **/
	@Column(name = "password_code_times", length = 5, columnDefinition = "TINYINT(1) UNSIGNED DEFAULT 0")
	private String passwordCodeTimes;

	@Column(name = "user_gender", columnDefinition = "TINYINT(1) UNSIGNED DEFAULT 0")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private Boolean userGender;

	@Column(name = "user_birthday", columnDefinition = "DATE DEFAULT 0")
	private Date userBirthday;

	/** Init phanQuyen **/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", referencedColumnName = "role_id", insertable = false, updatable = false)
	private Role role;

	/** Init diaChi **/
	@Column(name = "user_address", length = 250, columnDefinition = "VARCHAR(250) DEFAULT ''")
	private String userAddress;

	/** Init viTien **/
	@Column(name = "capital_amount", columnDefinition = "INT(11) UNSIGNED DEFAULT 0")
	private Integer capitalAmount;

	/** Init maCodeKichHoat **/
	@Column(name = "activation_code", length = 5, columnDefinition = "VARCHAR(5) DEFAULT ''")
	private String activationCode;

	/** Su dung khi quen mat khau **/
	@Column(name = "password_code", length = 5, columnDefinition = "VARCHAR(5) DEFAULT ''")
	private String passwordCode;

//	/** Init list thong bao **/
//	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Notification.class)
//	private List<Notification> notificationList;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getActivationCodeTimes() {
		return activationCodeTimes;
	}

	public void setActivationCodeTimes(Integer activationCodeTimes) {
		this.activationCodeTimes = activationCodeTimes;
	}

	public String getPasswordCodeTimes() {
		return passwordCodeTimes;
	}

	public void setPasswordCodeTimes(String passwordCodeTimes) {
		this.passwordCodeTimes = passwordCodeTimes;
	}

	public Boolean getUserGender() {
		return userGender;
	}

	public void setUserGender(Boolean userGender) {
		this.userGender = userGender;
	}

	public Date getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public Integer getCapitalAmount() {
		return capitalAmount;
	}

	public void setCapitalAmount(Integer capitalAmount) {
		this.capitalAmount = capitalAmount;
	}

	public String getActivationCode() {
		return activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public String getPasswordCode() {
		return passwordCode;
	}

	public void setPasswordCode(String passwordCode) {
		this.passwordCode = passwordCode;
	}

//	/**
//	 * @return the notificationList
//	 */
//	public List<Notification> getNotificationList() {
//		return notificationList;
//	}
//
//	/**
//	 * @param notificationList
//	 *            the notificationList to set
//	 */
//	public void setNotificationList(List<Notification> notificationList) {
//		this.notificationList = notificationList;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
