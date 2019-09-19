package org.lanqiao.controller;

import org.lanqiao.entity.User;
import org.lanqiao.service.UsermsgImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsermsgController {
    @Autowired
    private UsermsgImpl userImpl;
    @RequestMapping("/usermsg")
    @ResponseBody
    public int updateByPrimaryKey(User user) {
        return userImpl.updateByPrimaryKey(user);
    }
    @RequestMapping("/s")
    @ResponseBody
    public User selectByPrimaryKey(Integer userId){return userImpl.selectByPrimaryKey(userId);}
}

