<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Nhà Đất</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <meta name="viewport" content="width=device-width; initial-scale=1.0, minimum-scale=1.0, user-scalable=no" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/hover.css"/>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/animate.css"/>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css?t=1">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/lib/select/select.min.css"/>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/lib/owl-carousel/owl.carousel.css"/>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/lib/swipebox/swipebox-dark-1.3.css" >
        <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet">
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.9.1.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/plugin.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/owl-carousel/owl.carousel.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/select/select.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/jquery.nailthumb.1.1.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/jquery.lazyload.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/jquery.validationEngine.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/jquery.validationEngine-vi.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/main.js"></script>

        <!--[if IE]>
            <script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7/html5shiv.js"></script>
        <![endif]-->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>
    <body class="">
        <!-- HEADER BEGIN -->
        <header>
            <div>
                <a href="trangchu.html" class="logo"></a>
                <div class="header-action">
                    <div class="cbx notification">
                        <a href="JavaScript:void(0)" class="btn" data-toggle="dropdown"><span class="fa fa-bell-o"></span><i>3</i></a>
                        <div class="cbx-menu center">
                            <ul>
                                <li>
                                    <div>
                                        [Lorem Ipsum] is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s
                                    </div>
                                </li>
                                <li>
                                    <div>
                                        [Lorem Ipsum] is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s
                                    </div>
                                </li>
                                <li>
                                    <div>
                                        [Lorem Ipsum] is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s
                                    </div>
                                </li>
                                <li>
                                    <div>
                                        [Lorem Ipsum] is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s
                                    </div>
                                </li>
                                <li>
                                    <div>
                                        [Lorem Ipsum] is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s
                                    </div>
                                </li>
                                <li>
                                    <div>
                                        [Lorem Ipsum] is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div><a href="JavaScript:dialog('login-dialog')" class="btn"><span class="fa fa-file-text-o"></span><span class="hi"> Đăng Tin Miễn Phí</span></a></div>
                    <div id="login-menu" class="cbx">
                        <a href="JavaScript:void(0)" class="btn" data-toggle="dropdown"><span class="fa fa-user"></span><span class="hi"> Tài Khoản</span></a>
                        <div class="cbx-menu right">
                            <ul>
                                <li><a href="JavaScript:dialog('login-dialog')">Đăng nhập</a></li>
                                <li><a href="JavaScript:dialog('reg-dialog')">Đăng ký</a></li>
                            </ul>
                        </div>
                    </div>
                    <div id="account-menu" class="cbx">
                        <a href="JavaScript:void(0)" class="btn" data-toggle="dropdown">Thủy Tiên</span></a>
                        <div class="cbx-menu right">
                            <ul>
                                <li class="">
                                    <div>
                                        <img src="${pageContext.request.contextPath}/resources/images/120x120.jpg">
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
                    <span></span>
                    <span></span>
                    <span></span>
                </div>
                <div class="nav-menu">
                    <div class="nav">
                        <ul>
                            <li><a href="trangchu.html">Trang Chủ</a></li>
                            <li class="sub-menu">
                                <a href="mua.html">Mua</a>
                                <div>
                                    <ul>
                                        <li><a href="JavaScript:void(0)">Nhà Phố</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Nát</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Trong Hẻm</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Mới Xây</a></li>
                                        <li><a href="JavaScript:void(0)">Chung Cư</a></li>
                                        <li class="divider"></li>
                                        <li><a href="JavaScript:void(0)">Người Có Thu Nhập Thấp</a></li>
                                        <li class="divider"></li>
                                        <li><a href="JavaScript:void(0)">Tất cả</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li class="sub-menu ">
                                <a href="ban.html">Bán</a>
                                <div>
                                    <ul>
                                        <li><a href="JavaScript:void(0)">Nhà Phố</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Nát</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Trong Hẻm</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Mới Xây</a></li>
                                        <li><a href="JavaScript:void(0)">Chung Cư</a></li>
                                        <li class="divider"></li>
                                        <li><a href="JavaScript:void(0)">Người Có Thu Nhập Thấp</a></li>
                                        <li class="divider"></li>
                                        <li><a href="JavaScript:void(0)">Tất cả</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li class="sub-menu">
                                <a href="thue.html">Cho Thuê</a>
                                <div>
                                    <ul>
                                        <li><a href="JavaScript:void(0)">Nhà Phố</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Nát</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Trong Hẻm</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Mới Xây</a></li>
                                        <li><a href="JavaScript:void(0)">Chung Cư</a></li>
                                        <li class="divider"></li>
                                        <li><a href="JavaScript:void(0)">Người Có Thu Nhập Thấp</a></li>
                                        <li class="divider"></li>
                                        <li><a href="JavaScript:void(0)">Tất cả</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li class="sub-menu">
                                <a href="thechap.html">Thế Chấp</a>
                                <div>
                                    <ul>
                                        <li><a href="JavaScript:void(0)">Nhà Phố</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Nát</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Trong Hẻm</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Mới Xây</a></li>
                                        <li><a href="JavaScript:void(0)">Chung Cư</a></li>
                                        <li class="divider"></li>
                                        <li><a href="JavaScript:void(0)">Người Có Thu Nhập Thấp</a></li>
                                        <li class="divider"></li>
                                        <li><a href="JavaScript:void(0)">Tất cả</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li class="sub-menu">
                                <a href="duan.html">Dự Án</a>
                                <div>
                                    <ul>
                                        <li><a href="JavaScript:void(0)">Nhà Phố</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Nát</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Trong Hẻm</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Mới Xây</a></li>
                                        <li><a href="JavaScript:void(0)">Chung Cư</a></li>
                                        <li class="divider"></li>
                                        <li><a href="JavaScript:void(0)">Người Có Thu Nhập Thấp</a></li>
                                        <li class="divider"></li>
                                        <li><a href="JavaScript:void(0)">Tất cả</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li class="sub-menu active">
                                <a href="dichvu.html">Dịch Vụ Môi Giới</a>
                                <div>
                                    <ul>
                                        <li><a href="JavaScript:void(0)">Nhà Phố</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Nát</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Trong Hẻm</a></li>
                                        <li><a href="JavaScript:void(0)">Nhà Mới Xây</a></li>
                                        <li><a href="JavaScript:void(0)">Chung Cư</a></li>
                                        <li class="divider"></li>
                                        <li><a href="JavaScript:void(0)">Người Có Thu Nhập Thấp</a></li>
                                        <li class="divider"></li>
                                        <li><a href="JavaScript:void(0)">Tất cả</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li class=""><a href="tintuc.html">Tin Tức</a></li>
                            <li><a href="lienhe.html">Liên Hệ</a></li>
                        </ul>
                    </div>
                    
                </div>
            </div>
        </header>
        <!-- HEADER END -->

        <div class="wrap">

            <!-- BANNER BEGIN -->
            <div class="banner cover" style="background-image:url(${pageContext.request.contextPath}/resources/images/15.jpg)">
                <div class="con">
                    <div class="tit-big">DỊCH VỤ</div>
                </div>
            </div>
            <!-- BANNER END -->

            <!-- SEARCH BEGIN -->
            <div class="search-setting mgb">
                <div class="con">
                    <div class="tabs pda">
                        <div>
                            <div>
                                <div class="cls-after umgl umgr half pdt pdb">
                                    <div class="cls-after">
                                        <div class="s-item">
                                            <div>
                                                <select 
                                                    class="form-control selectpicker validate[required]" 
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
                                                <select 
                                                    class="form-control selectpicker validate[required]" 
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
                                                <select 
                                                    class="form-control selectpicker validate[required]" 
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
                                                <select 
                                                    class="form-control selectpicker validate[required]" 
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
                                                <select 
                                                    class="form-control selectpicker validate[required]" 
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
                                                <button class="block-btn yellow-btn hvr-bounce-to-bottom">Tìm Kiếm</button>
                                                <button class="black-btn" data-toggle="collapse" data-target="#advance-setting"><span class="fa fa-sliders"></span></button>
                                            </div>
                                        </div>
                                    </div>
                                    <div id="advance-setting" class="advance-setting">
                                        <div class="s-item">
                                            <label>dự án</label>
                                            <div>
                                                <select 
                                                    class="form-control selectpicker validate[required]" 
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
                                                <select 
                                                    class="form-control selectpicker validate[required]" 
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
                                                <select 
                                                    class="form-control selectpicker validate[required]" 
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
                                                <select 
                                                    class="form-control selectpicker validate[required]" 
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
                                                <select 
                                                    class="form-control selectpicker validate[required]" 
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
                                                <select 
                                                    class="form-control selectpicker validate[required]" 
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
                                                <select 
                                                    class="form-control selectpicker validate[required]" 
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
                                                <label class="rdb"><input type="checkbox"> <span>Lorrem 1</span></label>
                                                <label class="rdb"><input type="checkbox"> <span>Lorrem 2</span></label>
                                                <label class="rdb"><input type="checkbox"> <span>Lorrem 3</span></label>
                                                <label class="rdb"><input type="checkbox"> <span>Lorrem 4</span></label>
                                                <label class="rdb"><input type="checkbox"> <span>Lorrem 5</span></label>
                                                <label class="rdb"><input type="checkbox"> <span>Lorrem 6</span></label>
                                                <label class="rdb"><input type="checkbox"> <span>Lorrem 7</span></label>
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

            <!-- BREADCRUMB BEGIN -->
            <div class="con pdl pdr">
                <div class="breadcrumb bec-fu">
                    <ul>
                        <li><a href="index.html"><i class="fa fa-home"></i> Trang Chủ</a></li>
                        <li><a href="dichvu.html">Dịch vụ môi giới</a></li>
                        <li><span>Doanh nghiệp/Công ty</span></li>
                    </ul>
                </div>
            </div>
            <!-- BREADCRUMB END -->

            <!-- NEWS BEGIN -->
            <div class="con cls-after">
                <div class="pda">
                    <div class="tit">
                        <p>DỊCH VỤ</p>
                        <div class="act">
                            <a href="tintuc-list.html" class="more a"><span class="smtext">Xem tất cả</span> <span class="fa fa-angle-right"></span></a>
                        </div>
                    </div>
                    <div id="owl-service" class="owl-carousel owl-news services">
                    <!-- <div class="news-items cls-after"> -->
                        <div class="news-item">
                            <div class="nailthumb">
                                <div class="nailthumb-figure-75">
                                    <a href="dichvu-detail.html" class="nailthumb-container">
                                        <img class="lazy" src="${pageContext.request.contextPath}/resources/images/1.jpg">
                                    </a>
                                </div>
                            </div>
                            <div class="info">
                                <div>
                                <a href="tintuc-detail.html" class="h2"><span>[Lorem Ipsum] is simply dummy text of the printing and typesetting industry</span></a>
                                </div>
                                <table>
                                    <tr>
                                        <td colspan="3">
                                        <span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức Thắng, P. Bến Thành, Q.1, TP.HCM<br/>
                                        <span class="fa fa-phone"></span> 09xx xxxx xxx/09xx xxxx xxx/<br/>
                                        <span class="fa fa-envelope-o"></span> Info@gmail.com
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="6" class="hr"></td>
                                    </tr>
                                    <tr>
                                        <td class=""><span class="fa fa-file-text-o"></span> 5 Dự án</td>
                                        <td class=""><span class="fa fa-building-o"></span> 3 Sàn giao dịch</td>
                                        <td class="td-more" ><button class="yellow-btn">CHI TIẾT <span class="fa fa-angle-right"></span></button></td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                        <div class="news-item">
                            <div class="nailthumb">
                                <div class="nailthumb-figure-75">
                                    <a href="dichvu-detail.html" class="nailthumb-container">
                                        <img class="lazy" src="${pageContext.request.contextPath}/resources/images/2.jpg">
                                    </a>
                                </div>
                            </div>
                            <div class="info">
                                <div>
                                <a href="tintuc-detail.html" class="h2"><span>[Lorem Ipsum] is simply dummy text of the printing and typesetting industry</span></a>
                                </div>
                                <table>
                                    <tr>
                                        <td colspan="3">
                                        <span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức Thắng, P. Bến Thành, Q.1, TP.HCM<br/>
                                        <span class="fa fa-phone"></span> 09xx xxxx xxx/09xx xxxx xxx/<br/>
                                        <span class="fa fa-envelope-o"></span> Info@gmail.com
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="6" class="hr"></td>
                                    </tr>
                                    <tr>
                                        <td class=""><span class="fa fa-file-text-o"></span> 5 Dự án</td>
                                        <td class=""><span class="fa fa-building-o"></span> 3 Sàn giao dịch</td>
                                        <td class="td-more" ><button class="yellow-btn">CHI TIẾT <span class="fa fa-angle-right"></span></button></td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                        <div class="news-item">
                            <div class="nailthumb">
                                <div class="nailthumb-figure-75">
                                    <a href="dichvu-detail.html" class="nailthumb-container">
                                        <img class="lazy" src="${pageContext.request.contextPath}/resources/images/3.jpg">
                                    </a>
                                </div>
                            </div>
                            <div class="info">
                                <div>
                                <a href="tintuc-detail.html" class="h2"><span>[Lorem Ipsum] is simply dummy text of the printing and typesetting industry</span></a>
                                </div>
                                <table>
                                    <tr>
                                        <td colspan="3">
                                        <span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức Thắng, P. Bến Thành, Q.1, TP.HCM<br/>
                                        <span class="fa fa-phone"></span> 09xx xxxx xxx/09xx xxxx xxx/<br/>
                                        <span class="fa fa-envelope-o"></span> Info@gmail.com
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="6" class="hr"></td>
                                    </tr>
                                    <tr>
                                        <td class=""><span class="fa fa-file-text-o"></span> 5 Dự án</td>
                                        <td class=""><span class="fa fa-building-o"></span> 3 Sàn giao dịch</td>
                                        <td class="td-more" ><button class="yellow-btn">CHI TIẾT <span class="fa fa-angle-right"></span></button></td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                        <div class="news-item">
                            <div class="nailthumb">
                                <div class="nailthumb-figure-75">
                                    <a href="dichvu-detail.html" class="nailthumb-container">
                                        <img class="lazy" src="${pageContext.request.contextPath}/resources/images/4.jpg">
                                    </a>
                                </div>
                            </div>
                            <div class="info">
                                <div>
                                <a href="tintuc-detail.html" class="h2"><span>[Lorem Ipsum] is simply dummy text of the printing and typesetting industry</span></a>
                                </div>
                                <table>
                                    <tr>
                                        <td colspan="3">
                                        <span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức Thắng, P. Bến Thành, Q.1, TP.HCM<br/>
                                        <span class="fa fa-phone"></span> 09xx xxxx xxx/09xx xxxx xxx/<br/>
                                        <span class="fa fa-envelope-o"></span> Info@gmail.com
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="6" class="hr"></td>
                                    </tr>
                                    <tr>
                                        <td class=""><span class="fa fa-file-text-o"></span> 5 Dự án</td>
                                        <td class=""><span class="fa fa-building-o"></span> 3 Sàn giao dịch</td>
                                        <td class="td-more" ><button class="yellow-btn">CHI TIẾT <span class="fa fa-angle-right"></span></button></td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                        <div class="news-item">
                            <div class="nailthumb">
                                <div class="nailthumb-figure-75">
                                    <a href="dichvu-detail.html" class="nailthumb-container">
                                        <img class="lazy" src="${pageContext.request.contextPath}/resources/images/5.jpg">
                                    </a>
                                </div>
                            </div>
                            <div class="info">
                                <div>
                                <a href="tintuc-detail.html" class="h2"><span>[Lorem Ipsum] is simply dummy text of the printing and typesetting industry</span></a>
                                </div>
                                <table>
                                    <tr>
                                        <td colspan="3">
                                        <span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức Thắng, P. Bến Thành, Q.1, TP.HCM<br/>
                                        <span class="fa fa-phone"></span> 09xx xxxx xxx/09xx xxxx xxx/<br/>
                                        <span class="fa fa-envelope-o"></span> Info@gmail.com
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="6" class="hr"></td>
                                    </tr>
                                    <tr>
                                        <td class=""><span class="fa fa-file-text-o"></span> 5 Dự án</td>
                                        <td class=""><span class="fa fa-building-o"></span> 3 Sàn giao dịch</td>
                                        <td class="td-more" ><button class="yellow-btn">CHI TIẾT <span class="fa fa-angle-right"></span></button></td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    <!-- </div> -->
                    </div>
                </div>
            </div>
            <!-- NEWS END -->

            <!-- CONTENT BEGIN -->
            <div class="con cls-after">
                <!-- LEFT BEGIN -->
                <div class="con-left pda">

                    <!-- SORT BEGIN -->
                    <div class="con pdb" style="z-index:29">
                            <div class="sort-setting">
                                <div class="view-type">
                                Xem theo
                                <span class="fa fa-th active" data-view="grid"></span>
                                <span class="fa fa-th-list " data-view="list"></span>
                                </div>
                                <span>Sắp xếp theo </span>
                                <div class="control">
                                    <div class="cbx cbx-se cbx-sort">
                                        <a href="JavaScript:void(0)" class="btn" data-toggle="dropdown"><span>Quận/Huyện <i class="fa fa-caret-down"></i></span></a>
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
                                        <a href="JavaScript:void(0)" class="btn" data-toggle="dropdown"><span>Tỉnh/Thành Phố<i class="fa fa-angle-down"></i></span></a>
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
                            </div>
                    </div>
                    <!-- SORT END -->
                    
                    <!-- THUE BEGIN -->
                    <div class="tit">
                        <p>TIN TỨC - SỰ KIỆN</p>
                        <div class="act">
                            <a href="tintuc-list.html" class="more a"><span class="smtext">Xem tất cả</span> <span class="fa fa-angle-right"></span></a>
                        </div>
                    </div>
                    <div class="items cls-after grid services-list">
                        <div class="item cls-after">
                            <div class="nailthumb">
                                <div class="nailthumb-figure-64">
                                    <a href="dichvu-detail.html" class="nailthumb-container">
                                        <img class="lazy" src="${pageContext.request.contextPath}/resources/images/10.jpg">
                                    </a>
                                    <div class="price">
                                        <div>10 TỶ</div>
                                        <span>7tr500/Tháng</span>
                                    </div>
                                </div>
                            </div>
                            <div class="info">
                                <table>
                                    <tr>
                                        <th colspan="6"><a href="dichvu-detail.html" class="h2"><span>[Lorem Ipsum] is simply dummy text of the printing and typesetting industry</span></a></th>
                                    </tr>
                                    <tr>
                                        <td colspan="6">
                                            <p class="line-clamp-f-3">
                                                <span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức Thắng, P. Bến Thành, Q.1, TP.HCM<br>
                                        <span class="fa fa-phone"></span> 09xx xxxx xxx/09xx xxxx xxx/<br>
                                        <span class="fa fa-envelope-o"></span> Info@gmail.com
                                            </p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="6" class="hr"></td>
                                    </tr>
                                    <tr>
                                        <td class="adds" colspan="2"><span class="fa fa-user"></span> Nova Land Group</td>
                                        <td class="adds" colspan="2"><span class="fa fa-calendar"></span> 12/08/2016</td>
                                        <td class="td-more" colspan="2" ><button class="yellow-btn">CHI TIẾT <span class="fa fa-angle-right"></span></button></td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                        <div class="item cls-after">
                            <div class="nailthumb">
                                <div class="nailthumb-figure-64">
                                    <a href="dichvu-detail.html" class="nailthumb-container">
                                        <img class="lazy" src="${pageContext.request.contextPath}/resources/images/11.jpg">
                                    </a>
                                    <div class="price">
                                        <div>10 TỶ</div>
                                        <span>7tr500/Tháng</span>
                                    </div>
                                </div>
                            </div>
                            <div class="info">
                                <table>
                                    <tr>
                                        <th colspan="6"><a href="dichvu-detail.html" class="h2"><span>[Lorem Ipsum] is simply dummy text of the printing and typesetting industry</span></a></th>
                                    </tr>
                                    <tr>
                                        <td colspan="6">
                                            <p class="line-clamp-f-3">
                                                <span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức Thắng, P. Bến Thành, Q.1, TP.HCM<br>
                                        <span class="fa fa-phone"></span> 09xx xxxx xxx/09xx xxxx xxx/<br>
                                        <span class="fa fa-envelope-o"></span> Info@gmail.com
                                            </p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="6" class="hr"></td>
                                    </tr>
                                    <tr>
                                        <td class="adds" colspan="2"><span class="fa fa-user"></span> Nova Land Group</td>
                                        <td class="adds" colspan="2"><span class="fa fa-calendar"></span> 12/08/2016</td>
                                        <td class="td-more" colspan="2" ><button class="yellow-btn">CHI TIẾT <span class="fa fa-angle-right"></span></button></td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                        <div class="item cls-after">
                            <div class="nailthumb">
                                <div class="nailthumb-figure-64">
                                    <a href="dichvu-detail.html" class="nailthumb-container">
                                        <img class="lazy" src="${pageContext.request.contextPath}/resources/images/1.jpg">
                                    </a>
                                    <div class="price">
                                        <div>10 TỶ</div>
                                        <span>7tr500/Tháng</span>
                                    </div>
                                </div>
                            </div>
                            <div class="info">
                                <table>
                                    <tr>
                                        <th colspan="6"><a href="dichvu-detail.html" class="h2"><span>[Lorem Ipsum] is simply dummy text of the printing and typesetting industry</span></a></th>
                                    </tr>
                                    <tr>
                                        <td colspan="6">
                                            <p class="line-clamp-f-3">
                                                <span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức Thắng, P. Bến Thành, Q.1, TP.HCM<br>
                                        <span class="fa fa-phone"></span> 09xx xxxx xxx/09xx xxxx xxx/<br>
                                        <span class="fa fa-envelope-o"></span> Info@gmail.com
                                            </p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="6" class="hr"></td>
                                    </tr>
                                    <tr>
                                        <td class="adds" colspan="2"><span class="fa fa-user"></span> Nova Land Group</td>
                                        <td class="adds" colspan="2"><span class="fa fa-calendar"></span> 12/08/2016</td>
                                        <td class="td-more" colspan="2" ><button class="yellow-btn">CHI TIẾT <span class="fa fa-angle-right"></span></button></td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                        <div class="item cls-after">
                            <div class="nailthumb">
                                <div class="nailthumb-figure-64">
                                    <a href="dichvu-detail.html" class="nailthumb-container">
                                        <img class="lazy" src="${pageContext.request.contextPath}/resources/images/2.jpg">
                                    </a>
                                    <div class="price">
                                        <div>10 TỶ</div>
                                        <span>7tr500/Tháng</span>
                                    </div>
                                </div>
                            </div>
                            <div class="info">
                                <table>
                                    <tr>
                                        <th colspan="6"><a href="dichvu-detail.html" class="h2"><span>[Lorem Ipsum] is simply dummy text of the printing and typesetting industry</span></a></th>
                                    </tr>
                                    <tr>
                                        <td colspan="6">
                                            <p class="line-clamp-f-3">
                                                <span class="fa fa-map-marker"></span> Địa chỉ 108 Tôn Đức Thắng, P. Bến Thành, Q.1, TP.HCM<br>
                                        <span class="fa fa-phone"></span> 09xx xxxx xxx/09xx xxxx xxx/<br>
                                        <span class="fa fa-envelope-o"></span> Info@gmail.com
                                            </p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="6" class="hr"></td>
                                    </tr>
                                    <tr>
                                        <td class="adds" colspan="2"><span class="fa fa-user"></span> Nova Land Group</td>
                                        <td class="adds" colspan="2"><span class="fa fa-calendar"></span> 12/08/2016</td>
                                        <td class="td-more" colspan="2" ><button class="yellow-btn">CHI TIẾT <span class="fa fa-angle-right"></span></button></td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </div>
                    <!-- THUE END -->
                    <!-- PAGING BEGIN -->
                    <div class="paging">
                        <ul>
                            <li><a href="#"><span class="fa fa-angle-double-left"></span></a></li>
                            <li><a href="#"><span class="fa fa-angle-left"></span></a></li>
                            <li><a href="#">1</a></li>
                            <li><a href="#">2</a></li>
                            <li class="active"><a href="#">6</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li><a href="#">5</a></li>
                            <li><a href="#"><span class="fa fa-angle-right"></span></a></li>
                            <li><a href="#"><span class="fa fa-angle-double-right"></span></a></li>
                        </ul>
                    </div>
                    <!-- PAGING END -->
                </div>
                <!-- LEFT END -->
                <!-- RIGHT BEGIN -->
                <div class="con-right pda">
                    <div class="tit">
                        <p>QUẢNG CÁO</p>
                    </div>
                    <div class="advs cls-after">
                        <a href="JavaScript:void(0)" class="adv">
                            <img src="${pageContext.request.contextPath}/resources/images/17.jpg">
                        </a>
                        <a href="JavaScript:void(0)" class="adv">
                            <img src="${pageContext.request.contextPath}/resources/images/18.jpg">
                        </a>
                        <a href="JavaScript:void(0)" class="adv">
                            <img src="${pageContext.request.contextPath}/resources/images/19.jpg">
                        </a>
                        <a href="JavaScript:void(0)" class="adv">
                            <img src="${pageContext.request.contextPath}/resources/images/20.jpg">
                        </a>
                    </div>
                </div>
                <!-- RIGHT END -->
            </div>
            <!-- CONTENT END -->

            

            <!-- FOOTER BEGIN -->
            <footer>
                <div class="con pdt pdb cls-after">
                    <!-- FOOTER LEFT BEGIN -->
                    <div>
                        <div class="pdb"><img src="${pageContext.request.contextPath}/resources/images/logo.png"></div>
                        <div class="pdt pdb">Kết nối với cộng đồng Thuê-Bán Nhà Đất</div>
                        <ul class="social-icons cls-after pdb">
                            <li><a href="JavaScript:void(0)"><span class="fa fa-facebook"></span></a></li>
                            <li><a href="JavaScript:void(0)"><span class="fa fa-google"></span></a></li>
                            <li><a href="JavaScript:void(0)"><span class="fa fa-youtube"></span></a></li>
                            <li><a href="JavaScript:void(0)"><span class="fa fa-twitter"></span></a></li>
                        </ul>
                        <div class="pdt pdb foot-inf">
                           Liên hệ với Thuê-Bán Nhà Đất<br/>
                            <span class="fa fa-location-arrow"></span> 178 - 180 Nguyen Cu Trinh St, 1St Dist, HCMC<br/>
                            <span class="fa fa-envelope-o"></span> (84.8) - 3836.8989 - 3836.8899 - 3836.9144<br/>
                            <span class="fa fa-"> </span> Fax: (84.8) - 3836.8399<br/>
                            <span class="fa fa-phone"></span> (84.8) - 3836.8989
                        </div>
                        <div class="pdt pdb">
                            <button class="bbtn">Liên hệ</button>
                        </div>
                    </div>
                    <!-- FOOTER LEFT END -->
                    <!-- FOOTER RIGHT BEGIN -->
                    <div>
                        <div class="f-tit">Nhà Đất Bán</div>
                        <ul class="f-list pdb">
                            <li><a href="JavaScript:void(0)"><span>100</span>Nhà đất Hồ Chí Minh</a></li>
                            <li><a href="JavaScript:void(0)"><span>100</span>Nhà đất Hà Nội</a></li>
                            <li><a href="JavaScript:void(0)"><span>100</span>Nhà đất Đà Nẵng</a></li>
                            <li><a href="JavaScript:void(0)"><span>100</span>Nhà đất Hải Phòng</a></li>
                            <li><a href="JavaScript:void(0)"><span>100</span>Nhà đất Bình Dương</a></li>
                            <li><a href="JavaScript:void(0)"><span>100</span>Nhà đất Đồng Nai</a></li>
                            <li><a href="JavaScript:void(0)"><span>100</span>Nhà đất Cần Thơ</a></li>
                        </ul>
                        <div class="f-tit">Nhà Đất Cho Thuê</div>
                        <ul class="f-list">
                            <li><a href="JavaScript:void(0)"><span>100</span>Nhà đất Hồ Chí Minh</a></li>
                            <li><a href="JavaScript:void(0)"><span>100</span>Nhà đất Hà Nội</a></li>
                            <li><a href="JavaScript:void(0)"><span>100</span>Nhà đất Hải Phòng</a></li>
                            <li><a href="JavaScript:void(0)"><span>100</span>Nhà đất Bình Dương</a></li>
                            <li><a href="JavaScript:void(0)"><span>100</span>Nhà đất Đồng Nai</a></li>
                        </ul>
                    </div>
                    <!-- FOOTER LEFT END -->
                    <!-- FOOTER RIGHT BEGIN -->
                    <div>
                        <div class="f-tit">Tag Tìm Kiếm</div>
                        <div class="f-tag pdb">
                            <a href="JavaScript:void(0)">NHÀ BÁN</a>
                            <a href="JavaScript:void(0)">CHO THUÊ</a>
                            <a href="JavaScript:void(0)">CHUNG CƯ</a>
                            <a href="JavaScript:void(0)">THUÊ XƯỞNG</a>
                            <a href="JavaScript:void(0)">BÁN BIỆT THỰ</a>
                            <a href="JavaScript:void(0)">CHUNG CƯ CAO CẤP</a>
                            <a href="JavaScript:void(0)">ĐẤT NỀN</a>
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
                        <button><span class="fa fa-send"></span></button>
                        </div>
                    </div>
                    <!-- FOOTER RIGHT END -->
                </div>
            </footer>
            <!-- FOOTER END -->

            <div class="after-foot">
                <div class="con cls-after">
                    <ul>
                        <li><a href="JavaScript:void(0)">Trang Chủ</a></li>
                        <li><a href="JavaScript:void(0)">Giới Thiệu</a></li>
                        <li><a href="JavaScript:void(0)">Điều Khoản Bảo Mật</a></li>
                        <li><a href="JavaScript:void(0)">Liên Hệ</a></li>
                    </ul>
                    <p>&copy; 2014 All rights reserved.</p>
                </div>
            </div>
        </div>
        <div id="login-dialog" class="dialog">
            <div class="content">
                <div class="">
                    <div class="head">ĐĂNG NHẬP <i class="pull-right fa fa-close" onclick="dialog('login-dialog')"></i></div>
                    <div class="body">
                        <form name="loginFrm" id="loginFrm" class="loginFrm" action="dangtin.html">
                            <div class="ctrl pdb">
                                <input class="txt txt-border validate[required,custom[email]]" data-prompt-position="topLeft:0,26" placeholder="Email" type="text">
                            </div>
                            <div class="ctrl pdb">
                                <input class="txt txt-border validate[required]" data-prompt-position="topLeft:0,26" placeholder="Mật Khẩu" type="password">
                            </div>
                            <div class="ctrl pdb">
                                <button class="block-btn yellow-btn hvr-bounce-to-bottom" type="submit">ĐĂNG NHẬP</button>
                            </div>
                            <div class="ctrls pdb cls-after">
                                
                                
<div>
                                    <a href="dangky-social.html"><button class="block-btn blue-btn" type="button"><span class="fa fa-facebook"></span> FACEBOOK</button></a>
                                </div>
                                <div>
                                    <a href="dangky-social.html"><button class="block-btn red-btn" type="button"><span class="fa fa-google"></span> GOOGLE+</button></a>
                                </div>
                      
                            </div> 
                        </form>
                    </div>
                    <div class="dfoot foot-btns">
                        <div><div class="text-left">Quên mật khẩu ?</div></div>
                        <div><div class="text-right">Chưa có tài khoản</div></div>
                    </div>
                </div>
            </div>
        </div>
        <iframe id="integration_asynchronous" name="integration_asynchronous" class="integration_asynchronous"></iframe>
