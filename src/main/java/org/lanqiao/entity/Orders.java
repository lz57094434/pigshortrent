package org.lanqiao.entity;

import java.util.Date;

public class Orders {
    private HouseImg houseImg;
    private User user;
    private House house;
    private Integer ordersId;

    private Integer ordersPrice;

    private Date ordersDate;

    private Integer userId;

    private Integer houseId;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public HouseImg getHouseImg() {
        return houseImg;
    }

    public void setHouseImg(HouseImg houseImg) {
        this.houseImg = houseImg;
    }

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

    @Override
    public String toString() {
        return "Orders{" +
                "houseImg=" + houseImg +
                ", user=" + user +
                ", house=" + house +
                ", ordersId=" + ordersId +
                ", ordersPrice=" + ordersPrice +
                ", ordersDate=" + ordersDate +
                ", userId=" + userId +
                ", houseId=" + houseId +
                '}';
    }
}