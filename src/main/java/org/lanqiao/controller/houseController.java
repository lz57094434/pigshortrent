package org.lanqiao.controller;

import org.lanqiao.entity.House;
import org.lanqiao.mapper.HouseMapper;
import org.lanqiao.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class houseController {
    @Autowired
    HouseMapper houseMapper;
    @Autowired
    HouseService houseService;
    @RequestMapping("/hello")
    public String hello(){
        return "hello9";

    }
    @RequestMapping("/get")
    public House getHouse(Integer id){
//        return houseMapper.selectByPrimaryKey(1).toString();
        System.out.println(id);
        return houseService.selectByPrimaryKey(id);
    }


    @RequestMapping("/getRank")
    public List<House> getAll(){
        return houseService.getAll();
    }
    @RequestMapping("/getImg")
    public House getImg(Integer id){

//        House house1 = houseService.getImg(1);
//        for (House house: house1
//             ) {
//            System.out.println(house.getHouseImgSet());
//
//        }
        return houseService.getImg(id);
        }
    }




