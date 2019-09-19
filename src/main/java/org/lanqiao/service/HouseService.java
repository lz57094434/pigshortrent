package org.lanqiao.service;

import org.lanqiao.entity.House;

import java.util.List;

public interface HouseService {
       House selectByPrimaryKey(Integer houseId);

       List<House> getAll();
       House getImg(Integer houseId);

}
