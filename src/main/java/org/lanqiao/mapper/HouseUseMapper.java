package org.lanqiao.mapper;

import org.lanqiao.entity.HouseUse;

public interface HouseUseMapper {
    int deleteByPrimaryKey(Integer houseUseId);

    int insert(HouseUse record);

    int insertSelective(HouseUse record);

    HouseUse selectByPrimaryKey(Integer houseUseId);

    int updateByPrimaryKeySelective(HouseUse record);

    int updateByPrimaryKey(HouseUse record);
}