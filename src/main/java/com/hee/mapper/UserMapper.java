package com.hee.mapper;

import com.hee.pojo.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author hee
 * @version 1.0
 * @description com.hee.mapper
 * @date 2018/4/9
 */
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>  {

    int addUser(User user);
}
