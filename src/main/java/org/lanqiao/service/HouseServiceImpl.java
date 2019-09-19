package org.lanqiao.service;

import org.lanqiao.entity.House;
import org.lanqiao.entity.HouseImg;
import org.lanqiao.entity.Pay;
import org.lanqiao.entity.User;
import org.lanqiao.mapper.HouseImgMapper;
import org.lanqiao.mapper.HouseMapper;
import org.lanqiao.mapper.PayMapper;
import org.lanqiao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;


@Service
public class HouseServiceImpl implements HouseService{
   @Autowired
    UserMapper userMapper;
   @Autowired
    PayMapper payMapper;
   @Autowired
   HouseImgMapper houseImgMapper;
    @Autowired
    HouseMapper houseMapper;
    @Override
    public int updateReall(User user){
        return  userMapper.updateByPrimaryKey(user);
    }
    @Override
    public int  sendImg(HouseImg houseImg){
        return houseImgMapper.insert(houseImg);
    }

    @Override
    public int houseInsert(House house){
   return houseMapper.insert(house);
    }
    @Override
    public int payInsert(Pay pay){
        return payMapper.insert(pay);
    }
}
