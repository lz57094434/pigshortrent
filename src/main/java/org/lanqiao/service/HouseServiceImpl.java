package org.lanqiao.service;

import org.lanqiao.entity.House;
import org.lanqiao.mapper.HouseMapper;
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
}
