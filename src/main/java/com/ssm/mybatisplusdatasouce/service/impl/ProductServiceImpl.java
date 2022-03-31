package com.ssm.mybatisplusdatasouce.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ssm.mybatisplusdatasouce.entity.Product;
import com.ssm.mybatisplusdatasouce.mapper.ProductMapper;
import com.ssm.mybatisplusdatasouce.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/3/31 12:44
 */
@Service
@DS("slave_1") // 要操作的数据源
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
