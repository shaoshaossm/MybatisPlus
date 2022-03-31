package com.ssm.mybatis_plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ssm.mybatis_plus.mapper.UserMapper;
import com.ssm.mybatis_plus.pojo.User;
import com.ssm.mybatis_plus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/3/29 12:31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
