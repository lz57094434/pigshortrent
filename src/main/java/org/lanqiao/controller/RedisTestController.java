package org.lanqiao.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.lanqiao.entity.House;
import org.lanqiao.entity.User;
import org.lanqiao.mapper.HouseMapper;
import org.lanqiao.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RedisTestController {
    @Autowired
    RedisUtil redisUtil;
    @RequestMapping("/set")
    public String set(){
        User user = new User(1,"Mango","123");
        redisUtil.set("user1",user);
        return null;
    }

    @RequestMapping("/get")
    public String get(){
        User user = (User)redisUtil.get("user1");
        System.out.println(user);
        return null;
    }


}
