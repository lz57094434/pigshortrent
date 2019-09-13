package org.lanqiao.controller;

import org.lanqiao.entity.Test;
import org.lanqiao.utile.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    RedisUtil redisUtil;

    @RequestMapping("/set")
    public String set(){
        Test test = new Test(1,"chenhao",97);
        redisUtil.set("user1",test);
        return null;
    }

    @RequestMapping("/get")
    public String get(){
        Test test = (Test)redisUtil.get("user1");
        System.out.println(test);
        return null;
    }
}
