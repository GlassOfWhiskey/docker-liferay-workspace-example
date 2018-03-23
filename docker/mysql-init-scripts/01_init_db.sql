USE `sys`;
CREATE DATABASE `lportal` /*!40100 DEFAULT CHARACTER SET utf8 */;
CREATE USER 'lportal'@'%' IDENTIFIED BY 'lportal';
GRANT ALL PRIVILEGES ON lportal.* TO 'lportal'@'%';