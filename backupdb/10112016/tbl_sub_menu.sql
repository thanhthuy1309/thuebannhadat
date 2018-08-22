/*
Navicat MySQL Data Transfer

Source Server         : locahost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : realestate

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2018-08-22 23:31:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_sub_menu
-- ----------------------------
DROP TABLE IF EXISTS `tbl_sub_menu`;
CREATE TABLE `tbl_sub_menu` (
  `main_menu_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `sub_menu_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `sub_menu_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `sub_menu_order` tinyint(2) unsigned NOT NULL,
  `sub_menu_url` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`main_menu_id`,`sub_menu_id`),
  KEY `FK14753F5F7F25AC74` (`main_menu_id`),
  CONSTRAINT `FK14753F5F7F25AC74` FOREIGN KEY (`main_menu_id`) REFERENCES `tbl_main_menu` (`main_menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_sub_menu
-- ----------------------------
INSERT INTO `tbl_sub_menu` VALUES ('ban', 'chung-cu', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Chung Cư', '5', 'chung-cu');
INSERT INTO `tbl_sub_menu` VALUES ('ban', 'nguoi-co-thu-nhap-thap', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Người Có  Thu Nhập Thấp', '6', 'nguoi-co-thu-nhap-thap');
INSERT INTO `tbl_sub_menu` VALUES ('ban', 'nha-moi-xay', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Mới Xây', '4', 'nha-moi-xay');
INSERT INTO `tbl_sub_menu` VALUES ('ban', 'nha-nat', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Nát', '2', 'nha-nat');
INSERT INTO `tbl_sub_menu` VALUES ('ban', 'nha-pho', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Phố', '1', 'nha-pho');
INSERT INTO `tbl_sub_menu` VALUES ('ban', 'nha-trong-hem', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Trong Hẻm', '3', 'nha-trong-hem');
INSERT INTO `tbl_sub_menu` VALUES ('ban', 'tat-ca', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Tất Cả', '7', 'tat-ca');
INSERT INTO `tbl_sub_menu` VALUES ('cho-thue', 'chung-cu', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Chung Cư', '5', 'chung-cu');
INSERT INTO `tbl_sub_menu` VALUES ('cho-thue', 'nguoi-co-thu-nhap-thap', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Người Có  Thu Nhập Thấp', '6', 'nguoi-co-thu-nhap-thap');
INSERT INTO `tbl_sub_menu` VALUES ('cho-thue', 'nha-moi-xay', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Mới Xây', '4', 'nha-moi-xay');
INSERT INTO `tbl_sub_menu` VALUES ('cho-thue', 'nha-nat', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Nát', '2', 'nha-nat');
INSERT INTO `tbl_sub_menu` VALUES ('cho-thue', 'nha-pho', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Phố', '1', 'nha-pho');
INSERT INTO `tbl_sub_menu` VALUES ('cho-thue', 'nha-trong-hem', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Trong Hẻm', '3', 'nha-trong-hem');
INSERT INTO `tbl_sub_menu` VALUES ('cho-thue', 'tat-ca', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Tất Cả', '7', 'tat-ca');
INSERT INTO `tbl_sub_menu` VALUES ('dich-vu-moi-gioi', 'doanh-nghiep', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Doanh Nghiệp', '1', 'doanh-nghiep');
INSERT INTO `tbl_sub_menu` VALUES ('dich-vu-moi-gioi', 'nguoi-moi-gioi', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Người Môi Giới', '2', 'nguoi-moi-gioi');
INSERT INTO `tbl_sub_menu` VALUES ('du-an', 'chung-cu', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Chung Cư', '5', 'chung-cu');
INSERT INTO `tbl_sub_menu` VALUES ('du-an', 'nguoi-co-thu-nhap-thap', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Người Có  Thu Nhập Thấp', '6', 'nguoi-co-thu-nhap-thap');
INSERT INTO `tbl_sub_menu` VALUES ('du-an', 'nha-moi-xay', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Mới Xây', '4', 'nha-moi-xay');
INSERT INTO `tbl_sub_menu` VALUES ('du-an', 'nha-nat', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Nát', '2', 'nha-nat');
INSERT INTO `tbl_sub_menu` VALUES ('du-an', 'nha-pho', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Phố', '1', 'nha-pho');
INSERT INTO `tbl_sub_menu` VALUES ('du-an', 'nha-trong-hem', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Trong Hẻm', '3', 'nha-trong-hem');
INSERT INTO `tbl_sub_menu` VALUES ('du-an', 'tat-ca', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Tất Cả', '7', 'tat-ca');
INSERT INTO `tbl_sub_menu` VALUES ('mua', 'chung-cu', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Chung Cư', '5', 'chung-cu');
INSERT INTO `tbl_sub_menu` VALUES ('mua', 'nguoi-co-thu-nhap-thap', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Người Có  Thu Nhập Thấp', '6', 'nguoi-co-thu-nhap-thap');
INSERT INTO `tbl_sub_menu` VALUES ('mua', 'nha-moi-xay', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Mới Xây', '4', 'nha-moi-xay');
INSERT INTO `tbl_sub_menu` VALUES ('mua', 'nha-nat', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Nát', '2', 'nha-nat');
INSERT INTO `tbl_sub_menu` VALUES ('mua', 'nha-pho', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Phố', '1', 'nha-pho');
INSERT INTO `tbl_sub_menu` VALUES ('mua', 'nha-trong-hem', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Trong Hẻm', '3', 'nha-trong-hem');
INSERT INTO `tbl_sub_menu` VALUES ('mua', 'tat-ca', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Tất Cả', '7', 'tat-ca');
INSERT INTO `tbl_sub_menu` VALUES ('the-chap', 'chung-cu', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Chung Cư', '5', 'chung-cu');
INSERT INTO `tbl_sub_menu` VALUES ('the-chap', 'nguoi-co-thu-nhap-thap', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Người Có  Thu Nhập Thấp', '6', 'nguoi-co-thu-nhap-thap');
INSERT INTO `tbl_sub_menu` VALUES ('the-chap', 'nha-moi-xay', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Mới Xây', '4', 'nha-moi-xay');
INSERT INTO `tbl_sub_menu` VALUES ('the-chap', 'nha-nat', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Nát', '2', 'nha-nat');
INSERT INTO `tbl_sub_menu` VALUES ('the-chap', 'nha-pho', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Phố', '1', 'nha-pho');
INSERT INTO `tbl_sub_menu` VALUES ('the-chap', 'nha-trong-hem', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Nhà Trong Hẻm', '3', 'nha-trong-hem');
INSERT INTO `tbl_sub_menu` VALUES ('the-chap', 'tat-ca', '2018-08-22 21:00:29', '', '1', '2018-08-22 21:00:34', '', 'Tất Cả', '7', 'tat-ca');
