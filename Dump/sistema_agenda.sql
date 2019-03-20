-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sistema_agenda
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agenda`
--

DROP TABLE IF EXISTS `agenda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `agenda` (
  `dataCri` datetime NOT NULL,
  `dataEnt` datetime NOT NULL,
  `titAge` varchar(30) DEFAULT NULL,
  `desAge` text,
  `idEqp` int(11) NOT NULL,
  `idCol` int(11) NOT NULL,
  PRIMARY KEY (`dataCri`,`dataEnt`,`idEqp`,`idCol`),
  KEY `fk_agenda_equipe1_idx` (`idEqp`),
  KEY `fk_agenda_colaborador1_idx` (`idCol`),
  CONSTRAINT `fk_agenda_colaborador1` FOREIGN KEY (`idCol`) REFERENCES `colaborador` (`idCol`),
  CONSTRAINT `fk_agenda_equipe1` FOREIGN KEY (`idEqp`) REFERENCES `equipe` (`idEqp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agenda`
--

LOCK TABLES `agenda` WRITE;
/*!40000 ALTER TABLE `agenda` DISABLE KEYS */;
INSERT INTO `agenda` VALUES ('2000-01-01 00:00:00','2000-01-02 00:00:00','AgendaTeste 01','Essa é a agenda teste01',1,1),('2000-02-01 00:02:00','2000-02-02 00:02:00','AgendaTeste 02','Essa é a agenda teste02',2,2),('2000-03-01 00:03:00','2000-03-02 00:03:00','AgendaTeste 03','Essa é a agenda teste03',3,3),('2000-04-01 00:04:00','2000-04-02 00:04:00','AgendaTeste 04','Essa é a agenda teste04',4,4);
/*!40000 ALTER TABLE `agenda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `colaborador`
--

DROP TABLE IF EXISTS `colaborador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `colaborador` (
  `idCol` int(11) NOT NULL AUTO_INCREMENT,
  `tipoCol` varchar(15) DEFAULT NULL,
  `nomCol` varchar(60) DEFAULT NULL,
  `loginCol` varchar(15) DEFAULT NULL,
  `senhaCol` varchar(15) DEFAULT NULL,
  `endCol` varchar(60) DEFAULT NULL,
  `baiCol` varchar(60) DEFAULT NULL,
  `emailCol` varchar(60) DEFAULT NULL,
  `idEqp` int(11) NOT NULL,
  PRIMARY KEY (`idCol`),
  KEY `fk_colaborador_equipe_idx` (`idEqp`),
  CONSTRAINT `fk_colaborador_equipe` FOREIGN KEY (`idEqp`) REFERENCES `equipe` (`idEqp`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `colaborador`
--

LOCK TABLES `colaborador` WRITE;
/*!40000 ALTER TABLE `colaborador` DISABLE KEYS */;
INSERT INTO `colaborador` VALUES (1,'User','Teste01','TesteLogin01','TesteSenha01','EndTeste01','BairroTeste01','teste01@teste.com.br',1),(2,'User','Teste02','TesteLogin02','TesteSenha02','EndTeste02','BairroTeste02','teste02@teste.com.br',2),(3,'User','Teste03','TesteLogin03','TesteSenha03','EndTeste03','BairroTeste03','teste03@teste.com.br',3),(4,'User','Teste04','TesteLogin04','TesteSenha04','EndTeste04','BairroTeste04','teste04@teste.com.br',4),(19,'Administrador','lucas da silva','admin1','123','az-41','azambuja','ds.lucas.ds@hotmail.com',0);
/*!40000 ALTER TABLE `colaborador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipe`
--

DROP TABLE IF EXISTS `equipe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `equipe` (
  `idEqp` int(11) NOT NULL AUTO_INCREMENT,
  `nomEqp` varchar(60) DEFAULT NULL,
  `desEqp` text,
  PRIMARY KEY (`idEqp`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipe`
--

LOCK TABLES `equipe` WRITE;
/*!40000 ALTER TABLE `equipe` DISABLE KEYS */;
INSERT INTO `equipe` VALUES (0,'SemEqp','essa eqp foi criado pra quando o colaborador nao tem eqiupe'),(1,'Equipe Teste01','Essa é a equipe Teste 01'),(2,'Equipe Teste02','Essa é a equipe Teste 02'),(3,'Equipe Teste03','Essa é a equipe Teste 03'),(5,'jureg','aaaaa');
/*!40000 ALTER TABLE `equipe` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-20 16:02:34
