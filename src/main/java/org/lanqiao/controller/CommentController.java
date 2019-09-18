package org.lanqiao.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.lanqiao.entity.Comment;
import org.lanqiao.entity.House;
import org.lanqiao.entity.HouseImg;
import org.lanqiao.mapper.HouseMapper;
import org.lanqiao.service.CommentServiceImpl;
import org.lanqiao.service.HouseImgService;
import org.lanqiao.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    CommentServiceImpl commentService;

    @Autowired
    HouseService houseService;

    @Autowired
    HouseImgService houseImgService;

    //分页
    @RequestMapping("/page")
    public PageInfo<House> getPages(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<House> houses=houseService.OrderMessage(1);
        PageInfo<House> pageInfo = new PageInfo<House>(houses);
        return pageInfo;
    }

    //房间图片
    @RequestMapping("/getHouseImg")
    public HouseImg getHouseImg() {
        return houseImgService.getHouseImg();
    }


    //订单信息（多条可分页）
    @RequestMapping("/OrderMessage")
    public List<House> OrderMessage(Integer houseId) {
        return houseService.OrderMessage(houseId);
    }

    //插入数据
    @RequestMapping("/insert")
    public int insert(Comment record) {
        return commentService.insert(record);
    }

}
