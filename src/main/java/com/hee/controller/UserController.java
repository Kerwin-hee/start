package com.hee.controller;

import com.hee.pojo.User;
import com.hee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hee
 * @version 1.0
 * @description PACKAGE_NAME
 * @date 2018/4/9
 */


//@ConfigurationProperties(prefix = "user")
@Configuration
@RestController
public class UserController {


    /**
     *
     */
    @Autowired
    private UserService userService;


    @GetMapping(value = "/add",produces = "application/json")
    public void addUser(){
        User user = new User();
       user.setName("xiao");
       user.setPassword(123);
        userService.addUser(user);

    }

}
