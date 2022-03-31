package com.ssm.mybatis_plus;

import com.ssm.mybatis_plus.pojo.User;
import com.ssm.mybatis_plus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/3/29 12:36
 */
@SpringBootTest
public class MybatisPlusServiceTests {
    @Autowired
    private UserService userService;
    @Test
    public void testGetCount(){
        long count = userService.count(null);
        System.out.println("总记录数"+count);

    }

    /**
     * 批量添加
     */
    @Test
    public void testInsertMore(){
        ArrayList<User> list = new ArrayList<>();
        for (int i = 0; i <=10 ; i++) {
            User user = new User();
            user.setAge(20+i);
            user.setName("ssm"+i);
            list.add(user);
        }
        boolean b = userService.saveBatch(list);
        System.out.println(b);
    }
}
