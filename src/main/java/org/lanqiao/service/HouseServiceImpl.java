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

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService{
    @Autowired
    HouseMapper houseMapper;
    @Override
    public House selectByPrimaryKey(Integer houseId) {
        System.out.println(houseId);
        return houseMapper.selectByPrimaryKey(houseId);
    }

    @Override
    public List<House> getAll(){
        return houseMapper.getAll();
    }

    @Override
    public House getImg(Integer houseId) {
        return houseMapper.getImg(houseId);
    }

    @Override
    public List<House> OrderMessage() {
        return houseMapper.OrderMessage();
    }

    @Override
    public List<House> OrderMessage(Integer houseId) {
        return houseMapper.OrderMessage();
    }
    @Autowired
    UserMapper userMapper;
    @Autowired
    PayMapper payMapper;
    @Autowired
    HouseImgMapper houseImgMapper;
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
