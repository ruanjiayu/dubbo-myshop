-- auto Generated on 2020-01-08
-- DROP TABLE IF EXISTS myshop.tb_item_cat;
CREATE TABLE myshop.tb_item_cat(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '类目ID',
	parent_id BIGINT (15) NOT NULL DEFAULT -1 COMMENT '父类目ID=0时，代表的是一级的类目',
	`name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT '类目名称',
	`status` INT (11) NOT NULL DEFAULT -1 COMMENT '状态。可选值:1(正常),2(删除)',
	sort_order INT (11) NOT NULL DEFAULT -1 COMMENT '排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数',
	is_parent TINYINT (3) NOT NULL DEFAULT 0 COMMENT '该类目是否为父类目，1为true，0为false',
	created DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	updated DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'myshop.tb_item_cat';
