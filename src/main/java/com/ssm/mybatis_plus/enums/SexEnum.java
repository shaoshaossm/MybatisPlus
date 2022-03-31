package com.ssm.mybatis_plus.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/3/31 11:05
 */
@Getter // 因为枚举里面都是常量
public enum SexEnum {

    MALE(1, "男"),
    FEMALE(2, "女");

    @EnumValue // 将注解所标识的属性的值存储到数据库中
    private Integer sex;
    private String sexName;

    SexEnum(Integer sex, String sexName) {
        this.sex = sex;
        this.sexName = sexName;
    }
}
