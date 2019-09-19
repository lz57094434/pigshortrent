package org.lanqiao.service;

import org.lanqiao.entity.User;

public interface Regandlogin {
    User selectuser(String userName);
    int insertUser(User record);
    User selectuser2(String userName,String password);
    User selectuser3(String phone);

}
