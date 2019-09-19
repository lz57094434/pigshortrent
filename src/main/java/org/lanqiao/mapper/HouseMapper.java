package org.lanqiao.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.lanqiao.entity.House;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface HouseMapper {
    int deleteByPrimaryKey(Integer houseId);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Integer houseId);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

}