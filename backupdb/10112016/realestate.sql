/*
Navicat MySQL Data Transfer

Source Server         : play
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : realestate

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2016-10-26 23:14:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_advertisement
-- ----------------------------
DROP TABLE IF EXISTS `tbl_advertisement`;
CREATE TABLE `tbl_advertisement` (
  `advertisement_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `advertisement_image_url` longtext COLLATE utf8_unicode_ci NOT NULL,
  `advertisement_title` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `advertisement_web_url` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`advertisement_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_advertisement
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_balcony_direction
-- ----------------------------
DROP TABLE IF EXISTS `tbl_balcony_direction`;
CREATE TABLE `tbl_balcony_direction` (
  `balcony_direction_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `balcony_direction_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`balcony_direction_id`),
  UNIQUE KEY `balcony_direction_name` (`balcony_direction_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_balcony_direction
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_bathroom
-- ----------------------------
DROP TABLE IF EXISTS `tbl_bathroom`;
CREATE TABLE `tbl_bathroom` (
  `bathroom_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `bathroom_amount` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`bathroom_id`),
  UNIQUE KEY `bathroom_amount` (`bathroom_amount`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_bathroom
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_bedroom
-- ----------------------------
DROP TABLE IF EXISTS `tbl_bedroom`;
CREATE TABLE `tbl_bedroom` (
  `bedroom_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `bedroom_amount` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`bedroom_id`),
  UNIQUE KEY `bedroom_amount` (`bedroom_amount`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_bedroom
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_city
-- ----------------------------
DROP TABLE IF EXISTS `tbl_city`;
CREATE TABLE `tbl_city` (
  `city_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `city_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `city_order` int(11) NOT NULL,
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_city
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_currency_unit
-- ----------------------------
DROP TABLE IF EXISTS `tbl_currency_unit`;
CREATE TABLE `tbl_currency_unit` (
  `currency_unit_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `currency_unit_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`currency_unit_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_currency_unit
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_district
-- ----------------------------
DROP TABLE IF EXISTS `tbl_district`;
CREATE TABLE `tbl_district` (
  `city_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `district_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `district_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`city_id`,`district_id`),
  KEY `FKA1A57AEFC0BC03A1` (`city_id`),
  CONSTRAINT `FKA1A57AEFC0BC03A1` FOREIGN KEY (`city_id`) REFERENCES `tbl_city` (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_district
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_floor
-- ----------------------------
DROP TABLE IF EXISTS `tbl_floor`;
CREATE TABLE `tbl_floor` (
  `floor_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `floor_amount` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`floor_id`),
  UNIQUE KEY `floor_amount` (`floor_amount`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_floor
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_footer_rent_link
-- ----------------------------
DROP TABLE IF EXISTS `tbl_footer_rent_link`;
CREATE TABLE `tbl_footer_rent_link` (
  `footer_rent_link_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `footer_rent_link_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `footer_rent_link_url` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`footer_rent_link_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_footer_rent_link
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_footer_sell_link
-- ----------------------------
DROP TABLE IF EXISTS `tbl_footer_sell_link`;
CREATE TABLE `tbl_footer_sell_link` (
  `footer_sell_link_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `footer_sell_link_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `footer_sell_link_url` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`footer_sell_link_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_footer_sell_link
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_house_direction
-- ----------------------------
DROP TABLE IF EXISTS `tbl_house_direction`;
CREATE TABLE `tbl_house_direction` (
  `house_direction_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `house_direction_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`house_direction_id`),
  UNIQUE KEY `house_direction_name` (`house_direction_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_house_direction
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_housing_type
-- ----------------------------
DROP TABLE IF EXISTS `tbl_housing_type`;
CREATE TABLE `tbl_housing_type` (
  `housing_type_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `land_type_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `housing_type_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`housing_type_id`,`land_type_id`),
  KEY `FK63683D3DA6D5F7F8` (`land_type_id`),
  CONSTRAINT `FK63683D3DA6D5F7F8` FOREIGN KEY (`land_type_id`) REFERENCES `tbl_land_type` (`land_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_housing_type
-- ----------------------------

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

-- ----------------------------
-- Table structure for tbl_post_expiration
-- ----------------------------
DROP TABLE IF EXISTS `tbl_post_expiration`;
CREATE TABLE `tbl_post_expiration` (
  `post_expiration_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `discount` float NOT NULL,
  `post_expiration_name` varchar(10) COLLATE utf8_unicode_ci DEFAULT '',
  `post_expiration_time` tinyint(2) unsigned DEFAULT NULL,
  PRIMARY KEY (`post_expiration_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_post_expiration
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_post_image
-- ----------------------------
DROP TABLE IF EXISTS `tbl_post_image`;
CREATE TABLE `tbl_post_image` (
  `post_image_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `post_specification_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `post_specification_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `post_specification_order` tinyint(2) unsigned NOT NULL,
  `type_image` char(1) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`post_image_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_post_image
-- ----------------------------

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
  `balcony_direction_id` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `bathroom_id` int(11) DEFAULT '0',
  `bedroom_id` int(11) DEFAULT '0',
  `city_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `currency_unit_id` int(11) NOT NULL,
  `district_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `floor_id` int(11) DEFAULT '0',
  `house_direction_id` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `housing_type_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `is_car_access` tinyint(1) unsigned DEFAULT '0',
  `is_private_property` tinyint(1) unsigned DEFAULT '0',
  `is_secure` tinyint(1) unsigned DEFAULT '0',
  `land_area` float NOT NULL,
  `land_price` bigint(19) NOT NULL,
  `land_price_summary` varchar(250) COLLATE utf8_unicode_ci DEFAULT '0',
  `land_type_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `link_youtube` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `post_cost_total` bigint(20) NOT NULL,
  `post_expiration_id` int(11) NOT NULL,
  `post_spec_description` text COLLATE utf8_unicode_ci NOT NULL,
  `post_specification_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `post_type_id` int(11) NOT NULL,
  `street_front` float DEFAULT NULL,
  `street_front_usage` float DEFAULT NULL,
  `street_id` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `user_id` int(11) unsigned NOT NULL,
  `ward_id` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  PRIMARY KEY (`post_specification_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_post_specification
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_post_type
-- ----------------------------
DROP TABLE IF EXISTS `tbl_post_type`;
CREATE TABLE `tbl_post_type` (
  `post_type_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `post_type_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `price` int(11) unsigned NOT NULL,
  PRIMARY KEY (`post_type_id`),
  UNIQUE KEY `post_type_name` (`post_type_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_post_type
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_role
-- ----------------------------
DROP TABLE IF EXISTS `tbl_role`;
CREATE TABLE `tbl_role` (
  `role_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `role_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`role_id`),
  UNIQUE KEY `role_name` (`role_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_role
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_search_land_area
-- ----------------------------
DROP TABLE IF EXISTS `tbl_search_land_area`;
CREATE TABLE `tbl_search_land_area` (
  `search_land_area_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `search_land_area_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `search_land_area_value` float NOT NULL,
  PRIMARY KEY (`search_land_area_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_search_land_area
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_search_land_price
-- ----------------------------
DROP TABLE IF EXISTS `tbl_search_land_price`;
CREATE TABLE `tbl_search_land_price` (
  `search_land_price_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `search_land_price_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `search_land_price_value` bigint(20) NOT NULL,
  PRIMARY KEY (`search_land_price_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_search_land_price
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_street
-- ----------------------------
DROP TABLE IF EXISTS `tbl_street`;
CREATE TABLE `tbl_street` (
  `city_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `district_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `street_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `street_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`city_id`,`district_id`,`street_id`),
  KEY `FKB2BDFBA4B1444DB0` (`city_id`,`district_id`),
  CONSTRAINT `FKB2BDFBA4B1444DB0` FOREIGN KEY (`city_id`, `district_id`) REFERENCES `tbl_district` (`city_id`, `district_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_street
-- ----------------------------

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

-- ----------------------------
-- Table structure for tbl_transaction
-- ----------------------------
DROP TABLE IF EXISTS `tbl_transaction`;
CREATE TABLE `tbl_transaction` (
  `transaction_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `capital_amount` int(11) unsigned DEFAULT '0',
  `transaction_amount` int(11) unsigned DEFAULT '0',
  `transaction_type_id` int(11) unsigned NOT NULL,
  `user_id` int(11) unsigned NOT NULL,
  PRIMARY KEY (`transaction_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_transaction
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_transaction_type
-- ----------------------------
DROP TABLE IF EXISTS `tbl_transaction_type`;
CREATE TABLE `tbl_transaction_type` (
  `transaction_type_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `transaction_type_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`transaction_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_transaction_type
-- ----------------------------

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
  `user_name` varchar(500) COLLATE utf8_unicode_ci DEFAULT '',
  `user_password` varchar(250) COLLATE utf8_unicode_ci DEFAULT '',
  `user_phone` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_phone` (`user_phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_user
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_ward
-- ----------------------------
DROP TABLE IF EXISTS `tbl_ward`;
CREATE TABLE `tbl_ward` (
  `city_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `district_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `ward_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `ward_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`city_id`,`district_id`,`ward_id`),
  KEY `FKFE8B25DB1444DB0` (`city_id`,`district_id`),
  CONSTRAINT `FKFE8B25DB1444DB0` FOREIGN KEY (`city_id`, `district_id`) REFERENCES `tbl_district` (`city_id`, `district_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_ward
-- ----------------------------
