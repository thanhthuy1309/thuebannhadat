<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<body>
	<!-- HEADER BEGIN -->
	<header>
		<div>
			<a href="trangchu.html" class="logo"></a>
			<div class="header-action">
				<c:if test="${lstNotification != null}">
					<div class="cbx notification">
						<a href="JavaScript:void(0)" class="btn" data-toggle="dropdown"><span
							class="fa fa-bell-o"></span><i>${fn:length(lstNotification)}</i></a>
						<div class="cbx-menu center">
							<ul>
								<c:forEach items="${lstNotification }" var="notifications">
									<li>
										<div>
											<a href="thongbao.html">${notifications.notificationTitle }</a>
										</div>
									</li>
								</c:forEach>
							</ul>
						</div>
					</div>
				</c:if>
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
						<c:if test="${lstMainMenu != null}">
							<c:forEach items="${lstMainMenu }" var="menus">
								<li class="${empty menus.subMenuList ? '' : 'sub-menu' }"><a
									href="JavaScript:">${menus.mainMenuName}</a> <c:if
										test="${!empty menus.subMenuList}">
										<div>
											<ul>
												<c:forEach items="${menus.subMenuList }" var="subMenus">
													<li><a href="${subMenus.subMenuUrl }">${subMenus.subMenuName }</a></li>
												</c:forEach>
											</ul>
										</div>
									</c:if></li>
							</c:forEach>
							<li class=""><a href="tintuc.html">Tin Tức</a></li>
						</c:if>
					</ul>
				</div>
			</div>
		</div>
	</header>
	<!-- HEADER END -->
</body>
</html>