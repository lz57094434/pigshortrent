package org.lanqiao.mapper;

import io.lettuce.core.dynamic.annotation.Param;
import org.apache.ibatis.plugin.Intercepts;
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

    HouseImg getHouseImg(Integer houseId);
}