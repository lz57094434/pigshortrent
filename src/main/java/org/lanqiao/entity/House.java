package org.lanqiao.entity;

import io.lettuce.core.dynamic.annotation.Param;

public class House {
    private Integer houseId;

    private String houseName;

    private Integer housePrice;

    private Integer deposit;

    private Integer houseNumber;

    private String houseAddress;

    private String houseArea;

    private String houseModel;

    private Integer liveNubmer;

    private String characterDes;

    private String internalSit;

    private String trafficSit;

    private String surroundingSit;

    private String houseImgurl;

    private Float longitude;

    private Float latitude;

    private Integer publisherId;

    private Integer userId;

    private Comment comment;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName == null ? null : houseName.trim();
    }

    public Integer getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(Integer housePrice) {
        this.housePrice = housePrice;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress == null ? null : houseAddress.trim();
    }

    public String getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(String houseArea) {
        this.houseArea = houseArea == null ? null : houseArea.trim();
    }

    public String getHouseModel() {
        return houseModel;
    }

    public void setHouseModel(String houseModel) {
        this.houseModel = houseModel == null ? null : houseModel.trim();
    }

    public Integer getLiveNubmer() {
        return liveNubmer;
    }

    public void setLiveNubmer(Integer liveNubmer) {
        this.liveNubmer = liveNubmer;
    }

    public String getCharacterDes() {
        return characterDes;
    }

    public void setCharacterDes(String characterDes) {
        this.characterDes = characterDes == null ? null : characterDes.trim();
    }

    public String getInternalSit() {
        return internalSit;
    }

    public void setInternalSit(String internalSit) {
        this.internalSit = internalSit == null ? null : internalSit.trim();
    }

    public String getTrafficSit() {
        return trafficSit;
    }

    public void setTrafficSit(String trafficSit) {
        this.trafficSit = trafficSit == null ? null : trafficSit.trim();
    }

    public String getSurroundingSit() {
        return surroundingSit;
    }

    public void setSurroundingSit(String surroundingSit) {
        this.surroundingSit = surroundingSit == null ? null : surroundingSit.trim();
    }

    public String getHouseImgurl() {
        return houseImgurl;
    }

    public void setHouseImgurl(String houseImgurl) {
        this.houseImgurl = houseImgurl == null ? null : houseImgurl.trim();
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseId=" + houseId +
                ", houseName='" + houseName + '\'' +
                ", housePrice=" + housePrice +
                ", deposit=" + deposit +
                ", houseNumber=" + houseNumber +
                ", houseAddress='" + houseAddress + '\'' +
                ", houseArea='" + houseArea + '\'' +
                ", houseModel='" + houseModel + '\'' +
                ", liveNubmer=" + liveNubmer +
                ", characterDes='" + characterDes + '\'' +
                ", internalSit='" + internalSit + '\'' +
                ", trafficSit='" + trafficSit + '\'' +
                ", surroundingSit='" + surroundingSit + '\'' +
                ", houseImgurl='" + houseImgurl + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", publisherId=" + publisherId +
                ", userId=" + userId +
                ", comment=" + comment +
                '}';
    }
}