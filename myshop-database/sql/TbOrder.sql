-- auto Generated on 2020-01-08
-- DROP TABLE IF EXISTS myshop.tb_order;
CREATE TABLE myshop.tb_order(
	order_id VARCHAR (50) NOT NULL COMMENT '订单id',
	payment VARCHAR (50) NOT NULL DEFAULT '' COMMENT '实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分',
	payment_type INT (11) NOT NULL DEFAULT -1 COMMENT '支付类型，1、在线支付，2、货到付款',
	post_fee VARCHAR (50) NOT NULL DEFAULT '' COMMENT '邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分',
	`status` INT (11) NOT NULL DEFAULT -1 COMMENT '状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭',
	created_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	updated_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	payment_time DATETIME NULL COMMENT '付款时间',
	consign_time DATETIME NULL COMMENT '发货时间',
	end_time DATETIME NULL COMMENT '交易完成时间',
	close_time DATETIME NULL COMMENT '交易关闭时间',
	shipping_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT '物流名称',
	shipping_code VARCHAR (50) NOT NULL DEFAULT '' COMMENT '物流单号',
	user_id BIGINT (15) NOT NULL DEFAULT -1 COMMENT '用户id',
	buyer_message VARCHAR (50) NOT NULL DEFAULT '' COMMENT '买家留言',
	buyer_nick VARCHAR (50) NOT NULL DEFAULT '' COMMENT '买家昵称',
	buyer_rate INT (11) NOT NULL DEFAULT -1 COMMENT '买家是否已经评价',
	PRIMARY KEY (order_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'myshop.tb_order';
