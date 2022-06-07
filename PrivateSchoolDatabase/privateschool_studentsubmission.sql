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
-- Table structure for table `studentsubmission`
--

DROP TABLE IF EXISTS `studentsubmission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentsubmission` (
  `StudSub_ID` int NOT NULL AUTO_INCREMENT,
  `StudentSub` int NOT NULL,
  `AssSub` int NOT NULL,
  `OralMark` decimal(5,2) DEFAULT NULL,
  `WrittenMark` decimal(5,2) DEFAULT NULL,
  `SubDateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`StudSub_ID`),
  KEY `StudentSub1_idx` (`StudentSub`),
  KEY `StudentSub2_idx` (`AssSub`),
  CONSTRAINT `StudentSub1` FOREIGN KEY (`StudentSub`) REFERENCES `students` (`Student_ID`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `StudentSub2` FOREIGN KEY (`AssSub`) REFERENCES `assignments` (`Assignment_ID`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=305 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentsubmission`
--

LOCK TABLES `studentsubmission` WRITE;
/*!40000 ALTER TABLE `studentsubmission` DISABLE KEYS */;
INSERT INTO `studentsubmission` VALUES (1,1,1,16.64,46.62,'2020-06-01 00:00:00'),(2,2,2,18.64,26.05,'2020-06-27 00:00:00'),(3,3,3,17.69,72.50,'2020-07-20 00:00:00'),(4,4,4,0.87,10.88,'2020-08-07 00:00:00'),(5,5,5,18.31,74.20,'2020-06-08 00:00:00'),(6,6,6,11.53,42.23,'2020-07-24 00:00:00'),(7,7,7,7.20,47.59,'2020-07-04 00:00:00'),(8,8,8,19.77,67.47,'2020-08-10 00:00:00'),(9,9,8,19.25,36.25,'2020-07-23 00:00:00'),(10,10,8,3.27,29.10,'2020-05-22 00:00:00'),(11,11,1,14.12,4.94,'2020-05-18 00:00:00'),(12,12,1,16.57,37.07,'2020-06-02 00:00:00'),(13,13,1,18.29,2.99,'2020-06-19 00:00:00'),(14,14,2,1.01,34.18,'2020-05-28 00:00:00'),(15,15,3,17.37,40.24,'2020-05-20 00:00:00'),(16,16,4,9.90,1.94,'2020-06-28 00:00:00'),(17,17,5,10.82,9.65,'2020-08-23 00:00:00'),(18,18,6,2.68,2.34,'2020-06-16 00:00:00'),(19,19,7,17.97,12.01,'2020-08-09 00:00:00'),(20,20,8,2.21,6.97,'2020-08-09 00:00:00'),(21,21,1,0.97,19.62,'2020-05-18 00:00:00'),(22,22,2,14.71,17.81,'2020-07-23 00:00:00'),(23,23,3,2.14,42.78,'2020-05-07 00:00:00'),(24,24,3,9.32,76.86,'2020-07-12 00:00:00'),(25,25,4,5.53,51.50,'2020-08-17 00:00:00'),(26,26,5,3.79,37.83,'2020-07-11 00:00:00'),(27,27,6,18.52,12.39,'2020-05-08 00:00:00'),(28,28,7,17.66,44.12,'2020-07-08 00:00:00'),(29,29,8,0.60,70.01,'2020-07-29 00:00:00'),(30,30,3,6.73,7.62,'2020-06-03 00:00:00'),(31,31,1,14.70,66.58,'2020-08-19 00:00:00'),(32,32,2,1.08,32.83,'2020-06-11 00:00:00'),(33,33,3,6.75,13.66,'2020-05-03 00:00:00'),(34,34,4,16.38,40.33,'2020-05-29 00:00:00'),(35,35,4,18.22,24.22,'2020-06-02 00:00:00'),(36,36,5,1.77,65.43,'2020-04-24 00:00:00'),(37,37,5,0.18,30.08,'2020-04-19 00:00:00'),(38,38,6,8.52,75.10,'2020-04-22 00:00:00'),(39,39,7,0.32,68.27,'2020-09-03 00:00:00'),(40,40,8,19.17,46.09,'2020-09-01 00:00:00'),(41,41,1,17.81,15.14,'2020-05-30 00:00:00'),(42,42,2,17.55,30.47,'2020-04-12 00:00:00'),(43,43,3,16.84,37.45,'2020-09-02 00:00:00'),(44,44,4,9.17,75.13,'2020-03-16 00:00:00'),(45,45,5,12.83,44.99,'2020-05-23 00:00:00'),(46,46,6,1.46,71.80,'2020-09-16 00:00:00'),(47,47,7,16.22,46.13,'2020-04-06 00:00:00'),(48,48,8,6.02,74.89,'2020-08-06 00:00:00'),(49,49,8,12.78,20.05,'2020-08-10 00:00:00'),(50,50,8,14.28,76.64,'2020-09-18 00:00:00'),(51,51,1,4.40,65.03,'2020-05-27 00:00:00'),(52,52,2,10.69,50.35,'2020-04-20 00:00:00'),(53,53,3,18.96,23.01,'2020-06-24 00:00:00'),(54,54,4,16.75,24.59,'2020-03-20 00:00:00'),(55,55,5,19.34,61.01,'2020-07-16 00:00:00'),(56,56,6,6.57,43.11,'2020-03-21 00:00:00'),(57,57,7,13.46,68.03,'2020-06-27 00:00:00'),(58,58,8,15.43,50.89,'2020-05-11 00:00:00'),(59,59,8,19.65,62.35,'2020-08-10 00:00:00'),(60,60,7,6.87,71.59,'2020-08-06 00:00:00'),(61,61,1,2.30,15.73,'2021-01-21 00:00:00'),(62,62,3,5.95,7.23,'2021-04-10 00:00:00'),(63,63,4,19.33,3.93,'2021-01-25 00:00:00'),(64,64,2,18.48,79.89,'2021-04-02 00:00:00'),(65,65,5,5.98,6.74,'2021-02-10 00:00:00'),(66,66,8,5.09,61.91,'2021-01-15 00:00:00'),(67,67,7,17.44,78.96,'2021-03-26 00:00:00'),(68,68,5,11.18,66.22,'2021-03-10 00:00:00'),(69,69,8,2.99,21.19,'2021-03-29 00:00:00'),(70,70,5,13.12,37.48,'2021-03-15 00:00:00'),(71,71,7,6.87,25.14,'2021-02-14 00:00:00'),(72,72,1,13.71,5.90,'2021-04-08 00:00:00'),(73,73,7,2.46,59.46,'2021-03-07 00:00:00'),(74,74,7,11.81,7.45,'2021-02-01 00:00:00'),(75,75,4,7.40,64.95,'2021-01-29 00:00:00'),(76,76,7,5.32,78.64,'2021-03-13 00:00:00'),(77,77,8,15.44,76.35,'2021-02-23 00:00:00'),(78,78,4,11.85,36.26,'2021-02-27 00:00:00'),(79,79,3,13.59,29.46,'2021-04-02 00:00:00'),(80,80,6,1.44,61.65,'2021-02-14 00:00:00'),(81,81,6,12.42,70.80,'2021-02-14 00:00:00'),(82,82,2,15.26,10.53,'2021-03-12 00:00:00'),(83,83,6,12.80,29.29,'2021-04-02 00:00:00'),(84,84,7,3.43,43.46,'2021-01-17 00:00:00'),(85,85,8,12.52,48.89,'2021-04-06 00:00:00'),(86,86,1,17.40,51.23,'2021-01-30 00:00:00'),(87,87,2,11.97,32.92,'2021-02-05 00:00:00'),(88,88,3,2.27,29.08,'2021-02-21 00:00:00'),(89,89,6,8.15,32.88,'2021-01-17 00:00:00'),(90,90,2,8.71,5.89,'2021-02-01 00:00:00'),(91,91,8,3.98,33.45,'2020-12-14 00:00:00'),(92,92,1,14.07,42.28,'2020-12-20 00:00:00'),(93,93,4,12.63,32.77,'2021-04-22 00:00:00'),(94,94,8,17.52,17.23,'2020-12-12 00:00:00'),(95,95,5,0.88,56.30,'2020-12-08 00:00:00'),(96,96,3,9.56,30.71,'2021-03-27 00:00:00'),(97,97,1,8.61,34.94,'2021-04-25 00:00:00'),(98,98,5,11.99,56.39,'2020-12-31 00:00:00'),(99,99,4,3.00,65.77,'2021-03-28 00:00:00'),(100,100,6,11.84,76.95,'2020-12-11 00:00:00'),(101,101,2,11.73,19.58,'2021-03-04 00:00:00'),(102,102,4,5.99,22.71,'2021-01-23 00:00:00'),(103,103,5,12.49,61.59,'2020-12-21 00:00:00'),(104,104,1,11.50,68.26,'2021-03-05 00:00:00'),(105,105,3,7.86,8.91,'2021-03-03 00:00:00'),(106,106,1,11.74,8.80,'2021-01-26 00:00:00'),(107,107,3,17.13,0.24,'2020-12-01 00:00:00'),(108,108,2,15.15,29.91,'2020-11-15 00:00:00'),(109,109,8,14.93,35.68,'2021-01-27 00:00:00'),(110,110,1,5.60,8.88,'2021-01-22 00:00:00'),(111,111,2,13.22,32.51,'2021-01-26 00:00:00'),(112,112,1,16.63,34.07,'2021-04-11 00:00:00'),(113,113,3,11.72,79.44,'2021-04-23 00:00:00'),(114,114,1,3.20,4.66,'2020-12-20 00:00:00'),(115,115,7,8.40,4.98,'2020-12-21 00:00:00'),(116,116,7,11.00,76.89,'2021-02-02 00:00:00'),(117,117,7,15.20,56.98,'2021-04-06 00:00:00'),(118,118,2,1.45,49.12,'2021-02-09 00:00:00'),(119,119,4,16.22,27.51,'2021-03-23 00:00:00'),(120,120,1,13.63,42.13,'2021-02-26 00:00:00'),(121,121,2,3.89,62.11,'2021-07-17 00:00:00'),(122,122,6,12.49,19.81,'2021-08-12 00:00:00'),(123,123,2,6.16,3.04,'2021-05-15 00:00:00'),(124,124,6,1.18,72.43,'2021-08-02 00:00:00'),(125,125,6,19.31,36.22,'2021-05-21 00:00:00'),(126,126,1,2.04,23.99,'2021-08-24 00:00:00'),(127,127,5,12.26,1.45,'2021-08-03 00:00:00'),(128,128,1,13.48,77.70,'2021-05-21 00:00:00'),(129,129,8,17.41,4.80,'2021-06-06 00:00:00'),(130,130,4,2.28,63.56,'2021-06-08 00:00:00'),(131,131,6,9.00,24.57,'2021-07-31 00:00:00'),(132,132,5,4.14,58.86,'2021-06-23 00:00:00'),(133,133,1,1.06,48.28,'2021-05-03 00:00:00'),(134,134,3,4.83,17.42,'2021-08-14 00:00:00'),(135,135,3,13.11,28.84,'2021-08-24 00:00:00'),(136,136,2,11.96,4.40,'2021-07-22 00:00:00'),(137,137,4,15.45,25.89,'2021-08-14 00:00:00'),(138,138,1,9.85,40.37,'2021-06-14 00:00:00'),(139,139,4,3.73,29.94,'2021-08-03 00:00:00'),(140,140,8,0.88,5.70,'2021-07-20 00:00:00'),(141,141,6,7.10,31.30,'2021-07-03 00:00:00'),(142,142,2,2.57,77.76,'2021-07-23 00:00:00'),(143,143,6,5.59,58.59,'2021-06-08 00:00:00'),(144,144,2,8.36,44.21,'2021-05-26 00:00:00'),(145,145,2,19.24,66.55,'2021-08-16 00:00:00'),(146,146,7,1.49,6.04,'2021-07-18 00:00:00'),(147,147,3,14.44,33.25,'2021-08-27 00:00:00'),(148,148,4,18.87,33.83,'2021-07-27 00:00:00'),(149,149,5,16.87,16.00,'2021-06-01 00:00:00'),(150,150,3,1.94,57.14,'2021-07-20 00:00:00'),(151,151,7,13.52,41.59,'2021-07-30 00:00:00'),(152,152,8,3.31,46.53,'2021-07-11 00:00:00'),(153,153,3,15.42,66.04,'2021-05-05 00:00:00'),(154,154,3,12.59,31.47,'2021-03-03 00:00:00'),(155,155,2,1.62,71.87,'2021-09-20 00:00:00'),(156,156,5,8.50,12.55,'2021-04-11 00:00:00'),(157,157,1,0.78,27.40,'2021-07-17 00:00:00'),(158,158,4,18.20,20.53,'2021-07-11 00:00:00'),(159,159,2,17.66,48.15,'2021-07-19 00:00:00'),(160,160,6,3.16,17.51,'2021-07-27 00:00:00'),(161,161,5,15.22,69.72,'2021-09-15 00:00:00'),(162,162,8,11.23,68.04,'2021-05-26 00:00:00'),(163,163,4,6.05,49.24,'2021-03-04 00:00:00'),(164,164,6,7.07,71.92,'2021-08-15 00:00:00'),(165,165,8,17.72,49.38,'2021-05-01 00:00:00'),(166,166,5,19.12,22.58,'2021-04-30 00:00:00'),(167,167,4,19.09,45.49,'2021-07-09 00:00:00'),(168,168,6,8.26,4.34,'2021-05-22 00:00:00'),(169,169,7,15.69,16.15,'2021-08-15 00:00:00'),(170,170,5,5.15,65.27,'2021-03-11 00:00:00'),(171,171,1,19.80,39.16,'2021-05-19 00:00:00'),(172,172,5,16.27,41.52,'2021-04-21 00:00:00'),(173,173,8,8.67,10.72,'2021-07-21 00:00:00'),(174,174,8,13.78,6.97,'2021-07-01 00:00:00'),(175,175,6,12.31,44.23,'2021-08-29 00:00:00'),(176,176,2,0.29,11.50,'2021-05-27 00:00:00'),(177,177,4,6.65,23.79,'2021-05-17 00:00:00'),(178,178,6,0.13,77.53,'2021-06-12 00:00:00'),(179,179,3,9.96,44.46,'2021-05-01 00:00:00'),(180,180,4,4.20,57.37,'2021-04-27 00:00:00'),(181,181,6,17.36,16.50,'2022-01-23 00:00:00'),(182,182,3,3.61,34.93,'2022-04-11 00:00:00'),(183,183,1,12.50,27.62,'2022-02-17 00:00:00'),(184,184,3,16.43,73.87,'2022-03-24 00:00:00'),(185,185,3,13.30,34.65,'2022-01-23 00:00:00'),(186,186,2,2.18,70.39,'2022-01-29 00:00:00'),(187,187,1,18.43,27.00,'2022-03-29 00:00:00'),(188,188,4,18.35,27.73,'2022-02-15 00:00:00'),(189,189,3,8.89,44.56,'2022-01-28 00:00:00'),(190,190,1,14.43,57.75,'2022-01-29 00:00:00'),(191,191,2,3.55,14.13,'2022-02-24 00:00:00'),(192,192,6,14.92,36.80,'2022-02-23 00:00:00'),(193,193,1,8.13,29.39,'2022-01-22 00:00:00'),(194,194,4,9.26,63.83,'2022-02-15 00:00:00'),(195,195,3,12.56,4.60,'2022-04-06 00:00:00'),(196,196,3,16.25,16.82,'2022-02-18 00:00:00'),(197,197,4,14.67,50.32,'2022-02-19 00:00:00'),(198,198,4,6.24,6.73,'2022-01-12 00:00:00'),(199,199,2,18.95,62.36,'2022-01-16 00:00:00'),(200,200,5,9.68,43.13,'2022-02-16 00:00:00'),(201,201,6,16.70,18.52,'2022-03-27 00:00:00'),(202,202,2,17.54,40.57,'2022-01-10 00:00:00'),(203,203,7,7.31,7.63,'2022-02-07 00:00:00'),(204,204,6,1.49,9.88,'2022-04-03 00:00:00'),(205,205,1,7.51,36.46,'2022-01-13 00:00:00'),(206,206,2,14.85,74.28,'2022-02-07 00:00:00'),(207,207,6,10.15,32.96,'2022-03-25 00:00:00'),(208,208,4,15.96,76.22,'2022-02-20 00:00:00'),(209,209,5,15.07,15.22,'2022-03-19 00:00:00'),(210,210,7,5.27,57.36,'2022-02-11 00:00:00'),(211,211,4,5.52,13.29,'2022-04-17 00:00:00'),(212,212,7,7.58,23.72,'2022-03-25 00:00:00'),(213,213,5,17.69,25.09,'2022-01-23 00:00:00'),(214,214,5,6.51,59.38,'2021-12-22 00:00:00'),(215,215,6,11.38,4.79,'2021-12-12 00:00:00'),(216,216,8,18.49,79.78,'2022-01-31 00:00:00'),(217,217,3,17.25,19.02,'2022-01-03 00:00:00'),(218,218,7,8.60,15.05,'2022-04-23 00:00:00'),(219,219,6,15.89,23.06,'2022-04-24 00:00:00'),(220,220,2,2.80,39.47,'2022-01-06 00:00:00'),(221,221,4,3.18,4.22,'2022-04-11 00:00:00'),(222,222,7,0.13,14.63,'2022-03-23 00:00:00'),(223,223,8,7.14,34.03,'2022-04-12 00:00:00'),(224,224,1,19.21,76.42,'2022-01-18 00:00:00'),(225,225,2,8.87,1.06,'2022-02-16 00:00:00'),(226,226,4,7.60,33.27,'2022-04-11 00:00:00'),(227,227,5,15.26,27.69,'2022-01-13 00:00:00'),(228,228,6,8.89,3.58,'2022-03-18 00:00:00'),(229,229,7,10.13,42.92,'2021-11-04 00:00:00'),(230,230,8,18.04,3.86,'2022-02-11 00:00:00'),(231,231,2,6.53,39.30,'2022-01-07 00:00:00'),(232,232,6,9.81,44.88,'2022-01-31 00:00:00'),(233,233,4,14.37,22.07,'2022-03-22 00:00:00'),(234,234,7,8.17,64.14,'2022-03-24 00:00:00'),(235,235,1,8.81,62.38,'2021-12-30 00:00:00'),(236,236,4,15.13,17.59,'2022-04-08 00:00:00'),(237,237,8,8.17,77.71,'2022-01-09 00:00:00'),(238,238,3,14.06,18.12,'2022-03-20 00:00:00'),(239,239,7,4.54,39.97,'2021-12-28 00:00:00'),(240,240,2,11.30,10.94,'2022-04-18 00:00:00'),(241,241,6,13.63,65.32,'2022-08-05 00:00:00'),(242,242,4,14.68,15.80,'2022-07-10 00:00:00'),(243,243,1,15.33,12.66,'2022-05-23 00:00:00'),(244,244,6,9.52,68.27,'2022-07-14 00:00:00'),(245,245,5,6.58,19.21,'2022-08-29 00:00:00'),(246,246,5,14.20,28.78,'2022-05-24 00:00:00'),(247,247,8,0.53,29.27,'2022-05-06 00:00:00'),(248,248,4,17.83,52.03,'2022-07-20 00:00:00'),(249,249,7,2.53,48.05,'2022-07-08 00:00:00'),(250,250,6,17.11,20.14,'2022-08-27 00:00:00'),(251,251,2,14.37,76.49,'2022-06-15 00:00:00'),(252,252,8,17.06,31.33,'2022-08-27 00:00:00'),(253,253,7,4.81,76.22,'2022-06-17 00:00:00'),(254,254,5,8.29,56.62,'2022-07-19 00:00:00'),(255,255,3,16.55,46.39,'2022-05-19 00:00:00'),(256,256,6,11.40,4.84,'2022-08-06 00:00:00'),(257,257,2,8.04,77.35,'2022-05-09 00:00:00'),(258,258,8,15.45,23.50,'2022-07-12 00:00:00'),(259,259,5,9.87,20.80,'2022-07-05 00:00:00'),(260,260,8,16.02,53.40,'2022-08-21 00:00:00'),(261,261,8,14.95,24.67,'2022-05-22 00:00:00'),(262,262,5,10.53,58.05,'2022-07-31 00:00:00'),(263,263,5,3.55,47.04,'2022-08-29 00:00:00'),(264,264,5,7.87,7.90,'2022-05-24 00:00:00'),(265,265,1,2.68,51.55,'2022-06-24 00:00:00'),(266,266,2,14.44,0.66,'2022-07-23 00:00:00'),(267,267,4,15.79,66.78,'2022-07-15 00:00:00'),(268,268,8,10.23,0.83,'2022-08-26 00:00:00'),(269,269,3,19.05,20.57,'2022-06-17 00:00:00'),(270,270,1,11.22,57.64,'2022-06-23 00:00:00'),(271,271,4,4.27,33.78,'2022-04-15 00:00:00'),(272,272,3,6.52,67.00,'2022-07-24 00:00:00'),(273,273,1,10.92,2.30,'2022-07-20 00:00:00'),(274,274,7,12.52,7.36,'2022-03-05 00:00:00'),(275,275,6,1.47,68.51,'2022-06-29 00:00:00'),(276,276,4,6.28,66.24,'2022-04-11 00:00:00'),(277,277,1,7.14,36.16,'2022-04-13 00:00:00'),(278,278,1,13.56,66.86,'2022-08-24 00:00:00'),(279,279,1,13.98,65.67,'2022-07-05 00:00:00'),(280,280,1,2.30,69.47,'2022-07-15 00:00:00'),(281,281,4,18.02,52.53,'2022-07-15 00:00:00'),(282,282,3,4.73,42.76,'2022-08-13 00:00:00'),(283,283,6,16.65,25.47,'2022-08-16 00:00:00'),(284,284,2,8.71,52.21,'2022-05-31 00:00:00'),(285,285,1,17.84,58.50,'2022-06-15 00:00:00'),(286,286,4,15.31,10.83,'2022-05-18 00:00:00'),(287,287,5,13.76,2.71,'2022-07-20 00:00:00'),(288,288,7,9.48,22.72,'2022-09-19 00:00:00'),(289,289,5,7.11,39.80,'2022-06-23 00:00:00'),(290,290,5,19.60,8.72,'2022-07-08 00:00:00'),(291,291,2,3.53,61.12,'2022-07-02 00:00:00'),(292,292,6,14.43,28.89,'2022-07-21 00:00:00'),(293,293,2,16.53,11.74,'2022-04-02 00:00:00'),(294,294,2,14.95,51.46,'2022-06-29 00:00:00'),(295,295,2,7.04,39.62,'2022-04-27 00:00:00'),(296,296,6,0.48,36.23,'2022-05-18 00:00:00'),(297,297,6,16.20,68.79,'2022-06-26 00:00:00'),(298,298,2,8.75,23.49,'2022-03-16 00:00:00'),(299,299,6,15.82,62.42,'2022-07-13 00:00:00'),(300,300,8,4.54,29.65,'2022-05-10 00:00:00'),(302,1,1,20.00,80.00,'2020-11-10 23:59:59'),(303,1,1,20.00,80.00,'2020-09-09 12:00:00'),(304,107,5,20.00,80.00,'2020-12-30 23:59:59');
/*!40000 ALTER TABLE `studentsubmission` ENABLE KEYS */;
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
