-- MySQL dump 10.13  Distrib 5.7.12, for linux-glibc2.5 (x86_64)
--
-- Host: localhost    Database: realestate
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.25-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_category_land`
--

DROP TABLE IF EXISTS `tbl_category_land`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_category_land` (
  `catagory_salse_id` varchar(250) NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) DEFAULT '',
  `catagory_salse_name` varchar(250) NOT NULL,
  `category_type_id` varchar(250) NOT NULL,
  PRIMARY KEY (`catagory_salse_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_category_land`
--

LOCK TABLES `tbl_category_land` WRITE;
/*!40000 ALTER TABLE `tbl_category_land` DISABLE KEYS */;
INSERT INTO `tbl_category_land` VALUES ('ban-biet-thu-lien-ke','2018-08-22 14:00:29','',0,'0000-00-00 00:00:00','','Bán biệt thự, liền kề','nha-dat-ban'),('ban-can-ho-chung-cu','2018-08-22 14:00:29','',0,'0000-00-00 00:00:00','','Bán căn hộ chung cư','nha-dat-ban'),('ban-dat','2018-08-22 14:00:29','',0,'0000-00-00 00:00:00','','Bán đất','nha-dat-ban'),('ban-dat-nen','2018-08-22 14:00:29','',0,'0000-00-00 00:00:00','','Tất cả các loại đất bán','nha-dat-ban'),('ban-dat-nen-du-an','2018-08-22 14:00:29','',0,'0000-00-00 00:00:00','','Bán đất nề dự án','nha-dat-ban'),('ban-nha-dat','2018-08-22 14:00:29','',0,'0000-00-00 00:00:00','','Tất cả các loại nhà bán','nha-dat-ban'),('ban-nha-kho-xuong','2018-08-22 14:00:29','',0,'0000-00-00 00:00:00','','Bán kho, nhà xưởng','nha-dat-ban'),('ban-nha-mat-pho','2018-08-22 14:00:29','',0,'0000-00-00 00:00:00','','Bán nhà mặt phố','nha-dat-ban'),('ban-nha-rieng','2018-08-22 14:00:29','',0,'0000-00-00 00:00:00','','Bán nhà riêng','nha-dat-ban'),('ban-trang-trai-khu-nghi-duong','2018-08-22 14:00:29','',0,'0000-00-00 00:00:00','','Bán trang trại, khu nghĩ dưỡng','nha-dat-ban'),('bat-dong-san-khac','2018-08-22 14:00:29','',0,'0000-00-00 00:00:00','','Bất động sản khác','nha-dat-ban');
/*!40000 ALTER TABLE `tbl_category_land` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_category_type`
--

DROP TABLE IF EXISTS `tbl_category_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_category_type` (
  `category_type_id` varchar(250) NOT NULL,
  `category_type_name` varchar(250) NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(250) DEFAULT '',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_user` varchar(250) DEFAULT '',
  PRIMARY KEY (`category_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_category_type`
--

LOCK TABLES `tbl_category_type` WRITE;
/*!40000 ALTER TABLE `tbl_category_type` DISABLE KEYS */;
INSERT INTO `tbl_category_type` VALUES ('nha-dat-ban','Nhà đất bán','2018-08-22 14:00:29','',1,'0000-00-00 00:00:00',''),('nha-dat-cho-thue','Nhà đất cho thuê','2018-08-22 14:00:29','',1,'0000-00-00 00:00:00','');
/*!40000 ALTER TABLE `tbl_category_type` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-23 17:41:48
