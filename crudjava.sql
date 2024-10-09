
CREATE DATABASE IF NOT EXISTS `crudjava` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `crudjava`;


CREATE TABLE IF NOT EXISTS `productos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `cantidad` decimal(5,2) DEFAULT NULL,
  `precio` decimal(5,2) DEFAULT NULL,
  `fecha_crear` date DEFAULT NULL,
  `fecha_actualizar` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

