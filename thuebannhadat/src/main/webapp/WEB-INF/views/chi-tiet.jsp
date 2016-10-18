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
	href="${pageContext.request.contextPath}/resources/lib/swipebox/swipebox-dark-1.3.css">
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
	src="${pageContext.request.contextPath}/resources/lib/swipebox/jquery.swipebox-1.3.js"></script>
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
	<div id="fb-root"></div>
	<script>
		(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id))
				return;
			js = d.createElement(s);
			js.id = id;
			js.src = "//connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v2.8&appId=1049348641852619";
			fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));
	</script>
	<!-- HEADER BEGIN -->
	<header>
		<div>
			<a href="trangchu.html" class="logo"></a>
			<div class="header-action">
				<div class="cbx notification">
					<a href="JavaScript:void(0)" class="btn" data-toggle="dropdown"><span
						class="fa fa-bell-o"></span><i>3</i></a>
					<div class="cbx-menu center">
						<ul>
							<li>
								<div>
									<a href="thongbao.html">[Lorem Ipsum] is simply dummy text
										of the printing and typesetting industry. Lorem Ipsum has been
										the industry's standard dummy text ever since the 1500s</a>
								</div>
							</li>
							<li>
								<div>
									<a href="thongbao.html">[Lorem Ipsum] is simply dummy text
										of the printing and typesetting industry. Lorem Ipsum has been
										the industry's standard dummy text ever since the 1500s</a>
								</div>
							</li>
							<li>
								<div>
									<a href="thongbao.html">[Lorem Ipsum] is simply dummy text
										of the printing and typesetting industry. Lorem Ipsum has been
										the industry's standard dummy text ever since the 1500s</a>
								</div>
							</li>
							<li>
								<div>
									<a href="thongbao.html">[Lorem Ipsum] is simply dummy text
										of the printing and typesetting industry. Lorem Ipsum has been
										the industry's standard dummy text ever since the 1500s</a>
								</div>
							</li>
							<li>
								<div>
									<a href="thongbao.html">[Lorem Ipsum] is simply dummy text
										of the printing and typesetting industry. Lorem Ipsum has been
										the industry's standard dummy text ever since the 1500s</a>
								</div>
							</li>
							<li>
								<div>
									<a href="thongbao.html">[Lorem Ipsum] is simply dummy text
										of the printing and typesetting industry. Lorem Ipsum has been
										the industry's standard dummy text ever since the 1500s</a>
								</div>
							</li>
						</ul>
					</div>
				</div>
				<div>
					<a href="JavaScript:dialog('login-dialog')" class="btn"><span
						class="fa fa-file-text-o"></span><span class="hi"> Đăng Tin
							Miễn Phí</span></a>
				</div>
				<div id="login-menu" class="cbx">
					<a href="JavaScript:void(0)" class="btn" data-toggle="dropdown"><span
						class="fa fa-user"></span><span class="hi"> Tài Khoản</span></a>
					<div class="cbx-menu right">
						<ul>
							<li><a href="JavaScript:dialog('login-dialog')">Đăng
									nhập</a></li>
							<li><a href="JavaScript:dialog('reg-dialog')">Đăng ký</a></li>
						</ul>
					</div>
				</div>
				<div id="account-menu" class="cbx">
					<a href="JavaScript:void(0)" class="btn" data-toggle="dropdown">Thủy
						Tiên</span>
					</a>
					<div class="cbx-menu right">
						<ul>
							<li class="">
								<div>
									<img
										src="${pageContext.request.contextPath}/resources/images/120x120.jpg">
									<span>ĐẶNG THỊ THỦY TIÊN</span>
								</div>
							</li>
							<li><a href="taikhoan.html">Quản lý tài khoản</a></li>
							<li><a href="JavaScript:logout()">Thoát</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="navbar-toggle">
				<span></span> <span></span> <span></span>
			</div>
			<div class="nav-menu">
				<div class="nav">
					<ul>
						<li><a href="trangchu.html">Trang Chủ</a></li>
						<li class="sub-menu "><a href="JavaScript:">Mua</a>
							<div>
								<ul>
									<li><a href="mua.html">Nhà Phố</a></li>
									<li><a href="mua.html">Nhà Nát</a></li>
									<li><a href="mua.html">Nhà Trong Hẻm</a></li>
									<li><a href="mua.html">Nhà Mới Xây</a></li>
									<li><a href="mua.html">Chung Cư</a></li>
									<li class="divider"></li>
									<li><a href="mua.html">Người Có Thu Nhập Thấp</a></li>
									<li class="divider"></li>
									<li><a href="mua.html">Tất cả</a></li>
								</ul>
							</div></li>
						<li class="sub-menu "><a href="JavaScript:">Bán</a>
							<div>
								<ul>
									<li><a href="ban.html">Nhà Phố</a></li>
									<li><a href="ban.html">Nhà Nát</a></li>
									<li><a href="ban.html">Nhà Trong Hẻm</a></li>
									<li><a href="ban.html">Nhà Mới Xây</a></li>
									<li><a href="ban.html">Chung Cư</a></li>
									<li class="divider"></li>
									<li><a href="ban.html">Người Có Thu Nhập Thấp</a></li>
									<li class="divider"></li>
									<li><a href="ban.html">Tất cả</a></li>
								</ul>
							</div></li>
						<li class="sub-menu"><a href="JavaScript:">Cho Thuê</a>
							<div>
								<ul>
									<li><a href="thue.html">Nhà Phố</a></li>
									<li><a href="thue.html">Nhà Nát</a></li>
									<li><a href="thue.html">Nhà Trong Hẻm</a></li>
									<li><a href="thue.html">Nhà Mới Xây</a></li>
									<li><a href="thue.html">Chung Cư</a></li>
									<li class="divider"></li>
									<li><a href="thue.html">Người Có Thu Nhập Thấp</a></li>
									<li class="divider"></li>
									<li><a href="thue.html">Tất cả</a></li>
								</ul>
							</div></li>
						<li class="sub-menu"><a href="JavaScript:">Thế Chấp</a>
							<div>
								<ul>
									<li><a href="thechap.html">Nhà Phố</a></li>
									<li><a href="thechap.html">Nhà Nát</a></li>
									<li><a href="thechap.html">Nhà Trong Hẻm</a></li>
									<li><a href="thechap.html">Nhà Mới Xây</a></li>
									<li><a href="thechap.html">Chung Cư</a></li>
									<li class="divider"></li>
									<li><a href="thechap.html">Người Có Thu Nhập Thấp</a></li>
									<li class="divider"></li>
									<li><a href="thechap.html">Tất cả</a></li>
								</ul>
							</div></li>
						<li class="sub-menu"><a href="JavaScript:">Dự Án</a>
							<div>
								<ul>
									<li><a href="duan.html">Nhà Phố</a></li>
									<li><a href="duan.html">Nhà Nát</a></li>
									<li><a href="duan.html">Nhà Trong Hẻm</a></li>
									<li><a href="duan.html">Nhà Mới Xây</a></li>
									<li><a href="duan.html">Chung Cư</a></li>
									<li class="divider"></li>
									<li><a href="duan.html">Người Có Thu Nhập Thấp</a></li>
									<li class="divider"></li>
									<li><a href="duan.html">Tất cả</a></li>
								</ul>
							</div></li>
						<li class="sub-menu"><a href="JavaScript:">Dịch Vụ Môi
								Giới</a>
							<div>
								<ul>
									<li><a href="dichvu.htm">Doanh Nghiệp</a></li>
									<li><a href="moigioi.html">Người Môi Giới</a></li>
								</ul>
							</div></li>
						<li class=""><a href="tintuc.html">Tin Tức</a></li>
						<li class=""><a href="lienhe.html">Liên Hệ</a></li>
					</ul>
				</div>

			</div>
		</div>
	</header>
	<!-- HEADER END -->

	<div class="wrap">

		<!-- BANNER BEGIN -->
		<div class="banner cover"
			style="background-image: url(${pageContext.request.contextPath}/resources/images/15.jpg)">
			<div class="con">
				<div class="tit-big">CHUNG CU CAO CAP DIAMON</div>
				<div class="breadcrumb">
					<ul>
						<li><a href="trangchu.html">Trang Chủ</a></li>
						<li><a href="ban.html">Bán</a></li>
						<li><span>CHUNG CU CAO CAP DIAMON</span></li>
					</ul>
				</div>
			</div>
		</div>
		<!-- BANNER END -->

		<!-- SLIDER BEGIN -->
		<div class="con pda ">
			<div class="detail-box">
				<div class="medias">
					<div id="vimage" class="active">
						<div id="owl-slider" class="owl-carousel owl-slider">
							<div class="item cover"
								style="background-image: url(${pageContext.request.contextPath}/resources/images/13.jpg)">
								<div class="">
									<div class=""></div>
								</div>
							</div>
							<div class="item cover"
								style="background-image: url(${pageContext.request.contextPath}/resources/images/14.jpg)">
								<div class="">
									<div class=""></div>
								</div>
							</div>
						</div>
					</div>
					<div id="vmap" class="">
						<div id="map" style="width: 100%; height: 100%;"></div>
					</div>
					<script type="text/javascript"
						src="https://maps.googleapis.com/maps/api/js?sensor=false"></script>
					<script type="text/javascript">
						// When the window has finished loading create our google map below
						//google.maps.event.addDomListener(window, 'load', init);
						function init() {
							var latlon = [ 10.792048, 106.679982 ];
							var lat = latlon[0], lon = latlon[1];
							// Basic options for a simple Google Map
							// For more options see: https://developers.google.com/maps/documentation/javascript/reference#MapOptions

							var mapOptions = {
								// How zoomed in you want the map to start at (always required)
								zoom : 16,

								// The latitude and longitude to center the map (always required)
								center : new google.maps.LatLng(lat, lon), // New York

								// How you would like to style the map. 
								// This is where you would paste any style found on Snazzy Maps.
								styles : [ {
									"featureType" : "landscape",
									"stylers" : [ {
										"hue" : "#FFA800"
									}, {
										"saturation" : 0
									}, {
										"lightness" : 0
									}, {
										"gamma" : 1
									} ]
								}, {
									"featureType" : "road.highway",
									"stylers" : [ {
										"hue" : "#53FF00"
									}, {
										"saturation" : -73
									}, {
										"lightness" : 40
									}, {
										"gamma" : 1
									} ]
								}, {
									"featureType" : "road.arterial",
									"stylers" : [ {
										"hue" : "#FBFF00"
									}, {
										"saturation" : 0
									}, {
										"lightness" : 0
									}, {
										"gamma" : 1
									} ]
								}, {
									"featureType" : "road.local",
									"stylers" : [ {
										"hue" : "#00FFFD"
									}, {
										"saturation" : 0
									}, {
										"lightness" : 30
									}, {
										"gamma" : 1
									} ]
								}, {
									"featureType" : "water",
									"stylers" : [ {
										"hue" : "#00BFFF"
									}, {
										"saturation" : 6
									}, {
										"lightness" : 8
									}, {
										"gamma" : 1
									} ]
								}, {
									"featureType" : "poi",
									"stylers" : [ {
										"hue" : "#679714"
									}, {
										"saturation" : 33.4
									}, {
										"lightness" : -25.4
									}, {
										"gamma" : 1
									} ]
								} ]
							};

							// Get the HTML DOM element that will contain your map 
							// We are using a div with id="map" seen below in the <body>
							var mapElement = document.getElementById('map');

							// Create the Google Map using our element and options defined above
							var map = new google.maps.Map(mapElement,
									mapOptions);

							// Let's also add a marker while we're at it
							var marker = new google.maps.Marker(
									{
										position : new google.maps.LatLng(lat,
												lon),
										map : map,
										icon : new google.maps.MarkerImage(
												'${pageContext.request.contextPath}/resources/images/marker.png',
												new google.maps.Size(40, 56),
												new google.maps.Point(0, 0),
												new google.maps.Point(20, 28),
												new google.maps.Size(40, 56)),
										title : 'Dụng cụ làm bánh An Phú !'
									});
							var infowindow = new google.maps.InfoWindow();
							var content_info = '\
                                      <div style="width:360px;font-size:13px;">\
                                          <img src="${pageContext.request.contextPath}/resources/images/logo.png" style="float:left;margin-right:5px;background:#27ae61;padding:10px;"/>\
                                          <div><h4 style="margin:0;padding:4px 0;color:#ee4034">CHUNG CƯ DIAMON</h4></div>\
                                          <div>Phone : 098 263 6618 (có kết nối bằng zalo & viber)<br/>Email: hotro@thuebannhadat.com</div>\
                                          <div>Đ/c : <i>108/46 Trần Quang Diệu, Phường 14. Quận 3 - TP Hồ Chí Minh</i></div>\
                                      </div>';
							infowindow.setPosition(new google.maps.LatLng(lat,
									lon));
							infowindow.setContent(content_info);
							infowindow.open(map, marker);
							google.maps.event.addListener(marker, 'click',
									(function(marker) {

										return function() {
											infowindow.open(map, marker);
										};
									})(marker));
							init = undefined
						}
					</script>
					<div id="vvideo" class="cover"
						style="background-image: url(${pageContext.request.contextPath}/resources/images/24.jpg)">
						<a href="#" class="play"></a>
					</div>
				</div>
				<div class="acts">
					<div class="active" data-elm="vimage">
						<img
							src="${pageContext.request.contextPath}/resources/images/xh.png" />
					</div>
					<div class="" data-elm="vmap" onclick="init()">
						<img
							src="${pageContext.request.contextPath}/resources/images/bd.png" />
					</div>
					<div class="" data-elm="vvideo">
						<img
							src="${pageContext.request.contextPath}/resources/images/vd.png" />
					</div>
				</div>
				<div class="info">
					<div class="h1">
						Chung cư cao cấp DIAMON
						<div class="labels">
							<span class="label">Bán</span> <span class="label g">Thương
								Lượng</span>
						</div>
					</div>
					<p class="pdb">
						<span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức Thắng,
						P. Bến Thành, Q.1, TP.HCM
					</p>
					<div class="big-ifs">
						<div class="big-price">3200 TỶ</div>
						<div class="big-if">
							<img
								src="${pageContext.request.contextPath}/resources/images/ico61.png" />
							<span>Gara : 1</span>
						</div>
						<div class="big-if">
							<img
								src="${pageContext.request.contextPath}/resources/images/ico62.png" />
							<span>Phòng Ngủ : 3</span>
						</div>
						<div class="big-if">
							<img
								src="${pageContext.request.contextPath}/resources/images/ico63.png" />
							<span>Phòng Tắm : 3</span>
						</div>
						<div class="big-if">
							<img
								src="${pageContext.request.contextPath}/resources/images/ico64.png" />
							<span>Diện Tích : 100m</span>
						</div>
					</div>
					<div class="servs">
						<div>
							<strong>Tiện Ích Xung Quanh</strong>
						</div>
						<div class="big-if">
							<img
								src="${pageContext.request.contextPath}/resources/images/ico65.png" />
							<span>Gần Trường Học</span>
						</div>
						<div class="big-if">
							<img
								src="${pageContext.request.contextPath}/resources/images/ico66.png" />
							<span>Gần Bệnh Viện</span>
						</div>
						<div class="big-if">
							<img
								src="${pageContext.request.contextPath}/resources/images/ico67.png" />
							<span>Gần Trường Học</span>
						</div>
						<div class="big-if">
							<img
								src="${pageContext.request.contextPath}/resources/images/ico68.png" />
							<span>An Ninh Tốt</span>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- SLIDER END -->

		<!-- CONTENT BEGIN -->
		<div class="con cls-after">
			<!-- LEFT BEGIN -->
			<div class="con-left pda">
				<!-- SALE BEGIN -->
				<div class="tit-h3">
					<p>MIÊU TẢ NGẮN GỌN</p>
				</div>
				<div class="mgb pdb">Lorem Ipsum is simply dummy text of the
					printing and typesetting industry. Lorem Ipsum has been the
					industry's standard dummy text ever since the 1500s, when an
					unknown printer took a galley of type and scrambled it to make a
					type specimen book. It has survived not only five centuries, but
					also the leap into electronic typesetting, remaining essentially
					unchanged. It was popularised in the 1960s with the release of
					Letraset sheets containing Lorem Ipsum passages, and more recently
					with desktop publishing software like Aldus PageMaker including
					versions of Lorem Ipsum.</div>
				<div class="mgb pdb">Lorem Ipsum is simply dummy text of the
					printing and typesetting industry. Lorem Ipsum has been the
					industry's standard dummy text ever since the 1500s, when an
					unknown printer took a galley of type and scrambled it to make a
					type specimen book. It has survived not only five centuries, but
					also the leap into electronic typesetting, remaining essentially
					unchanged. It was popularised in the 1960s with the release of
					Letraset sheets containing Lorem Ipsum passages, and more recently
					with desktop publishing software like Aldus PageMaker including
					versions of Lorem Ipsum.</div>
				<div class="mgb pdb">Lorem Ipsum is simply dummy text of the
					printing and typesetting industry. Lorem Ipsum has been the
					industry's standard dummy text ever since the 1500s, when an
					unknown printer took a galley of type and scrambled it to make a
					type specimen book. It has survived not only five centuries, but
					also the leap into electronic typesetting, remaining essentially
					unchanged. It was popularised in the 1960s with the release of
					Letraset sheets containing Lorem Ipsum passages, and more recently
					with desktop publishing software like Aldus PageMaker including
					versions of Lorem Ipsum.</div>
				<p>Chia sẻ thông tin:</p>
				<div class="social2">
					<a href="https://www.facebook.com/sharer/sharer.php?u=http%3A%2F%2F192.168.1.106%3A8080%2Fthuebannhadat%2Fchitiet&amp;src=sdkpreparse"><span class="fa fa-facebook"></span> Facebook</a> <a
						href="#"><span class="fa fa-google"></span> Google</a> <a href="#"><span
						class="fa fa-skype"></span> Skype</a> <a href="#"><span
						class="fa fa-youtube"></span> Youtube</a>
				</div>
				<div class="fb-share-button"
					data-href="http://192.168.1.106:8080/thuebannhadat/chitiet"
					data-layout="button_count" data-size="small"
					data-mobile-iframe="true">
					<a class="fb-xfbml-parse-ignore" target="_blank"
						href="https://www.facebook.com/sharer/sharer.php?u=http%3A%2F%2F192.168.1.106%3A8080%2Fthuebannhadat%2Fchitiet&amp;src=sdkpreparse">Chia
						sẻ</a>
				</div>

			</div>
			<!-- LEFT END -->
			<!-- RIGHT BEGIN -->
			<div class="con-right pda">
				<div class="saler cls-after">
					<a href="JavaScript:void(0)"> <img
						src="${pageContext.request.contextPath}/resources/images/22.jpg">
					</a>
					<div class="tit-big un-tit">NGUYEN VAN TEO</div>
					<div class="pda">
						Liên hệ người bán<br /> <br /> <span class="fa fa-phone"></span>
						09xx xxx xxx<br /> <span class="fa fa-send"></span>
						Info@gmail.com<br /> <span class="fa fa-skype"></span>
						nguyenvanteo<br />
					</div>
				</div>
			</div>
			<!-- RIGHT END -->
		</div>
		<div class="hr"></div>
		<div class="con cls-after">
			<div class="pda">
				<div class="tit-h3">Tổng thể dự án</div>
				<div class="cls-after pdb">
					<p class="gray pdb">Cập nhật lúc 01h30 20/12/2016</p>
					<p class="gray c30 pdb">
						- Lorem Ipsum is simply dummy text of the printing<br /> - Lorem
						Ipsum is simply dummy text of the printing<br /> - Lorem Ipsum is
						simply dummy text of the printing<br /> - Lorem Ipsum is simply
						dummy text of the printing<br /> - Lorem Ipsum is simply dummy
						text of the printing<br /> - Lorem Ipsum is simply dummy text of
						the printing<br />
					</p>
					<p class="gray c30 pdb">
						- Lorem Ipsum is simply dummy text of the printing<br /> - Lorem
						Ipsum is simply dummy text of the printing<br /> - Lorem Ipsum is
						simply dummy text of the printing<br /> - Lorem Ipsum is simply
						dummy text of the printing<br /> - Lorem Ipsum is simply dummy
						text of the printing<br /> - Lorem Ipsum is simply dummy text of
						the printing<br />
					</p>
					<p class="gray c30 pdb">
						- Lorem Ipsum is simply dummy text of the printing<br /> - Lorem
						Ipsum is simply dummy text of the printing<br />
					</p>
				</div>
				<div class="tit-h3">Bản vẽ mặt bằng</div>
				<div class="cls-after pdb">
					<p class="gray pdb">Cập nhật lúc 01h30 20/12/2016</p>
					<div class="diagrams umgl umgr">
						<div class="item">
							<div class="nailthumb">
								<div class="nailthumb-figure">
									<div class="nailthumb-container">
										<img class="lazy"
											src="${pageContext.request.contextPath}/resources/images/14.png">
									</div>
									<a
										href="${pageContext.request.contextPath}/resources/images/14.png"
										title="Sơ đồ nhà" class="nailthumb-mark swipebox"></a>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="nailthumb">
								<div class="nailthumb-figure">
									<div class="nailthumb-container">
										<img class="lazy"
											src="${pageContext.request.contextPath}/resources/images/14.png">
									</div>
									<a
										href="${pageContext.request.contextPath}/resources/images/14.png"
										title="Sơ đồ nhà" class="nailthumb-mark swipebox"></a>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="nailthumb">
								<div class="nailthumb-figure">
									<div class="nailthumb-container">
										<img class="lazy"
											src="${pageContext.request.contextPath}/resources/images/14.png">
									</div>
									<a
										href="${pageContext.request.contextPath}/resources/images/14.png"
										title="Sơ đồ nhà" class="nailthumb-mark swipebox"></a>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="nailthumb">
								<div class="nailthumb-figure">
									<div class="nailthumb-container">
										<img class="lazy"
											src="${pageContext.request.contextPath}/resources/images/14.png">
									</div>
									<a
										href="${pageContext.request.contextPath}/resources/images/14.png"
										title="Sơ đồ nhà" class="nailthumb-mark swipebox"></a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="hr"></div>
		<div class="con cls-after">
			<div>
				<!-- LEFT BEGIN -->
				<div class="con-left pda">
					<!-- SALE BEGIN -->
					<div class="tit-h3">Mua theo phương thức trả góp</div>
					<div class="mgb pdb">Lorem Ipsum is simply dummy text of the
						printing and typesetting industry. Lorem Ipsum has been the
						industry's standard dummy text ever since the 1500s, when an
						unknown printer took a galley of type and scrambled it to make a
						type specimen book. It has survived not only five centuries, but
						also the leap into electronic typesetting, remaining essentially
						unchanged. It was popularised in the 1960s with the release of
						Letraset sheets containing Lorem Ipsum passages, and more recently
						with desktop publishing software like Aldus PageMaker including
						versions of Lorem Ipsum.</div>
					<table class="table detail">
						<tr>
							<td width="">Giá</td>
							<td width="120">100 tỷ</td>
						</tr>
						<tr>
							<td>Trả trước</td>
							<td>100 tỷ</td>
						</tr>
						<tr>
							<td>Số tiền vay</td>
							<td>100 tỷ</td>
						</tr>
						<tr>
							<td>Hợp đồng vay với</td>
							<td>Lãi 6 năm</td>
						</tr>
						<tr>
							<td>Số tiền thanh toán hàng tháng</td>
							<td>100 tỷ</td>
						</tr>
						<tr>
							<td colspan="2"><div class="hr"></div></td>
						</tr>
						<tr>
							<td>Ngân hàng hỗ trợ vay<br />Với lãi xuất ưu đãi
							</td>
							<td width="120"><img onclick="dialog('bank-dialog')"
								src="${pageContext.request.contextPath}/resources/images/banks.png"></td>
						</tr>
					</table>

				</div>
				<!-- LEFT END -->
				<!-- RIGHT BEGIN -->
				<div class="con-right pda">
					<div class="cha">
						<img
							src="${pageContext.request.contextPath}/resources/images/ch.png">
					</div>
				</div>
				<!-- RIGHT END -->
			</div>
		</div>
		<!-- CONTENT END -->
		<div class="hr"></div>
		<!-- NEWS BEGIN -->
		<div class="con cls-after">
			<div class="pda">
				<div class="tit">
					<p>DỰ ÁN LIÊN QUAN</p>
					<div class="act">
						<a href="tintuc-list.html" class="more a"><span class="smtext">Xem
								tất cả</span> <span class="fa fa-angle-right"></span></a>
					</div>
				</div>
				<div id="owl-service"
					class="owl-carousel owl-news services related-services">
					<!-- <div class="news-items cls-after"> -->
					<div class="news-item">
						<div class="nailthumb">
							<div class="nailthumb-figure-75">
								<a href="dichvu-detail.html" class="nailthumb-container"> <img
									class="lazy"
									src="${pageContext.request.contextPath}/resources/images/1.jpg">
								</a>
							</div>
						</div>
						<div class="info">
							<div>
								<a href="tintuc-detail.html" class="h2"><span>[Lorem
										Ipsum] is simply dummy text of the printing and typesetting
										industry</span></a>
							</div>
							<table>
								<tr>
									<td colspan="3"><span class="fa fa-map-marker"></span> Địa
										chỉ 108 Tôn Đức Thắng, P. Bến Thành, Q.1, TP.HCM<br /> <span
										class="fa fa-phone"></span> 09xx xxxx xxx/09xx xxxx xxx/<br />
										<span class="fa fa-envelope-o"></span> Info@gmail.com</td>
								</tr>
								<tr>
									<td colspan="6" class="hr"></td>
								</tr>
								<tr>
									<td class="adds"><span class="fa fa-user"></span> Nova
										Land Group</td>
									<td class="adds"><span class="fa fa-calendar"></span>
										12/08/2016</td>
									<td class="td-more"><button class="yellow-btn">
											CHI TIẾT <span class="fa fa-angle-right"></span>
										</button></td>
								</tr>
							</table>
						</div>
					</div>
					<div class="news-item">
						<div class="nailthumb">
							<div class="nailthumb-figure-75">
								<a href="dichvu-detail.html" class="nailthumb-container"> <img
									class="lazy"
									src="${pageContext.request.contextPath}/resources/images/2.jpg">
								</a>
							</div>
						</div>
						<div class="info">
							<div>
								<a href="tintuc-detail.html" class="h2"><span>[Lorem
										Ipsum] is simply dummy text of the printing and typesetting
										industry</span></a>
							</div>
							<table>
								<tr>
									<td colspan="3"><span class="fa fa-map-marker"></span> Địa
										chỉ 108 Tôn Đức Thắng, P. Bến Thành, Q.1, TP.HCM<br /> <span
										class="fa fa-phone"></span> 09xx xxxx xxx/09xx xxxx xxx/<br />
										<span class="fa fa-envelope-o"></span> Info@gmail.com</td>
								</tr>
								<tr>
									<td colspan="6" class="hr"></td>
								</tr>
								<tr>
									<td class="adds"><span class="fa fa-user"></span> Nova
										Land Group</td>
									<td class="adds"><span class="fa fa-calendar"></span>
										12/08/2016</td>
									<td class="td-more"><button class="yellow-btn">
											CHI TIẾT <span class="fa fa-angle-right"></span>
										</button></td>
								</tr>
							</table>
						</div>
					</div>
					<div class="news-item">
						<div class="nailthumb">
							<div class="nailthumb-figure-75">
								<a href="dichvu-detail.html" class="nailthumb-container"> <img
									class="lazy"
									src="${pageContext.request.contextPath}/resources/images/3.jpg">
								</a>
							</div>
						</div>
						<div class="info">
							<div>
								<a href="tintuc-detail.html" class="h2"><span>[Lorem
										Ipsum] is simply dummy text of the printing and typesetting
										industry</span></a>
							</div>
							<table>
								<tr>
									<td colspan="3"><span class="fa fa-map-marker"></span> Địa
										chỉ 108 Tôn Đức Thắng, P. Bến Thành, Q.1, TP.HCM<br /> <span
										class="fa fa-phone"></span> 09xx xxxx xxx/09xx xxxx xxx/<br />
										<span class="fa fa-envelope-o"></span> Info@gmail.com</td>
								</tr>
								<tr>
									<td colspan="6" class="hr"></td>
								</tr>
								<tr>
									<td class="adds"><span class="fa fa-user"></span> Nova
										Land Group</td>
									<td class="adds"><span class="fa fa-calendar"></span>
										12/08/2016</td>
									<td class="td-more"><button class="yellow-btn">
											CHI TIẾT <span class="fa fa-angle-right"></span>
										</button></td>
								</tr>
							</table>
						</div>
					</div>
					<div class="news-item">
						<div class="nailthumb">
							<div class="nailthumb-figure-75">
								<a href="dichvu-detail.html" class="nailthumb-container"> <img
									class="lazy"
									src="${pageContext.request.contextPath}/resources/images/4.jpg">
								</a>
							</div>
						</div>
						<div class="info">
							<div>
								<a href="tintuc-detail.html" class="h2"><span>[Lorem
										Ipsum] is simply dummy text of the printing and typesetting
										industry</span></a>
							</div>
							<table>
								<tr>
									<td colspan="3"><span class="fa fa-map-marker"></span> Địa
										chỉ 108 Tôn Đức Thắng, P. Bến Thành, Q.1, TP.HCM<br /> <span
										class="fa fa-phone"></span> 09xx xxxx xxx/09xx xxxx xxx/<br />
										<span class="fa fa-envelope-o"></span> Info@gmail.com</td>
								</tr>
								<tr>
									<td colspan="6" class="hr"></td>
								</tr>
								<tr>
									<td class="adds"><span class="fa fa-user"></span> Nova
										Land Group</td>
									<td class="adds"><span class="fa fa-calendar"></span>
										12/08/2016</td>
									<td class="td-more"><button class="yellow-btn">
											CHI TIẾT <span class="fa fa-angle-right"></span>
										</button></td>
								</tr>
							</table>
						</div>
					</div>
					<div class="news-item">
						<div class="nailthumb">
							<div class="nailthumb-figure-75">
								<a href="dichvu-detail.html" class="nailthumb-container"> <img
									class="lazy"
									src="${pageContext.request.contextPath}/resources/images/5.jpg">
								</a>
							</div>
						</div>
						<div class="info">
							<div>
								<a href="tintuc-detail.html" class="h2"><span>[Lorem
										Ipsum] is simply dummy text of the printing and typesetting
										industry</span></a>
							</div>
							<table>
								<tr>
									<td colspan="3"><span class="fa fa-map-marker"></span> Địa
										chỉ 108 Tôn Đức Thắng, P. Bến Thành, Q.1, TP.HCM<br /> <span
										class="fa fa-phone"></span> 09xx xxxx xxx/09xx xxxx xxx/<br />
										<span class="fa fa-envelope-o"></span> Info@gmail.com</td>
								</tr>
								<tr>
									<td colspan="6" class="hr"></td>
								</tr>
								<tr>
									<td class="adds"><span class="fa fa-user"></span> Nova
										Land Group</td>
									<td class="adds"><span class="fa fa-calendar"></span>
										12/08/2016</td>
									<td class="td-more"><button class="yellow-btn">
											CHI TIẾT <span class="fa fa-angle-right"></span>
										</button></td>
								</tr>
							</table>
						</div>
					</div>
					<!-- </div> -->
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
	<div id="login-dialog" class="dialog">
		<div class="content">
			<div class="">
				<div class="head">
					ĐĂNG NHẬP <i class="pull-right fa fa-close"
						onclick="dialog('login-dialog')"></i>
				</div>
				<div class="body">
					<form name="loginFrm" id="loginFrm" class="loginFrm"
						action="dangtin.html">
						<div class="ctrl pdb">
							<input class="txt txt-border validate[required,custom[email]]"
								data-prompt-position="topLeft:0,26" placeholder="Email"
								type="text">
						</div>
						<div class="ctrl pdb">
							<input class="txt txt-border validate[required]"
								data-prompt-position="topLeft:0,26" placeholder="Mật Khẩu"
								type="password">
						</div>
						<div class="ctrl pdb">
							<button class="block-btn yellow-btn hvr-bounce-to-bottom"
								type="submit">ĐĂNG NHẬP</button>
						</div>
						<div class="ctrls pdb cls-after">


							<div>
								<a href="dangky-social.html"><button
										class="block-btn blue-btn" type="button">
										<span class="fa fa-facebook"></span> FACEBOOK
									</button></a>
							</div>
							<div>
								<a href="dangky-social.html"><button
										class="block-btn red-btn" type="button">
										<span class="fa fa-google"></span> GOOGLE+
									</button></a>
							</div>

						</div>
					</form>
				</div>
				<div class="dfoot foot-btns">
					<div>
						<div class="text-left" onclick="dialog('lostpass-dialog')">Quên
							mật khẩu ?</div>
					</div>
					<div>
						<div class="text-right" onclick="dialog('reg-dialog')">Chưa
							có tài khoản</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="lostpass-dialog" class="dialog">
		<div class="content">
			<div class="" style="max-width: 320px">
				<div class="head">QUÊN MẬT KHẨU</div>
				<div class="body">
					<div>Vui lòng nhập số điện thoại</div>
					<form name="lostpass" id="lostpass" class="loginFrm">
						<div class="ctrl pdb">
							<input class="txt txt-border validate[required,custom[email]]"
								data-prompt-position="topLeft:0,26" placeholder="Số điện thoại"
								type="text">
						</div>
						<div class="ctrl pdb">
							<button class="block-btn yellow-btn hvr-bounce-to-bottom"
								type="button" onclick="dialog('lostpass2-dialog')">LẤY
								LẠI MẬT KHẨU</button>
						</div>
					</form>
				</div>
				<div class="dfoot foot-btns">
					<div>
						<div class="text-left" onclick="dialog('login-dialog')">Đăng
							nhập</div>
					</div>
					<div>
						<div class="text-right" onclick="dialog('reg-dialog')">Đăng
							ký</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="lostpass2-dialog" class="dialog">
		<div class="content">
			<div class="" style="max-width: 320px">
				<div class="head">LẤY LẠI MẬT KHẨU</div>
				<div class="body">
					<div class="pdb">Vui lòng nhập mã xác thực, chúng tôi đã gửi
						đến số điện thoại của bạn.</div>
					<form name="lostpass" id="lostpass" class="loginFrm">
						<div class="ctrl pdb">
							<input class="txt txt-border validate[required,custom[email]]"
								data-prompt-position="topLeft:0,26" placeholder="Mã xác thực"
								type="text">
						</div>
						<div class="ctrl pdb">
							<button class="block-btn yellow-btn hvr-bounce-to-bottom"
								type="button" onclick="dialog('lostpass3-dialog')">XÁC
								NHẬN</button>
						</div>

						<div class="ctrl pdb">
							<button class="block-btn green-btn hvr-bounce-to-bottom"
								type="button">NHẬN LẠI MÃ XÁC THỰC</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div id="lostpass3-dialog" class="dialog">
		<div class="content">
			<div class="" style="max-width: 320px">
				<div class="head">LẤY LẠI MẬT KHẨU</div>
				<div class="body">
					<form name="lostpass" id="lostpass" class="loginFrm">
						<div class="ctrl pdb">
							<input class="txt txt-border validate[required,custom[email]]"
								data-prompt-position="topLeft:0,26" placeholder="MẬT KHẨU"
								type="text">
						</div>
						<div class="ctrl pdb">
							<input class="txt txt-border validate[required,custom[email]]"
								data-prompt-position="topLeft:0,26"
								placeholder="XÁC NHẬN MẬT KHẨU" type="text">
						</div>
						<div class="ctrl pdb">
							<button class="block-btn yellow-btn hvr-bounce-to-bottom"
								type="button" onclick="dialog('lostpass3-dialog')">XÁC
								NHẬN</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div id="reg-dialog" class="dialog">
		<div class="content">
			<div class="">
				<div class="head">
					ĐĂNG KÝ TÀI KHOẢN MIỄN PHÍ <i class="pull-right fa fa-close"
						onclick="dialog('reg-dialog')"></i>
				</div>
				<div class="body">
					<form name="regFrm" id="regFrm" class="loginFrm">
						<div class="ctrl pdb">
							<input class="txt txt-border validate[required"
								data-prompt-position="topLeft:0,26" placeholder="Họ Và Tên"
								type="text">
						</div>

						<div class="ctrl pdb">
							<input class="txt txt-border validate[required,custom[email]]"
								data-prompt-position="topLeft:0,26" placeholder="Email"
								type="text">
						</div>
						<div class="ctrl pdb">
							<input class="txt txt-border validate[required]"
								data-prompt-position="topLeft:0,26" placeholder="Mật Khẩu"
								type="password">
						</div>
						<div class="ctrl pdb">
							<input class="txt txt-border validate[required]"
								data-prompt-position="topLeft:0,26"
								placeholder="Gõ Lại Mật Khẩu" type="password">
						</div>
						<div class="ctrl pdb">
							<input class="txt txt-border validate[required]"
								data-prompt-position="topLeft:0,26" placeholder="Điện Thoại"
								type="text">
						</div>
						<div class="ctrl pdb">
							<input class="txt txt-border validate[required]"
								data-prompt-position="topLeft:0,26" placeholder="Địa Chỉ"
								type="text">
						</div>
						<!--
                            <div class="ctrl pdb cls-after">
                                <label class="rad"><input type="radio" checked name="rad1"><span>Cá Nhân</span></label>
                                <label class="rad"><input type="radio" name="rad1"><span>Doanh Nghiệp</span></label>
                            </div>
                            <div class="ctrls pdb cls-after">
                                <div>
                                    <input class="txt txt-border validate[required]" data-prompt-position="topLeft:0,26" placeholder="Mã Xác Nhận" type="text">
                                </div>
                                <div class="captcha">
                                    <img src="${pageContext.request.contextPath}/resources/images/captcha.png"/>
                                    <span class="fa fa-refresh"></span>
                                </div>
                            </div> 
                            <div class="ctrl pdb">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s</div>
                            -->
						<div class="ctrl pdb">
							<button class="block-btn yellow-btn hvr-bounce-to-bottom"
								type="button" onclick="dialog('pin-dialog')">ĐĂNG KÝ</button>
						</div>
						<div class="deli">
							<span>Hoặc Đăng Ký Với</span>
						</div>
						<div class="ctrls pdt cls-after">


							<div>
								<a href="dangky-social.html"><button
										class="block-btn blue-btn" type="button">
										<span class="fa fa-facebook"></span> FACEBOOK
									</button></a>
							</div>
							<div>
								<a href="dangky-social.html"><button
										class="block-btn red-btn" type="button">
										<span class="fa fa-google"></span> GOOGLE+
									</button></a>
							</div>

						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div id="pin-dialog" class="dialog">
		<div class="content">
			<div style="max-width: 320px">
				<div class="head">
					NHẬP MÃ XÁC NHẬN <i class="pull-right fa fa-close"
						onclick="dialog('pin-dialog')"></i>
				</div>
				<div class="body">
					<form name="pinFrm" id="pinFrm" class="loginFrm">
						<div class="ctrl pdb mes">Bạn vui lòng nhập mã xác nhận được
							gửi đến số diện thoại mà bạn dùng để đăng ký</div>
						<div class="ctrl pdb">
							<input class="txt txt-border validate[required"
								data-prompt-position="topLeft:0,26" placeholder="Mã xác nhận"
								type="text">
						</div>
						<div class="ctrls pdt cls-after">
							<div>
								<button class="block-btn yellow-btn" type="button"
									onclick="dialog('get-pin-dialog')">LẤY LẠI MÃ</button>
							</div>
							<div>
								<button class="block-btn yellow-btn" type="button"
									onclick="verifyCode()">NHẬP MÃ</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div id="get-pin-dialog" class="dialog">
		<div class="content">
			<div style="max-width: 320px">
				<div class="head">
					XÁC NHẬN SỐ ĐIỆN THOẠI <i class="pull-right fa fa-close"
						onclick="dialog('get-pin-dialog')"></i>
				</div>
				<div class="body">
					<form name="pinFrm" id="pinFrm" class="loginFrm">
						<div class="ctrl pdb mes">Bạn vui lòng nhập số điện thoại
							tại đây để hoàn tất việc đăng ký của bạn.</div>
						<div class="ctrl pdb">
							<input class="txt txt-border validate[required"
								data-prompt-position="topLeft:0,26" placeholder="Số điện thoại"
								type="text">
						</div>
						<div class="ctrls pdt cls-after">
							<div>
								<button class="block-btn yellow-btn" type="button">LẤY
									LẠI MÃ</button>
							</div>
							<div>
								<button class="block-btn yellow-btn" type="button"
									onclick="dialog('pin-dialog')">XÁC NHẬN</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div id="noti-dialog" class="dialog">
		<div class="content">
			<div style="max-width: 320px">
				<div class="head">
					CHÚNG MỪNG BẠN<br />ĐĂNG KÝ THÀNH CÔNG
				</div>
				<div class="body">
					<form name="pinFrm" id="pinFrm" class="loginFrm">
						<div class="ctrl mes">
							<div class="text-center">
								<span class="fa fa-check-circle"
									style="color: #ffdd00; font-size: 30px"></span>
							</div>
							Chúc mừng bạn đã đăng ký thành công.<br /> Vui lòng đăng nhập để
							tiếp tục đăng tin.<br /> Xin cảm ơn.<br />
						</div>
					</form>
				</div>
				<div class="dfoot foot-btns">
					<div>
						<div class="text-left" onclick="dialog('noti-dialog')">Quay
							lại và đăng nhập</div>
					</div>
					<div>
						<div class="text-right"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="bank-dialog" class="dialog">
		<div class="content">
			<div style="max-width: 720px">
				<div class="head">ĐĂNG KÝ</div>
				<div class="body">
					<form name="pinFrm" id="pinFrm" class="form custom-form bank-frm">
						<table>
							<tr>
								<td><img height="30"
									src="http://www.acb.com.vn/wps/wcm/connect/f6798828-b0d3-4061-8581-f7ee2b9c1d68/logo-acb.png?MOD=AJPERES&CACHEID=f6798828-b0d3-4061-8581-f7ee2b9c1d68" /></td>
								<td>Đăng Ký sử dụng Ngân hàng ACB</td>
							</tr>
						</table>
						<fieldset>
							<legend>THÔNG TIN SẢN PHẦM</legend>
							<table>
								<tr>
									<td width="120">Tên Sản Phẩm</td>
									<td>NHÀ MẶT TIỀN PHỐ</td>
								</tr>
								<tr>
									<td>Giá</td>
									<td>1 TỶ 2</td>
								</tr>
								<tr>
									<td>Người bán</td>
									<td>NGUYỄN VĂN TÈO</td>
								</tr>
							</table>
						</fieldset>
						<fieldset>
							<legend>THÔNG TIN NGƯỜI MUA</legend>
							<div class="row">
								<div>
									<label>Tiêu đề (*)</label>
								</div>
								<div>
									<input type="text" class="txt validate[required]">
								</div>
							</div>
							<div class="row">
								<div class="c50">
									<div>
										<label>Họ tên (*)</label>
									</div>
									<div>
										<input type="text" class="txt validate[required]">
									</div>
								</div>
								<div class="c50">
									<div>
										<label>Địa chỉ (*)</label>
									</div>
									<div>
										<input type="text" class="txt validate[required]">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="c50">
									<div>
										<label>Điện thoại (*)</label>
									</div>
									<div>
										<input type="text" class="txt validate[required]">
									</div>
								</div>
								<div class="c50">
									<div>
										<label>Email (*)</label>
									</div>
									<div>
										<input type="text" class="txt validate[required]">
									</div>
								</div>
							</div>
							<div class="row">
								<div>
									<label>Thông tin mô tả</label>
								</div>
								<div>
									<textarea rows="3" class="txt" id="content"></textarea>

								</div>
							</div>
						</fieldset>
						<div class="pdt">
							<button class="yellow-btn hvr-bounce-to-bottom"
								onclick="dialog('bank-dialog')" type="button">ĐỒNG Ý</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<iframe id="integration_asynchronous" name="integration_asynchronous"
		class="integration_asynchronous"></iframe>

</body>
</html>