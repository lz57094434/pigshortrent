package org.lanqiao.mapper;

import org.apache.ibatis.annotations.Param;
import org.lanqiao.entity.House;
import org.lanqiao.entity.HouseInformation;
import org.springframework.stereotype.Repository;
import org.lanqiao.entity.HouseImg;

import java.util.List;

@Repository
public interface HouseMapper {
    int deleteByPrimaryKey(Integer houseId);

    int insert(House record);

    int insertSelective(House record);

    //得到房子全部信息，用来测试的
    List<House> getAllHouse();

    //得到房子全部信息
    List<House> getHouseSolr(@Param("solrList")List<Integer> solrList);
    //得到房子全部信息
    List<House> getHouse(@Param("houseInformation")HouseInformation houseInformation,@Param("house")House house,
                         @Param("minPrice")Integer minPrice,@Param("maxPrice")Integer maxPrice,
                         @Param("huxingList")List<String> huxingList,@Param("sheshiList")List<String> sheshiList,
                         @Param("solrList")List<Integer> solrList);
    //得到房子评论的数量
    List<House> houseCommentCount (@Param("houseInformation")HouseInformation houseInformation,@Param("house")House house,
                                   @Param("minPrice")Integer minPrice,@Param("maxPrice")Integer maxPrice,
                                   @Param("huxingList")List<String> huxingList,@Param("sheshiList")List<String> sheshiList);
    List<House> houseAllCommentCount ();


    House selectByPrimaryKey(Integer houseId);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

    List<House> getAll();
     House getImg(Integer houseId);


    //显示房间订单页房间信息
    List<House> OrderMessage();

}