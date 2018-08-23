/*
Navicat MySQL Data Transfer

Source Server         : locahost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : realestate

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2018-08-24 00:10:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_user
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `user_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `activation_code` varchar(5) COLLATE utf8_unicode_ci DEFAULT '',
  `activation_code_times` tinyint(1) unsigned DEFAULT '0',
  `capital_amount` int(11) unsigned DEFAULT '0',
  `password_code` varchar(5) COLLATE utf8_unicode_ci DEFAULT '',
  `password_code_times` tinyint(1) unsigned DEFAULT '0',
  `role_id` int(11) NOT NULL,
  `user_address` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `user_birthday` date DEFAULT '0000-00-00',
  `user_email` varchar(50) COLLATE utf8_unicode_ci DEFAULT '',
  `user_gender` tinyint(1) unsigned DEFAULT '0',
  `user_name` varchar(500) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `user_password` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `user_phone` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_phone` (`user_phone`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_user
-- ----------------------------
INSERT INTO `tbl_user` VALUES ('1', '2018-08-23 22:54:03', '', '1', '2018-08-23 22:54:05', '', '', '0', '0', '', '0', '1', '', '0000-00-00', '', '0', 'admin', '', null);
