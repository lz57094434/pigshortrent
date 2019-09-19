package org.lanqiao.controller;

import org.lanqiao.entity.House;

import org.lanqiao.entity.HouseImg;
import org.lanqiao.entity.Pay;
import org.lanqiao.entity.User;
import org.lanqiao.service.HouseServiceImpl;

import org.lanqiao.util.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
public class HouseController {
    @Autowired
   HouseServiceImpl houseServiceImpl;

    @RequestMapping(value = "/really", method = RequestMethod.POST)
    public int insertReall(User user){
        return houseServiceImpl.updateReall(user);
    }
   @RequestMapping("/house")
    public int insertHouse(House house){
        return houseServiceImpl.houseInsert(house);
   }
//   @RequestMapping("/Imginsert")
//    public int insertImg(HouseImg houseImg){
//        return  houseServiceImpl.sendImg(houseImg);
//   }
    @RequestMapping("/payInsert")
    public int insertPay(Pay pay){
       return houseServiceImpl.payInsert(pay);
    }
}
