-- auto Generated on 2020-01-08
-- DROP TABLE IF EXISTS myshop.tb_user;
CREATE TABLE myshop.tb_user(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	username VARCHAR (50) NOT NULL DEFAULT '' COMMENT '用户名',
	`password` VARCHAR (50) NOT NULL DEFAULT '' COMMENT '密码，加密存储',
	phone VARCHAR (50) NOT NULL DEFAULT '' COMMENT '注册手机号',
	email VARCHAR (50) NOT NULL DEFAULT '' COMMENT '注册邮箱',
	created DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	updated DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'myshop.tb_user';
