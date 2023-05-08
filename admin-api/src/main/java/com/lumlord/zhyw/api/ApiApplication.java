package com.lumlord.zhyw.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created on 2023/4/28
 *
 * @author huangwx
 * Description:
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.lumlord.zhyw")
@MapperScan("com.lumlord.zhyw.mappers")
@EntityScan("com.lumlord.zhyw.bean.entity")
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
        System.out.println("Asdasd");
    }
}
