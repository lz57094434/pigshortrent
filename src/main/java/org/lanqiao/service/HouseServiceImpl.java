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
    public List<House> OrderMessage() {
        return houseMapper.OrderMessage();
    }

    @Override
    public List<House> OrderMessage(Integer houseId) {
        return houseMapper.OrderMessage();
    }


}
