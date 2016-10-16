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
		<div class="banner cover" style="background-image: url(images/16.jpg)">
			<div class="con">
				<div class="tit-big">ĐĂNG TIN</div>
				<div class="breadcrumb">
					<ul>
						<li><a href="trangchu.html">Trang Chủ</a></li>
						<li><span>Tài Khoản</span></li>
					</ul>
				</div>
			</div>
		</div>
		<!-- BANNER END -->
		<!-- CONTENT BEGIN -->
		<div class="con cls-after">

			<!-- LEFT BEGIN -->
			<div class="con-right pda">
				<div class="acc-info">
					<div class="nailthumb">
						<div class="nailthumb-figure-75">
							<div class="nailthumb-container">
								<img class="lazy" src="images/1.jpg">
							</div>
							<div class="change-av">
								<div class="upload">
									<button class="yellow-btn" data-target="#modal"
										data-toggle="modal">Tải Hình</button>
								</div>
								<div class="edit-acc"></div>
							</div>
						</div>
					</div>
					<h2 class="">${nguoiDung.hoTen }</h2>
					<ul>
						<li><a href="trangchu.html"><span class="fa fa-home"></span>
								Trang Chủ</a></li>
						<li class=""><a href="dangtin.html"><span
								class="fa fa-edit"></span> Đăng Tin</a></li>
						<li><a href="quanly.html"><span class="fa fa-newspaper-o"></span>
								Quản Lý Tin</a></li>
						<li class="active"><a href="taikhoan.html"><span
								class="fa fa-user"></span> Thông tin tài khoản</a></li>
						<li><a href="lichsu.html"><span class="fa fa-history"></span>
								Lịch sử giao dịch</a></li>
						<li><a href="thongbao.html"><span class="fa fa-bell-o"></span>
								Thông báo mới <i class="numof">5</i></a></li>
						<li><a href="naptien.html"><span class="fa fa-money"></span>
								Nạp tiền</a></li>
						<li><a href="#"><span class="fa fa-sign-out"></span>
								Thoát</a></li>
					</ul>
				</div>
			</div>
			<!-- LEFT END -->

			<!-- RIGHT BEGIN -->
			<div class="con-left pda">
				<!-- CREATE 1 BEGIN -->

				<div data-step="2-1" id="step2-1" class="open">
					<div class="tit">
						<p>THÔNG TIN TÀI KHOẢN</p>
					</div>
					<form id="myFrm" name="myFrm" class="custom-form">
						<div class="box gray">
							<div class="h4-yellow">
								<span>Thông tin cá nhân</span>
							</div>
							<div class="form pdt ">
								<table class="table contact-tb gray">
									<tr>
										<td width="180">Họ và Tên (<span class="red">*</span>)
										</td>
										<td><input type="text" class="txt validate[required]" value="${nguoiDung.hoTen }">
										</td>
									</tr>
									<tr>
										<td>Số điện thoại (<span class="red">*</span>)
										</td>
										<td><input type="text" class="txt validate[required]" value="${nguoiDung.dienThoai }">
										</td>
									</tr>
									<tr>
										<td>Email (<span class="red">*</span>)
										</td>
										<td><input type="text" class="txt validate[required]" value="${nguoiDung.email }">
										</td>
									</tr>
									<tr>
										<td>Ngày sinh (<span class="red">*</span>)
										</td>
										<td><input type="text" class="txt validate[required]" value="${nguoiDung.hoTen }">
										</td>
									</tr>
									<tr>
										<td>Giới tính</td>
										<td>
											<div class="rdbs">
												<label class="rad"><input type="radio" name="sex"
													checked=""> <span>nam</span></label> <label class="rad"><input
													type="radio" name="sex"> <span>nữ</span></label>
											</div>
										</td>
									</tr>
								</table>
							</div>
						</div>
						<div class="box gray">
							<div class="h4-yellow">
								<span>Thông tin tài khoản</span>
							</div>
							<div class="form pdt">
								<table class="table contact-tb gray">
									<tr>
										<td width="180">Email (<span class="red">*</span>)
										</td>
										<td><input type="text" class="txt validate[required]" value="${nguoiDung.gioiTinh }">
										</td>
									</tr>
									<tr>
										<td>Thay Đổi Mật Khẩu (<span class="red">*</span>)
										</td>
										<td><input type="text" class="txt validate[required]"
											placeholder="mật khẩu cũ"></td>
									</tr>
									<tr>
										<td></td>
										<td><input type="text" class="txt validate[required]"
											placeholder="mật khẩu mới"></td>
									</tr>
									<tr>
										<td></td>
										<td><input type="text" class="txt validate[required]"
											placeholder="lặp lại mật khẩu mới"></td>
									</tr>
									<tr>
								</table>
								<div class="row text-right">
									<a class="yellow-btn hvr-bounce-to-bottom">GỬI THÔNG TIN</a>
								</div>
							</div>
					</form>
				</div>

				<table class="tb-service">
					<tr>
						<th class="b-g">
							<div class="h4-yellow">
								<span>Thông tin tài khoản</span>
							</div>
						</th>
						<th class="b-p fx2">THÔNG THƯỜNG</th>
						<th class="b-b fx2">VÀNG</th>
						<th class="b-bb fx2">BẠCH KIM</th>
					</tr>
					<tr>
						<th class="b-g">THÔNG TIN DỊCH VỤ</th>
						<th class="b-g text-center"><span class="fx4">MIỄN PHÍ</span>
						</th>
						<th class="b-g text-center"><span class="fx4">500.000</span><br />
							<span class="fx3">VND/THÁNG</span></th>
						<th class="b-g text-center"><span class="fx4">750.000</span><br />
							<span class="fx3">VND/THÁNG</span></th>
					</tr>
					<tr>
						<td>Đăng ký không giới hạn</td>
						<td>1 tin/1 ngày</td>
						<td>Không giới hạn</td>
						<td>Không giới hạn</td>
					</tr>
					<tr>
						<td>Duyệt tin</td>
						<td>Không ưu tiên</td>
						<td>Hiển thị ngay</td>
						<td>Hiển thị ngay</td>
					</tr>
					<tr>
						<td>Đăng ký không giới hạn</td>
						<td>1 tin/1 ngày</td>
						<td>Không giới hạn</td>
						<td>Không giới hạn</td>
					</tr>
					<tr>
						<td>Đăng ký không giới hạn</td>
						<td>1 tin/1 ngày</td>
						<td>Không giới hạn</td>
						<td>Không giới hạn</td>
					</tr>
					<tr>
						<td>Đăng ký không giới hạn</td>
						<td>1 tin/1 ngày</td>
						<td>Không giới hạn</td>
						<td>Không giới hạn</td>
					</tr>
					<tr>
						<td>Đăng ký không giới hạn</td>
						<td>1 tin/1 ngày</td>
						<td>Không giới hạn</td>
						<td>Không giới hạn</td>
					</tr>
					<tr>
						<td></td>
						<td><a class="yellow-btn hvr-bounce-to-bottom">MIỄN PHÍ</a>
						</td>
						<td><a class="green-btn hvr-bounce-to-bottom">NÂNG CẤP</a>
						</td>
						<td><a class="green-btn hvr-bounce-to-bottom">NÂNG CẤP</a>
						</td>
					</tr>
				</table>
			</div>
			<!-- CREATE 1 END -->
		</div>
		<!-- RIGHT END -->
	</div>
	<!-- CONTENT END -->

	<jsp:include page="footer.jsp"></jsp:include>
	
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
	<iframe id="integration_asynchronous" name="integration_asynchronous"
		class="integration_asynchronous"></iframe>
	<div class="modal fade" id="modal" role="dialog"
		aria-labelledby="modalLabel" tabindex="-1">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div
					style="padding: 30px; background: #f0f0f0; width: 540px; height: 380px">
					<div class="crop-image" style="width: 480px; height: 320px">
						<img id="image" src="images/picture.jpg" alt="Picture"
							style="width: 100%">
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
</body>
</html>