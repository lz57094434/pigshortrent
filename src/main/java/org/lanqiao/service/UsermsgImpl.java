package org.lanqiao.service;

import org.lanqiao.entity.User;

import org.lanqiao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsermsgImpl implements Usermsg{
    @Autowired
    UserMapper usesrmapper;
    @Override
    public int updateByPrimaryKey(User user) {
        return usesrmapper.updateByPrimaryKey(user);
    }
    @Override
    public User selectByPrimaryKey(Integer userId){return usesrmapper.selectByPrimaryKey(userId);}
}
