package org.lanqiao.controller;

import org.lanqiao.entity.House;

import org.lanqiao.entity.HouseImg;
import org.lanqiao.entity.Pay;
import org.lanqiao.entity.User;
import org.lanqiao.service.HouseService;
import org.lanqiao.service.HouseServiceImpl;

import org.lanqiao.util.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


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
    @RequestMapping("/Imginsert")
    public int insertImg(HouseImg houseImg){
        return  houseServiceImpl.sendImg(houseImg);
    }
    @Value("${file.location.path}")
    private String fileLocation;
    @RequestMapping("/houseinsert")
    public String insert( MultipartFile file){
        String url = FileUpload.upload(file,"/upload",fileLocation);
        return url;
    }
    @RequestMapping("/payInsert")
    public int insertPay(Pay pay){
        return houseServiceImpl.payInsert(pay);
    }
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
