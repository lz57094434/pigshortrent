package org.lanqiao.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.lanqiao.entity.House;
import org.lanqiao.entity.HouseInformation;
import org.lanqiao.mapper.HouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    HouseMapper houseMapper;
    @Autowired
    private SolrClient solrClient ;

    //得到房子全部信息，用来测试的
    @Override
    public List<House> getAllHouse() {
        return houseMapper.getAllHouse();
    }

    //得到房子全部信息
    @Override
    public List<House> getHouseSolr(List<Integer> solrList) {
        return houseMapper.getHouseSolr(solrList);
    }
    //得到房子全部信息
    @Override
    public List<House> getAllHouse(HouseInformation houseInformation,House house,
                                   Integer minPrice,Integer maxPrice,
                                   List<String> huxingList,List<String> sheshiList,
                                   List<Integer> solrList) {
        String province = houseInformation.getProvince();//得到省份
        String city = houseInformation.getCity();//得到城市
        if(province.equals("请选择省份") || city.equals("请选择城市")){
            return houseMapper.getHouseSolr(solrList);
        } else{
            houseInformation.setProvince(province.substring(0, province.length() - 1));
            houseInformation.setCity(city.substring(0, city.length() - 1));
//            System.out.println(houseInformation.getProvince());
//            System.out.println(houseInformation.getCity());
            return houseMapper.getHouse(houseInformation,house,minPrice,maxPrice,huxingList,sheshiList,solrList);
        }
    }

    //得到房子信息总数量
    @Override
    public List<House> houseCommentCount(HouseInformation houseInformation, House house,
                                           Integer minPrice, Integer maxPrice,
                                           List<String> huxingList, List<String> sheshiList) {
        return houseMapper.houseCommentCount(houseInformation,house,minPrice,maxPrice,huxingList,sheshiList);
    }
    @Override
    public List<House> houseCommentCount() {
        return houseMapper.houseAllCommentCount();
    }

    //solr单个查询
    @Override
    public House queryById(int id){
        House house=null;
        try {
            SolrDocument solrDocument = solrClient.getById(String.valueOf(id));
            Gson gson = new Gson();
            // 方法1
            String solrString = gson.toJson(solrDocument);
            house = gson.fromJson(solrString,House.class);
            if (null == house) {
                house = houseMapper.selectByPrimaryKey(id);
                solrClient.addBean(house,1000);
            }
        }catch (SolrServerException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return house;
    }

    //solr全部查询
    public List<House> queryAll(){
        List<House> houseList = null;
        SolrQuery query = new SolrQuery();
        query.setQuery("*:*");
        query.setStart(0);
        query.setRows(20);
        try {
            QueryResponse response = solrClient.query(query);
            SolrDocumentList documentList = response.getResults();
            if (!documentList.isEmpty()) {
                Gson gson = new Gson();
                String listString = gson.toJson(documentList);
                houseList = gson.fromJson(listString, new TypeToken<List<House>>() {}.getType());
            } else {
                houseList = houseMapper.getAllHouse();
                solrClient.addBeans(houseList);
            }

        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }

    //solr插入
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Map<String, Object> insertAndUpdate(House house){
        Map<String,Object> result = new HashMap<>();
        result.put("success",false);
        // 返回结果表示受影响的数据条数，而不是id值
        int insert = houseMapper.insertSelective(house);
        if (insert != 1) {
            throw new RuntimeException(" >>>> insert user to database failed,the return value should be 1,but result is:" + insert + " <<<<");
        }
        // 插入或者更新solr数据
        try {
            UpdateResponse response = solrClient.addBean(house,1000);
            int staus = response.getStatus();
            if (staus != 0) {
                solrClient.rollback();
                result.put("message","insert user to solr failed");
                return result;
            }
        } catch (SolrServerException e) {
            e.printStackTrace();
            result.put("message",e.getMessage());
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            result.put("message",e.getMessage());
            return result;
        }

        result.put("message","insert user to solr success");
        result.put("success",true);
        return result;
    }

    //搜索
    public List<House> queryByCondition(String de){
        List<House> houseList = null;
        // 关键字模糊查询
        SolrQuery query = new SolrQuery();
        String charDesLike = "characterDes:" + de;
        String intSitLike = " OR internalSit:" + de;
        String traSitLike = " OR trafficSit:" + de;
        String surSitLike = " OR surroundingSit:" + de;
//        System.out.println(charDesLike + intSitLike + traSitLike + surSitLike);
        query.set("q",charDesLike + intSitLike + traSitLike + surSitLike);
        query.setStart(0);
        query.setRows(20);
        try {
            QueryResponse response = solrClient.query(query);
            SolrDocumentList documentList = response.getResults();
            if (!documentList.isEmpty()) {
                Gson gson = new Gson();
                String listString = gson.toJson(documentList);
                houseList = gson.fromJson(listString, new TypeToken<List<House>>() {}.getType());
            }
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }

}
