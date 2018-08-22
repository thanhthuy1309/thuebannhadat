/*
Navicat MySQL Data Transfer

Source Server         : locahost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : realestate

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2018-08-22 23:31:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_main_menu
-- ----------------------------
DROP TABLE IF EXISTS `tbl_main_menu`;
CREATE TABLE `tbl_main_menu` (
  `main_menu_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `main_menu_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `main_menu_order` tinyint(2) unsigned NOT NULL,
  `main_menu_url` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`main_menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_main_menu
-- ----------------------------
INSERT INTO `tbl_main_menu` VALUES ('ban', '2018-08-22 21:08:21', '', '0', '2018-08-22 21:08:26', '', 'Bán', '3', 'ban');
INSERT INTO `tbl_main_menu` VALUES ('cho-thue', '2018-08-22 20:50:38', '', '1', '2018-08-22 22:41:19', '', 'Cho Thuê', '4', 'cho-thue');
INSERT INTO `tbl_main_menu` VALUES ('dich-vu-moi-gioi', '2018-08-22 20:50:38', '', '1', '2018-08-22 22:41:30', '', 'Dịch Vụ Môi Giới', '7', 'dich-vu-moi-gioi');
INSERT INTO `tbl_main_menu` VALUES ('du-an', '2018-08-22 20:50:38', '', '1', '2018-08-22 22:41:26', '', 'Dự Án', '6', 'du-an');
INSERT INTO `tbl_main_menu` VALUES ('lien-he', '2018-08-22 20:50:38', '', '1', '2018-08-22 22:41:36', '', 'Liên Hệ', '9', 'lien-he');
INSERT INTO `tbl_main_menu` VALUES ('mua', '2018-08-22 20:50:38', '', '1', '2018-08-22 22:41:11', '', 'Mua', '2', 'mua');
INSERT INTO `tbl_main_menu` VALUES ('the-chap', '2018-08-22 20:50:38', '', '1', '2018-08-22 22:41:22', '', 'Thế Chấp', '5', 'the-chap');
INSERT INTO `tbl_main_menu` VALUES ('tin-tuc', '2018-08-22 20:50:38', '', '1', '2018-08-22 22:41:34', '', 'Tin Tức', '8', 'tin-tuc');
