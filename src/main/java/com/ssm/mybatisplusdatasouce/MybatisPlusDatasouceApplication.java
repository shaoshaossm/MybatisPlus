package com.ssm.mybatisplusdatasouce;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ssm.mybatisplusdatasouce.mapper")
public class MybatisPlusDatasouceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusDatasouceApplication.class, args);
    }

}
