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
-- Dumping data for table `alergias`
--

LOCK TABLES `alergias` WRITE;
/*!40000 ALTER TABLE `alergias` DISABLE KEYS */;
/*!40000 ALTER TABLE `alergias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `alergias_paciente`
--

LOCK TABLES `alergias_paciente` WRITE;
/*!40000 ALTER TABLE `alergias_paciente` DISABLE KEYS */;
/*!40000 ALTER TABLE `alergias_paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `carrito`
--

LOCK TABLES `carrito` WRITE;
/*!40000 ALTER TABLE `carrito` DISABLE KEYS */;
/*!40000 ALTER TABLE `carrito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `cirugias`
--

LOCK TABLES `cirugias` WRITE;
/*!40000 ALTER TABLE `cirugias` DISABLE KEYS */;
/*!40000 ALTER TABLE `cirugias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `cirugias_paciente`
--

LOCK TABLES `cirugias_paciente` WRITE;
/*!40000 ALTER TABLE `cirugias_paciente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cirugias_paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `compras`
--

LOCK TABLES `compras` WRITE;
/*!40000 ALTER TABLE `compras` DISABLE KEYS */;
/*!40000 ALTER TABLE `compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `consulta_especialidad`
--

LOCK TABLES `consulta_especialidad` WRITE;
/*!40000 ALTER TABLE `consulta_especialidad` DISABLE KEYS */;
/*!40000 ALTER TABLE `consulta_especialidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `consultas`
--

LOCK TABLES `consultas` WRITE;
/*!40000 ALTER TABLE `consultas` DISABLE KEYS */;
/*!40000 ALTER TABLE `consultas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `covid19`
--

LOCK TABLES `covid19` WRITE;
/*!40000 ALTER TABLE `covid19` DISABLE KEYS */;
/*!40000 ALTER TABLE `covid19` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `cronicas_paciente`
--

LOCK TABLES `cronicas_paciente` WRITE;
/*!40000 ALTER TABLE `cronicas_paciente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cronicas_paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `domicilios`
--

LOCK TABLES `domicilios` WRITE;
/*!40000 ALTER TABLE `domicilios` DISABLE KEYS */;
/*!40000 ALTER TABLE `domicilios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `enfermedades_cronicas`
--

LOCK TABLES `enfermedades_cronicas` WRITE;
/*!40000 ALTER TABLE `enfermedades_cronicas` DISABLE KEYS */;
/*!40000 ALTER TABLE `enfermedades_cronicas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `especialidades`
--

LOCK TABLES `especialidades` WRITE;
/*!40000 ALTER TABLE `especialidades` DISABLE KEYS */;
INSERT INTO `especialidades` VALUES (8,'Infectología'),(11,'Neumología'),(12,'Pediatría'),(14,'Otorrinolaringología'),(15,'Inmunología'),(16,'Farmacología'),(17,'Medicina intensiva'),(18,'Geriatría');
/*!40000 ALTER TABLE `especialidades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `evidencias`
--

LOCK TABLES `evidencias` WRITE;
/*!40000 ALTER TABLE `evidencias` DISABLE KEYS */;
/*!40000 ALTER TABLE `evidencias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `facturas`
--

LOCK TABLES `facturas` WRITE;
/*!40000 ALTER TABLE `facturas` DISABLE KEYS */;
/*!40000 ALTER TABLE `facturas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `hibernate_sequence`
--

/*LOCK TABLES `hibernate_sequence` WRITE;*/
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
/*INSERT INTO `hibernate_sequence` VALUES (40);*/
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
/*UNLOCK TABLES;*/

--
-- Dumping data for table `medicamentos`
--

LOCK TABLES `medicamentos` WRITE;
/*!40000 ALTER TABLE `medicamentos` DISABLE KEYS */;
/*!40000 ALTER TABLE `medicamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `medicamentos_recetas`
--

LOCK TABLES `medicamentos_recetas` WRITE;
/*!40000 ALTER TABLE `medicamentos_recetas` DISABLE KEYS */;
/*!40000 ALTER TABLE `medicamentos_recetas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `medico_especialidad`
--

LOCK TABLES `medico_especialidad` WRITE;
/*!40000 ALTER TABLE `medico_especialidad` DISABLE KEYS */;
INSERT INTO `medico_especialidad` VALUES (1,8),(1,11),(33,16),(31,18);
/*!40000 ALTER TABLE `medico_especialidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `medicos`
--

LOCK TABLES `medicos` WRITE;
/*!40000 ALTER TABLE `medicos` DISABLE KEYS */;
INSERT INTO `medicos` VALUES (1,1),(24,10203040),(29,20304050),(31,30405060),(33,40506070);
/*!40000 ALTER TABLE `medicos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `metodos_pago`
--

LOCK TABLES `metodos_pago` WRITE;
/*!40000 ALTER TABLE `metodos_pago` DISABLE KEYS */;
/*!40000 ALTER TABLE `metodos_pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `paciente_metodos`
--

LOCK TABLES `paciente_metodos` WRITE;
/*!40000 ALTER TABLE `paciente_metodos` DISABLE KEYS */;
/*!40000 ALTER TABLE `paciente_metodos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `pacientes`
--

LOCK TABLES `pacientes` WRITE;
/*!40000 ALTER TABLE `pacientes` DISABLE KEYS */;
INSERT INTO `pacientes` VALUES (7,NULL),(21,'2020-05-22'),(23,'2020-05-23'),(27,'1970-02-20');
/*!40000 ALTER TABLE `pacientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `pagos`
--

LOCK TABLES `pagos` WRITE;
/*!40000 ALTER TABLE `pagos` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `pagos_paypal`
--

LOCK TABLES `pagos_paypal` WRITE;
/*!40000 ALTER TABLE `pagos_paypal` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagos_paypal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `pagos_tarjetas`
--

LOCK TABLES `pagos_tarjetas` WRITE;
/*!40000 ALTER TABLE `pagos_tarjetas` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagos_tarjetas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `personas`
--

LOCK TABLES `personas` WRITE;
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT INTO `personas` VALUES (1,'Juan1','Perez1','México','Michoacan','03146111123',NULL,NULL,NULL),(2,'Juan2','Perez2','México','Guerrero','03146111124',NULL,NULL,NULL),(3,'Juan3','Perez3','México','Nuevo Leon','03146111125',NULL,NULL,NULL),(4,'Juan4','Perez4','México','Jalisco','03146111126',NULL,NULL,NULL),(5,'Angelica','Guanajuato','México','Xichu','03146111126',NULL,NULL,NULL),(6,'Valeria','Guanajuato','México','Salvatierra','03146111129',NULL,NULL,NULL),(7,'Luz Natalia','Guanajuato','México','Celaya','03146111129','Villanueva Medina','sesame street',NULL),(21,'gordo','guanajuato','mexico','celaya','123456','mendoza','enrique segoviano',NULL),(22,'Juan','guanajuato','mexico','celaya','123456','De dios','enrique segoviano',NULL),(23,'Valeria','Nuevo Leon','Mexico','Monterrey','123456','Cerritos Castañeda','Col del valle',NULL),(24,'Patricio','Ciudad Juarez','Mexico','Chihuahua','45454545','Cedeño Martinez','Heroes de La Revolución, 32696 ',25),(27,'Margarita','Jalisco','Mexico','Guanatos','12345678','Fernandez Ramirez','Col Niños heroes #123',26),(29,'Daniela Aranza','Estado de Mexico','Mexico','Toluca','45454545','Mancera Berentia','Calle de los doctores #1234',28),(31,'Rosa Aurora','Colima','Mexico','Ixtlahuacán','99999999','Cervantes Leal','Col Los rosales #201',30),(33,'Arturo','Chiapas','Mexico','Francisco León','88888888','Hernandez Montes','calle los arrozales #109',32);
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `recetas`
--

LOCK TABLES `recetas` WRITE;
/*!40000 ALTER TABLE `recetas` DISABLE KEYS */;
/*!40000 ALTER TABLE `recetas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'medico'),(2,'paciente');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `roles_usuario`
--

LOCK TABLES `roles_usuario` WRITE;
/*!40000 ALTER TABLE `roles_usuario` DISABLE KEYS */;
INSERT INTO `roles_usuario` VALUES (25,1),(32,1),(26,2),(28,2),(30,2);
/*!40000 ALTER TABLE `roles_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `servicios`
--

LOCK TABLES `servicios` WRITE;
/*!40000 ALTER TABLE `servicios` DISABLE KEYS */;
INSERT INTO `servicios` VALUES (38,'Servicio Basico',1233,33),(39,'Servicio Intermedio',1000,33);
/*!40000 ALTER TABLE `servicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tasks`
--

LOCK TABLES `tasks` WRITE;
/*!40000 ALTER TABLE `tasks` DISABLE KEYS */;
/*!40000 ALTER TABLE `tasks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tipo_dom`
--

LOCK TABLES `tipo_dom` WRITE;
/*!40000 ALTER TABLE `tipo_dom` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_dom` ENABLE KEYS */;
UNLOCK TABLES;

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

-- Dump completed on 2020-05-24 16:06:41
