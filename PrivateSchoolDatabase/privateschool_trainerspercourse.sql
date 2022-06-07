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
-- Table structure for table `trainerspercourse`
--

DROP TABLE IF EXISTS `trainerspercourse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trainerspercourse` (
  `TrPerCourse_ID` int NOT NULL AUTO_INCREMENT,
  `Trainer` int NOT NULL,
  `TrCourse` int NOT NULL,
  PRIMARY KEY (`TrPerCourse_ID`),
  KEY `TrCourse1_idx` (`Trainer`),
  KEY `TrCourse2_idx` (`TrCourse`),
  CONSTRAINT `TrCourse1` FOREIGN KEY (`Trainer`) REFERENCES `trainers` (`Trainer_ID`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `TrCourse2` FOREIGN KEY (`TrCourse`) REFERENCES `courses` (`Course_ID`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trainerspercourse`
--

LOCK TABLES `trainerspercourse` WRITE;
/*!40000 ALTER TABLE `trainerspercourse` DISABLE KEYS */;
INSERT INTO `trainerspercourse` VALUES (1,1,1),(2,2,1),(3,3,4),(4,4,4),(5,5,2),(6,6,2),(7,7,5),(8,8,5),(9,9,3),(10,10,3),(11,11,6),(12,12,6),(13,1,7),(14,2,7),(15,3,10),(16,4,10),(17,5,8),(18,6,8),(19,7,11),(20,8,11),(21,9,9),(22,10,9),(23,11,12),(24,12,12),(25,1,13),(26,2,13),(27,3,16),(28,4,16),(29,5,14),(30,6,14),(31,7,17),(32,8,17),(33,9,15),(34,10,15),(35,11,18),(36,12,18),(37,1,19),(38,2,19),(39,3,22),(40,4,22),(41,5,20),(42,6,20),(43,7,23),(44,8,23),(45,9,21),(46,10,21),(47,11,24),(48,12,24),(49,1,25),(50,2,25),(51,3,28),(52,4,28),(53,5,26),(54,6,26),(55,7,29),(56,8,29),(57,9,27),(58,10,27),(59,11,30),(60,12,30);
/*!40000 ALTER TABLE `trainerspercourse` ENABLE KEYS */;
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
