/*
Navicat MySQL Data Transfer

Source Server         : locahost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : realestate

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2018-09-06 21:52:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_post_specification
-- ----------------------------
DROP TABLE IF EXISTS `tbl_post_specification`;
CREATE TABLE `tbl_post_specification` (
  `post_specification_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `address` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `city_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `district_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `ward_id` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `street_id` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `bathroom` int(11) DEFAULT '0',
  `bedroom` int(11) DEFAULT '0',
  `floor` int(11) DEFAULT '0',
  `house_direction_id` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `housing_type_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `land_area` float NOT NULL,
  `land_price` bigint(19) NOT NULL,
  `land_price_summary` varchar(250) COLLATE utf8_unicode_ci DEFAULT '0',
  `land_type_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `post_cost_total` bigint(20) NOT NULL,
  `currency_unit_id` int(11) NOT NULL,
  `post_expiration_id` int(11) NOT NULL,
  `post_spec_description` text COLLATE utf8_unicode_ci NOT NULL,
  `post_specification_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `post_type_id` int(11) NOT NULL,
  `street_front` float DEFAULT NULL,
  `street_front_usage` float DEFAULT NULL,
  `link_youtube` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `user_id` int(11) unsigned NOT NULL,
  PRIMARY KEY (`post_specification_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_post_specification
-- ----------------------------
INSERT INTO `tbl_post_specification` VALUES ('nha-mat-tien-pho-a', '2018-09-06 21:42:23', '', '1', '2018-09-06 21:42:27', '', '108', 'ho-chi-minh', 'binh-tan', 'tan-tao', 'le-dinh-can', '0', '0', '0', '', '', '0', '0', '0', '', '0', '0', '0', '', '', '0', null, null, '', '0');
