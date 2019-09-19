package org.lanqiao.service;

import org.lanqiao.entity.User;

public interface Usermsg {
    public  int updateByPrimaryKey(User user);
    public User selectByPrimaryKey(Integer userId);
}
