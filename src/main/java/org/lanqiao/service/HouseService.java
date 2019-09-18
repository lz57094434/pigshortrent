package org.lanqiao.service;

import org.lanqiao.entity.House;

import java.util.List;


public interface HouseService {


    public List<House> OrderMessage();

    public List<House> OrderMessage(Integer houseId);


}
