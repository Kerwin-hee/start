package com.hee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author hee
 * @version 1.0
 * @description com.hee
 * @date 2018/4/9
 */

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@SpringBootApplication
//@MapperScan(basePackages = {"com.hee.mapper"})
//@ComponentScan(basePackages={"com.hee.controller" , "com.hee.service"})

/*@Configuration
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages={"com.hee.controller" , "com.hee.service"})
@MapperScan("com.hee.mapper")*/
@SpringBootApplication
public class AppMain {

    public static void main(String[] args) {
        SpringApplication.run(AppMain.class);
    }
}


