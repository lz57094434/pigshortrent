package org.lanqiao.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.lanqiao.entity.Comment;
import org.lanqiao.entity.House;
import org.lanqiao.entity.HouseImg;
import org.lanqiao.service.CommentServiceImpl;
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

    //分页
    @RequestMapping("/page")
    public PageInfo<House> getPages(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<House> houses=houseService.OrderMessage(1);
        PageInfo<House> pageInfo = new PageInfo<House>(houses);
        return pageInfo;
    }

    //订单信息
    @RequestMapping("/OrderMessage")
    public List<House> OrderMessage(Integer houseId) {
        return houseService.OrderMessage(houseId);
    }

    //插入数据
    @RequestMapping("/insertcomment")
    public int insert(Comment record) {
        return commentService.insert(record);
    }

}
