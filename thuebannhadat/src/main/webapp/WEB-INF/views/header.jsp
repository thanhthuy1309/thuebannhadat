<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<body>
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
</body>
</html>