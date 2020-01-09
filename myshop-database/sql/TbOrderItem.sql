-- auto Generated on 2020-01-08
-- DROP TABLE IF EXISTS myshop.tb_order_item;
CREATE TABLE myshop.tb_order_item(
	id VARCHAR (50) NOT NULL COMMENT 'id',
	item_id VARCHAR (50) NOT NULL DEFAULT '' COMMENT '商品id',
	order_id VARCHAR (50) NOT NULL DEFAULT '' COMMENT '订单id',
	num INT (11) NOT NULL DEFAULT -1 COMMENT '商品购买数量',
	title VARCHAR (50) NOT NULL DEFAULT '' COMMENT '商品标题',
	price BIGINT (15) NOT NULL DEFAULT -1 COMMENT '商品单价',
	total_fee BIGINT (15) NOT NULL DEFAULT -1 COMMENT '商品总金额',
	pic_path VARCHAR (50) NOT NULL DEFAULT '' COMMENT '商品图片地址',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'myshop.tb_order_item';
