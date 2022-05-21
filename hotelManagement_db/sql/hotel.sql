/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : hotel

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2017-07-20 16:56:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for rooms
-- ----------------------------
DROP TABLE IF EXISTS `rooms`;
CREATE TABLE `rooms` (
  `number` int(255) NOT NULL AUTO_INCREMENT,
  `roompass` int(255) NOT NULL,
  `price` int(255) NOT NULL,
  `style` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL DEFAULT '未订',
  PRIMARY KEY (`number`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rooms
-- ----------------------------
INSERT INTO `rooms` VALUES ('1', '111', '11', '大床房', '未订');
INSERT INTO `rooms` VALUES ('3', '333', '33', '双人间', '未订');
INSERT INTO `rooms` VALUES ('4', '444', '44', '豪华单人间', '未订');
INSERT INTO `rooms` VALUES ('5', '555', '55', '豪华大床房', '未订');
INSERT INTO `rooms` VALUES ('6', '666', '66', '豪华双人房', '未订');
INSERT INTO `rooms` VALUES ('7', '777', '77', '总统套房', '未订');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `idnumber` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `tel` varchar(255) NOT NULL,
  PRIMARY KEY (`idnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('123', 'zhangsan', '123', '123');
INSERT INTO `users` VALUES ('123456', 'admin', 'admin', '123456');
INSERT INTO `users` VALUES ('456', 'lisi', '456', '456');
INSERT INTO `users` VALUES ('789', 'wangwu', '789', '789');
