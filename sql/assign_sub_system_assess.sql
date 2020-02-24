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
-- Table structure for table `assess`
--

DROP TABLE IF EXISTS `assess`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assess` (
  `assesId` int(32) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `content` varchar(100) NOT NULL,
  `showDate` datetime NOT NULL,
  `idenCode` varchar(45) NOT NULL,
  `deadline` datetime NOT NULL,
  PRIMARY KEY (`assesId`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assess`
--

LOCK TABLES `assess` WRITE;
/*!40000 ALTER TABLE `assess` DISABLE KEYS */;
INSERT INTO `assess` VALUES (1,'高数期中考测试','高速退学oh0231no!','2020-02-09 18:47:54','aaa','2020-02-11 17:17:10'),(2,'c++小测','干蛤嘞？','2020-02-12 22:46:11','bbb','2020-02-20 23:59:59'),(3,'新概念英语da!','000','2020-02-09 23:04:20','ccc','2020-02-13 22:01:30'),(4,'概率论网课','喵喵喵？？？？？？','2020-02-10 17:50:05','ddd','2020-03-15 10:11:12'),(5,'离散第二周小测','母鸡啊啊啊','2020-02-10 18:11:06','eee','2020-03-02 11:11:11'),(14,'Heaven Knows','you know','2020-02-12 22:50:05','999','2020-06-04 02:03:05'),(18,'要开学了','好悲伤啊','2020-02-22 13:51:38','rrr','2020-03-01 01:01:01'),(19,'喵呜','25146','2020-02-23 17:45:15','ttt','2020-03-01 02:02:02');
/*!40000 ALTER TABLE `assess` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-25  0:28:31
