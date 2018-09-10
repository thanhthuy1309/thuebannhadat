/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.entity;

import java.sql.Date;

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
 * @author : DungPT
 * @PG_ID : PostExpiration(ThoiHanTin)
 * @createDate : 21.08.2016
 */
@Entity
@Table(name = "tbl_post_expiration")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class PostExpiration extends AbstractEntity {

	/** Init serialVersionUID is 1L **/
	private static final long serialVersionUID = 1L;

	/** Init idThoiHanTin **/
	@Id
	@Column(name = "post_expiration_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer postExpirationId;

	/** Init postSpecificationId **/
	@Column(name = "post_specification_id", nullable = false, length = 250)
	private String postSpecificationId;

	/** Init startDate **/
	@Column(name = "start_date", columnDefinition = "TIMESTAMP DEFAULT 0")
	private Date startDate;

	/** Init endDate **/
	@Column(name = "end_date", columnDefinition = "TIMESTAMP DEFAULT 0")
	private Date endDate;

	/**
	 * @return the postExpirationId
	 */
	public Integer getPostExpirationId() {
		return postExpirationId;
	}

	/**
	 * @param postExpirationId
	 *            the postExpirationId to set
	 */
	public void setPostExpirationId(Integer postExpirationId) {
		this.postExpirationId = postExpirationId;
	}

	/**
	 * @return the postSpecificationId
	 */
	public String getPostSpecificationId() {
		return postSpecificationId;
	}

	/**
	 * @param postSpecificationId
	 *            the postSpecificationId to set
	 */
	public void setPostSpecificationId(String postSpecificationId) {
		this.postSpecificationId = postSpecificationId;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
