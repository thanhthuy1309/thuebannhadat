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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

/**
 * The Class PostImage.
 *
 * @author : DungPT
 * @PG_ID : PostImage(HinhAnhTin)
 * @createDate : 21.08.2016
 */
@Entity
@Table(name = "tbl_post_image")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Where(clause = "status = 1")
public class PostImage extends AbstractEntity {

	/**  Init serialVersionUID is 1L *. */
	private static final long serialVersionUID = 1L;

	/**  Init idHinhAnhTin *. */
	@Id
	@Column(name = "post_image_id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer postImageId;

	/**  Init idMauTin *. */
	@Column(name = "post_specification_id", nullable = false, length = 250)
	private String postSpecificationId;

	/**  Init tenHinhAnh *. */
	@Column(name = "post_image_name", nullable = false, length = 250)
	private String postImageName;

	/**  Init order *. */
	@Column(name = "type_image", nullable = false, length = 250, columnDefinition = "CHAR(1)")
	private String typeImage;

	/**  Init order *. */
	@Column(name = "post_image_order", nullable = false, columnDefinition = "TINYINT(2) UNSIGNED")
	private Integer postImageOrder;

	/**  Init MauTin *. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "post_specification_id", referencedColumnName = "post_specification_id", insertable = false, updatable = false)
	private PostSpecification postSpecification;

	/**
	 * Gets the post image id.
	 *
	 * @return the post image id
	 */
	public Integer getPostImageId() {
		return postImageId;
	}

	/**
	 * Sets the post image id.
	 *
	 * @param postImageId the new post image id
	 */
	public void setPostImageId(Integer postImageId) {
		this.postImageId = postImageId;
	}

	/**
	 * Gets the post specification id.
	 *
	 * @return the post specification id
	 */
	public String getPostSpecificationId() {
		return postSpecificationId;
	}

	/**
	 * Sets the post specification id.
	 *
	 * @param postSpecificationId the new post specification id
	 */
	public void setPostSpecificationId(String postSpecificationId) {
		this.postSpecificationId = postSpecificationId;
	}

	/**
	 * Gets the post image name.
	 *
	 * @return the post image name
	 */
	public String getPostImageName() {
		return postImageName;
	}

	/**
	 * Sets the post image name.
	 *
	 * @param postImageName the new post image name
	 */
	public void setPostImageName(String postImageName) {
		this.postImageName = postImageName;
	}

	/**
	 * Gets the type image.
	 *
	 * @return the type image
	 */
	public String getTypeImage() {
		return typeImage;
	}

	/**
	 * Sets the type image.
	 *
	 * @param typeImage the new type image
	 */
	public void setTypeImage(String typeImage) {
		this.typeImage = typeImage;
	}

	/**
	 * Gets the post image order.
	 *
	 * @return the postImageOrder
	 */
	public Integer getPostImageOrder() {
		return postImageOrder;
	}

	/**
	 * Sets the post image order.
	 *
	 * @param postImageOrder            the postImageOrder to set
	 */
	public void setPostImageOrder(Integer postImageOrder) {
		this.postImageOrder = postImageOrder;
	}

	/**
	 * Gets the post specification.
	 *
	 * @return the postSpecification
	 */
	public PostSpecification getPostSpecification() {
		return postSpecification;
	}

	/**
	 * Sets the post specification.
	 *
	 * @param postSpecification the postSpecification to set
	 */
	public void setPostSpecification(PostSpecification postSpecification) {
		this.postSpecification = postSpecification;
	}

}
