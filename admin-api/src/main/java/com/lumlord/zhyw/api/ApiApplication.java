package com.lumlord.zhyw.api;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.net.Inet4Address;
import java.net.InetAddress;

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

    private static Logger logger = LoggerFactory.getLogger(ApiApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext application = SpringApplication.run(ApiApplication.class, args);


        try {


            String ip = InetAddress.getLocalHost().getHostAddress();

            logger.info(ip);

        } catch (Exception e) {

        }


    }
}
