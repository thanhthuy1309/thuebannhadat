<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	href="${pageContext.request.contextPath}/resources/lib/datepicker/datetimepicker.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/lib/redactor/redactor2.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/lib/crop/cropper.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/lib/owl-carousel/owl.carousel.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/lib/swipebox/swipebox-dark-1.3.css">
<link href="https://fonts.googleapis.com/css?family=Roboto+Condensed"
	rel="stylesheet">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/lib/datepicker/moment.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/lib/plugin.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/lib/datepicker/datetimepicker.min.js"></script>
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
	src="${pageContext.request.contextPath}/resources/lib/redactor/redactor2.js"></script>

<!-- // <script type="text/javascript" src="lib/ckeditor/ckeditor.js" ></script> -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/lib/crop/cropper.js"></script>
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
		<!-- BANNER BEGIN -->
		<!-- <div class="banner cover" style="background-image:url(${pageContext.request.contextPath}/resources/images/16.jpg)">
                <div class="con">
                    <div class="tit-big">ĐĂNG TIN</div>
                    <div class="breadcrumb">
                        <ul>
                            <li><a href="trangchu.html">Trang Chủ</a></li>
                            <li><span>Tài Khoản</span></li>
                        </ul>
                    </div>
                </div>
            </div> -->
		<!-- BANNER END -->
		<!-- CONTENT BEGIN -->
		<div class="con cls-after"></div>
		<!-- CONTENT END -->

		<div class="notify-box open" data-step="1" id="step1">
			<div>
				<h2>XÁC NHẬN SỐ ĐIỆN THOẠI</h2>
				<div>
					<form:form name="phoneFrm" method="post" modelAttribute="registerSocialDto" id="phoneFrm" class="frm" action="/registerSocial">
						<div class="ctrl pdb mes red">Bạn vui lòng nhập số điện
							thoại tại đây để hoàn tất việc đăng ký của bạn.</div>
							<input type="hidden" name="hoTen" value="${registerSocialDto.hoTen}">
						<div class="ctrl pdb">
							<input class="txt txt-border validate[required]" name="dienThoai"
								data-prompt-position="topLeft:0,26" placeholder="Số điện thoại"
								type="text">
						</div>
						<div class="ctrl pdb">
							<input class="txt txt-border" readonly="readonly" name="email" value="${registerSocialDto.email}"
								data-prompt-position="topLeft:0,26" placeholder="Email của bạn"
								type="text">
						</div>
						<div class="ctrls pdt cls-after">
							<div>
								<button class="block-btn yellow-btn" type="button">LẤY
									LẠI MÃ</button>
							</div>
							<div>
								<button class="block-btn yellow-btn" type="button"
									onclick="GotoStep(2)">XÁC NHẬN</button>
							</div>
						</div>
					</form:form>
					<script type="text/javascript">
						$('#phoneFrm').validationEngine()
					</script>
				</div>
			</div>
		</div>

		<div class="notify-box" class="" data-step="2" id="step2">
			<div>
				<h2>NHẬP MÃ XÁC NHẬN</h2>
				<div>
					<form name="codeFrm" id="codeFrm" class="frm">
						<div class="ctrl pdb mes red">Bạn vui lòng nhập mã xác nhận
							được gửi đến số diện thoại mà bạn dùng để đăng ký</div>
						<div class="ctrl pdb">
							<input class="txt txt-border validate[required]"
								data-prompt-position="topLeft:0,26" placeholder="Mã xác nhận"
								type="text">
						</div>
						<div class="ctrls pdt cls-after">
							<div>
								<button class="block-btn yellow-btn" type="button">LẤY
									LẠI MÃ</button>
							</div>
							<div>
								<button class="block-btn yellow-btn" type="button"
									onclick="GotoStep('3');login()">NHẬP MÃ</button>
							</div>
						</div>
					</form>
					<script type="text/javascript">
						$('#codeFrm').validationEngine()
					</script>
				</div>
			</div>
		</div>

		<div class="notify-box" class="" data-step="3" id="step3">
			<div>
				<h2>
					CHÚC MỪNG BẠN<br />ĐĂNG KÝ THÀNH CÔNG
				</h2>
				<div>
					<form name="phoneFrm" id="phoneFrm" class="frm">
						<div class="ctrl pdb mes">
							<div class="text-center">
								<span class="fa fa-check-circle"
									style="color: #ffdd00; font-size: 60px; padding: 20px"></span>
							</div>
							Chúc mừng bạn đã đăng ký thành công.<br /> Vui lòng đăng nhập để
							tiếp tục đăng tin. Xin cảm ơn.
						</div>
					</form>
				</div>
				<div class="dfoot foot-btns">
					<div>
						<div class="text-left">
							<a href="taikhoan.html">Tài Khoản Của Tôi</a>
						</div>
					</div>
					<div>
						<div class="text-right">&nbsp;</div>
					</div>
				</div>
			</div>
		</div>

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
								<button class="block-btn yellow-btn" type="button" onclick="returnHome('${pageContext.request.contextPath}')" >HỦY</button>
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
	<iframe id="integration_asynchronous" name="integration_asynchronous"
		class="integration_asynchronous"></iframe>
	<div class="modal fade" id="modal" role="dialog"
		aria-labelledby="modalLabel" tabindex="-1">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div
					style="padding: 30px; background: #f0f0f0; width: 540px; height: 380px">
					<div class="crop-image" style="width: 480px; height: 320px">
						<img id="image"
							src="${pageContext.request.contextPath}/resources/images/picture.jpg"
							alt="Picture" style="width: 100%">
					</div>
				</div>
				<div class="pda text-right">
					<span class="">
						<button data-dismiss="modal" class="red-btn">Hủy</button>
						<button data-dismiss="modal" class="green-btn">Lưu</button>
					</span>
				</div>
			</div>
		</div>
	</div>