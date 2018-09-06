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
 * @author : ThuyTran
 * @PG_ID : PostAddOns(TinTienIchDinhKem)
 * @createDate : 06.09.2018
 */
@Entity
@Table(name = "tbl_post_ad_ons")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class PostAddOns extends AbstractEntity {

	/** Init serialVersionUID is 1L **/
	private static final long serialVersionUID = 1L;

	/** Init idTienIchDinhKem **/
	@Id
	@Column(name = "post_ad_ons_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer postAdOnsId;

	/** Init idMauTin **/
	@Column(name = "post_specification_id", nullable = false, length = 250)
	private String postSpecificationId;

	/** Init idMauTin **/
	@Column(name = "add_on_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
	private Integer addOnId;

	public Integer getPostAdOnsId() {
		return postAdOnsId;
	}

	public void setPostAdOnsId(Integer postAdOnsId) {
		this.postAdOnsId = postAdOnsId;
	}

	public String getPostSpecificationId() {
		return postSpecificationId;
	}

	public void setPostSpecificationId(String postSpecificationId) {
		this.postSpecificationId = postSpecificationId;
	}

	public Integer getAddOnId() {
		return addOnId;
	}

	public void setAddOnId(Integer addOnId) {
		this.addOnId = addOnId;
	}

}
