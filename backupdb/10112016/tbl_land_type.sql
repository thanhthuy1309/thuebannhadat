/*
Navicat MySQL Data Transfer

Source Server         : locahost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : realestate

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2018-08-24 00:10:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_land_type
-- ----------------------------
DROP TABLE IF EXISTS `tbl_land_type`;
CREATE TABLE `tbl_land_type` (
  `land_type_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `land_type_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`land_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_land_type
-- ----------------------------
INSERT INTO `tbl_land_type` VALUES ('nha-dat-ban', '2018-08-23 20:54:01', '', '1', '2018-08-23 21:53:53', '', 'Bán');
INSERT INTO `tbl_land_type` VALUES ('nha-dat-cho-thue', '2018-08-23 20:54:06', '', '1', '2018-08-23 21:53:56', '', 'Cho thuê');
