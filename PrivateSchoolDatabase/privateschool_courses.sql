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
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `courses` (
  `Course_ID` int NOT NULL AUTO_INCREMENT,
  `CourseTitle` varchar(45) DEFAULT NULL,
  `Stream` varchar(45) DEFAULT NULL,
  `Type` varchar(45) DEFAULT NULL,
  `StartDate` date DEFAULT NULL,
  `EndDate` date DEFAULT NULL,
  PRIMARY KEY (`Course_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
INSERT INTO `courses` VALUES (1,'CB1','Java','Full Time','2020-05-04','2020-09-04'),(2,'CB1','C#','Full Time','2020-05-04','2020-09-04'),(3,'CB1','Python','Full Time','2020-05-04','2020-09-04'),(4,'CB1','Java','Part Time','2020-02-24','2020-09-25'),(5,'CB1','C#','Part Time','2020-02-24','2020-09-25'),(6,'CB1','Python','Part Time','2020-02-24','2020-09-25'),(7,'CB2','Java','Full Time','2021-01-11','2021-04-12'),(8,'CB2','C#','Full Time','2021-01-11','2021-04-12'),(9,'CB2','Python','Full Time','2021-01-11','2021-04-12'),(10,'CB2','Java','Part Time','2020-11-02','2021-05-03'),(11,'CB2','C#','Part Time','2020-11-02','2021-05-03'),(12,'CB2','Python','Part Time','2020-11-02','2021-05-03'),(13,'CB3','Java','Full Time','2021-05-03','2021-09-06'),(14,'CB3','C#','Full Time','2021-05-03','2021-09-06'),(15,'CB3','Python','Full Time','2021-05-03','2021-09-06'),(16,'CB3','Java','Part Time','2021-02-26','2021-09-24'),(17,'CB3','C#','Part Time','2021-02-26','2021-09-24'),(18,'CB3','Python','Part Time','2021-02-26','2021-09-24'),(19,'CB4','Java','Full Time','2022-01-10','2022-04-11'),(20,'CB4','C#','Full Time','2022-01-10','2022-04-11'),(21,'CB4','Python','Full Time','2022-01-10','2022-04-11'),(22,'CB4','Java','Part Time','2021-11-01','2022-05-02'),(23,'CB4','C#','Part Time','2021-11-01','2022-05-02'),(24,'CB4','Python','Part Time','2021-11-01','2022-05-02'),(25,'CB5','Java','Full Time','2022-05-02','2022-09-02'),(26,'CB5','C#','Full Time','2022-05-02','2022-09-02'),(27,'CB5','Python','Full Time','2022-05-02','2022-09-02'),(28,'CB5','Java','Part Time','2022-02-28','2022-09-27'),(29,'CB5','C#','Part Time','2022-02-28','2022-09-27'),(30,'CB5','Python','Part Time','2022-02-28','2022-09-27');
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-07 23:33:55
