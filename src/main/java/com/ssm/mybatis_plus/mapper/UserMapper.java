package com.ssm.mybatis_plus.mapper;
import com.ssm.mybatis_plus.enums.SexEnum;
import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ssm.mybatis_plus.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/3/28 17:29
 */
//在对应的接口上面继承一个基本的接口 BaseMapper
@Repository
public interface UserMapper extends BaseMapper<User> {
    /**
     * 根据id查询用户信心
     * @param id
     * @return
     */
    Map<String,Object> selectMapById(Long id);
    //所有CRUD操作都编写完成了
    Page<User> selectPageVo(@Param("page") Page<User> page,@Param("age") Integer age);

    List<User> selectAllOrderByAgeDesc();

    int insertSelective(User user);

    int deleteByIdAndUserName(@Param("id") Long id);

    int updateAgeAndSexById(@Param("age") Integer age, @Param("sex") SexEnum sex, @Param("id") Long id);

    List<User> selectAllByAgeanAndSex(@Param("age") Integer age);
}
