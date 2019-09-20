package org.lanqiao.mapper;

import org.lanqiao.entity.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrdersMapper {
    int deleteByPrimaryKey(Integer ordersId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer ordersId);

    Orders getAllOrders(Integer userId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}