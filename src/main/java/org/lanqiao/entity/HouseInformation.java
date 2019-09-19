package org.lanqiao.entity;

public class HouseInformation {
    private Integer houseInformationId;

    private String province;

    private String city;

    private String rentType;

    private String houseInformationAddress;

    private House house;

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Integer getHouseInformationId() {
        return houseInformationId;
    }

    public void setHouseInformationId(Integer houseInformationId) {
        this.houseInformationId = houseInformationId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType == null ? null : rentType.trim();
    }

    public String getHouseInformationAddress() {
        return houseInformationAddress;
    }

    public void setHouseInformationAddress(String houseInformationAddress) {
        this.houseInformationAddress = houseInformationAddress == null ? null : houseInformationAddress.trim();
    }

}