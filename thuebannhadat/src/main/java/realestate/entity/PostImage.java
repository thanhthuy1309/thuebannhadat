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
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

/**
 * @author : DungPT
 * @PG_ID : PostImage(HinhAnhTin)
 * @createDate : 21.08.2016
 */
@Entity
@Table(name = "tbl_post_image")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class PostImage extends AbstractEntity {

	/** Init serialVersionUID is 1L **/
	private static final long serialVersionUID = 1L;

	/** Init idHinhAnhTin **/
	@Id
	@Column(name = "post_image_id", length = 250, nullable = false)
	private String postImageId;

	/** Init idMauTin **/
	@Column(name = "post_specification_id", nullable = false, length = 250)
	private String postSpecificationId;

	/** Init tenHinhAnh **/
	@Column(name = "post_image_name", nullable = false, length = 250)
	private String postImageName;

	/** Init urlHinhAnh **/
	@Column(name = "post_image_url", nullable = false, length = 500)
	private String postImageUrl;

	/** Init order **/
	@Column(name = "type_image", nullable = false, length = 250, columnDefinition = "CHAR(1)")
	private String typeImage;

	/** Init order **/
	@Column(name = "post_image_order", nullable = false, columnDefinition = "TINYINT(2) UNSIGNED")
	private Integer postImageOrder;

	public String getPostImageId() {
		return postImageId;
	}

	public void setPostImageId(String postImageId) {
		this.postImageId = postImageId;
	}

	public String getPostSpecificationId() {
		return postSpecificationId;
	}

	public void setPostSpecificationId(String postSpecificationId) {
		this.postSpecificationId = postSpecificationId;
	}

	public String getPostImageName() {
		return postImageName;
	}

	public void setPostImageName(String postImageName) {
		this.postImageName = postImageName;
	}

	public String getTypeImage() {
		return typeImage;
	}

	public void setTypeImage(String typeImage) {
		this.typeImage = typeImage;
	}

	/**
	 * @return the postImageOrder
	 */
	public Integer getPostImageOrder() {
		return postImageOrder;
	}

	/**
	 * @param postImageOrder
	 *            the postImageOrder to set
	 */
	public void setPostImageOrder(Integer postImageOrder) {
		this.postImageOrder = postImageOrder;
	}

	/**
	 * @return the postImageUrl
	 */
	public String getPostImageUrl() {
		return postImageUrl;
	}

	/**
	 * @param postImageUrl
	 *            the postImageUrl to set
	 */
	public void setPostImageUrl(String postImageUrl) {
		this.postImageUrl = postImageUrl;
	}

}
