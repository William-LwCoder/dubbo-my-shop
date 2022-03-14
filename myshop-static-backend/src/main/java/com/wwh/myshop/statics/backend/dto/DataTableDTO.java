package com.wwh.myshop.statics.backend.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Bootstrap DataTable 数据传输对象
 * <p>Title: DataTableDTO</p>
 * <p>Description: </p>
 *
 * @author William
 * @version 1.0.0
 * @date 2022/1/31 23:17
 */
@Data
public class DataTableDTO<T> implements Serializable {
    private int draw;
    private long recordsTotal;
    private long recordsFiltered;
    private List<T> data;
    private String error;
}
