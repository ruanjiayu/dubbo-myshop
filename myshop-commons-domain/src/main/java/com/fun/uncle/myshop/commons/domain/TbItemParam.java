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
@Table(name = "tb_item_param")
public class TbItemParam implements Serializable {
    /**
     * id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 商品类目ID
     */
    @Column(name = "item_cat_id")
    private Long itemCatId;

    /**
     * created
     */
    @Column(name = "created")
    private Date created;

    /**
     * updated
     */
    @Column(name = "updated")
    private Date updated;

    /**
     * 参数数据，格式为json格式
     */
    @Column(name = "param_data")
    private String paramData;

    private static final long serialVersionUID = 1L;
}