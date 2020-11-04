/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : mybatis_research

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2020-11-03 12:17:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for csdn_entity
-- ----------------------------
DROP TABLE IF EXISTS `csdn_entity`;
CREATE TABLE `csdn_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `content` blob,
  `author` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of csdn_entity
-- ----------------------------
