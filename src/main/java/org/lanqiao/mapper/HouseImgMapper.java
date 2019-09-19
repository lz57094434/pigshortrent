package org.lanqiao.mapper;

import org.lanqiao.entity.House;
import org.lanqiao.entity.HouseImg;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseImgMapper {
    int deleteByPrimaryKey(Integer houseImgId);

//    List<HouseImg> insert(HouseImg record);
     int insert(HouseImg record);
    int insertSelective(HouseImg record);

    HouseImg selectByPrimaryKey(Integer houseImgId);

    int updateByPrimaryKeySelective(HouseImg record);

    int updateByPrimaryKey(HouseImg record);
}