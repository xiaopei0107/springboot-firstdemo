package com.zxp.springbootfirstdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.zxp.dao")
@ComponentScan(basePackages = {"com.zxp.*"})
public class SpringbootFirstdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFirstdemoApplication.class, args);
    }
}
