package com.fun.uncle.myshop.service.search.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: solr内的存放的对象
 * @Author: Xian
 * @CreateDate: 2020/1/16  9:21
 * @Version: 0.0.1-SNAPSHOT
 */
@Data
public class TbItemResult implements Serializable {

    private static final long serialVersionUID = 1280735739504145056L;

    private Long id;
    private Long tbItemCid;
    private String tbItemCname;
    private String tbItemTitle;
    private String tbItemSellPoint;
    private String tbItemDesc;
}
