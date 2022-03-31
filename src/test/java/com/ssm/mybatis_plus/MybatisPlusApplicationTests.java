package com.ssm.mybatis_plus;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ssm.mybatis_plus.mapper.UserMapper;
import com.ssm.mybatis_plus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
    @Test//测试插入
    public void insertTest(){
        User user = new User();
        user.setId(111121l);
        user.setName("hxl2");
        user.setAge(18);
        user.setEmail("1600767556@qq.com");
        Integer result = userMapper.insert(user); //会帮我们自动生成id
        System.out.println(result); //受影响的行数
        System.out.println(user); //通过日志发现id会自动回填
    }
    @Test//测试更新
    public void updateTest(){
        User user = new User();
        user.setId(5L);//怎么改id？？
        //通过条件自动拼接动态Sql
        user.setName("root");
        user.setAge(12);
        user.setEmail("root@qq.com");
        int i = userMapper.updateById(user);//updateById，但是参数是个user
        System.out.println(i);
    }
    @Test //测试删除
    public void  testDelete(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","hxl2");
        map.put("age",18);
        int result = userMapper.deleteByMap(map);
        System.out.println("result:"+result);
    }
    @Test //测试删除
    public void  testDelete2(){
        int result = userMapper.deleteById(1508724348663631882l);
        System.out.println("result:"+result);
    }
    @Test //测试删除
    public void  testDelete3(){

        List<Long> list = Arrays.asList(1l,2l,3l);
        int result = userMapper.deleteBatchIds(list);
        System.out.println("result:"+result);
    }
    @Test
    public void testSelect(){
        User user = userMapper.selectById("4");
        System.out.println("user:"+user);
    }
    @Test
    public void testSelect2(){
        List<Long> list = Arrays.asList(4l,5l);
        List<User> user =  userMapper.selectBatchIds(list);
        user.forEach(System.out::println);
    }
    @Test
    public void testSelect3(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","Billie");
        map.put("age",24);
        List<User> result = userMapper.selectByMap(map);
        System.out.println("result:"+result);
    }

    @Test
    public void testSelect4(){
        // 没有条件
        List<User> result = userMapper.selectList(null);
        System.out.println("result:"+result);
    }

    @Test
    public void testSelect5(){
        // 自定义
        Map<String,Object> map = userMapper.selectMapById(4L);
        System.out.println("map:"+map);
    }
}
