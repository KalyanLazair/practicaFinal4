DROP DATABASE IF EXISTS deportes;

-- MySQL dump 10.16  Distrib 10.1.35-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: deportes
-- ------------------------------------------------------
-- Server version	10.1.35-MariaDB

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
-- Current Database: `deportes`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `deportes` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `deportes`;

--
-- Table structure for table `club`
--

DROP TABLE IF EXISTS `club`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `club` (
  `CIF` int(20) NOT NULL,
  `nombre` varchar(120) NOT NULL,
  `direccion` varchar(120) DEFAULT NULL,
  `telefono` int(10) NOT NULL,
  PRIMARY KEY (`CIF`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `club`
--

LOCK TABLES `club` WRITE;
/*!40000 ALTER TABLE `club` DISABLE KEYS */;
INSERT INTO `club` VALUES (1,'Ring UCAS Madrid','C/Prado 1',614233216),(2,'Club Eslon','C/ Rey 30',672393862),(3,'Lealcan','C/ Villa del Monte 23',639824731),(4,'Xaloc','C/ Gramenet 12',629476128);
/*!40000 ALTER TABLE `club` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perro`
--

DROP TABLE IF EXISTS `perro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `perro` (
  `chip` int(30) NOT NULL,
  `nombre` varchar(120) NOT NULL,
  `afijo` varchar(120) DEFAULT NULL,
  `raza` varchar(120) DEFAULT NULL,
  `sexo` varchar(120) DEFAULT NULL,
  `deporte` varchar(120) DEFAULT NULL,
  `nacimiento` date DEFAULT NULL,
  `Grado` varchar(120) DEFAULT NULL,
  `propietario` varchar(10) NOT NULL,
  PRIMARY KEY (`chip`),
  KEY `propietario` (`propietario`),
  CONSTRAINT `perro_ibfk_1` FOREIGN KEY (`propietario`) REFERENCES `propietario` (`DNI`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perro`
--

LOCK TABLES `perro` WRITE;
/*!40000 ALTER TABLE `perro` DISABLE KEYS */;
INSERT INTO `perro` VALUES (10,'K\'Atlas','de la Serralada','Pastor Belga Malinois','Macho','Ring Francés','2015-12-18','Brevet','00000001F'),(11,'Eva','de Demonheart','Dobermann','Hembra','Ring Francés','2012-05-27','1','00000001F'),(12,'Alejandro','von Elegance','Galgo Español','Macho','Agility','0000-00-00','2','00000001G'),(13,'Abril','-','Pomeranian','Hembra','Agility','2001-09-05','1','00000001H'),(14,'Leo','-','Mestizo','Macho','OCI','2011-03-16','Brevet','00000001E'),(15,'Dionisio','de Ydre','Pastor Belga Malinois','Macho','Ring Francés','2012-08-23','3','00000001B'),(16,'Kaiser','Daker','Dobermann','Macho','IPO','2010-04-19','3','00000001D'),(17,'Ginger','del Valle','Pastor Alemán','Hembra','IPO','2014-06-03','2','00000001D'),(18,'Ayra','de los Trastolillos','Border Collie','Hembra','Agility','2016-02-14','3','00000001I'),(19,'Valar','de Tangotara','Husky Siberiano','Hembra','OCI','2017-10-17','1','00000001J'),(20,'Hera','Rhayader','Dobermann','Hembra','Ring Francés','2018-03-06','Brevet','00000001A'),(21,'Marcus','del Palazzo di Shanta','Dobermann','Macho','IPO','2017-11-26','3','00000001C'),(22,'Arena','du Banc des Hermelles','Pastor Belga Malinois','Hembra','Ring Francés','2016-07-11','2','00000001K'),(23,'Udex','Aux Acacias','Pastor Belga Malinois','Macho','Ring Francés','2014-04-26','2','00000001K');
/*!40000 ALTER TABLE `perro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `propietario`
--

DROP TABLE IF EXISTS `propietario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `propietario` (
  `DNI` varchar(10) NOT NULL,
  `nombre` varchar(120) NOT NULL,
  `apellidos` varchar(120) DEFAULT NULL,
  `direccion` varchar(120) DEFAULT NULL,
  `telefono` int(10) NOT NULL,
  `club` int(20) NOT NULL,
  PRIMARY KEY (`DNI`),
  KEY `club` (`club`),
  CONSTRAINT `propietario_ibfk_1` FOREIGN KEY (`club`) REFERENCES `club` (`CIF`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `propietario`
--

LOCK TABLES `propietario` WRITE;
/*!40000 ALTER TABLE `propietario` DISABLE KEYS */;
INSERT INTO `propietario` VALUES ('00000001A','Pepe','López','C/ Gregorio Marañón 12',672498314,1),('00000001B','Ana','Pérez','C/Paseo de los Sauces 14',676349831,1),('00000001C','Manuel','Villena','C/ Adelfas 27',612093291,4),('00000001D','Sofía','Bregan','C/ Siglo XXI 27',682315932,4),('00000001E','Emma','Larra','C/ Valle Inclán 38',619423197,3),('00000001F','Kalyan','Lazair','C/ Monasterio de Leyre 45',623019241,1),('00000001G','Koenig','Yazria','C/ Isabel de Farnesio 16',692912052,2),('00000001H','Odran','Raleth','C/ Nuevo Mundo 14',687201398,2),('00000001I','Dailen','Noaryan','C/ Camino del Rey 23',681139411,2),('00000001J','Aranias','Vaerthi','C/ Gran Vía 34',612239181,3),('00000001K','Marith','Taish','C/ Vía de los Pantanos 68',661294881,1);
/*!40000 ALTER TABLE `propietario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-24 19:45:12
