package org.lanqiao.mapper;

import org.lanqiao.entity.House;
import org.lanqiao.entity.HouseImg;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseMapper {
    int deleteByPrimaryKey(Integer houseId);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Integer houseId);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

    List<House> getAll();
     House getImg(Integer houseId);

}