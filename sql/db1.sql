CREATE DATABASE db0;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for main_order_0
-- ----------------------------
DROP TABLE IF EXISTS `main_order_0`;
CREATE TABLE `main_order_0`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `order_no` bigint NULL DEFAULT NULL,
  `user_id` bigint NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for main_order_1
-- ----------------------------
DROP TABLE IF EXISTS `main_order_1`;
CREATE TABLE `main_order_1`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `order_no` bigint NULL DEFAULT NULL,
  `user_id` bigint NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for main_order_2
-- ----------------------------
DROP TABLE IF EXISTS `main_order_2`;
CREATE TABLE `main_order_2`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `order_no` bigint NULL DEFAULT NULL,
  `user_id` bigint NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
