<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Nhà Đất</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width; initial-scale=1.0, minimum-scale=1.0, user-scalable=no" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/hover.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/animate.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css?t=1">
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
					style="background-image:url(${pageContext.request.contextPath}/resources/images/13.jpg)">
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
					style="background-image:url(${pageContext.request.contextPath}/resources/images/14.jpg)">
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

		<jsp:include page="search.jsp"></jsp:include>
		<jsp:include page="sort.jsp"></jsp:include>

		<!-- HOT BEGIN -->
		<div class="con pda">
			<div class="tit">
				<p>THÔNG TIN NỔI BẬT</p>
				<div class="act">
					<div class="next" onclick="hotowl.trigger('prev.owl.carousel');">
						<span class="fa fa-angle-left"></span>
					</div>
					<div class="prev" onclick="hotowl.trigger('next.owl.carousel');">
						<span class="fa fa-angle-right"></span>
					</div>
					<a href="ban-list.html" class="more a"><span class="smtext">Xem
							tất cả</span> <span class="fa fa-angle-right"></span></a>
				</div>
			</div>
			<div id="hot-owl-slider" class="owl-carousel">
				<div class="item">
					<div class="hot-items">
						<div>
							<div class="item">
								<div class="nailthumb">
									<div class="nailthumb-figure-75">
										<a href="ban.html" class="nailthumb-container"> <img
											class="lazy"
											src="${pageContext.request.contextPath}/resources/images/1.jpg">
										</a> <a href="ban.html" class="info">
											<div>
												<div class="labels">
													<span class="label">Bán</span> <span class="label g">Thương
														Lượng</span>
												</div>
												<h2>NHÀ MẶT TIỀN PHỐ</h2>
												<p>
													<span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức
													Thắng, P. Bến Thành, Q.1, TP.HCM
												</p>
												<div class="price">6 400 TỶ</div>
											</div>
										</a>
									</div>
								</div>
							</div>
							<div class="item">
								<div class="">
									<div class="nailthumb">
										<a href="ban.html" class="nailthumb-container"> <img
											class="lazy"
											src="${pageContext.request.contextPath}/resources/images/2.jpg">
										</a> <a href="ban.html" class="info">
											<div>
												<div class="labels">
													<span class="label">Bán</span> <span class="label g">Thương
														Lượng</span>
												</div>
												<h2>NHÀ MẶT TIỀN PHỐ</h2>
												<p>
													<span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức
													Thắng, P. Bến Thành, Q.1, TP.HCM
												</p>
												<div class="price">6 400 TỶ</div>
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
										<a href="ban.html" class="nailthumb-container"> <img
											class="lazy"
											src="${pageContext.request.contextPath}/resources/images/3.jpg">
										</a> <a href="ban.html" class="info">
											<div>
												<div class="labels">
													<span class="label">Bán</span> <span class="label g">Thương
														Lượng</span>
												</div>
												<h2>NHÀ MẶT TIỀN PHỐ</h2>
												<p>
													<span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức
													Thắng, P. Bến Thành, Q.1, TP.HCM
												</p>
												<div class="price">6 400 TỶ</div>
											</div>
										</a>
									</div>
								</div>
							</div>
							<div class="item">
								<div class="nailthumb">
									<div class="nailthumb-figure-75">
										<a href="ban.html" class="nailthumb-container"> <img
											class="lazy"
											src="${pageContext.request.contextPath}/resources/images/4.jpg">
										</a> <a href="ban.html" class="info">
											<div>
												<div class="labels">
													<span class="label">Bán</span> <span class="label g">Thương
														Lượng</span>
												</div>
												<h2>NHÀ MẶT TIỀN PHỐ</h2>
												<p>
													<span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức
													Thắng, P. Bến Thành, Q.1, TP.HCM
												</p>
												<div class="price">6 400 TỶ</div>
											</div>
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="hot-items">
						<div>
							<div class="item">
								<div class="nailthumb">
									<div class="nailthumb-figure-75">
										<a href="chitiet.html" class="nailthumb-container"> <img
											class="lazy"
											src="${pageContext.request.contextPath}/resources/images/1.jpg">
										</a> <a href="chitiet.html" class="info">
											<div>
												<div class="labels">
													<span class="label b">Cho Thuê</span>
												</div>
												<h2>NHÀ MẶT TIỀN PHỐ 1</h2>
												<p>
													<span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức
													Thắng, P. Bến Thành, Q.1, TP.HCM
												</p>
												<div class="price">6 400 TỶ</div>
											</div>
										</a>
									</div>
								</div>
							</div>
							<div class="item">
								<div class="">
									<div class="nailthumb">
										<a href="chitiet.html" class="nailthumb-container"> <img
											class="lazy"
											src="${pageContext.request.contextPath}/resources/images/2.jpg">
										</a> <a href="chitiet.html" class="info">
											<div>
												<div class="labels">
													<span class="label b">Cho Thuê</span> <span class="label g">Thương
														Lượng</span>
												</div>
												<h2>NHÀ MẶT TIỀN PHỐ 1</h2>
												<p>
													<span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức
													Thắng, P. Bến Thành, Q.1, TP.HCM
												</p>
												<div class="price">6 400 TỶ</div>
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
										<a href="chitiet.html" class="nailthumb-container"> <img
											class="lazy"
											src="${pageContext.request.contextPath}/resources/images/3.jpg">
										</a> <a href="chitiet.html" class="info">
											<div>
												<div class="labels">
													<span class="label">Bán</span> <span class="label g">Thương
														Lượng</span>
												</div>
												<h2>NHÀ MẶT TIỀN PHỐ 1</h2>
												<p>
													<span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức
													Thắng, P. Bến Thành, Q.1, TP.HCM
												</p>
												<div class="price">6 400 TỶ</div>
											</div>
										</a>
									</div>
								</div>
							</div>
							<div class="item">
								<div class="nailthumb">
									<div class="nailthumb-figure-75">
										<a href="chitiet.html" class="nailthumb-container"> <img
											class="lazy"
											src="${pageContext.request.contextPath}/resources/images/4.jpg">
										</a> <a href="chitiet.html" class="info">
											<div>
												<div class="labels">
													<span class="label">Bán</span> <span class="label g">Thương
														Lượng</span>
												</div>
												<h2>NHÀ MẶT TIỀN PHỐ</h2>
												<p>
													<span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức
													Thắng, P. Bến Thành, Q.1, TP.HCM
												</p>
												<div class="price">6 400 TỶ</div>
											</div>
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
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
			<jsp:include page="commercial.jsp"></jsp:include>
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

		<jsp:include page="footer.jsp"></jsp:include>

	</div>
	<jsp:include page="popup.jsp"></jsp:include>
	<iframe id="integration_asynchronous" name="integration_asynchronous"
		class="integration_asynchronous"></iframe>