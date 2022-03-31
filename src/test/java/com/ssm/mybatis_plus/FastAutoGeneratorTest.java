package com.ssm.mybatis_plus;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/3/31 11:23
 */
public class FastAutoGeneratorTest {
    public static void main(String[] args) {
        // 设置我们需要创建在哪的路径
        String path = "E:\\ideaProjectAll\\mybatis_plus";
        // 这里我是mysql8 5版本可以换成 jdbc:mysql://localhost:3306/mybatis_plus?characterEncoding=utf-8&useSSL=false
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/mybatis_plus?useSSL=false&serverTimezone=GMT%2B8&allowPublicKeyRetrieval=true", "root", "hxl158120")
                .globalConfig(builder -> {
                    builder.author("ssm") // 设置作者
                            // .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(path); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.ssm") // 设置父包名
                            .moduleName("mybatis_plus") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, path)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("user");// 设置需要生成的表名
//                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                }).templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker 引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
