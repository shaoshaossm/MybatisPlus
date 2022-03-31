package com.ssm.mybatis_plus;

import com.ssm.mybatis_plus.enums.SexEnum;
import com.ssm.mybatis_plus.mapper.UserMapper;
import com.ssm.mybatis_plus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/3/31 11:09
 */
@SpringBootTest
public class MyBatisPlusEnumTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        User user = new User();
        user.setName("admin");
        user.setAge(33);
        user.setSex(SexEnum.MALE);
        int result = userMapper.insert(user);
        System.out.println("result = " + result);
    }

}
