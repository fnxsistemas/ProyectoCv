CREATE DATABASE  IF NOT EXISTS `proyectocv` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;
USE `proyectocv`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: proyectocv
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.13-MariaDB

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
-- Table structure for table `datosacademicos`
--

DROP TABLE IF EXISTS `datosacademicos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `datosacademicos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `persona` int(11) NOT NULL,
  `codigo` varchar(45) COLLATE utf8_bin NOT NULL,
  `Empresa` int(11) DEFAULT NULL,
  `descripcion` blob,
  `ftitulacion` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_datosacademicos_persona_idx` (`persona`),
  KEY `fk_datosacademicos_empresa_idx` (`Empresa`),
  CONSTRAINT `fk_datosacademicos_empresa` FOREIGN KEY (`Empresa`) REFERENCES `mydb`.`empresa` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_datosacademicos_persona` FOREIGN KEY (`persona`) REFERENCES `mydb`.`persona` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datosacademicos`
--

LOCK TABLES `datosacademicos` WRITE;
/*!40000 ALTER TABLE `datosacademicos` DISABLE KEYS */;
/*!40000 ALTER TABLE `datosacademicos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empresa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE utf8_bin NOT NULL,
  `direccion` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `poblacion` varchar(25) COLLATE utf8_bin DEFAULT NULL,
  `codigopostal` varchar(5) COLLATE utf8_bin DEFAULT NULL,
  `provincia` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `web` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `experienciaprofesional`
--

DROP TABLE IF EXISTS `experienciaprofesional`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `experienciaprofesional` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` int(11) NOT NULL,
  `persona` int(11) NOT NULL,
  `empresa` int(11) NOT NULL,
  `descripcion` blob NOT NULL,
  `fdesde` date DEFAULT NULL,
  `fhasta` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_experienciaprofesional_persona_idx` (`persona`),
  KEY `fk_experienciaprofesional_empresa_idx` (`empresa`),
  CONSTRAINT `fk_experienciaprofesional_empresa` FOREIGN KEY (`empresa`) REFERENCES `mydb`.`empresa` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_experienciaprofesional_persona` FOREIGN KEY (`persona`) REFERENCES `mydb`.`persona` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experienciaprofesional`
--

LOCK TABLES `experienciaprofesional` WRITE;
/*!40000 ALTER TABLE `experienciaprofesional` DISABLE KEYS */;
/*!40000 ALTER TABLE `experienciaprofesional` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `formacioncomplementaria`
--

DROP TABLE IF EXISTS `formacioncomplementaria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `formacioncomplementaria` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `persona` int(11) NOT NULL,
  `codigo` varchar(45) COLLATE utf8_bin NOT NULL,
  `Empresa` int(11) NOT NULL,
  `descripcion` blob,
  PRIMARY KEY (`id`),
  KEY `fk_datosacademicos_persona_idx` (`persona`),
  KEY `fk_datosacademicos_empresa_idx` (`Empresa`),
  CONSTRAINT `fk_formacioncomplementaria_empresa` FOREIGN KEY (`Empresa`) REFERENCES `mydb`.`empresa` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_formacioncomplementaria_persona` FOREIGN KEY (`persona`) REFERENCES `mydb`.`persona` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `formacioncomplementaria`
--

LOCK TABLES `formacioncomplementaria` WRITE;
/*!40000 ALTER TABLE `formacioncomplementaria` DISABLE KEYS */;
/*!40000 ALTER TABLE `formacioncomplementaria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persona` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` int(11) NOT NULL,
  `nombre` varchar(100) COLLATE utf8_bin NOT NULL,
  `fnacimiento` date NOT NULL,
  `direccion` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `poblacion` varchar(25) COLLATE utf8_bin DEFAULT NULL,
  `codigopostal` varchar(5) COLLATE utf8_bin DEFAULT NULL,
  `provincia` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `movil` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'proyectocv'
--

--
-- Dumping routines for database 'proyectocv'
--
/*!50003 DROP PROCEDURE IF EXISTS `empresaCreate` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `empresaCreate`(
/* Parametros de Entrada*/
in `pcodigo` int(11), 
in `pnombre` varchar(50), 
in `pdireccion` varchar(50) ,
in `ppoblacion` varchar(25), 
in `pcodigopostal` varchar(5), 
in `pprovincia` varchar(15), 
in `pemail` varchar(100), 
in `ptelefono` int(11) ,
in `pweb` varchar(100),
/* Parametro de Salida.*/
OUT `pid` INT)
BEGIN
    /* Se inserta los parametros recibidos en la tabla EMPRESA.*/
	INSERT INTO empresa (codigo, nombre, direccion, poblacion,
						 codigopostal, provincia, email, telefono, web)
	VALUES (pcodigo, LOWER(pnombre), LOWER(pdireccion), LOWER(poblacion),
			pcodigopostal, LOWER(provincia), LOWER(email), telefono, LOWER(web));
            
    /* Se devuelve el codigo de la ultima inserción.*/
    SET pid = LAST_INSERT_ID();    

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `empresaDelete` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `empresaDelete`(IN `pid` INT)
BEGIN  
    /* Se borra una empresa en base al id pasado por parametro.*/
	DELETE FROM empresa WHERE empresa.id = pid;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `empresaGetAll` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `empresaGetAll`()
BEGIN
	/* Sentencia que muestra todas las empresas de la Bd.*/
	SELECT empresa.id, empresa.codigo, empresa.nombre, empresa.direccion, 
           empresa.poblacion, empresa.codigopostal, empresa.provincia, 
           empresa.email, empresa.telefono, empresa.web
    FROM empresa;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `empresaGetByCodigo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `empresaGetByCodigo`(IN `pcodigo` INT)
BEGIN
	/* Sentencia que muestra la empresa cuyo codigo coincida con el parametro pasado.*/
	SELECT empresa.id, empresa.codigo, empresa.nombre, empresa.direccion, 
           empresa.poblacion, empresa.codigopostal, empresa.provincia, 
           empresa.email, empresa.telefono, empresa.web
    FROM empresa
    WHERE empresa.codigo = pcodigo;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `empresaGetById` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `empresaGetById`(IN `pid` INT)
BEGIN
	/* Sentencia que muestra la empresa cuyo id coincida con el parametro pasado.*/
	SELECT empresa.id, empresa.codigo, empresa.nombre, empresa.direccion, 
           empresa.poblacion, empresa.codigopostal, empresa.provincia, 
           empresa.email, empresa.telefono, empresa.web
    FROM empresa
    WHERE empresa.id = pid;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `personaCreate` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `personaCreate`(
/* Parametros de Entrada*/
in `pid` INT(11),
in `pcodigo` int(11), 
in `pnombre` varchar(100) ,
in `pfnacimiento` date ,
in `pdireccion` varchar(50) ,
in `ppoblacion` varchar(25) ,
in `pcodigopostal` varchar(5), 
in `pprovincia` varchar(15), 
in `pemail` varchar(100) ,
in `ptelefono` int(11) ,
in `pmovil` int(11))
BEGIN
	/* Se actualiza la persona con los datos recibidos por parametro.*/
	UPDATE persona set codigo = pcodigo,
                       nombre = Lower(pnombre),
                       fnacimiento = pfnacimiento,
                       direccion = Lower(pdireccion),
                       poblacion = Lower(ppoblacion),
                       codigopostal = pcodigopostal,
                       provincia = Lower(pprovincia),
                       email = Lower(pemail),
                       telefono = ptelefono,
                       movil = pmovil
	WHERE persona.id = pid;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `personaDelete` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `personaDelete`(IN `pid` INT)
BEGIN  
    /* Se borra una persona en base al id pasado por parametro.*/
	DELETE FROM persona WHERE persona.id = pid;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `personaGetAll` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `personaGetAll`()
BEGIN
	/* Sentencia que muestra todas las personas de la Bd.*/
	SELECT persona.id, persona.codigo, persona.nombre, persona.fnacimiento, 
           persona.direccion, persona.poblacion, persona.codigopostal, 
           persona.provincia, persona.email, persona.telefono, movil
    FROM persona;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `personaGetByCodigo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `personaGetByCodigo`(IN `pcodigo` INT)
BEGIN
	/* Sentencia que muestra la persona cuyo codigo 
       coincida con el parametro pasado.*/
	SELECT persona.id, persona.codigo, persona.nombre, persona.fnacimiento, 
           persona.direccion, persona.poblacion, persona.codigopostal, 
           persona.provincia, persona.email, persona.telefono, movil
    FROM persona
    WHERE persona.codigo = pcodigo;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `personaGetById` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `personaGetById`(IN `pid` INT)
BEGIN
	/* Sentencia que muestra la persona cuyo id coincida con el parametro pasado.*/
	SELECT persona.id, persona.codigo, persona.nombre, persona.fnacimiento, 
           persona.direccion, persona.poblacion, persona.codigopostal, 
           persona.provincia, persona.email, persona.telefono, movil
    FROM persona
    WHERE persona.id = pid;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `personaUpdate` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `personaUpdate`(
/* Parametros de Entrada*/
in `pid` INT(11),
in `pcodigo` int(11), 
in `pnombre` varchar(50), 
in `pdireccion` varchar(50) ,
in `ppoblacion` varchar(25), 
in `pcodigopostal` varchar(5), 
in `pprovincia` varchar(15), 
in `pemail` varchar(100), 
in `ptelefono` int(11) ,
in `pweb` varchar(100))
BEGIN
	/* Se actualiza la empresa con los datos recibidos por parametro.*/
	UPDATE empresa set codigo = pcodigo,
                       nombre = Lower(pnombre),
                       direccion = Lower(pdireccion),
                       poblacion = Lower(ppoblacion),
                       codigopostal = pcodigopostal,
                       provincia = Lower(pprovincia),
                       email = Lower(pemail),
                       telefono = ptelefono,
                       web = Lower(pweb)
	WHERE empresa.id = pid;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-14 12:32:40
