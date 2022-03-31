package com.ssm.mybatis_plus.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/3/28 21:04
 */
@Slf4j//日志
@Component//丢到springboot里   一定不要忘记把处理器加到Ioc容器中!
public class MyMetaObjectHandler implements MetaObjectHandler {//extends??
    @Override//插入时的填充策略
    public void insertFill(MetaObject metaObject) {
        log.info("==start insert ······==");
        //setFieldValByName(java.lang.String fieldName, java.lang.Object fieldVal, org.apache.ibatis.reflection.MetaObject metaObject)
        this.setFieldValByName("createTIme",new Date(),metaObject);
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }
    @Override//更新时的填充策略
    public void updateFill(MetaObject metaObject) {
        log.info("==start update ······==");
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }

}
