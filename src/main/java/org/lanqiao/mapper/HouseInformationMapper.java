package org.lanqiao.mapper;

import org.lanqiao.entity.HouseInformation;

public interface HouseInformationMapper {
    int deleteByPrimaryKey(Integer houseInformationId);

    int insert(HouseInformation record);

    int insertSelective(HouseInformation record);

    HouseInformation selectByPrimaryKey(Integer houseInformationId);

    int updateByPrimaryKeySelective(HouseInformation record);

    int updateByPrimaryKey(HouseInformation record);
}