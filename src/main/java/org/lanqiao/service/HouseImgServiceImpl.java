package org.lanqiao.service;

import org.lanqiao.entity.HouseImg;
import org.lanqiao.mapper.HouseImgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseImgServiceImpl implements HouseImgService {

    @Autowired
    HouseImgMapper houseImgMapper;

    @Override
    public HouseImg getHouseImg() {
        return houseImgMapper.getHouseImg(1);
    }
}
