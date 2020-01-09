package com.fun.uncle.myshop.commons.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
* @Description:   
* @Author:         Xian
* @CreateDate:     2020/1/9  10:05
* @Version:        0.0.1-SNAPSHOT
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_item_desc")
public class TbItemDesc implements Serializable {
    /**
     * 商品ID
     */
    @Id
    @Column(name = "item_id")
    @GeneratedValue(generator = "JDBC")
    private Long itemId;

    /**
     * 创建时间
     */
    @Column(name = "created")
    private Date created;

    /**
     * 更新时间
     */
    @Column(name = "updated")
    private Date updated;

    /**
     * 商品描述
     */
    @Column(name = "item_desc")
    private String itemDesc;

    private static final long serialVersionUID = 1L;
}