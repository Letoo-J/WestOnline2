-- MySQL dump 10.13  Distrib 5.7.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: assign_sub_system
-- ------------------------------------------------------
-- Server version	5.7.22-log

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
-- Table structure for table `assignmentlist`
--

DROP TABLE IF EXISTS `assignmentlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assignmentlist` (
  `subId` int(32) NOT NULL AUTO_INCREMENT,
  `sID` varchar(45) NOT NULL,
  `sName` varchar(45) NOT NULL,
  `subDate` datetime NOT NULL,
  `idenCode` varchar(45) NOT NULL,
  `document` varchar(100) NOT NULL,
  `review` varchar(45) NOT NULL,
  PRIMARY KEY (`subId`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignmentlist`
--

LOCK TABLES `assignmentlist` WRITE;
/*!40000 ALTER TABLE `assignmentlist` DISABLE KEYS */;
INSERT INTO `assignmentlist` VALUES (23,'221801431','cxx','2020-02-17 20:23:25','aaa','99996666.zip','未通过'),(24,'031801122','whowhowho','2020-02-17 20:26:03','aaa','牛皮啊.zip','未通过'),(25,'666601529','space','2020-02-17 20:26:49','aaa','牛皮啊.zip','审核中'),(26,'221801431','cxx','2020-02-17 20:27:16','ccc','多线程代码.zip','未通过'),(27,'221801431','cxx','2020-02-17 20:27:31','ccc','99996666.zip','审核中'),(28,'511502626','bananaFish','2020-02-17 20:29:06','bbb','牛皮啊.zip','审核中'),(29,'511502626','bananaFish','2020-02-17 20:29:35','eee','99996666.zip','通过'),(36,'221801444','ereg','2020-02-23 16:19:38','aaa','99996666.zip','审核中'),(37,'221801444','ereg','2020-02-23 17:45:00','aaa','99996666.zip','审核中'),(38,'221801431','cxx','2020-02-24 21:10:45','bbb','99996666.zip','审核中'),(41,'221801444','weare','2020-02-24 21:37:01','ccc','F:/assignment_upload/7e2c457e-96ff-4429-8033-61f984ad38a7aaa.zip','审核中');
/*!40000 ALTER TABLE `assignmentlist` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-25  0:28:32
