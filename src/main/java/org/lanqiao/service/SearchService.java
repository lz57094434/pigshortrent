package org.lanqiao.service;

import org.lanqiao.entity.House;
import org.lanqiao.entity.HouseInformation;

import java.util.List;
import java.util.Map;

public interface SearchService {
    //得到房子全部信息，用来测试的
    public List<House> getAllHouse();

    //得到房子全部信息
    public List<House> getHouseSolr(List<Integer> solrList);
    //得到房子全部信息
    public List<House> getAllHouse(HouseInformation houseInformation, House house,
                                   Integer minPrice, Integer maxPrice,
                                   List<String> huxingList, List<String> sheshiList,
                                   List<Integer> solrList);

    //得到房子评论的数量
    List<House> houseCommentCount(HouseInformation houseInformation, House house,
                                           Integer minPrice, Integer maxPrice,
                                           List<String> huxingList, List<String> sheshiList);
    public List<House> houseCommentCount ();

    //solr单个查询
    public House queryById(int id);

    //solr全部查询
    public List<House> queryAll();

    //solr插入
    public Map<String, Object> insertAndUpdate(House house);

    //搜索
    public List<House> queryByCondition(String de);
}