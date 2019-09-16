package org.lanqiao.service;

import org.lanqiao.entity.User;
import org.lanqiao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegandloginImpl implements Regandlogin {
    @Autowired
    UserMapper userMapper;


    @Override
    public User selectuser(String userName) {
        return userMapper.selectuser(userName);
    }

    @Override
    public int insertUser(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectuser2(String userName, String password) {
        return userMapper.selectuser2(userName,password);
    }
}
