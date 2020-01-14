package com.fun.uncle.myshop.statics.backend.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/13  13:43
 * @Version: 0.0.1-SNAPSHOT
 */
@Data
public class DataTableDTO<T> implements Serializable {
    private int draw;
    private long recordsTotal;
    private long recordsFiltered;
    private List<T> data;
    private String error;
}
