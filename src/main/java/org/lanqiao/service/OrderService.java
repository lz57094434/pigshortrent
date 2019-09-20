package org.lanqiao.service;

import com.alipay.api.AlipayApiException;
import org.lanqiao.entity.Orders;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface OrderService {
    public void ali(HttpServletResponse response, HttpServletRequest request) throws AlipayApiException, IOException;

    public int insertOrders(Orders orders);
    public Orders getAllOrders(Integer userId);
}
