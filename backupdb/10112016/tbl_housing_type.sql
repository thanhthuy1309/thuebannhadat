/*
Navicat MySQL Data Transfer

Source Server         : locahost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : realestate

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2018-08-24 00:09:54
*/

SET FOREIGN_KEY_CHECKS=0;

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
INSERT INTO `tbl_housing_type` VALUES ('ban-biet-thu-lien-ke', 'nha-dat-ban', '2018-08-23 20:55:12', '', '1', '2018-08-23 20:55:16', '', 'Bán biệt thự, liền kề');
INSERT INTO `tbl_housing_type` VALUES ('ban-can-ho-chung-cu', 'nha-dat-ban', '2018-08-23 20:55:45', '', '1', '2018-08-23 20:55:47', '', 'Bán căn hộ chung cư');
INSERT INTO `tbl_housing_type` VALUES ('ban-dat', 'nha-dat-ban', '2018-08-23 21:01:06', '', '1', '2018-08-23 21:01:51', '', 'Bán đất');
INSERT INTO `tbl_housing_type` VALUES ('ban-dat-nen', 'nha-dat-ban', '2018-08-23 21:01:11', '', '1', '2018-08-23 21:01:56', '', 'Tất cả các loại đất bán');
INSERT INTO `tbl_housing_type` VALUES ('ban-dat-nen-du-an', 'nha-dat-ban', '2018-08-23 21:01:14', '', '1', '2018-08-23 21:01:59', '', 'Bán đất nề dự án');
INSERT INTO `tbl_housing_type` VALUES ('ban-nha-dat', 'nha-dat-ban', '2018-08-23 21:01:16', '', '1', '2018-08-23 21:02:02', '', 'Tất cả các loại nhà bán');
INSERT INTO `tbl_housing_type` VALUES ('ban-nha-kho-xuong', 'nha-dat-ban', '2018-08-23 21:01:18', '', '1', '2018-08-23 21:02:04', '', 'Bán kho, nhà xưởng');
INSERT INTO `tbl_housing_type` VALUES ('ban-nha-mat-pho', 'nha-dat-ban', '2018-08-23 21:01:21', '', '1', '2018-08-23 21:02:07', '', 'Bán nhà mặt phố');
INSERT INTO `tbl_housing_type` VALUES ('ban-nha-rieng', 'nha-dat-ban', '2018-08-23 21:01:24', '', '1', '2018-08-23 21:02:10', '', 'Bán nhà riêng');
INSERT INTO `tbl_housing_type` VALUES ('ban-trang-trai-khu-nghi-duong', 'nha-dat-ban', '2018-08-23 21:01:26', '', '1', '2018-08-23 21:02:13', '', 'Bán trang trại, khu nghĩ dưỡng');
INSERT INTO `tbl_housing_type` VALUES ('bat-dong-san-khac', 'nha-dat-ban', '2018-08-23 21:01:34', '', '1', '2018-08-23 21:02:15', '', 'Bán loại bất động sản khác');
INSERT INTO `tbl_housing_type` VALUES ('cho-thue-can-ho-chung-cu', 'nha-dat-cho-thue', '2018-08-23 21:01:04', '', '1', '2018-08-23 21:02:17', '', 'Cho thuê căn hộ chung cư');
INSERT INTO `tbl_housing_type` VALUES ('cho-thue-cua-hang-ki-ot', 'nha-dat-cho-thue', '2018-08-23 21:05:14', '', '1', '2018-08-23 21:05:18', '', 'Cho thuê cửa hàng, ki ốt');
INSERT INTO `tbl_housing_type` VALUES ('cho-thue-kho-nha-xuong-dat', 'nha-dat-cho-thue', '2018-08-23 21:05:58', '', '1', '2018-08-23 21:06:01', '', 'Cho thuê kho, nhà xưởng, đất');
INSERT INTO `tbl_housing_type` VALUES ('cho-thue-loai-bat-dong-san-khac', 'nha-dat-cho-thue', '2018-08-23 21:06:52', '', '1', '2018-08-23 21:06:55', '', 'Cho thuê loại bất động sản khác');
INSERT INTO `tbl_housing_type` VALUES ('cho-thue-nha-mat-pho', 'nha-dat-cho-thue', '2018-08-23 21:03:24', '', '1', '2018-08-23 21:03:29', '', 'Cho thuê nhà mặt phố');
INSERT INTO `tbl_housing_type` VALUES ('cho-thue-nha-rieng', 'nha-dat-cho-thue', '2018-08-23 21:03:00', '', '1', '2018-08-23 21:03:02', '', 'Cho thuê nhà riêng');
INSERT INTO `tbl_housing_type` VALUES ('cho-thue-nha-tro', 'nha-dat-cho-thue', '2018-08-23 21:04:00', '', '1', '2018-08-23 21:04:02', '', 'Cho thuê nhà trọ, phòng trọ');
INSERT INTO `tbl_housing_type` VALUES ('cho-thue-van-phong', 'nha-dat-cho-thue', '2018-08-23 21:04:28', '', '1', '2018-08-23 21:04:32', '', 'Cho thuê văn phòng');
