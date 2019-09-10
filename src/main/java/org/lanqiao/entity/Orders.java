package org.lanqiao.entity;

import java.util.Date;

public class Orders {
    private Integer ordersId;

    private Integer ordersPrice;

    private Date ordersDate;

    private Integer userId;

    private Integer houseId;

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getOrdersPrice() {
        return ordersPrice;
    }

    public void setOrdersPrice(Integer ordersPrice) {
        this.ordersPrice = ordersPrice;
    }

    public Date getOrdersDate() {
        return ordersDate;
    }

    public void setOrdersDate(Date ordersDate) {
        this.ordersDate = ordersDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }
}