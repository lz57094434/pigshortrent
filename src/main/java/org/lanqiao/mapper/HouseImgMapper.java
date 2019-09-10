package org.lanqiao.mapper;

import org.lanqiao.entity.HouseImg;

public interface HouseImgMapper {
    int deleteByPrimaryKey(Integer houseImgId);

    int insert(HouseImg record);

    int insertSelective(HouseImg record);

    HouseImg selectByPrimaryKey(Integer houseImgId);

    int updateByPrimaryKeySelective(HouseImg record);

    int updateByPrimaryKey(HouseImg record);
}