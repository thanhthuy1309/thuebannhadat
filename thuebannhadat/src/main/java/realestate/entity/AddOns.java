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
import org.hibernate.annotations.Where;

/**
 * The Class AddOns.
 *
 * @author : Thuy.Tran
 * @PG_ID : AddOns(Tien ich dinh kem)
 * @createDate : 04.09.2018
 */
@Entity
@Table(name = "tbl_add_ons")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class AddOns extends AbstractEntity {

	/** Init serialVersionUID is 1L *. */
	private static final long serialVersionUID = 1L;

	/** Init id dien tich mo rong */
	@Id
	@Column(name = "add_on_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addOnId;

	/** Init ten tien ich mo rong */
	@Column(name = "add_on_name", nullable = false)
	private String addOnName;

	/**
	 * Gets the adds the on id.
	 *
	 * @return the addOnId
	 */
	public Integer getAddOnId() {
		return addOnId;
	}

	/**
	 * Sets the adds the on id.
	 *
	 * @param addOnId
	 *            the addOnId to set
	 */
	public void setAddOnId(Integer addOnId) {
		this.addOnId = addOnId;
	}

	/**
	 * Gets the adds the on name.
	 *
	 * @return the addOnName
	 */
	public String getAddOnName() {
		return addOnName;
	}

	/**
	 * Sets the adds the on name.
	 *
	 * @param addOnName
	 *            the addOnName to set
	 */
	public void setAddOnName(String addOnName) {
		this.addOnName = addOnName;
	}

}
