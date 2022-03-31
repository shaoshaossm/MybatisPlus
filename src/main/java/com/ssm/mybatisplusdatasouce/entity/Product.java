package com.ssm.mybatisplusdatasouce.entity;

import lombok.Data;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/3/31 12:01
 */
@Data
public class Product {
    private Integer id;
    private String name;
    private Integer price;
    private Integer version;
}
