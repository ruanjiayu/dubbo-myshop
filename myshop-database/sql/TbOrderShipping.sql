-- auto Generated on 2020-01-08
-- DROP TABLE IF EXISTS myshop.tb_order_shipping;
CREATE TABLE myshop.tb_order_shipping(
	order_id VARCHAR (50) NOT NULL COMMENT '订单ID',
	receiver_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT '收货人全名',
	receiver_phone VARCHAR (50) NOT NULL DEFAULT '' COMMENT '固定电话',
	receiver_mobile VARCHAR (50) NOT NULL DEFAULT '' COMMENT '移动电话',
	receiver_state VARCHAR (50) NOT NULL DEFAULT '' COMMENT '省份',
	receiver_city VARCHAR (50) NOT NULL DEFAULT '' COMMENT '城市',
	receiver_district VARCHAR (50) NOT NULL DEFAULT '' COMMENT '区/县',
	receiver_address VARCHAR (50) NOT NULL DEFAULT '' COMMENT '收货地址，如：xx路xx号',
	receiver_zip VARCHAR (50) NOT NULL DEFAULT '' COMMENT '邮政编码,如：310001',
	created DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	updated DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY (order_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'myshop.tb_order_shipping';
