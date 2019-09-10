package org.lanqiao.entity;

import java.util.Date;

public class HouseUse {
    private Integer houseUseId;

    private Date stayinDate;

    private Date leaveDate;

    private Integer houseId;

    private Integer userId;

    public Integer getHouseUseId() {
        return houseUseId;
    }

    public void setHouseUseId(Integer houseUseId) {
        this.houseUseId = houseUseId;
    }

    public Date getStayinDate() {
        return stayinDate;
    }

    public void setStayinDate(Date stayinDate) {
        this.stayinDate = stayinDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
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