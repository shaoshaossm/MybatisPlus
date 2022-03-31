package com.ssm.mybatisplusdatasouce;


import com.ssm.mybatisplusdatasouce.service.ProductService;
import com.ssm.mybatisplusdatasouce.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusDatasouceApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Test
    public void test() {
        // 测试
        System.out.println(userService.getById(5L));
        System.out.println(productService.getById(1L));
    }
}
