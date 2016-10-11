/*
Navicat MySQL Data Transfer

Source Server         : thuabannhadat
Source Server Version : 50632
Source Host           : 54.255.169.171:3306
Source Database       : thuebannhadat

Target Server Type    : MYSQL
Target Server Version : 50632
File Encoding         : 65001

Date: 2016-10-11 22:01:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_donvigia
-- ----------------------------
DROP TABLE IF EXISTS `tbl_donvigia`;
CREATE TABLE `tbl_donvigia` (
  `id_donvigia` int(11) NOT NULL AUTO_INCREMENT,
  `ten_donvigia` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_donvigia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_duong
-- ----------------------------
DROP TABLE IF EXISTS `tbl_duong`;
CREATE TABLE `tbl_duong` (
  `id_duong` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `id_quanhuyen` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `id_thanhpho` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `ten_duong` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_duong`,`id_quanhuyen`,`id_thanhpho`),
  KEY `FKEC2AE8766F370B0B` (`id_quanhuyen`,`id_thanhpho`),
  CONSTRAINT `FKEC2AE8766F370B0B` FOREIGN KEY (`id_quanhuyen`, `id_thanhpho`) REFERENCES `tbl_quanhuyen` (`id_quanhuyen`, `id_thanhpho`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_footerlinkban
-- ----------------------------
DROP TABLE IF EXISTS `tbl_footerlinkban`;
CREATE TABLE `tbl_footerlinkban` (
  `id_footerlinkban` int(11) NOT NULL AUTO_INCREMENT,
  `ten_footerlinkban` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(11) NOT NULL,
  `url_footerlinkban` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_footerlinkban`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_footerlinkthue
-- ----------------------------
DROP TABLE IF EXISTS `tbl_footerlinkthue`;
CREATE TABLE `tbl_footerlinkthue` (
  `id_footerlinkthue` int(11) NOT NULL AUTO_INCREMENT,
  `ten_footerlinkthue` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(11) NOT NULL,
  `url_footerlinkthue` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_footerlinkthue`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_giaodich
-- ----------------------------
DROP TABLE IF EXISTS `tbl_giaodich`;
CREATE TABLE `tbl_giaodich` (
  `id_giaodich` int(11) NOT NULL AUTO_INCREMENT,
  `id_loaigiaodich` int(11) NOT NULL,
  `thoigian` datetime NOT NULL,
  `tien_giaodich` decimal(19,2) DEFAULT NULL,
  `tien_nap` decimal(19,2) DEFAULT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_giaodich`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_giatin
-- ----------------------------
DROP TABLE IF EXISTS `tbl_giatin`;
CREATE TABLE `tbl_giatin` (
  `id_giatin` int(11) NOT NULL AUTO_INCREMENT,
  `giatin` decimal(19,2) NOT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_giatin`),
  UNIQUE KEY `giatin` (`giatin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_hinhanhtin
-- ----------------------------
DROP TABLE IF EXISTS `tbl_hinhanhtin`;
CREATE TABLE `tbl_hinhanhtin` (
  `ten_hinhanhtin` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `id_mautin` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(11) NOT NULL,
  `id_hinhanhtin` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `thutu` int(11) NOT NULL,
  PRIMARY KEY (`ten_hinhanhtin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_huongbancong
-- ----------------------------
DROP TABLE IF EXISTS `tbl_huongbancong`;
CREATE TABLE `tbl_huongbancong` (
  `id_huongbancong` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `ten_huongbancong` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_huongbancong`),
  UNIQUE KEY `ten_huongbancong` (`ten_huongbancong`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_huongnha
-- ----------------------------
DROP TABLE IF EXISTS `tbl_huongnha`;
CREATE TABLE `tbl_huongnha` (
  `id_huongnha` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `ten_huongnha` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_huongnha`),
  UNIQUE KEY `ten_huongnha` (`ten_huongnha`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_loaigiaodich
-- ----------------------------
DROP TABLE IF EXISTS `tbl_loaigiaodich`;
CREATE TABLE `tbl_loaigiaodich` (
  `id_loaigiaodich` int(11) NOT NULL AUTO_INCREMENT,
  `ten_loaigiaodich` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_loaigiaodich`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_loaihinhdat
-- ----------------------------
DROP TABLE IF EXISTS `tbl_loaihinhdat`;
CREATE TABLE `tbl_loaihinhdat` (
  `id_loaihinhdat` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `ten_loaihinhdat` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_loaihinhdat`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_loainhadat
-- ----------------------------
DROP TABLE IF EXISTS `tbl_loainhadat`;
CREATE TABLE `tbl_loainhadat` (
  `id_loaihinhdat` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `id_loainhadat` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `ten_loainhadat` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_loaihinhdat`,`id_loainhadat`),
  KEY `FK4F7C581C2E248B31` (`id_loaihinhdat`),
  CONSTRAINT `FK4F7C581C2E248B31` FOREIGN KEY (`id_loaihinhdat`) REFERENCES `tbl_loaihinhdat` (`id_loaihinhdat`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_loaitin
-- ----------------------------
DROP TABLE IF EXISTS `tbl_loaitin`;
CREATE TABLE `tbl_loaitin` (
  `id_loaitin` int(11) NOT NULL AUTO_INCREMENT,
  `id_giatin` int(11) NOT NULL,
  `ten_loaitin` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_loaitin`),
  UNIQUE KEY `ten_loaitin` (`ten_loaitin`),
  KEY `FK2940184DEDD19FE5` (`id_giatin`),
  CONSTRAINT `FK2940184DEDD19FE5` FOREIGN KEY (`id_giatin`) REFERENCES `tbl_giatin` (`id_giatin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_mautin
-- ----------------------------
DROP TABLE IF EXISTS `tbl_mautin`;
CREATE TABLE `tbl_mautin` (
  `id_mautin` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `chinhchu` tinyint(1) DEFAULT NULL,
  `diachi` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `dientich` float NOT NULL,
  `giadat` decimal(19,2) NOT NULL,
  `hemxehoi` tinyint(1) DEFAULT NULL,
  `id_donvigia` int(11) NOT NULL,
  `id_duong` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id_huongbancong` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id_huongnha` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id_loaihinhdat` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `id_loainhadat` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `id_loaitin` int(11) NOT NULL,
  `id_phuongxa` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id_quanhuyen` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `id_sophongngu` int(11) DEFAULT NULL,
  `id_sotang` int(11) DEFAULT NULL,
  `id_sotoilet` int(11) DEFAULT NULL,
  `id_thanhpho` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `id_thoihantin` int(11) NOT NULL,
  `khuanninh` tinyint(1) DEFAULT NULL,
  `link_youtube` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `logioi` float DEFAULT NULL,
  `mattien` float DEFAULT NULL,
  `motatin` longtext COLLATE utf8_unicode_ci NOT NULL,
  `ngaydangtin` date DEFAULT NULL,
  `ten_mautin` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `tong_giatien` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tongtientin` decimal(19,2) NOT NULL,
  `trangthai` varchar(1) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_mautin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_menuchinh
-- ----------------------------
DROP TABLE IF EXISTS `tbl_menuchinh`;
CREATE TABLE `tbl_menuchinh` (
  `id_menuchinh` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `ten_menuchinh` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `thutu` int(11) NOT NULL,
  `trangthai` int(11) NOT NULL,
  `url` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_menuchinh`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_menucon
-- ----------------------------
DROP TABLE IF EXISTS `tbl_menucon`;
CREATE TABLE `tbl_menucon` (
  `id_menuchinh` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `id_menucon` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `ten_menuchinh` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `thutu` int(11) NOT NULL,
  `trangthai` int(11) NOT NULL,
  `url` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_menuchinh`,`id_menucon`),
  UNIQUE KEY `thutu` (`thutu`),
  KEY `FK4DD24442886261ED` (`id_menuchinh`),
  CONSTRAINT `FK4DD24442886261ED` FOREIGN KEY (`id_menuchinh`) REFERENCES `tbl_menuchinh` (`id_menuchinh`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_nguoidung
-- ----------------------------
DROP TABLE IF EXISTS `tbl_nguoidung`;
CREATE TABLE `tbl_nguoidung` (
  `id_nguoidung` int(11) NOT NULL AUTO_INCREMENT,
  `diachi` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dienthoai` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gioitinh` tinyint(1) DEFAULT NULL,
  `hoten` longtext COLLATE utf8_unicode_ci,
  `id_phanquyen` int(11) NOT NULL,
  `macode_kichhoat` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `macode_matkhau` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `matkhau` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngaysinh` date DEFAULT NULL,
  `ngaytao` datetime DEFAULT NULL,
  `socode_kichhoat` int(11) DEFAULT NULL,
  `socode_matkhau` int(11) DEFAULT NULL,
  `trangthai` int(11) NOT NULL,
  `vitien` decimal(19,2) DEFAULT NULL,
  PRIMARY KEY (`id_nguoidung`),
  UNIQUE KEY `dienthoai` (`dienthoai`),
  KEY `FKEEB7447FFB9505A1` (`id_phanquyen`),
  CONSTRAINT `FKEEB7447FFB9505A1` FOREIGN KEY (`id_phanquyen`) REFERENCES `tbl_phanquyen` (`id_phanquyen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_phanquyen
-- ----------------------------
DROP TABLE IF EXISTS `tbl_phanquyen`;
CREATE TABLE `tbl_phanquyen` (
  `id_phanquyen` int(11) NOT NULL AUTO_INCREMENT,
  `ten_phanquyen` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_phanquyen`),
  UNIQUE KEY `ten_phanquyen` (`ten_phanquyen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_phuongxa
-- ----------------------------
DROP TABLE IF EXISTS `tbl_phuongxa`;
CREATE TABLE `tbl_phuongxa` (
  `id_phuongxa` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `id_quanhuyen` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `id_thanhpho` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `ten_phuongxa` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_phuongxa`,`id_quanhuyen`,`id_thanhpho`),
  KEY `FK4E6EBF556F370B0B` (`id_quanhuyen`,`id_thanhpho`),
  CONSTRAINT `FK4E6EBF556F370B0B` FOREIGN KEY (`id_quanhuyen`, `id_thanhpho`) REFERENCES `tbl_quanhuyen` (`id_quanhuyen`, `id_thanhpho`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_quangcao
-- ----------------------------
DROP TABLE IF EXISTS `tbl_quangcao`;
CREATE TABLE `tbl_quangcao` (
  `id_quangcao` int(11) NOT NULL AUTO_INCREMENT,
  `tieude` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `trangthai` int(11) NOT NULL,
  `urlhinhanh` longtext COLLATE utf8_unicode_ci NOT NULL,
  `urlweb` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_quangcao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_quanhuyen
-- ----------------------------
DROP TABLE IF EXISTS `tbl_quanhuyen`;
CREATE TABLE `tbl_quanhuyen` (
  `id_quanhuyen` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `id_thanhpho` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `ten_quanhuyen` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_quanhuyen`,`id_thanhpho`),
  KEY `FK361D3CC3E413F111` (`id_thanhpho`),
  CONSTRAINT `FK361D3CC3E413F111` FOREIGN KEY (`id_thanhpho`) REFERENCES `tbl_thanhpho` (`id_thanhpho`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_searchdientich
-- ----------------------------
DROP TABLE IF EXISTS `tbl_searchdientich`;
CREATE TABLE `tbl_searchdientich` (
  `id_searchdientich` int(11) NOT NULL AUTO_INCREMENT,
  `loaidientich` float NOT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_searchdientich`),
  UNIQUE KEY `loaidientich` (`loaidientich`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_searchgiatin
-- ----------------------------
DROP TABLE IF EXISTS `tbl_searchgiatin`;
CREATE TABLE `tbl_searchgiatin` (
  `id_searchgiatin` int(11) NOT NULL AUTO_INCREMENT,
  `loaigiatin` decimal(19,2) NOT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_searchgiatin`),
  UNIQUE KEY `loaigiatin` (`loaigiatin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_sophongngu
-- ----------------------------
DROP TABLE IF EXISTS `tbl_sophongngu`;
CREATE TABLE `tbl_sophongngu` (
  `id_sophongngu` int(11) NOT NULL AUTO_INCREMENT,
  `sophongngu` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_sophongngu`),
  UNIQUE KEY `sophongngu` (`sophongngu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_sotang
-- ----------------------------
DROP TABLE IF EXISTS `tbl_sotang`;
CREATE TABLE `tbl_sotang` (
  `id_sotang` int(11) NOT NULL AUTO_INCREMENT,
  `sotang` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_sotang`),
  UNIQUE KEY `sotang` (`sotang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_sotoilet
-- ----------------------------
DROP TABLE IF EXISTS `tbl_sotoilet`;
CREATE TABLE `tbl_sotoilet` (
  `id_sotoilet` int(11) NOT NULL AUTO_INCREMENT,
  `sotoilet` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_sotoilet`),
  UNIQUE KEY `sotoilet` (`sotoilet`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_thanhpho
-- ----------------------------
DROP TABLE IF EXISTS `tbl_thanhpho`;
CREATE TABLE `tbl_thanhpho` (
  `id_thanhpho` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `ten_thanhpho` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `trangthai` int(11) NOT NULL,
  `thutu` int(11) NOT NULL,
  PRIMARY KEY (`id_thanhpho`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbl_thoihantin
-- ----------------------------
DROP TABLE IF EXISTS `tbl_thoihantin`;
CREATE TABLE `tbl_thoihantin` (
  `id_thoihantin` int(11) NOT NULL AUTO_INCREMENT,
  `thoihan` int(11) DEFAULT NULL,
  `trangthai` int(11) NOT NULL,
  PRIMARY KEY (`id_thoihantin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
