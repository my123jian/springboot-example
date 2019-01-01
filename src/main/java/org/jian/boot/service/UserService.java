package org.jian.boot.service;

import org.jian.boot.model.User;
import org.jian.boot.model.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserMapper userMapper;//这里会报错，但是并不会影响


    public int addUser(User user) {

        return userMapper.insertSelective(user);
    }


}

