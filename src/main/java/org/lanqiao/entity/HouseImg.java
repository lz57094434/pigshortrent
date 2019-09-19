package org.lanqiao.entity;

public class HouseImg {
    private Integer houseImgId;
    private House house;


    private String houseImgUrl;

    private Integer houseId;

    public Integer getHouseImgId() {
        return houseImgId;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public void setHouseImgId(Integer houseImgId) {
        this.houseImgId = houseImgId;
    }

    public String getHouseImgUrl() {
        return houseImgUrl;
    }

    public void setHouseImgUrl(String houseImgUrl) {
        this.houseImgUrl = houseImgUrl == null ? null : houseImgUrl.trim();
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    @Override
    public String toString() {
        return "HouseImg{" +
                "houseImgId=" + houseImgId +
                ", house=" + house +
                ", houseImgUrl='" + houseImgUrl + '\'' +
                ", houseId=" + houseId +
                '}';
    }
}