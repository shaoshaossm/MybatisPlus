package com.ssm.mybatis_plus.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.ssm.mybatis_plus.enums.SexEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/3/28 17:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@TableName("t_user")
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private SexEnum sex;
    //字段  字段添加填充内容
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @TableLogic
    private Integer isDeleted;
}
