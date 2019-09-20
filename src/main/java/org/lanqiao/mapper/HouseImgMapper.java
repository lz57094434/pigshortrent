package org.lanqiao.mapper;

import org.lanqiao.entity.HouseImg;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseImgMapper {
    int deleteByPrimaryKey(Integer houseImgId);

    int insert(HouseImg record);

    int insertSelective(HouseImg record);

    HouseImg selectByPrimaryKey(Integer houseImgId);

    int updateByPrimaryKeySelective(HouseImg record);

    int updateByPrimaryKey(HouseImg record);

}