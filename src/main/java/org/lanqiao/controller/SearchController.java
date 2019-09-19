package org.lanqiao.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.lanqiao.entity.House;
import org.lanqiao.entity.HouseInformation;
import org.lanqiao.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SearchController {

    @Autowired
    SearchService searchService;

    //得到房子全部信息，用来测试的
    @RequestMapping("getallhouse")
    public List<House> getAllHouse() {
        return searchService.getAllHouse();
    }

    //普通搜索
    @RequestMapping("gethousepage")
    public Map getHousePage(Integer pageNum, Integer pageSize, HouseInformation houseInformation, House house,
                            Integer minPrice, Integer maxPrice,
                            String[] huxing, String[] sheshi, String[] solr) {
//        失败的转化方法
//        System.out.println(huxing);
//        JSONArray array = JSONArray.fromObject(huxing);
//        List<String> huxingList = JSONArray.toList(array);
////        List<String> huxingList = JSONArray.toList(array, String.class);
//        System.out.println(huxingList.size());
//        for (String s : huxingList) {
//            System.out.print(s);
//            System.out.println(s.length());
//        }
//        for (int i=0;i<huxingList.size();i++){
//            System.out.println(huxingList.get(i));
//        }
        //户型的提取
        List<String> huxingList = new ArrayList<String>();
        for (String s : huxing) {
            String newS = s.replace("[", "");
            newS = newS.replace("]", "");
            newS = newS.replace("\"", "");//删除[]""
            huxingList.add(newS);//户型添加到集合中
        }
        huxingList.remove(0);
//        for (int i = 0; i < huxingList.size(); i++) {
//            System.out.println(huxingList.get(i));
//        }
//        System.out.println(huxingList.size());
        //设施的提取
        List<String> sheshiList = new ArrayList<String>();
        for (String s : sheshi) {
            String newS = s.replace("[", "");
            newS = newS.replace("]", "");
            newS = newS.replace("\"", "");//删除[]""
            sheshiList.add(newS);//设施添加到集合中
        }
        sheshiList.remove(0);
//        System.out.println(solr);
        //solr的提前
        List<Integer> solrList =null;
        if (solr!=null){
            solrList = new ArrayList<Integer>();
            for (String s : solr) {
                String newS = s.replace("[", "");
                newS = newS.replace("]", "");
                newS = newS.replace("\"", "");//删除[]""
                if(Integer.parseInt(newS)!=0)
                    solrList.add(Integer.parseInt(newS));
            }
            for (int i = 0; i < solrList.size(); i++) {
                System.out.println(solrList.get(i));
            }
        }
        Map map = new HashMap();
        PageHelper.startPage(pageNum, pageSize);
        List<House> houseList = searchService.getAllHouse(houseInformation, house, minPrice, maxPrice, huxingList, sheshiList,solrList);
        if (houseInformation.getProvince().equals("请选择省份") || houseInformation.getCity().equals("请选择城市")) {
            List<House> houseCommentCount = searchService.houseCommentCount();//房子评论的数量
            for (int i = 0; i < houseList.size(); i++) {
                for (int j = 0; j < houseCommentCount.size(); j++) {
                    if (houseList.get(i).getHouseId() == houseCommentCount.get(j).getHouseId()) {
                        houseList.get(i).setHouseCommentCount(houseCommentCount.get(j).getHouseCommentCount());
                    }
                }
            }
        } else {
            List<House> houseCommentCount = searchService.houseCommentCount(houseInformation, house, minPrice, maxPrice, huxingList, sheshiList);//房子评论的数量
            for (int i = 0; i < houseList.size(); i++) {
                for (int j = 0; j < houseCommentCount.size(); j++) {
                    if (houseList.get(i).getHouseId() == houseCommentCount.get(j).getHouseId()) {
                        houseList.get(i).setHouseCommentCount(houseCommentCount.get(j).getHouseCommentCount());
                    }
                }
            }
        }
        PageInfo<House> pageHouse = new PageInfo<House>(houseList);//分页显示房间信息
//        for (int i = 0; i < pageHouse.getList().size(); i++) {
//            System.out.println("id:"+pageHouse.getList().get(i).getHouseId());
//            System.out.println("count:"+pageHouse.getList().get(i).getHouseCommentCount());
//        }
        map.put("pageHouse", pageHouse);//房间信息
        return map;
    }

    //solr搜索
    @RequestMapping("solr")
    public House getSolr(Integer id) {
        return searchService.queryById(id);
    }

    @RequestMapping("allsolr")
    public List<House> getAllSolr() {
        return searchService.queryAll();
    }

    @RequestMapping("insertsolr")
    public Map<String, Object> insertSolr(House house) {
        Map<String, Object> result = searchService.insertAndUpdate(house);
        return result;
    }

    @RequestMapping("searchsolr")
    public List<House> searchSolr(String de) {
        List<House> houseList = searchService.queryByCondition(de);
        if (houseList != null) {
//            System.out.println(de);
            return houseList;
        } else {
//            System.out.println("查不到");
            List<House> nullHouseList = new ArrayList<>();
            return nullHouseList;
        }
    }

}
