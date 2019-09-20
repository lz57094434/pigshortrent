package org.lanqiao.service;

import org.lanqiao.entity.House;
import org.lanqiao.entity.HouseImg;
import org.lanqiao.entity.Pay;
import org.lanqiao.entity.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface HouseService {
       House selectByPrimaryKey(Integer houseId);

       List<House> getAll();
       House getImg(Integer houseId);

    public List<House> OrderMessage();

    public List<House> OrderMessage(Integer houseId);


    public int updateReall(User user);
    public int sendImg(HouseImg houseImg);
//    public List<HouseImg> sendImg(HouseImg houseImg);
    public int houseInsert(House house);
    public int payInsert(Pay pay);
//    HouseImg uploadHouseImg(MultipartFile uploadFile);
}
