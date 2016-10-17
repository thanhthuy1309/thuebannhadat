<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<body>
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
								<a href="${pageContext.request.contextPath}/facebook/signin"><button
										class="block-btn blue-btn" type="button">
										<span class="fa fa-facebook"></span> FACEBOOK
									</button></a>
							</div>
							<div>
								<a href="${pageContext.request.contextPath}/google/signin"><button
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


						<div>
							<a onclick="checkLoginState();"><button
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
</body>
</html>