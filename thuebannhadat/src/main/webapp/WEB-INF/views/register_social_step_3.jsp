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
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/common.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/registerSocial.js"></script>

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
		<!-- CONTENT BEGIN -->
		<div class="con cls-after"></div>
		<!-- CONTENT END -->

		<div class="notify-box open" data-step="3" id="step3">
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
							<a href="${pageContext.request.contextPath}/taikhoan">Tài Khoản Của Tôi</a>
						</div>
					</div>
					<div>
						<div class="text-right">&nbsp;</div>
					</div>
				</div>
			</div>
		</div>

		<jsp:include page="footer.jsp"></jsp:include>
	</div>

	<jsp:include page="popup.jsp"></jsp:include>

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
</body>
</html>