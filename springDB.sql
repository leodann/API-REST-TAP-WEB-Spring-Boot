-- MySQL dump 10.13  Distrib 5.7.29, for Linux (x86_64)
--
-- Host: localhost    Database: springDB
-- ------------------------------------------------------
-- Server version	5.7.29-0ubuntu0.18.04.1

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
-- Table structure for table `alergias`
--

DROP TABLE IF EXISTS `alergias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alergias` (
  `id_alergia` int(11) NOT NULL AUTO_INCREMENT,
  `alergia` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_alergia`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alergias`
--

LOCK TABLES `alergias` WRITE;
/*!40000 ALTER TABLE `alergias` DISABLE KEYS */;
/*!40000 ALTER TABLE `alergias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `alergias_paciente`
--

DROP TABLE IF EXISTS `alergias_paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alergias_paciente` (
  `id_persona` int(11) NOT NULL,
  `id_alergia` int(11) NOT NULL,
  PRIMARY KEY (`id_persona`,`id_alergia`),
  KEY `alergias_pacienteFK2` (`id_alergia`),
  CONSTRAINT `alegias_pacienteFK1` FOREIGN KEY (`id_persona`) REFERENCES `pacientes` (`id_persona`),
  CONSTRAINT `alergias_pacienteFK2` FOREIGN KEY (`id_alergia`) REFERENCES `alergias` (`id_alergia`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alergias_paciente`
--

LOCK TABLES `alergias_paciente` WRITE;
/*!40000 ALTER TABLE `alergias_paciente` DISABLE KEYS */;
/*!40000 ALTER TABLE `alergias_paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carrito`
--

DROP TABLE IF EXISTS `carrito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `carrito` (
  `id_compra` int(11) NOT NULL,
  `id_medicamento` int(11) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_compra`,`id_medicamento`),
  KEY `carritoFK2` (`id_medicamento`),
  CONSTRAINT `carritoFK1` FOREIGN KEY (`id_compra`) REFERENCES `compras` (`id_compra`),
  CONSTRAINT `carritoFK2` FOREIGN KEY (`id_medicamento`) REFERENCES `medicamentos` (`id_medicamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carrito`
--

LOCK TABLES `carrito` WRITE;
/*!40000 ALTER TABLE `carrito` DISABLE KEYS */;
/*!40000 ALTER TABLE `carrito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cirugias`
--

DROP TABLE IF EXISTS `cirugias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cirugias` (
  `id_cirugia` int(11) NOT NULL AUTO_INCREMENT,
  `cirugia` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_cirugia`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cirugias`
--

LOCK TABLES `cirugias` WRITE;
/*!40000 ALTER TABLE `cirugias` DISABLE KEYS */;
/*!40000 ALTER TABLE `cirugias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cirugias_paciente`
--

DROP TABLE IF EXISTS `cirugias_paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cirugias_paciente` (
  `id_persona` int(11) NOT NULL,
  `id_cirugia` int(11) NOT NULL,
  PRIMARY KEY (`id_persona`,`id_cirugia`),
  KEY `cirugias_pacienteFK2` (`id_cirugia`),
  CONSTRAINT `cirugias_pacienteFK1` FOREIGN KEY (`id_persona`) REFERENCES `pacientes` (`id_persona`),
  CONSTRAINT `cirugias_pacienteFK2` FOREIGN KEY (`id_cirugia`) REFERENCES `cirugias` (`id_cirugia`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cirugias_paciente`
--

LOCK TABLES `cirugias_paciente` WRITE;
/*!40000 ALTER TABLE `cirugias_paciente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cirugias_paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compras`
--

DROP TABLE IF EXISTS `compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `compras` (
  `id_compra` int(11) NOT NULL AUTO_INCREMENT,
  `id_persona` int(11) DEFAULT NULL,
  `fecha_compra` date DEFAULT NULL,
  `id_pago` int(11) DEFAULT NULL,
  `cve_domicilio_entrega` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id_compra`),
  KEY `comprasFK2` (`id_pago`),
  KEY `comprasFK3` (`id_persona`,`cve_domicilio_entrega`),
  CONSTRAINT `comprasFK1` FOREIGN KEY (`id_persona`) REFERENCES `pacientes` (`id_persona`),
  CONSTRAINT `comprasFK2` FOREIGN KEY (`id_pago`) REFERENCES `pagos` (`id_pago`),
  CONSTRAINT `comprasFK3` FOREIGN KEY (`id_persona`, `cve_domicilio_entrega`) REFERENCES `domicilios` (`id_persona`, `cve_domicilio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras`
--

LOCK TABLES `compras` WRITE;
/*!40000 ALTER TABLE `compras` DISABLE KEYS */;
/*!40000 ALTER TABLE `compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consulta_especialidad`
--

DROP TABLE IF EXISTS `consulta_especialidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `consulta_especialidad` (
  `id_persona` int(11) NOT NULL,
  `cve_consulta` varchar(10) NOT NULL,
  `id_especilaidad` int(11) NOT NULL,
  PRIMARY KEY (`id_persona`,`cve_consulta`,`id_especilaidad`),
  KEY `consulta_especialidadFK2` (`id_especilaidad`),
  CONSTRAINT `consulta_especialidadFK1` FOREIGN KEY (`id_persona`, `cve_consulta`) REFERENCES `consultas` (`id_persona`, `cve_consulta`),
  CONSTRAINT `consulta_especialidadFK2` FOREIGN KEY (`id_especilaidad`) REFERENCES `especialidades` (`id_especialidad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consulta_especialidad`
--

LOCK TABLES `consulta_especialidad` WRITE;
/*!40000 ALTER TABLE `consulta_especialidad` DISABLE KEYS */;
/*!40000 ALTER TABLE `consulta_especialidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consultas`
--

DROP TABLE IF EXISTS `consultas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `consultas` (
  `id_persona` int(11) NOT NULL,
  `cve_consulta` varchar(10) NOT NULL,
  `fecha_consulta` date DEFAULT NULL,
  `sintomas` text,
  `id_medico` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_persona`,`cve_consulta`),
  KEY `consultaFK2` (`id_medico`),
  CONSTRAINT `consultaFK1` FOREIGN KEY (`id_persona`) REFERENCES `pacientes` (`id_persona`),
  CONSTRAINT `consultaFK2` FOREIGN KEY (`id_medico`) REFERENCES `medicos` (`id_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consultas`
--

LOCK TABLES `consultas` WRITE;
/*!40000 ALTER TABLE `consultas` DISABLE KEYS */;
/*!40000 ALTER TABLE `consultas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `covid19`
--

DROP TABLE IF EXISTS `covid19`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `covid19` (
  `id_perosna` int(11) NOT NULL,
  `status` char(10) DEFAULT NULL,
  PRIMARY KEY (`id_perosna`),
  CONSTRAINT `covid19FK1` FOREIGN KEY (`id_perosna`) REFERENCES `pacientes` (`id_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `covid19`
--

LOCK TABLES `covid19` WRITE;
/*!40000 ALTER TABLE `covid19` DISABLE KEYS */;
/*!40000 ALTER TABLE `covid19` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cronicas_paciente`
--

DROP TABLE IF EXISTS `cronicas_paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cronicas_paciente` (
  `id_persona` int(11) NOT NULL,
  `id_cronica` int(11) NOT NULL,
  PRIMARY KEY (`id_persona`,`id_cronica`),
  KEY `cronicas_pacienteFK2` (`id_cronica`),
  CONSTRAINT `cronicas_pacienteFK1` FOREIGN KEY (`id_persona`) REFERENCES `pacientes` (`id_persona`),
  CONSTRAINT `cronicas_pacienteFK2` FOREIGN KEY (`id_cronica`) REFERENCES `enfermedades_cronicas` (`id_cronica`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cronicas_paciente`
--

LOCK TABLES `cronicas_paciente` WRITE;
/*!40000 ALTER TABLE `cronicas_paciente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cronicas_paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `domicilios`
--

DROP TABLE IF EXISTS `domicilios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `domicilios` (
  `id_persona` int(11) NOT NULL,
  `cve_domicilio` varchar(5) NOT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `id_tipo_dom` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_persona`,`cve_domicilio`),
  CONSTRAINT `domiciliosFK1` FOREIGN KEY (`id_persona`) REFERENCES `pacientes` (`id_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `domicilios`
--

LOCK TABLES `domicilios` WRITE;
/*!40000 ALTER TABLE `domicilios` DISABLE KEYS */;
/*!40000 ALTER TABLE `domicilios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enfermedades_cronicas`
--

DROP TABLE IF EXISTS `enfermedades_cronicas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `enfermedades_cronicas` (
  `id_cronica` int(11) NOT NULL AUTO_INCREMENT,
  `enf_cronica` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_cronica`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enfermedades_cronicas`
--

LOCK TABLES `enfermedades_cronicas` WRITE;
/*!40000 ALTER TABLE `enfermedades_cronicas` DISABLE KEYS */;
/*!40000 ALTER TABLE `enfermedades_cronicas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `especialidades`
--

DROP TABLE IF EXISTS `especialidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `especialidades` (
  `id_especialidad` int(11) NOT NULL AUTO_INCREMENT,
  `especialidad` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_especialidad`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especialidades`
--

LOCK TABLES `especialidades` WRITE;
/*!40000 ALTER TABLE `especialidades` DISABLE KEYS */;
INSERT INTO `especialidades` VALUES (8,'Infectología'),(11,'Neumología'),(12,'Pediatría'),(14,'Otorrinolaringología'),(15,'Inmunología'),(16,'Farmacología'),(17,'Medicina intensiva'),(18,'Geriatría');
/*!40000 ALTER TABLE `especialidades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evidencias`
--

DROP TABLE IF EXISTS `evidencias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evidencias` (
  `id_persona` int(11) NOT NULL,
  `cve_consulta` varchar(10) NOT NULL,
  `cve_evidencia` varchar(10) NOT NULL,
  `evidencia` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_persona`,`cve_consulta`,`cve_evidencia`),
  CONSTRAINT `evidenciasFK1` FOREIGN KEY (`id_persona`, `cve_consulta`) REFERENCES `consultas` (`id_persona`, `cve_consulta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evidencias`
--

LOCK TABLES `evidencias` WRITE;
/*!40000 ALTER TABLE `evidencias` DISABLE KEYS */;
/*!40000 ALTER TABLE `evidencias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facturas`
--

DROP TABLE IF EXISTS `facturas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `facturas` (
  `id_persona` int(11) NOT NULL,
  `cve_consulta` varchar(10) NOT NULL,
  `RFC` varchar(12) DEFAULT NULL,
  `id_pago` int(11) DEFAULT NULL,
  `cve_domicilio` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id_persona`,`cve_consulta`),
  KEY `facturasFK2` (`id_pago`),
  KEY `facturasFK3` (`id_persona`,`cve_domicilio`),
  CONSTRAINT `facturasFK1` FOREIGN KEY (`id_persona`, `cve_consulta`) REFERENCES `consultas` (`id_persona`, `cve_consulta`),
  CONSTRAINT `facturasFK2` FOREIGN KEY (`id_pago`) REFERENCES `pagos` (`id_pago`),
  CONSTRAINT `facturasFK3` FOREIGN KEY (`id_persona`, `cve_domicilio`) REFERENCES `domicilios` (`id_persona`, `cve_domicilio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facturas`
--

LOCK TABLES `facturas` WRITE;
/*!40000 ALTER TABLE `facturas` DISABLE KEYS */;
/*!40000 ALTER TABLE `facturas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (40);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicamentos`
--

DROP TABLE IF EXISTS `medicamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicamentos` (
  `id_medicamento` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_medicamento` varchar(40) DEFAULT NULL,
  `costo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_medicamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicamentos`
--

LOCK TABLES `medicamentos` WRITE;
/*!40000 ALTER TABLE `medicamentos` DISABLE KEYS */;
/*!40000 ALTER TABLE `medicamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicamentos_recetas`
--

DROP TABLE IF EXISTS `medicamentos_recetas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicamentos_recetas` (
  `id_medicamento` int(11) NOT NULL,
  `id_persona` int(11) NOT NULL,
  `cve_consulta` varchar(10) NOT NULL,
  PRIMARY KEY (`id_medicamento`,`id_persona`),
  KEY `medicamentos_recetasFK2` (`id_persona`,`cve_consulta`),
  CONSTRAINT `medicamentos_recetasFK1` FOREIGN KEY (`id_medicamento`) REFERENCES `medicamentos` (`id_medicamento`),
  CONSTRAINT `medicamentos_recetasFK2` FOREIGN KEY (`id_persona`, `cve_consulta`) REFERENCES `recetas` (`id_persona`, `cve_consulta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicamentos_recetas`
--

LOCK TABLES `medicamentos_recetas` WRITE;
/*!40000 ALTER TABLE `medicamentos_recetas` DISABLE KEYS */;
/*!40000 ALTER TABLE `medicamentos_recetas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medico_especialidad`
--

DROP TABLE IF EXISTS `medico_especialidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medico_especialidad` (
  `id_persona` int(11) NOT NULL,
  `id_especialidad` int(11) NOT NULL,
  PRIMARY KEY (`id_persona`,`id_especialidad`),
  KEY `medico_especialidadFK2` (`id_especialidad`),
  CONSTRAINT `medico_especialidadFK1` FOREIGN KEY (`id_persona`) REFERENCES `medicos` (`id_persona`),
  CONSTRAINT `medico_especialidadFK2` FOREIGN KEY (`id_especialidad`) REFERENCES `especialidades` (`id_especialidad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico_especialidad`
--

LOCK TABLES `medico_especialidad` WRITE;
/*!40000 ALTER TABLE `medico_especialidad` DISABLE KEYS */;
INSERT INTO `medico_especialidad` VALUES (1,8),(1,11),(33,16),(31,18);
/*!40000 ALTER TABLE `medico_especialidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicos`
--

DROP TABLE IF EXISTS `medicos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicos` (
  `id_persona` int(11) NOT NULL,
  `numero_cedula` int(11) NOT NULL,
  PRIMARY KEY (`id_persona`),
  UNIQUE KEY `numero_cedula` (`numero_cedula`),
  CONSTRAINT `medicosFK1` FOREIGN KEY (`id_persona`) REFERENCES `personas` (`id_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicos`
--

LOCK TABLES `medicos` WRITE;
/*!40000 ALTER TABLE `medicos` DISABLE KEYS */;
INSERT INTO `medicos` VALUES (1,1),(24,10203040),(29,20304050),(31,30405060),(33,40506070);
/*!40000 ALTER TABLE `medicos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `metodos_pago`
--

DROP TABLE IF EXISTS `metodos_pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `metodos_pago` (
  `id_metodo` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id_metodo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `metodos_pago`
--

LOCK TABLES `metodos_pago` WRITE;
/*!40000 ALTER TABLE `metodos_pago` DISABLE KEYS */;
/*!40000 ALTER TABLE `metodos_pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paciente_metodos`
--

DROP TABLE IF EXISTS `paciente_metodos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paciente_metodos` (
  `id_persona` int(11) NOT NULL,
  `id_metodo` int(11) NOT NULL,
  PRIMARY KEY (`id_persona`,`id_metodo`),
  KEY `paciente_metodosFK2` (`id_metodo`),
  CONSTRAINT `paciente_metodosFK1` FOREIGN KEY (`id_persona`) REFERENCES `pacientes` (`id_persona`),
  CONSTRAINT `paciente_metodosFK2` FOREIGN KEY (`id_metodo`) REFERENCES `metodos_pago` (`id_metodo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente_metodos`
--

LOCK TABLES `paciente_metodos` WRITE;
/*!40000 ALTER TABLE `paciente_metodos` DISABLE KEYS */;
/*!40000 ALTER TABLE `paciente_metodos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pacientes`
--

DROP TABLE IF EXISTS `pacientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pacientes` (
  `id_persona` int(11) NOT NULL,
  `fecha_nac` date DEFAULT NULL,
  PRIMARY KEY (`id_persona`),
  CONSTRAINT `pacientesFK1` FOREIGN KEY (`id_persona`) REFERENCES `personas` (`id_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pacientes`
--

LOCK TABLES `pacientes` WRITE;
/*!40000 ALTER TABLE `pacientes` DISABLE KEYS */;
INSERT INTO `pacientes` VALUES (7,NULL),(21,'2020-05-22'),(23,'2020-05-23'),(27,'1970-02-20');
/*!40000 ALTER TABLE `pacientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagos`
--

DROP TABLE IF EXISTS `pagos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pagos` (
  `id_pago` int(11) NOT NULL AUTO_INCREMENT,
  `id_metodo` int(11) DEFAULT NULL,
  `monto` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_pago`),
  KEY `pagosFK1` (`id_metodo`),
  CONSTRAINT `pagosFK1` FOREIGN KEY (`id_metodo`) REFERENCES `metodos_pago` (`id_metodo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagos`
--

LOCK TABLES `pagos` WRITE;
/*!40000 ALTER TABLE `pagos` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagos_paypal`
--

DROP TABLE IF EXISTS `pagos_paypal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pagos_paypal` (
  `id_metodo` int(11) NOT NULL,
  `cuenta_paypal` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_metodo`),
  CONSTRAINT `pagos_paypalFK1` FOREIGN KEY (`id_metodo`) REFERENCES `metodos_pago` (`id_metodo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagos_paypal`
--

LOCK TABLES `pagos_paypal` WRITE;
/*!40000 ALTER TABLE `pagos_paypal` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagos_paypal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagos_tarjetas`
--

DROP TABLE IF EXISTS `pagos_tarjetas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pagos_tarjetas` (
  `id_metodo` int(11) NOT NULL,
  `no_tarjeta` int(11) NOT NULL,
  `nombre_responsable` varchar(40) NOT NULL,
  `vigencia` varchar(5) NOT NULL,
  `cvc` varchar(4) NOT NULL,
  PRIMARY KEY (`id_metodo`),
  CONSTRAINT `pagos_tarjetasFK1` FOREIGN KEY (`id_metodo`) REFERENCES `metodos_pago` (`id_metodo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagos_tarjetas`
--

LOCK TABLES `pagos_tarjetas` WRITE;
/*!40000 ALTER TABLE `pagos_tarjetas` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagos_tarjetas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personas`
--

DROP TABLE IF EXISTS `personas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `personas` (
  `id_persona` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL,
  `pais` varchar(20) DEFAULT NULL,
  `municipio` varchar(30) DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_persona`),
  KEY `personasFK1` (`id_usuario`),
  CONSTRAINT `personasFK1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personas`
--

LOCK TABLES `personas` WRITE;
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT INTO `personas` VALUES (1,'Juan1','Perez1','México','Michoacan','03146111123',NULL,NULL,NULL),(2,'Juan2','Perez2','México','Guerrero','03146111124',NULL,NULL,NULL),(3,'Juan3','Perez3','México','Nuevo Leon','03146111125',NULL,NULL,NULL),(4,'Juan4','Perez4','México','Jalisco','03146111126',NULL,NULL,NULL),(5,'Angelica','Guanajuato','México','Xichu','03146111126',NULL,NULL,NULL),(6,'Valeria','Guanajuato','México','Salvatierra','03146111129',NULL,NULL,NULL),(7,'Luz Natalia','Guanajuato','México','Celaya','03146111129','Villanueva Medina','sesame street',NULL),(21,'gordo','guanajuato','mexico','celaya','123456','mendoza','enrique segoviano',NULL),(22,'Juan','guanajuato','mexico','celaya','123456','De dios','enrique segoviano',NULL),(23,'Valeria','Nuevo Leon','Mexico','Monterrey','123456','Cerritos Castañeda','Col del valle',NULL),(24,'Patricio','Ciudad Juarez','Mexico','Chihuahua','45454545','Cedeño Martinez','Heroes de La Revolución, 32696 ',25),(27,'Margarita','Jalisco','Mexico','Guanatos','12345678','Fernandez Ramirez','Col Niños heroes #123',26),(29,'Daniela Aranza','Estado de Mexico','Mexico','Toluca','45454545','Mancera Berentia','Calle de los doctores #1234',28),(31,'Rosa Aurora','Colima','Mexico','Ixtlahuacán','99999999','Cervantes Leal','Col Los rosales #201',30),(33,'Arturo','Chiapas','Mexico','Francisco León','88888888','Hernandez Montes','calle los arrozales #109',32);
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recetas`
--

DROP TABLE IF EXISTS `recetas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recetas` (
  `id_persona` int(11) NOT NULL,
  `cve_consulta` varchar(10) NOT NULL,
  `indicaciones` text,
  `fecha_receta` date DEFAULT NULL,
  PRIMARY KEY (`id_persona`,`cve_consulta`),
  CONSTRAINT `recetasFK1` FOREIGN KEY (`id_persona`, `cve_consulta`) REFERENCES `consultas` (`id_persona`, `cve_consulta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recetas`
--

LOCK TABLES `recetas` WRITE;
/*!40000 ALTER TABLE `recetas` DISABLE KEYS */;
/*!40000 ALTER TABLE `recetas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roles` (
  `id_rol` int(11) NOT NULL AUTO_INCREMENT,
  `rol` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_rol`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'medico'),(2,'paciente');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles_usuario`
--

DROP TABLE IF EXISTS `roles_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roles_usuario` (
  `id_usuario` int(11) NOT NULL,
  `id_rol` int(11) NOT NULL,
  PRIMARY KEY (`id_usuario`,`id_rol`),
  KEY `roles_usuarioFK2` (`id_rol`),
  CONSTRAINT `roles_usuarioFK1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`),
  CONSTRAINT `roles_usuarioFK2` FOREIGN KEY (`id_rol`) REFERENCES `roles` (`id_rol`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles_usuario`
--

LOCK TABLES `roles_usuario` WRITE;
/*!40000 ALTER TABLE `roles_usuario` DISABLE KEYS */;
INSERT INTO `roles_usuario` VALUES (25,1),(32,1),(26,2),(28,2),(30,2);
/*!40000 ALTER TABLE `roles_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicios`
--

DROP TABLE IF EXISTS `servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servicios` (
  `id_servicio` int(11) NOT NULL AUTO_INCREMENT,
  `servicio` varchar(50) DEFAULT NULL,
  `costo` int(11) DEFAULT NULL,
  `id_persona` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_servicio`),
  KEY `serviciosFK1` (`id_persona`),
  CONSTRAINT `serviciosFK1` FOREIGN KEY (`id_persona`) REFERENCES `medicos` (`id_persona`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicios`
--

LOCK TABLES `servicios` WRITE;
/*!40000 ALTER TABLE `servicios` DISABLE KEYS */;
INSERT INTO `servicios` VALUES (38,'Servicio Basico',1233,33),(39,'Servicio Intermedio',1000,33);
/*!40000 ALTER TABLE `servicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tasks`
--

DROP TABLE IF EXISTS `tasks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tasks` (
  `task_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `start_date` date DEFAULT NULL,
  `due_date` date DEFAULT NULL,
  `status` tinyint(4) NOT NULL,
  `priority` tinyint(4) NOT NULL,
  `description` text,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tasks`
--

LOCK TABLES `tasks` WRITE;
/*!40000 ALTER TABLE `tasks` DISABLE KEYS */;
/*!40000 ALTER TABLE `tasks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_dom`
--

DROP TABLE IF EXISTS `tipo_dom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_dom` (
  `id_tipo_dom` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id_tipo_dom`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_dom`
--

LOCK TABLES `tipo_dom` WRITE;
/*!40000 ALTER TABLE `tipo_dom` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_dom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(30) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `usuarios_unique1` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (25,'test@mail.com','testpass'),(26,'margarita1@mail.com','margipass'),(28,'daniela1@mail.com','danipass'),(30,'rosa1@mail.com','rosapass'),(32,'arturo1@mail.com','arturopass');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-24 16:34:28
