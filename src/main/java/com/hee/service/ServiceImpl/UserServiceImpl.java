package com.hee.service.ServiceImpl;

import com.hee.mapper.UserMapper;
import com.hee.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import com.hee.service.UserService;




//@ConfigurationProperties(prefix = "user")
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }
}
