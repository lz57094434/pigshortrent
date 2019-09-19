package org.lanqiao.controller;

import org.lanqiao.entity.User;
import org.lanqiao.service.Regandlogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class registerController {
    @Autowired
    Regandlogin regandlogin;

    @ResponseBody
    @RequestMapping("/select")
    public User selectuser(String  userName){
        return regandlogin.selectuser(userName);
    }

    @ResponseBody
    @RequestMapping("/insert")
    public int insertUser(User record){
        return  regandlogin.insertUser(record);
    }

    @ResponseBody
    @RequestMapping("/select2")
    public User selectuser2(String  userName,String password){
        return regandlogin.selectuser2(userName,password);
    }

    @ResponseBody
    @RequestMapping("/select3")
    public User selectuser3(String  phone){
        return regandlogin.selectuser3(phone);
    }

}
