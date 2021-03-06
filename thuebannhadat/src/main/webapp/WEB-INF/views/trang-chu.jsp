<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Nhà Đất</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, user-scalable=no" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/hover.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/animate.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/font-awesome.minb73c.css?t=1">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/lib/select/select.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/lib/owl-carousel/owl.carousel.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/lib/swipebox/swipebox-dark-1.3.css">
<link href="https://fonts.googleapis.com/css?family=Roboto+Condensed"
	rel="stylesheet">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/lib/plugin.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/lib/owl-carousel/owl.carousel.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/lib/select/select.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/lib/jquery.nailthumb.1.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/lib/jquery.lazyload.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/lib/jquery.validationEngine.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/lib/jquery.validationEngine-vi.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/main.js"></script>

<!--[if IE]>
			<script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7/html5shiv.js"></script>
		<![endif]-->
<!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
			<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
		<![endif]-->

</head>
<body class="">

	<jsp:include page="header.jsp"></jsp:include>

	<div class="wrap">

		<!-- SLIDER BEGIN -->

		<div class="home-slider">
			<div id="owl-slider" class="owl-carousel owl-slider">
				<div class="item cover"
					style="background-image: url(${pageContext.request.contextPath}/resources/images/13.jpg)">
					<div class="">
						<div class="">
							<div class="slider-content transition">
								<div class="labels">
									<span class="label b">Cho Thuê</span> <span class="label">Bán</span>
								</div>
								<h3>BIỆT THỰ PHỐ SABESTIAN</h3>
								<div>
									<table>
										<tr>
											<td colspan="2" class="dc-ico">Địa chỉ 108 Tôn Đức
												Thắng, P. Bến Thành, Q.1, TP.HCM</td>
										</tr>
										<tr>
											<td class="dt-ico">Diện tích: 125m2</td>
											<td class="pn-ico">Phòng Ngủ: 3</td>
										</tr>

										<tr>
											<td class="pt-ico">Phòng tắm: 2</td>
											<td class="gr-ico">Gara: 1</td>
										</tr>
									</table>
								</div>
								<h2>7 800 TỶ VND</h2>
							</div>
						</div>
					</div>
				</div>
				<div class="item cover"
					style="background-image: url(${pageContext.request.contextPath}/resources/images/14.jpg)">
					<div class="">
						<div class="">
							<div class="slider-content transition">
								<div class="labels">
									<span class="label">Bán</span> <span class="label b">Cho
										Thuê</span>
								</div>
								<h3>TIÊU ĐỀ LORREM</h3>
								<div>
									<table>
										<tr>
											<td colspan="2" class="dc-ico">Địa chỉ 108 Tôn Đức
												Thắng, P. Bến Thành, Q.1, TP.HCM</td>
										</tr>
										<tr>
											<td class="dt-ico">Diện tích: 125m2</td>
											<td class="pn-ico">Phòng Ngủ: 3</td>
										</tr>

										<tr>
											<td class="pt-ico">Phòng tắm: 2</td>
											<td class="gr-ico">Gara: 1</td>
										</tr>
									</table>
								</div>
								<h2>7 800 TỶ VND</h2>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- SLIDER END -->

		<!-- SEARCH BEGIN -->
		<div class="search-setting">
			<div class="con">
				<div class="tabs pda">
					<c:if test="${lstLandType != null}">
						<ul>
							<c:forEach items="${lstLandType }" var="landTypes">
								<li
									class="${landTypes.landTypeId==selectAddress.landTypeId ? 'active' : '' }"><a
									href="JavaScript:void(0)"><span>${fn:toUpperCase(landTypes.landTypeName) }</span></a></li>
							</c:forEach>
						</ul>
					</c:if>
					<div>
						<div>
							<div class="cls-after umgl umgr half pdt pdb">
								<div class="cls-after">
									<c:if test="${lstHousingType != null}">
										<div class="s-item">
											<div>
												<select class="form-control selectpicker validate[required]"
													data-live-search="true" data-size="6">
													<option>Chọn Loại Nhà Đất</option>
													<c:forEach items="${lstHousingType }" var="housingTypes">
														<c:choose>
															<c:when
																test="${selectAddress.housingTypeId == housingTypes.housingTypeId}">
																<option value="${housingTypes.housingTypeId}" selected>${housingTypes.housingTypeName }</option>
															</c:when>
															<c:otherwise>
																<option value="${housingTypes.housingTypeId }">${housingTypes.housingTypeName }</option>
															</c:otherwise>
														</c:choose>
													</c:forEach>
												</select>
											</div>
										</div>
									</c:if>
									<c:if test="${lstCity != null}">
										<div class="s-item">
											<div>
												<select class="form-control selectpicker validate[required]"
													data-live-search="true" data-size="6"
													onchange="changeSearch(event);">
													<option>Chọn Tỉnh/Thành Phố</option>
													<c:forEach items="${lstCity }" var="cities">
														<c:choose>
															<c:when test="${selectAddress.cityId == cities.cityId}">
																<option value="${cities.cityId}" selected>${cities.cityName }</option>
															</c:when>
															<c:otherwise>
																<option value="${cities.cityId }">${cities.cityName }</option>
															</c:otherwise>
														</c:choose>
													</c:forEach>
												</select>
											</div>
										</div>
									</c:if>
									<c:if test="${lstDistrict != null}">
										<div class="s-item">
											<div>
												<select class="form-control selectpicker validate[required]"
													data-live-search="true" data-size="6"
													onchange="changeSearch(event);">
													<option>Chọn Quận/Huyện</option>
													<c:forEach items="${lstDistrict }" var="districts">
														<c:choose>
															<c:when
																test="${selectAddress.districtId == districts.districtId}">
																<option value="${districts.districtId}" selected>${districts.districtName }</option>
															</c:when>
															<c:otherwise>
																<option value="${districts.districtId }">${districts.districtName }</option>
															</c:otherwise>
														</c:choose>
													</c:forEach>
												</select>
											</div>
										</div>
									</c:if>
									<c:if test="${lstWard != null}">
										<div class="s-item">
											<div>
												<select class="form-control selectpicker validate[required]"
													data-live-search="true" data-size="6">
													<option>Chọn Phường/Xã</option>
													<c:forEach items="${lstWard }" var="wards">
														<c:choose>
															<c:when test="${selectAddress.wardId == wards.wardId}">
																<option value="${wards.wardId}" selected>${wards.wardName }</option>
															</c:when>
															<c:otherwise>
																<option value="${wards.wardId }">${wards.wardName }</option>
															</c:otherwise>
														</c:choose>
													</c:forEach>
												</select>
											</div>
										</div>
									</c:if>
									<c:if test="${listStreet != null}">
										<div class="s-item">
											<div>
												<select class="form-control selectpicker validate[required]"
													data-live-search="true" data-size="6">
													<option>Chọn Đường</option>
													<c:forEach items="${listStreet }" var="streets">
														<c:choose>
															<c:when
																test="${selectAddress.streetId == streets.streetId}">
																<option value="${streets.streetId}" selected>${streets.streetName }</option>
															</c:when>
															<c:otherwise>
																<option value="${streets.streetId }">${streets.streetName }</option>
															</c:otherwise>
														</c:choose>
													</c:forEach>
												</select>
											</div>
										</div>
									</c:if>
									<div class="s-item">
										<div class="search-btn">
											<a href="timkiem.html"
												class="block-btn yellow-btn hvr-bounce-to-bottom">Tìm
												Kiếm</a>
											<button class="black-btn" data-toggle="collapse"
												data-target="#advance-setting">
												<span class="fa fa-sliders"></span>
											</button>
										</div>
									</div>
								</div>
								<div id="advance-setting" class="advance-setting">
									<c:if test="${lstSearchLandPrice != null}">
										<div class="s-item">
											<label>Chọn giá</label>
											<div>
												<select class="form-control selectpicker validate[required]"
													data-live-search="true" data-size="6">
													<option>Chọn mức giá</option>
													<c:forEach items="${lstSearchLandPrice }" var="prices">
														<c:choose>
															<c:when
																test="${selectAddress.price == prices.searchLandPriceValue}">
																<option value="${prices.searchLandPriceValue}" selected>${prices.searchLandPriceName }</option>
															</c:when>
															<c:otherwise>
																<option value="${prices.searchLandPriceValue }">${prices.searchLandPriceName }</option>
															</c:otherwise>
														</c:choose>
													</c:forEach>
												</select>
											</div>
										</div>
									</c:if>
									<c:if test="${lstSearchLandArea != null}">
										<div class="s-item">
											<label>Chọn diện tích</label>
											<div>
												<select class="form-control selectpicker validate[required]"
													data-live-search="true" data-size="6">
													<option>Chọn diện tích</option>
													<c:forEach items="${lstSearchLandArea }" var="areas">
														<c:choose>
															<c:when
																test="${selectAddress.area == areas.searchLandAreaValue}">
																<option value="${areas.searchLandAreaValue}" selected>${areas.searchLandAreaName }</option>
															</c:when>
															<c:otherwise>
																<option value="${areas.searchLandAreaValue }">${areas.searchLandAreaName }</option>
															</c:otherwise>
														</c:choose>
													</c:forEach>
												</select>
											</div>
										</div>
									</c:if>
									<c:if test="${lstHouseDirection != null}">
										<div class="s-item">
											<label>Chọn Hướng Nhà</label>
											<div>
												<select class="form-control selectpicker validate[required]"
													data-live-search="true" data-size="6">
													<option>Chọn hướng nhà</option>
													<c:forEach items="${lstHouseDirection }" var="directions">
														<c:choose>
															<c:when
																test="${selectAddress.direction == directions.houseDirectionId}">
																<option value="${directions.houseDirectionId}" selected>${directions.houseDirectionName }</option>
															</c:when>
															<c:otherwise>
																<option value="${directions.houseDirectionId }">${directions.houseDirectionName }</option>
															</c:otherwise>
														</c:choose>
													</c:forEach>
												</select>
											</div>
										</div>
									</c:if>
									<div class="s-item">
										<label>Số tầng</label>
										<div>
											<input class="txt" placeholder="Số Tầng" type="number">
										</div>
									</div>
									<div class="s-item">
										<label>Số phòng ngủ</label>
										<div>
											<input class="txt" placeholder="Số phòng ngủ" type="number">
										</div>
									</div>
									<div class="s-item">
										<label>Số phòng tắm</label>
										<div>
											<input class="txt" placeholder="Số phòng tắm" type="number">
										</div>
									</div>
									<div class="cls-after"></div>
									<c:if test="${lstAddOns != null}">
										<div class="s-item-a">
											<label class="white-lbl">Chọn Tiện ích kèm theo</label>
											<div class="rdbs">
												<button class="yellow-btn f-right">Reset</button>
												<c:forEach items="${lstAddOns }" var="addOn">
													<label class="rdb"><input type="checkbox"
														value="${addOn.addOnId }"><span>${addOn.addOnName }</span></label>
												</c:forEach>
											</div>
										</div>
									</c:if>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- SEARCH END -->

		<!-- SORT BEGIN -->
		<div class="con pda" style="z-index: 10">
			<div class="sort-setting">
				<!--
						<span>Sắp xếp theo </span>
						<div class="control">
							<div class="cbx cbx-se cbx-sort">
								<a href="JavaScript:void(0)" class="btn" data-toggle="dropdown"><span>Thông Thường <i class="fa fa-angle-down"></i></span></a>
								<div class="cbx-menu">
									<ul>
										<li><a href="JavaScript:void(0)">Tin mới nhất</a></li>
										<li><a href="JavaScript:void(0)">Tin cũ nhất</a></li>
										<li><a href="JavaScript:void(0)">Giá tăng dần</a></li>
										<li><a href="JavaScript:void(0)">Giá giảm dần</a></li>
										<li><a href="JavaScript:void(0)">Diện tích giảm dần</a></li>
										<li><a href="JavaScript:void(0)">Diện tích tăng dần</a></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="control">
							<div class="cbx cbx-se cbx-sort">
								<a href="JavaScript:void(0)" class="btn" data-toggle="dropdown"><span>Mức giá<i class="fa fa-angle-down"></i></span></a>
								<div class="cbx-menu">
									<ul>
										<li><a href="JavaScript:void(0)">Lorrem 1</a></li>
										<li><a href="JavaScript:void(0)">Lorrem 1</a></li>
										<li><a href="JavaScript:void(0)">Lorrem 1</a></li>
										<li><a href="JavaScript:void(0)">Lorrem 1</a></li>
										<li><a href="JavaScript:void(0)">Lorrem 1</a></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="control">
							<div class="cbx cbx-se cbx-sort">
								<a href="JavaScript:void(0)" class="btn" data-toggle="dropdown"><span>Tỉnh/Thành phố <i class="fa fa-angle-down"></i></span></a>
								<div class="cbx-menu">
									<ul>
										<li><a href="JavaScript:void(0)">Lorrem 1</a></li>
										<li><a href="JavaScript:void(0)">Lorrem 1</a></li>
										<li><a href="JavaScript:void(0)">Lorrem 1</a></li>
										<li><a href="JavaScript:void(0)">Lorrem 1</a></li>
										<li><a href="JavaScript:void(0)">Lorrem 1</a></li>
										<li><a href="JavaScript:void(0)">Lorrem 1</a></li>
									</ul>
								</div>
							</div>
						</div>
						-->
				<div class="view-type">
					Xem theo <span class="fa fa-th active" data-view="grid"></span> <span
						class="fa fa-th-list " data-view="list"></span>
				</div>
			</div>
		</div>
		<!-- SORT END -->

		<!-- HOT BEGIN -->
		<div class="con pda">
			<div class="tit">
				<p>THÔNG TIN NỔI BẬT</p>
				<div class="act show-control">
					<div class="next" onclick="hotowl.trigger('prev.owl.carousel');">
						<span class="fa fa-angle-left"></span>
					</div>
					<div class="prev" onclick="hotowl.trigger('next.owl.carousel');">
						<span class="fa fa-angle-right"></span>
					</div>
					<a href="ban-list.html" class="more a read-more"></a>
				</div>
			</div>
			<c:if test="${lstHighlight != null}">
				<div id="hot-owl-slider" class="owl-carousel">
					<c:forEach varStatus="myIndex" begin="0"
						end="${lstHighlight.size() }" step="4">
						<div class="item">
							<div class="hot-items">
								<div>
									<div class="item">
										<div class="nailthumb">
											<div class="nailthumb-figure-75">
												<a
													href="${pageContext.request.contextPath}/${lstHighlight[myIndex.index].postSpecificationId}"
													class="nailthumb-container"> <img class="lazy"
													src="${pageContext.request.contextPath}/${lstHighlight[myIndex.index].postImageList[0].postImageName}">
												</a> <a
													href="${pageContext.request.contextPath}/${lstHighlight[myIndex.index].postSpecificationId}"
													class="info">
													<div>
														<div class="labels">
															<span class="label">${lstHighlight[myIndex.index].postType.postTypeName}</span>
															<span class="label g">Thương Lượng</span>
														</div>
														<h2>${lstHighlight[myIndex.index].postSpecificationName}</h2>
														<p>
															<span class="fa fa-map-marker"></span>${lstHighlight[myIndex.index].address}
															${lstHighlight[myIndex.index].street.streetName},
															P.${lstHighlight[myIndex.index].ward.wardName},
															${lstHighlight[myIndex.index].district.districtName},
															${lstHighlight[myIndex.index].city.cityName}
														</p>
														<div class="price">${lstHighlight[myIndex.index].postCostTotal}
															TỶ</div>
													</div>
												</a>
											</div>
										</div>
									</div>
									<div class="item">
										<div class="">
											<div class="nailthumb">
												<a
													href="${pageContext.request.contextPath}/${lstHighlight[myIndex.index + 1].postSpecificationId}"
													class="nailthumb-container"> <img class="lazy"
													src="${pageContext.request.contextPath}/${lstHighlight[myIndex.index + 1].postImageList[0].postImageName}">
												</a> <a
													href="${pageContext.request.contextPath}/${lstHighlight[myIndex.index + 1].postSpecificationId}"
													class="info">
													<div>
														<div class="labels">
															<span class="label">${lstHighlight[myIndex.index + 1].postType.postTypeName}</span>
															<span class="label g">Thương Lượng</span>
														</div>
														<h2>${lstHighlight[myIndex.index + 1].postSpecificationName}</h2>
														<p>
															<span class="fa fa-map-marker"></span>${lstHighlight[myIndex.index + 1].address}
															${lstHighlight[myIndex.index + 1].street.streetName},
															P.${lstHighlight[myIndex.index + 1].ward.wardName},
															${lstHighlight[myIndex.index + 1].district.districtName},
															${lstHighlight[myIndex.index + 1].city.cityName}
														</p>
														<div class="price">${lstHighlight[myIndex.index + 1].postCostTotal}
															TỶ</div>
													</div>
												</a>
											</div>
										</div>
									</div>
								</div>
								<div>
									<div class="item">
										<div class="">
											<div class="nailthumb">
												<a
													href="${pageContext.request.contextPath}/${lstHighlight[myIndex.index + 2].postSpecificationId}"
													class="nailthumb-container"> <img class="lazy"
													src="${pageContext.request.contextPath}/${lstHighlight[myIndex.index + 2].postImageList[0].postImageName}">
												</a> <a
													href="${pageContext.request.contextPath}/${lstHighlight[myIndex.index + 2].postSpecificationId}"
													class="info">
													<div>
														<div class="labels">
															<span class="label">${lstHighlight[myIndex.index + 2].postType.postTypeName}</span>
															<span class="label g">Thương Lượng</span>
														</div>
														<h2>${lstHighlight[myIndex.index + 2].postSpecificationName}</h2>
														<p>
															<span class="fa fa-map-marker"></span>${lstHighlight[myIndex.index + 2].address}
															${lstHighlight[myIndex.index + 2].street.streetName},
															P.${lstHighlight[myIndex.index + 2].ward.wardName},
															${lstHighlight[myIndex.index + 2].district.districtName},
															${lstHighlight[myIndex.index + 2].city.cityName}
														</p>
														<div class="price">${lstHighlight[myIndex.index + 2].postCostTotal}
															TỶ</div>
													</div>
												</a>
											</div>
										</div>
									</div>
									<div class="item">
										<div class="nailthumb">
											<div class="nailthumb-figure-75">
												<a
													href="${pageContext.request.contextPath}/${lstHighlight[myIndex.index + 3].postSpecificationId}"
													class="nailthumb-container"> <img class="lazy"
													src="${pageContext.request.contextPath}/${lstHighlight[myIndex.index + 3].postImageList[0].postImageName}">
												</a> <a
													href="${pageContext.request.contextPath}/${lstHighlight[myIndex.index + 3].postSpecificationId}"
													class="info">
													<div>
														<div class="labels">
															<span class="label">${lstHighlight[myIndex.index + 3].postType.postTypeName}</span>
															<span class="label g">Thương Lượng</span>
														</div>
														<h2>${lstHighlight[myIndex.index + 3].postSpecificationName}</h2>
														<p>
															<span class="fa fa-map-marker"></span>${lstHighlight[myIndex.index + 3].address}
															${lstHighlight[myIndex.index + 3].street.streetName},
															P.${lstHighlight[myIndex.index + 3].ward.wardName},
															${lstHighlight[myIndex.index + 3].district.districtName},
															${lstHighlight[myIndex.index + 3].city.cityName}
														</p>
														<div class="price">${lstHighlight[myIndex.index + 3].postCostTotal}
															TỶ</div>
													</div>
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</c:if>
		</div>
		<!-- HOT END -->

		<!-- CONTENT BEGIN -->
		<div class="con cls-after">
			<!-- LEFT BEGIN -->
			<div class="con-left pda">
				<!-- SALE BEGIN -->
				<div class="tit">
					<p>NHÀ ĐẤT BÁN</p>
					<div class="act">
						<a href="ban-list.html" class="more a"><span class="smtext">Xem
								tất cả</span> <span class="fa fa-angle-right"></span></a>
					</div>
				</div>
				<div class="items cls-after grid">
					<div class="item cls-after">
						<div class="nailthumb">
							<div class="nailthumb-figure-64">
								<a href="ban.html" class="nailthumb-container"> <img
									class="lazy"
									src="${pageContext.request.contextPath}/resources/images/5.jpg">
								</a>
								<div class="price">
									<div>10 TỶ</div>
									<span>7tr500/Tháng</span>
								</div>
							</div>
						</div>
						<div class="info">
							<div class="price">
								<div>10 TỶ</div>
								<span>7tr500/Tháng</span>
							</div>
							<div class="labels">
								<span class="label">Bán</span> <span class="label g">Thương
									Lượng</span>
							</div>
							<table>
								<tr>
									<th colspan="6"><a href="ban.html">Biệt thự Golden</a></th>
								</tr>
								<tr>
									<td colspan="6" class="dc-ico adds">Địa chỉ 108 Tôn Đức
										Thắng, P. Bến Thành, Q.1, TP.HCM</td>
								</tr>
								<tr>
									<td class="dt-ico" width="100" colspan="3">Diện tích:
										125m2</td>
									<td class="pn-ico" colspan="3">Phòng Ngủ: 3</td>
								</tr>

								<tr>
									<td class="pt-ico" colspan="3">Phòng tắm: 2</td>
									<td class="gr-ico" colspan="3">Gara: 1</td>
								</tr>
								<tr>
									<td colspan="6" class="hr"></td>
								</tr>
								<tr>
									<td class="adds" colspan="2"><span class="fa fa-user"></span>
										Nova Land Group</td>
									<td class="adds" colspan="2"><span class="fa fa-calendar"></span>
										12/08/2016</td>
									<td class="td-more" colspan="2"><a href="ban.html"
										class="yellow-btn">CHI TIẾT <span
											class="fa fa-angle-right"></span></a></td>
								</tr>
							</table>
						</div>
					</div>
					<div class="item cls-after">
						<div class="nailthumb">
							<div class="nailthumb-figure-64">
								<a href="ban.html" class="nailthumb-container"> <img
									class="lazy"
									src="${pageContext.request.contextPath}/resources/images/6.jpg">
								</a>
								<div class="price">
									<div>10 TỶ</div>
									<span>7tr500/Tháng</span>
								</div>
							</div>
						</div>
						<div class="info">
							<div class="price">
								<div>10 TỶ</div>
								<span>7tr500/Tháng</span>
							</div>
							<div class="labels">
								<span class="label">Bán</span> <span class="label g">Thương
									Lượng</span>
							</div>
							<table>
								<tr>
									<th colspan="6"><a href="ban.html">Biệt thự Golden</a></th>
								</tr>
								<tr>
									<td colspan="6" class="dc-ico adds">Địa chỉ 108 Tôn Đức
										Thắng, P. Bến Thành, Q.1, TP.HCM</td>
								</tr>
								<tr>
									<td class="dt-ico" width="100" colspan="3">Diện tích:
										125m2</td>
									<td class="pn-ico" colspan="3">Phòng Ngủ: 3</td>
								</tr>

								<tr>
									<td class="pt-ico" colspan="3">Phòng tắm: 2</td>
									<td class="gr-ico" colspan="3">Gara: 1</td>
								</tr>
								<tr>
									<td colspan="6" class="hr"></td>
								</tr>
								<tr>
									<td class="adds" colspan="2"><span class="fa fa-user"></span>
										Nova Land Group</td>
									<td class="adds" colspan="2"><span class="fa fa-calendar"></span>
										12/08/2016</td>
									<td class="td-more" colspan="2"><a href="ban.html"
										class="yellow-btn">CHI TIẾT <span
											class="fa fa-angle-right"></span></a></td>
								</tr>
							</table>
						</div>
					</div>
					<div class="item cls-after">
						<div class="nailthumb">
							<div class="nailthumb-figure-64">
								<a href="ban.html" class="nailthumb-container"> <img
									class="lazy"
									src="${pageContext.request.contextPath}/resources/images/7.jpg">
								</a>
								<div class="price">
									<div>10 TỶ</div>
									<span>7tr500/Tháng</span>
								</div>
							</div>
						</div>
						<div class="info">
							<div class="price">
								<div>10 TỶ</div>
								<span>7tr500/Tháng</span>
							</div>
							<div class="labels">
								<span class="label">Bán</span> <span class="label g">Thương
									Lượng</span>
							</div>
							<table>
								<tr>
									<th colspan="6"><a href="ban.html">Biệt thự Golden</a></th>
								</tr>
								<tr>
									<td colspan="6" class="dc-ico adds">Địa chỉ 108 Tôn Đức
										Thắng, P. Bến Thành, Q.1, TP.HCM</td>
								</tr>
								<tr>
									<td class="dt-ico" width="100" colspan="3">Diện tích:
										125m2</td>
									<td class="pn-ico" colspan="3">Phòng Ngủ: 3</td>
								</tr>

								<tr>
									<td class="pt-ico" colspan="3">Phòng tắm: 2</td>
									<td class="gr-ico" colspan="3">Gara: 1</td>
								</tr>
								<tr>
									<td colspan="6" class="hr"></td>
								</tr>
								<tr>
									<td class="adds" colspan="2"><span class="fa fa-user"></span>
										Nova Land Group</td>
									<td class="adds" colspan="2"><span class="fa fa-calendar"></span>
										12/08/2016</td>
									<td class="td-more" colspan="2"><a href="ban.html"
										class="yellow-btn">CHI TIẾT <span
											class="fa fa-angle-right"></span></a></td>
								</tr>
							</table>
						</div>
					</div>
					<div class="item cls-after">
						<div class="nailthumb">
							<div class="nailthumb-figure-64">
								<a href="ban.html" class="nailthumb-container"> <img
									class="lazy"
									src="${pageContext.request.contextPath}/resources/images/8.jpg">
								</a>
								<div class="price">
									<div>10 TỶ</div>
									<span>7tr500/Tháng</span>
								</div>
							</div>
						</div>
						<div class="info">
							<div class="price">
								<div>10 TỶ</div>
								<span>7tr500/Tháng</span>
							</div>
							<div class="labels">
								<span class="label b">Cho Thuê</span> <span class="label g">Thương
									Lượng</span>
							</div>
							<table>
								<tr>
									<th colspan="6"><a href="ban.html">Biệt thự Golden</a></th>
								</tr>
								<tr>
									<td colspan="6" class="dc-ico adds">Địa chỉ 108 Tôn Đức
										Thắng, P. Bến Thành, Q.1, TP.HCM</td>
								</tr>
								<tr>
									<td class="dt-ico" width="100" colspan="3">Diện tích:
										125m2</td>
									<td class="pn-ico" colspan="3">Phòng Ngủ: 3</td>
								</tr>

								<tr>
									<td class="pt-ico" colspan="3">Phòng tắm: 2</td>
									<td class="gr-ico" colspan="3">Gara: 1</td>
								</tr>
								<tr>
									<td colspan="6" class="hr"></td>
								</tr>
								<tr>
									<td class="adds" colspan="2"><span class="fa fa-user"></span>
										Nova Land Group</td>
									<td class="adds" colspan="2"><span class="fa fa-calendar"></span>
										12/08/2016</td>
									<td class="td-more" colspan="2"><a href="ban.html"
										class="yellow-btn">CHI TIẾT <span
											class="fa fa-angle-right"></span></a></td>
								</tr>
							</table>
						</div>
					</div>
				</div>
				<!-- SALE END -->
				<!-- THUE BEGIN -->
				<div class="tit">
					<p>NHÀ ĐẤT THUÊ</p>
					<div class="act">
						<a href="thue-list.html" class="more a"><span class="smtext">Xem
								tất cả</span> <span class="fa fa-angle-right"></span></a>
					</div>
				</div>
				<div class="items cls-after grid">
					<div class="item cls-after">
						<div class="nailthumb">
							<div class="nailthumb-figure-64">
								<a href="thue.html" class="nailthumb-container"> <img
									class="lazy"
									src="${pageContext.request.contextPath}/resources/images/9.jpg">
								</a>
								<div class="price">
									<div>10 TỶ</div>
									<span>7tr500/Tháng</span>
								</div>
							</div>
						</div>
						<div class="info">
							<div class="price">
								<div>10 TỶ</div>
								<span>7tr500/Tháng</span>
							</div>
							<div class="labels">
								<span class="label">Bán</span> <span class="label g">Thương
									Lượng</span>
							</div>
							<table>
								<tr>
									<th colspan="6"><a href="thue.html">Biệt thự Golden</a></th>
								</tr>
								<tr>
									<td colspan="6" class="dc-ico adds">Địa chỉ 108 Tôn Đức
										Thắng, P. Bến Thành, Q.1, TP.HCM</td>
								</tr>
								<tr>
									<td class="dt-ico" width="100" colspan="3">Diện tích:
										125m2</td>
									<td class="pn-ico" colspan="3">Phòng Ngủ: 3</td>
								</tr>

								<tr>
									<td class="pt-ico" colspan="3">Phòng tắm: 2</td>
									<td class="gr-ico" colspan="3">Gara: 1</td>
								</tr>
								<tr>
									<td colspan="6" class="hr"></td>
								</tr>
								<tr>
									<td class="adds" colspan="2"><span class="fa fa-user"></span>
										Nova Land Group</td>
									<td class="adds" colspan="2"><span class="fa fa-calendar"></span>
										12/08/2016</td>
									<td class="td-more" colspan="2"><a href="thue.html"
										class="yellow-btn">CHI TIẾT <span
											class="fa fa-angle-right"></span></a></td>
								</tr>
							</table>
						</div>
					</div>
					<div class="item cls-after">
						<div class="nailthumb">
							<div class="nailthumb-figure-64">
								<a href="thue.html" class="nailthumb-container"> <img
									class="lazy"
									src="${pageContext.request.contextPath}/resources/images/10.jpg">
								</a>
								<div class="price">
									<div>10 TỶ</div>
									<span>7tr500/Tháng</span>
								</div>
							</div>
						</div>
						<div class="info">
							<div class="price">
								<div>10 TỶ</div>
								<span>7tr500/Tháng</span>
							</div>
							<div class="labels">
								<span class="label">Bán</span> <span class="label g">Thương
									Lượng</span>
							</div>
							<table>
								<tr>
									<th colspan="6"><a href="thue.html">Biệt thự Golden</a></th>
								</tr>
								<tr>
									<td colspan="6" class="dc-ico adds">Địa chỉ 108 Tôn Đức
										Thắng, P. Bến Thành, Q.1, TP.HCM</td>
								</tr>
								<tr>
									<td class="dt-ico" width="100" colspan="3">Diện tích:
										125m2</td>
									<td class="pn-ico" colspan="3">Phòng Ngủ: 3</td>
								</tr>

								<tr>
									<td class="pt-ico" colspan="3">Phòng tắm: 2</td>
									<td class="gr-ico" colspan="3">Gara: 1</td>
								</tr>
								<tr>
									<td colspan="6" class="hr"></td>
								</tr>
								<tr>
									<td class="adds" colspan="2"><span class="fa fa-user"></span>
										Nova Land Group</td>
									<td class="adds" colspan="2"><span class="fa fa-calendar"></span>
										12/08/2016</td>
									<td class="td-more" colspan="2"><a href="thue.html"
										class="yellow-btn">CHI TIẾT <span
											class="fa fa-angle-right"></span></a></td>
								</tr>
							</table>
						</div>
					</div>
					<div class="item cls-after">
						<div class="nailthumb">
							<div class="nailthumb-figure-64">
								<a href="thue.html" class="nailthumb-container"> <img
									class="lazy"
									src="${pageContext.request.contextPath}/resources/images/11.jpg">
								</a>
								<div class="price">
									<div>10 TỶ</div>
									<span>7tr500/Tháng</span>
								</div>
							</div>
						</div>
						<div class="info">
							<div class="price">
								<div>10 TỶ</div>
								<span>7tr500/Tháng</span>
							</div>
							<div class="labels">
								<span class="label">Bán</span> <span class="label g">Thương
									Lượng</span>
							</div>
							<table>
								<tr>
									<th colspan="6"><a href="thue.html">Biệt thự Golden</a></th>
								</tr>
								<tr>
									<td colspan="6" class="dc-ico adds">Địa chỉ 108 Tôn Đức
										Thắng, P. Bến Thành, Q.1, TP.HCM</td>
								</tr>
								<tr>
									<td class="dt-ico" width="100" colspan="3">Diện tích:
										125m2</td>
									<td class="pn-ico" colspan="3">Phòng Ngủ: 3</td>
								</tr>

								<tr>
									<td class="pt-ico" colspan="3">Phòng tắm: 2</td>
									<td class="gr-ico" colspan="3">Gara: 1</td>
								</tr>
								<tr>
									<td colspan="6" class="hr"></td>
								</tr>
								<tr>
									<td class="adds" colspan="2"><span class="fa fa-user"></span>
										Nova Land Group</td>
									<td class="adds" colspan="2"><span class="fa fa-calendar"></span>
										12/08/2016</td>
									<td class="td-more" colspan="2"><a href="thue.html"
										class="yellow-btn">CHI TIẾT <span
											class="fa fa-angle-right"></span></a></td>
								</tr>
							</table>
						</div>
					</div>
					<div class="item cls-after">
						<div class="nailthumb">
							<div class="nailthumb-figure-64">
								<a href="thue.html" class="nailthumb-container"> <img
									class="lazy"
									src="${pageContext.request.contextPath}/resources/images/1.jpg">
								</a>
								<div class="price">
									<div>10 TỶ</div>
									<span>7tr500/Tháng</span>
								</div>
							</div>
						</div>
						<div class="info">
							<div class="price">
								<div>10 TỶ</div>
								<span>7tr500/Tháng</span>
							</div>
							<div class="labels">
								<span class="label b">Cho Thuê</span> <span class="label g">Thương
									Lượng</span>
							</div>
							<table>
								<tr>
									<th colspan="6"><a href="thue.html">Biệt thự Golden</a></th>
								</tr>
								<tr>
									<td colspan="6" class="dc-ico adds">Địa chỉ 108 Tôn Đức
										Thắng, P. Bến Thành, Q.1, TP.HCM</td>
								</tr>
								<tr>
									<td class="dt-ico" width="100" colspan="3">Diện tích:
										125m2</td>
									<td class="pn-ico" colspan="3">Phòng Ngủ: 3</td>
								</tr>

								<tr>
									<td class="pt-ico" colspan="3">Phòng tắm: 2</td>
									<td class="gr-ico" colspan="3">Gara: 1</td>
								</tr>
								<tr>
									<td colspan="6" class="hr"></td>
								</tr>
								<tr>
									<td class="adds" colspan="2"><span class="fa fa-user"></span>
										Nova Land Group</td>
									<td class="adds" colspan="2"><span class="fa fa-calendar"></span>
										12/08/2016</td>
									<td class="td-more" colspan="2"><a href="thue.html"
										class="yellow-btn">CHI TIẾT <span
											class="fa fa-angle-right"></span></a></td>
								</tr>
							</table>
						</div>
					</div>
				</div>
				<!-- THUE END -->
			</div>
			<!-- LEFT END -->
			<!-- RIGHT BEGIN -->
			<c:if test="${lstAds != null}">
				<div class="con-right pda">
					<div class="tit">
						<p>QUẢNG CÁO</p>
					</div>
					<div class="advs cls-after">
						<c:forEach items="${lstAds }" var="ads">
							<a href="${ads.advertisementWebUrl }" class="adv"> <img
								src="${pageContext.request.contextPath}${ads.advertisementImageUrl}">
							</a>
						</c:forEach>
					</div>
				</div>
			</c:if>
			<!-- RIGHT END -->
		</div>
		<!-- CONTENT END -->

		<!-- NEWS BEGIN -->
		<div class="con cls-after">
			<div class="pda">
				<div class="tit">
					<p>TIN NHÀ ĐẤT</p>
					<div class="act">
						<a href="tintuc-list.html" class="more a"><span class="smtext">Xem
								tất cả</span> <span class="fa fa-angle-right"></span></a>
					</div>
				</div>
				<div class="news-items cls-after">
					<div class="item">
						<div class="nailthumb">
							<div class="nailthumb-figure-square">
								<a href="tintuc-detail.html" class="nailthumb-container"> <img
									class="lazy"
									src="${pageContext.request.contextPath}/resources/images/2.jpg">
								</a>
							</div>
						</div>
						<div class="info">
							<a href="tintuc-detail.html" class="h3">[Lorem Ipsum] is
								simply dummy text of the printing and typesetting industry</a>
							<p>Lorem Ipsum is simply dummy text of the printing and
								typesetting industry. Lorem Ipsum has been the industry's
								standard dummy text ever since the 1500s</p>
						</div>
					</div>
					<div class="item">
						<div class="nailthumb">
							<div class="nailthumb-figure-square">
								<a href="tintuc-detail.html" class="nailthumb-container"> <img
									class="lazy"
									src="${pageContext.request.contextPath}/resources/images/3.jpg">
								</a>
							</div>
						</div>
						<div class="info">
							<a href="tintuc-detail.html" class="h3">[Lorem Ipsum] is
								simply dummy text of the printing and typesetting industry</a>
							<p>Lorem Ipsum is simply dummy text of the printing and
								typesetting industry. Lorem Ipsum has been the industry's
								standard dummy text ever since the 1500s</p>
						</div>
					</div>
					<div class="item">
						<div class="nailthumb">
							<div class="nailthumb-figure-square">
								<a href="tintuc-detail.html" class="nailthumb-container"> <img
									class="lazy"
									src="${pageContext.request.contextPath}/resources/images/4.jpg">
								</a>
							</div>
						</div>
						<div class="info">
							<a href="tintuc-detail.html" class="h3">[Lorem Ipsum] is
								simply dummy text of the printing and typesetting industry</a>
							<p>Lorem Ipsum is simply dummy text of the printing and
								typesetting industry. Lorem Ipsum has been the industry's
								standard dummy text ever since the 1500s</p>
						</div>
					</div>
					<div class="item">
						<div class="nailthumb">
							<div class="nailthumb-figure-square">
								<a href="tintuc-detail.html" class="nailthumb-container"> <img
									class="lazy"
									src="${pageContext.request.contextPath}/resources/images/5.jpg">
								</a>
							</div>
						</div>
						<div class="info">
							<a href="tintuc-detail.html" class="h3">[Lorem Ipsum] is
								simply dummy text of the printing and typesetting industry</a>
							<p>Lorem Ipsum is simply dummy text of the printing and
								typesetting industry. Lorem Ipsum has been the industry's
								standard dummy text ever since the 1500s</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- NEWS END -->

		<!-- FOOTER BEGIN -->
		<footer>
			<div class="con pdt pdb cls-after">
				<!-- FOOTER LEFT BEGIN -->
				<div>
					<div class="pdb">
						<a href="trangchu.html"><img
							src="${pageContext.request.contextPath}/resources/images/logo.png"></a>
					</div>
					<div class="pdt pdb">Kết nối với cộng đồng Thuê-Bán Nhà Đất</div>
					<ul class="social-icons cls-after pdb">
						<li><a href="JavaScript:void(0)"><span
								class="fa fa-facebook"></span></a></li>
						<li><a href="JavaScript:void(0)"><span
								class="fa fa-google"></span></a></li>
						<li><a href="JavaScript:void(0)"><span
								class="fa fa-youtube"></span></a></li>
						<li><a href="JavaScript:void(0)"><span
								class="fa fa-twitter"></span></a></li>
					</ul>
					<div class="pdt pdb foot-inf">
						Liên hệ với Thuê-Bán Nhà Đất<br /> <span
							class="fa fa-location-arrow"></span> 178 - 180 Nguyen Cu Trinh
						St, 1St Dist, HCMC<br /> <span class="fa fa-envelope-o"></span>
						(84.8) - 3836.8989 - 3836.8899 - 3836.9144<br /> <span
							class="fa fa-"> </span> Fax: (84.8) - 3836.8399<br /> <span
							class="fa fa-phone"></span> (84.8) - 3836.8989
					</div>
					<div class="pdt pdb">
						<a href="lienhe.html" class="bbtn">Liên hệ</a>
					</div>
				</div>
				<!-- FOOTER LEFT END -->
				<!-- FOOTER RIGHT BEGIN -->
				<div>
					<div class="f-tit">Nhà Đất Bán</div>
					<ul class="f-list pdb">
						<li><a href="JavaScript:void(0)"><span>100</span>Nhà đất
								Hồ Chí Minh</a></li>
						<li><a href="JavaScript:void(0)"><span>100</span>Nhà đất
								Hà Nội</a></li>
						<li><a href="JavaScript:void(0)"><span>100</span>Nhà đất
								Đà Nẵng</a></li>
						<li><a href="JavaScript:void(0)"><span>100</span>Nhà đất
								Hải Phòng</a></li>
						<li><a href="JavaScript:void(0)"><span>100</span>Nhà đất
								Bình Dương</a></li>
						<li><a href="JavaScript:void(0)"><span>100</span>Nhà đất
								Đồng Nai</a></li>
						<li><a href="JavaScript:void(0)"><span>100</span>Nhà đất
								Cần Thơ</a></li>
					</ul>
					<div class="f-tit">Nhà Đất Cho Thuê</div>
					<ul class="f-list">
						<li><a href="JavaScript:void(0)"><span>100</span>Nhà đất
								Hồ Chí Minh</a></li>
						<li><a href="JavaScript:void(0)"><span>100</span>Nhà đất
								Hà Nội</a></li>
						<li><a href="JavaScript:void(0)"><span>100</span>Nhà đất
								Hải Phòng</a></li>
						<li><a href="JavaScript:void(0)"><span>100</span>Nhà đất
								Bình Dương</a></li>
						<li><a href="JavaScript:void(0)"><span>100</span>Nhà đất
								Đồng Nai</a></li>
					</ul>
				</div>
				<!-- FOOTER LEFT END -->
				<!-- FOOTER RIGHT BEGIN -->
				<div>
					<div class="f-tit">Tag Tìm Kiếm</div>
					<div class="f-tag pdb">
						<a href="JavaScript:void(0)">NHÀ BÁN</a> <a
							href="JavaScript:void(0)">CHO THUÊ</a> <a
							href="JavaScript:void(0)">CHUNG CƯ</a> <a
							href="JavaScript:void(0)">THUÊ XƯỞNG</a> <a
							href="JavaScript:void(0)">BÁN BIỆT THỰ</a> <a
							href="JavaScript:void(0)">CHUNG CƯ CAO CẤP</a> <a
							href="JavaScript:void(0)">ĐẤT NỀN</a>
					</div>
					<div class="f-tit">Website Liên Kết</div>
					<ul class="f-list pdb">
						<li><a href="JavaScript:void(0)">http://www.phongthuy.com</a></li>
						<li><a href="JavaScript:void(0)">http://www.batdongsan.com</a></li>
						<li><a href="JavaScript:void(0)">http://www.chovaynhadat.com</a></li>
					</ul>
					<div class="f-tit">Đăng Ký Nhận Tin Nhắn Mới</div>
					<div class="newleter">
						<input type="text" placeholder="Email của bạn">
						<button>
							<span class="fa fa-send"></span>
						</button>
					</div>
				</div>
				<!-- FOOTER RIGHT END -->
			</div>
		</footer>
		<!-- FOOTER END -->
		<div class="after-foot">
			<div class="con cls-after">
				<ul>
					<li><a href="trangchu.html">Trang Chủ</a></li>
					<li><a href="gioithieu.html">Giới Thiệu</a></li>
					<li><a href="JavaScript:void(0)">Điều Khoản Bảo Mật</a></li>
					<li><a href="lienhe.html">Liên Hệ</a></li>
				</ul>
				<p>&copy; 2014 All rights reserved.</p>
			</div>
		</div>
	</div>

	<!-- POPUP BEGIN -->
	<jsp:include page="popup.jsp"></jsp:include>
	<iframe id="integration_asynchronous" name="integration_asynchronous"
		class="integration_asynchronous"></iframe>