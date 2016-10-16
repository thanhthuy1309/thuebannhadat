<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<body>
	<!-- SEARCH BEGIN -->
	<div class="search-setting">
		<div class="con">
			<div class="tabs pda">
				<ul>
					<li class="active"><a href="JavaScript:void(0)"><span>BÁN</span></a></li>
					<li><a href="JavaScript:void(0)"><span>CHO THUÊ</span></a></li>
				</ul>
				<div>
					<div>
						<div class="cls-after umgl umgr half pdt pdb">
							<div class="cls-after">
								<div class="s-item">
									<div>
										<select class="form-control selectpicker validate[required]"
											data-live-search="true" data-size="6">
											<option>Chọn Loại Nhà Đất</option>
											<option>Bán</option>
											<option>Cho thuê</option>
											<option>Căn Hộ Cho Thuê</option>
											<option>Biệt Thự</option>
											<option>Nhà Phố</option>
											<option>Nhà Riêng</option>
											<option>Đất</option>
											<option>Đất Nền Dự án</option>
										</select>
									</div>
								</div>
								<div class="s-item">
									<div>
										<select class="form-control selectpicker validate[required]"
											data-live-search="true" data-size="6">
											<option>Chọn Tỉnh/Thành Phố</option>
											<option>Hồ Chí Minh</option>
											<option>Hà Nội</option>
											<option>Đà Nẵng</option>
											<option>Cần Thơ</option>
											<option>Đà Lạt</option>
											<option>Bình Dương</option>
											<option>Đất Nền Dự án</option>
										</select>
									</div>
								</div>
								<div class="s-item">
									<div>
										<select class="form-control selectpicker validate[required]"
											data-live-search="true" data-size="6">
											<option>Chọn Quận/Huyện</option>
											<option>Quận 1</option>
											<option>Quận 2</option>
											<option>Quận 3</option>
											<option>Quận 4</option>
											<option>Quận 5</option>
											<option>Quận 6</option>
											<option>Quận 7</option>
											<option>Quận 8</option>
										</select>
									</div>
								</div>
								<div class="s-item">
									<div>
										<select class="form-control selectpicker validate[required]"
											data-live-search="true" data-size="6">
											<option>Chọn Phường/Xã</option>
											<option>Phương 1</option>
											<option>Phương 2</option>
											<option>Phương 3</option>
											<option>Phương 4</option>
											<option>Phương 5</option>
											<option>Phương 6</option>
											<option>Phương 7</option>
										</select>
									</div>
								</div>
								<div class="s-item">
									<div>
										<select class="form-control selectpicker validate[required]"
											data-live-search="true" data-size="6">
											<option>Chọn Đường</option>
											<option>Đường Hồng Lạc</option>
											<option>Đường Âu Cơ</option>
											<option>Đường Trần Quang Khải</option>
											<option>Đường Lý Thường Kiệt</option>
											<option>Đường Cách Mạng Tháng 8</option>
											<option>Đường Trường Trính</option>
										</select>
									</div>
								</div>
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
								<div class="s-item">
									<label>dự án</label>
									<div>
										<select class="form-control selectpicker validate[required]"
											data-live-search="true" data-size="6">
											<option>Tất cả</option>
											<option>Lorrem 1</option>
											<option>Lorrem 2</option>
											<option>Lorrem 3</option>
											<option>Lorrem 4</option>
										</select>
									</div>
								</div>
								<div class="s-item-2">
									<label>Chọn giá</label>
									<div>
										<div>
											<input class="txt" placeholder="Nhập Giá Thấp Nhất">
										</div>
										<div>
											<input class="txt" placeholder="Nhập Giá Cao Nhất">
										</div>
									</div>
								</div>
								<div class="s-item-2">
									<label>Chọn diện tích</label>
									<div>
										<div>
											<input class="txt" placeholder="Nhập Diện Tích Thấp Nhất">
										</div>
										<div>
											<input class="txt" placeholder="Nhập Diện Tích Cao Nhất">
										</div>
									</div>
								</div>
								<div class="s-item">
									<label>Số tầng</label>
									<div>
										<input class="txt" placeholder="Số Tầng" type="number">
									</div>
								</div>

								<div class="s-item">
									<label>Chọn Hướng Nhà</label>
									<div>
										<select class="form-control selectpicker validate[required]"
											data-live-search="true" data-size="6">
											<option>Tất cả</option>
											<option>Lorrem 1</option>
											<option>Lorrem 2</option>
											<option>Lorrem 3</option>
											<option>Lorrem 4</option>
										</select>
									</div>
								</div>
								<div class="s-item">
									<label>số phòng ngủ</label>
									<div>
										<select class="form-control selectpicker validate[required]"
											data-live-search="true" data-size="6">
											<option>Tất cả</option>
											<option>Lorrem 1</option>
											<option>Lorrem 2</option>
											<option>Lorrem 3</option>
											<option>Lorrem 4</option>
										</select>
									</div>
								</div>
								<div class="s-item">
									<label>số phòng tắm</label>
									<div>
										<select class="form-control selectpicker validate[required]"
											data-live-search="true" data-size="6">
											<option>Tất cả</option>
											<option>Lorrem 1</option>
											<option>Lorrem 2</option>
											<option>Lorrem 3</option>
											<option>Lorrem 4</option>
										</select>
									</div>
								</div>
								<div class="s-item">
									<label>gara</label>
									<div>
										<select class="form-control selectpicker validate[required]"
											data-live-search="true" data-size="6">
											<option>Tất cả</option>
											<option>Lorrem 1</option>
											<option>Lorrem 2</option>
											<option>Lorrem 3</option>
											<option>Lorrem 4</option>
										</select>
									</div>
								</div>
								<div class="s-item">
									<label>bancol</label>
									<div>
										<select class="form-control selectpicker validate[required]"
											data-live-search="true" data-size="6">
											<option>Tất cả</option>
											<option>Lorrem 1</option>
											<option>Lorrem 2</option>
											<option>Lorrem 3</option>
											<option>Lorrem 4</option>
										</select>
									</div>
								</div>
								<div class="s-item">
									<label>hình thức</label>
									<div>
										<select class="form-control selectpicker validate[required]"
											data-live-search="true" data-size="6">
											<option>Tất cả</option>
											<option>Lorrem 1</option>
											<option>Lorrem 2</option>
											<option>Lorrem 3</option>
											<option>Lorrem 4</option>
										</select>
									</div>
								</div>
								<div class="cls-after"></div>
								<div class="s-item-a">
									<label class="white-lbl">Chọn Tiện ích kèm theo</label>
									<div class="rdbs">
										<button class="yellow-btn f-right">Reset</button>
										<label class="rdb"><input type="checkbox"> <span>Lorrem
												1</span></label> <label class="rdb"><input type="checkbox">
											<span>Lorrem 2</span></label> <label class="rdb"><input
											type="checkbox"> <span>Lorrem 3</span></label> <label
											class="rdb"><input type="checkbox"> <span>Lorrem
												4</span></label> <label class="rdb"><input type="checkbox">
											<span>Lorrem 5</span></label> <label class="rdb"><input
											type="checkbox"> <span>Lorrem 6</span></label> <label
											class="rdb"><input type="checkbox"> <span>Lorrem
												7</span></label>
									</div>
								</div>
								<!-- <div class="s-item-a text-right">
                                            <button class="yellow-btn">Tìm Kiếm</button>
                                            <button class="yellow-btn">Reset</button>

                                        </div> -->
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- SEARCH END -->
</body>
</html>