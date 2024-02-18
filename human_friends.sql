-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: human_friends
-- ------------------------------------------------------
-- Server version	8.3.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `all_animals`
--

DROP TABLE IF EXISTS `all_animals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `all_animals` (
  `name` varchar(20) DEFAULT NULL,
  `subclass_name` varchar(20) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `commands` varchar(50) DEFAULT NULL,
  `class_name` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `all_animals`
--

LOCK TABLES `all_animals` WRITE;
/*!40000 ALTER TABLE `all_animals` DISABLE KEYS */;
INSERT INTO `all_animals` VALUES ('Fido','Cats','2020-01-01','Sit, Stay, Fetch','Pets'),('Buddy','Cats','2018-12-10','Sit, Paw, Bark','Pets'),('Bella','Cats','2019-11-11','Sit, Stay, Roll','Pets'),('Whiskers','Dogs','2019-05-15','Sit, Pounce','Pets'),('Smudge','Dogs','2020-02-20','Sit, Pounce, Scratch','Pets'),('Oliver','Dogs','2020-06-30','Meow, Scratch, Jump','Pets'),('Hammy','Hamsters','2021-03-10','Roll, Hide','Pets'),('Peanut','Hamsters','2021-08-01','Roll, Spin','Pets'),('Thunder','Horses','2015-07-21','Trot, Canter, Gallop','PackAnimals'),('Storm','Horses','2014-05-05','Trot, Canter','PackAnimals'),('Blaze','Horses','2016-02-29','Trot, Jump, Gallop','PackAnimals'),('Eeyore','Camels','2017-09-18','Walk, Carry Load, Bray','PackAnimals'),('Burro','Camels','2019-01-23','Walk, Bray, Kick','PackAnimals');
/*!40000 ALTER TABLE `all_animals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `animals`
--

DROP TABLE IF EXISTS `animals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `animals` (
  `id` int NOT NULL AUTO_INCREMENT,
  `class_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `animals`
--

LOCK TABLES `animals` WRITE;
/*!40000 ALTER TABLE `animals` DISABLE KEYS */;
INSERT INTO `animals` VALUES (1,'PackAnimals'),(2,'Pets');
/*!40000 ALTER TABLE `animals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `camels`
--

DROP TABLE IF EXISTS `camels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `camels` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `type_id` int DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `commands` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `type_id` (`type_id`),
  CONSTRAINT `camels_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `pack_animals` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `camels`
--

LOCK TABLES `camels` WRITE;
/*!40000 ALTER TABLE `camels` DISABLE KEYS */;
/*!40000 ALTER TABLE `camels` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cats`
--

DROP TABLE IF EXISTS `cats`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cats` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `type_id` int DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `commands` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `type_id` (`type_id`),
  CONSTRAINT `cats_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `pets` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cats`
--

LOCK TABLES `cats` WRITE;
/*!40000 ALTER TABLE `cats` DISABLE KEYS */;
INSERT INTO `cats` VALUES (1,'Whiskers',1,'2019-05-15','Sit, Pounce'),(2,'Smudge',1,'2020-02-20','Sit, Pounce, Scratch'),(3,'Oliver',1,'2020-06-30','Meow, Scratch, Jump'),(4,'Whiskers',1,'2019-05-15','Sit, Pounce'),(5,'Smudge',1,'2020-02-20','Sit, Pounce, Scratch'),(6,'Oliver',1,'2020-06-30','Meow, Scratch, Jump');
/*!40000 ALTER TABLE `cats` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dogs`
--

DROP TABLE IF EXISTS `dogs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dogs` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `type_id` int DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `commands` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `type_id` (`type_id`),
  CONSTRAINT `dogs_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `pets` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dogs`
--

LOCK TABLES `dogs` WRITE;
/*!40000 ALTER TABLE `dogs` DISABLE KEYS */;
INSERT INTO `dogs` VALUES (1,'Fido',2,'2020-01-01','Sit, Stay, Fetch'),(2,'Buddy',2,'2018-12-10','Sit, Paw, Bark'),(3,'Bella',2,'2019-11-11','Sit, Stay, Roll'),(4,'Fido',2,'2020-01-01','Sit, Stay, Fetch'),(5,'Buddy',2,'2018-12-10','Sit, Paw, Bark'),(6,'Bella',2,'2019-11-11','Sit, Stay, Roll');
/*!40000 ALTER TABLE `dogs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donkeys`
--

DROP TABLE IF EXISTS `donkeys`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donkeys` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `type_id` int DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `commands` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `type_id` (`type_id`),
  CONSTRAINT `donkeys_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `pack_animals` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donkeys`
--

LOCK TABLES `donkeys` WRITE;
/*!40000 ALTER TABLE `donkeys` DISABLE KEYS */;
INSERT INTO `donkeys` VALUES (1,'Eeyore',2,'2017-09-18','Walk, Carry Load, Bray'),(2,'Burro',2,'2019-01-23','Walk, Bray, Kick'),(3,'Eeyore',2,'2017-09-18','Walk, Carry Load, Bray'),(4,'Burro',2,'2019-01-23','Walk, Bray, Kick');
/*!40000 ALTER TABLE `donkeys` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hamsters`
--

DROP TABLE IF EXISTS `hamsters`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hamsters` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `type_id` int DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `commands` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `type_id` (`type_id`),
  CONSTRAINT `hamsters_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `pets` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hamsters`
--

LOCK TABLES `hamsters` WRITE;
/*!40000 ALTER TABLE `hamsters` DISABLE KEYS */;
INSERT INTO `hamsters` VALUES (1,'Hammy',3,'2021-03-10','Roll, Hide'),(2,'Peanut',3,'2021-08-01','Roll, Spin'),(3,'Hammy',3,'2021-03-10','Roll, Hide'),(4,'Peanut',3,'2021-08-01','Roll, Spin');
/*!40000 ALTER TABLE `hamsters` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horses`
--

DROP TABLE IF EXISTS `horses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horses` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `type_id` int DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `commands` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `type_id` (`type_id`),
  CONSTRAINT `horses_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `pack_animals` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horses`
--

LOCK TABLES `horses` WRITE;
/*!40000 ALTER TABLE `horses` DISABLE KEYS */;
INSERT INTO `horses` VALUES (1,'Thunder',1,'2015-07-21','Trot, Canter, Gallop'),(2,'Storm',1,'2014-05-05','Trot, Canter'),(3,'Blaze',1,'2016-02-29','Trot, Jump, Gallop'),(4,'Thunder',1,'2015-07-21','Trot, Canter, Gallop'),(5,'Storm',1,'2014-05-05','Trot, Canter'),(6,'Blaze',1,'2016-02-29','Trot, Jump, Gallop');
/*!40000 ALTER TABLE `horses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horses_and_donkeys`
--

DROP TABLE IF EXISTS `horses_and_donkeys`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horses_and_donkeys` (
  `id` int NOT NULL DEFAULT '0',
  `name` varchar(20) DEFAULT NULL,
  `type_id` int DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `commands` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horses_and_donkeys`
--

LOCK TABLES `horses_and_donkeys` WRITE;
/*!40000 ALTER TABLE `horses_and_donkeys` DISABLE KEYS */;
INSERT INTO `horses_and_donkeys` VALUES (1,'Thunder',1,'2015-07-21','Trot, Canter, Gallop'),(2,'Storm',1,'2014-05-05','Trot, Canter'),(3,'Blaze',1,'2016-02-29','Trot, Jump, Gallop'),(4,'Thunder',1,'2015-07-21','Trot, Canter, Gallop'),(5,'Storm',1,'2014-05-05','Trot, Canter'),(6,'Blaze',1,'2016-02-29','Trot, Jump, Gallop'),(1,'Eeyore',2,'2017-09-18','Walk, Carry Load, Bray'),(2,'Burro',2,'2019-01-23','Walk, Bray, Kick'),(3,'Eeyore',2,'2017-09-18','Walk, Carry Load, Bray'),(4,'Burro',2,'2019-01-23','Walk, Bray, Kick');
/*!40000 ALTER TABLE `horses_and_donkeys` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pack_animals`
--

DROP TABLE IF EXISTS `pack_animals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pack_animals` (
  `id` int NOT NULL AUTO_INCREMENT,
  `subclass_name` varchar(20) DEFAULT NULL,
  `class_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `class_id` (`class_id`),
  CONSTRAINT `pack_animals_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `animals` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pack_animals`
--

LOCK TABLES `pack_animals` WRITE;
/*!40000 ALTER TABLE `pack_animals` DISABLE KEYS */;
INSERT INTO `pack_animals` VALUES (1,'Horses',1),(2,'Camels',1),(3,'Donkeys',1);
/*!40000 ALTER TABLE `pack_animals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pets`
--

DROP TABLE IF EXISTS `pets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pets` (
  `id` int NOT NULL AUTO_INCREMENT,
  `subclass_name` varchar(20) DEFAULT NULL,
  `class_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `class_id` (`class_id`),
  CONSTRAINT `pets_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `animals` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pets`
--

LOCK TABLES `pets` WRITE;
/*!40000 ALTER TABLE `pets` DISABLE KEYS */;
INSERT INTO `pets` VALUES (1,'Dogs',2),(2,'Cats',2),(3,'Hamsters',2);
/*!40000 ALTER TABLE `pets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `young_animals`
--

DROP TABLE IF EXISTS `young_animals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `young_animals` (
  `name` varchar(20) DEFAULT NULL,
  `type_id` int DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `commands` varchar(50) DEFAULT NULL,
  `age_in_month` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `young_animals`
--

LOCK TABLES `young_animals` WRITE;
/*!40000 ALTER TABLE `young_animals` DISABLE KEYS */;
INSERT INTO `young_animals` VALUES ('Hammy',3,'2021-03-10','Roll, Hide',35),('Peanut',3,'2021-08-01','Roll, Spin',30),('Hammy',3,'2021-03-10','Roll, Hide',35),('Peanut',3,'2021-08-01','Roll, Spin',30);
/*!40000 ALTER TABLE `young_animals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'human_friends'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-18  1:41:49
