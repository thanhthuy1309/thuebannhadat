/*
Navicat MySQL Data Transfer

Source Server         : locahost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : realestate

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2018-08-24 00:10:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_notification
-- ----------------------------
DROP TABLE IF EXISTS `tbl_notification`;
CREATE TABLE `tbl_notification` (
  `notification_id` int(11) NOT NULL AUTO_INCREMENT,
  `notification_title` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `notification_content` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  PRIMARY KEY (`notification_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_notification
-- ----------------------------
INSERT INTO `tbl_notification` VALUES ('1', '[Lorem Ipsum1] is simply dummy text of the printing and typesetting industry', '[Lorem Ipsum1] is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s', '1', '2018-08-23 22:56:11', '', '1', '2018-08-23 22:56:15', '');
INSERT INTO `tbl_notification` VALUES ('2', '[Lorem Ipsum2] is simply dummy text of the printing and typesetting industry', '[Lorem Ipsum2] is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s', '1', '0000-00-00 00:00:00', '', '1', '2018-08-23 22:57:44', '');
INSERT INTO `tbl_notification` VALUES ('3', '[Lorem Ipsum3] is simply dummy text of the printing and typesetting industry', '[Lorem Ipsum3] is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s', '1', '2018-08-23 22:57:33', '', '1', '2018-08-23 22:57:47', '');
