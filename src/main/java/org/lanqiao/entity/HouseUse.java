package org.lanqiao.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class HouseUse {
    private Integer houseUseId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String stayinDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String leaveDate;

    private Integer houseId;

    private Integer userId;

    public Integer getHouseUseId() {
        return houseUseId;
    }

    public void setHouseUseId(Integer houseUseId) {
        this.houseUseId = houseUseId;
    }

    public String getStayinDate() {
        return stayinDate;
    }

    public void setStayinDate(String stayinDate) {
        this.stayinDate = stayinDate;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}