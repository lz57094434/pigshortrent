package org.lanqiao.mapper;

import org.lanqiao.entity.Facility;

public interface FacilityMapper {
    int deleteByPrimaryKey(Integer facilityId);

    int insert(Facility record);

    int insertSelective(Facility record);

    Facility selectByPrimaryKey(Integer facilityId);

    int updateByPrimaryKeySelective(Facility record);

    int updateByPrimaryKey(Facility record);
}