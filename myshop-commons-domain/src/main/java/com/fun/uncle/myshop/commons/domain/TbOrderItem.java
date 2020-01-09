package com.fun.uncle.myshop.commons.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
* @Description:   
* @Author:         Xian
* @CreateDate:     2020/1/9  10:05
* @Version:        0.0.1-SNAPSHOT
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_order_item")
public class TbOrderItem implements Serializable {
    /**
     * id
     */
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 商品id
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 商品购买数量
     */
    @Column(name = "num")
    private Integer num;

    /**
     * 商品标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 商品单价
     */
    @Column(name = "price")
    private Long price;

    /**
     * 商品总金额
     */
    @Column(name = "total_fee")
    private Integer totalFee;

    /**
     * 商品图片地址
     */
    @Column(name = "pic_path")
    private String picPath;

    private static final long serialVersionUID = 1L;
}