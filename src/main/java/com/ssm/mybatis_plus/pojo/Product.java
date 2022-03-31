package com.ssm.mybatis_plus.pojo;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/3/31 9:58
 */
@Data
public class Product {
    private Long id;
    private String name;
    private Integer price;
    @Version
    private Integer version;
}
