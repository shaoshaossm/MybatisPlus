package com.ssm.mybatisplusdatasouce.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ssm.mybatisplusdatasouce.entity.User;
import com.ssm.mybatisplusdatasouce.mapper.UserMapper;
import com.ssm.mybatisplusdatasouce.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/3/31 12:42
 */
@Service
@DS("master") // 指定所操作的数据源
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
