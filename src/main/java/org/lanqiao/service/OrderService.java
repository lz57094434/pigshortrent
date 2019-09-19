package org.lanqiao.service;


import org.lanqiao.entity.Orders;

import java.util.List;

public interface OrderService {
    public int insertOrders(Orders orders);
    public Orders getAllOrders(Integer userId);
}
