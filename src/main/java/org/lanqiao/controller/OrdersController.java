package org.lanqiao.controller;

import org.lanqiao.entity.Comment;
import org.lanqiao.entity.Orders;
import org.lanqiao.service.CommentService;
import org.lanqiao.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersController {
    @Autowired
    OrderServiceImpl orderService;
    @RequestMapping("/insert")
    public int insert(Orders orders){
        return orderService.insertOrders(orders);

    }
    @Autowired
    CommentService commentService;
    @RequestMapping("/get")
    public List<Comment> getListByPage(Integer houseId){
        return commentService.getListByPage(houseId);

    }
    @RequestMapping("/getuser")
    public Orders getAllOrders(Integer userId) {
        System.out.print(orderService.getAllOrders(userId).toString());

        return orderService.getAllOrders(userId);
    }



//    @RequestMapping("/index")
//    public String getAll(@RequestParam(value="pageNo",defaultValue = "1") int pageNo, Model model,Integer houseId) {
//       PageHelper.startPage(pageNo, 3);
//        //查询
//        List<Comment> commentList = commentService.getListByPage(houseId);
//        //创建PageInfo对象，保存查询出的结果，PageInfo是pageHelper中的对象
//        PageInfo<Comment> p =new PageInfo<Comment>(commentList);
//
////        return new ModelAndView("message","pageInfo",p);
//        model.addAttribute("pageInfo",p);
//        //可以很多  modelandview改为string
////      model.addAttribute("key","tom");
//
//
//        return  "comment";
//    }
}
