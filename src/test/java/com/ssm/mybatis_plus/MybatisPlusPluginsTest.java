package com.ssm.mybatis_plus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ssm.mybatis_plus.mapper.ProductMapper;
import com.ssm.mybatis_plus.mapper.UserMapper;
import com.ssm.mybatis_plus.pojo.Product;
import com.ssm.mybatis_plus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sun.misc.Version;

import java.util.List;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/3/30 17:16
 */
@SpringBootTest
public class MybatisPlusPluginsTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void testPage() {
    /*
        SELECT uid AS id,user_name AS name,age,email,is_deleted FROM t_user
        WHERE is_deleted=0 LIMIT ?
     */
        Page<User> page = new Page<>(2, 3);
        userMapper.selectPage(page, null);
        System.out.println(page.getRecords());
        System.out.println("总页数:" + page.getPages());
        System.out.println("总记录数" + page.getTotal());
        System.out.println("是否有上一页" + page.hasNext());
        System.out.println("是否有下一页:" + page.hasPrevious());
    }

    @Test
    public void testSelectPageVo() { //设置分页参数
        Page<User> page = new Page<>(1, 5);
        userMapper.selectPageVo(page, 20);
        //获取分页数据
        List<User> list = page.getRecords();
        list.forEach(System.out::println);
        System.out.println("当前页:" + page.getCurrent());
        System.out.println("每页显示的条数:" + page.getSize());
        System.out.println("总记录数:" + page.getTotal());
        System.out.println("总页数:" + page.getPages());
        System.out.println("是否有上一页:" + page.hasPrevious());
        System.out.println("是否有下一页:" + page.hasNext());
    }

    @Test
    public void testProduct01() {
        Product productLi = productMapper.selectById(1);
        System.out.println("小李查询商品价格" + productLi.getPrice());

        Product productWang = productMapper.selectById(1);
        System.out.println("小王查询商品价格" + productWang.getPrice());
        // 小李将商品价格提高50
        productLi.setPrice(productLi.getPrice() + 50);
        productMapper.updateById(productLi);
        // 小王将商品价格降低30
        productWang.setPrice(productWang.getPrice() - 30);
        int result = productMapper.updateById(productWang);
        if (result == 0){
            Product productNew = productMapper.selectById(1);
            productNew.setPrice(productNew.getPrice()-30);
            productMapper.updateById(productNew);
        }
        // 5.老板查询商品价格
        Product productBoss = productMapper.selectById(1);
        System.out.println("老板查询的商品价格:" + productBoss.getPrice());
    }

}
