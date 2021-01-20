CREATE DATABASE `xtracker`;
USE `xtracker`;

DROP TABLE IF EXISTS `user_accounts`;
CREATE TABLE `user_accounts` (
  `accountId`   INT(10)    NOT NULL,
  `email`       VARCHAR(100)    NOT NULL,
  `password`    VARCHAR(100)    NOT NULL,
  `first_name`  VARCHAR(50)     NOT NULL,
  `last_name`   VARCHAR(50)     NOT NULL,
  `user_type`   VARCHAR(50)     NOT NULL,
  `api_key`     VARCHAR(100)    NOT NULL,
  `status`      VARCHAR(10)     NOT NULL,
  PRIMARY KEY (`accountId`),
  UNIQUE KEY `accountId` (`accountId`, `email`)
);
