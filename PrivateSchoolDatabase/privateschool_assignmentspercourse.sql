CREATE DATABASE  IF NOT EXISTS `privateschool` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `privateschool`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: privateschool
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `assignmentspercourse`
--

DROP TABLE IF EXISTS `assignmentspercourse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assignmentspercourse` (
  `AssPerCourse_ID` int NOT NULL AUTO_INCREMENT,
  `Assignment` int NOT NULL,
  `AssCourse` int NOT NULL,
  PRIMARY KEY (`AssPerCourse_ID`),
  KEY `AssCourse1_idx` (`Assignment`),
  KEY `AssCourse2_idx` (`AssCourse`),
  CONSTRAINT `AssCourse1` FOREIGN KEY (`Assignment`) REFERENCES `assignments` (`Assignment_ID`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `AssCourse2` FOREIGN KEY (`AssCourse`) REFERENCES `courses` (`Course_ID`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=241 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignmentspercourse`
--

LOCK TABLES `assignmentspercourse` WRITE;
/*!40000 ALTER TABLE `assignmentspercourse` DISABLE KEYS */;
INSERT INTO `assignmentspercourse` VALUES (1,1,1),(2,2,1),(3,3,1),(4,4,1),(5,5,1),(6,6,1),(7,7,1),(8,8,1),(9,1,2),(10,2,2),(11,3,2),(12,4,2),(13,5,2),(14,6,2),(15,7,2),(16,8,2),(17,1,3),(18,2,3),(19,3,3),(20,4,3),(21,5,3),(22,6,3),(23,7,3),(24,8,3),(25,1,4),(26,2,4),(27,3,4),(28,4,4),(29,5,4),(30,6,4),(31,7,4),(32,8,4),(33,1,5),(34,2,5),(35,3,5),(36,4,5),(37,5,5),(38,6,5),(39,7,5),(40,8,5),(41,1,6),(42,2,6),(43,3,6),(44,4,6),(45,5,6),(46,6,6),(47,7,6),(48,8,6),(49,1,7),(50,2,7),(51,3,7),(52,4,7),(53,5,7),(54,6,7),(55,7,7),(56,8,7),(57,1,8),(58,2,8),(59,3,8),(60,4,8),(61,5,8),(62,6,8),(63,7,8),(64,8,8),(65,1,9),(66,2,9),(67,3,9),(68,4,9),(69,5,9),(70,6,9),(71,7,9),(72,8,9),(73,1,10),(74,2,10),(75,3,10),(76,4,10),(77,5,10),(78,6,10),(79,7,10),(80,8,10),(81,1,11),(82,2,11),(83,3,11),(84,4,11),(85,5,11),(86,6,11),(87,7,11),(88,8,11),(89,1,12),(90,2,12),(91,3,12),(92,4,12),(93,5,12),(94,6,12),(95,7,12),(96,8,12),(97,1,13),(98,2,13),(99,3,13),(100,4,13),(101,5,13),(102,6,13),(103,7,13),(104,8,13),(105,1,14),(106,2,14),(107,3,14),(108,4,14),(109,5,14),(110,6,14),(111,7,14),(112,8,14),(113,1,15),(114,2,15),(115,3,15),(116,4,15),(117,5,15),(118,6,15),(119,7,15),(120,8,15),(121,1,16),(122,2,16),(123,3,16),(124,4,16),(125,5,16),(126,6,16),(127,7,16),(128,8,16),(129,1,17),(130,2,17),(131,3,17),(132,4,17),(133,5,17),(134,6,17),(135,7,17),(136,8,17),(137,1,18),(138,2,18),(139,3,18),(140,4,18),(141,5,18),(142,6,18),(143,7,18),(144,8,18),(145,1,19),(146,2,19),(147,3,19),(148,4,19),(149,5,19),(150,6,19),(151,7,19),(152,8,19),(153,1,20),(154,2,20),(155,3,20),(156,4,20),(157,5,20),(158,6,20),(159,7,20),(160,8,20),(161,1,21),(162,2,21),(163,3,21),(164,4,21),(165,5,21),(166,6,21),(167,7,21),(168,8,21),(169,1,22),(170,2,22),(171,3,22),(172,4,22),(173,5,22),(174,6,22),(175,7,22),(176,8,22),(177,1,23),(178,2,23),(179,3,23),(180,4,23),(181,5,23),(182,6,23),(183,7,23),(184,8,23),(185,1,24),(186,2,24),(187,3,24),(188,4,24),(189,5,24),(190,6,24),(191,7,24),(192,8,24),(193,1,25),(194,2,25),(195,3,25),(196,4,25),(197,5,25),(198,6,25),(199,7,25),(200,8,25),(201,1,26),(202,2,26),(203,3,26),(204,4,26),(205,5,26),(206,6,26),(207,7,26),(208,8,26),(209,1,27),(210,2,27),(211,3,27),(212,4,27),(213,5,27),(214,6,27),(215,7,27),(216,8,27),(217,1,28),(218,2,28),(219,3,28),(220,4,28),(221,5,28),(222,6,28),(223,7,28),(224,8,28),(225,1,29),(226,2,29),(227,3,29),(228,4,29),(229,5,29),(230,6,29),(231,7,29),(232,8,29),(233,1,30),(234,2,30),(235,3,30),(236,4,30),(237,5,30),(238,6,30),(239,7,30),(240,8,30);
/*!40000 ALTER TABLE `assignmentspercourse` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-07 23:33:54
