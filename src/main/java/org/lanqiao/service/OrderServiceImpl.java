package org.lanqiao.service;

import org.lanqiao.entity.Orders;
import org.lanqiao.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrdersMapper ordersMapper;
    @Override
    public int insertOrders(Orders orders) {

        return ordersMapper.insertSelective(orders);
    }

    @Override
    public Orders getAllOrders(Integer userId) {

        return ordersMapper.getAllOrders(userId);
    }
}
