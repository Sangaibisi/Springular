# Springular
- My first full-stack web application which is developed Angular 7 and Spring Framework.

#Database Script
SQL Script for MySQL database
--
CREATE DATABASE  IF NOT EXISTS `customer`;
USE `web_customer_tracker`;

Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

Data for table `customer`
--

INSERT INTO `customer` VALUES 
	(1,'Ahmet','Kismet','abc@xyz.com'),
	(2,'Mehmet','Bahar','abc@xyz.com'),
	(3,'Ivan','Gupta','abc@xyz.com'),
	(4,'Emrullah','YILDIRIM','emrullahyildirim@windowslive.com'),
	(5,'Hasan','USTUN','abc@xyz.com');
