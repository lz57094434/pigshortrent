package org.lanqiao.entity;

public class Facility {
    private Integer facilityId;

    private String facilityOne;

    private String facilityTwo;

    private String facilityThree;

    private String facilityFour;

    private String facilityFive;

    private String facilitySix;

    private String facilityOrther;

    private House house;

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Integer getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Integer facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityOne() {
        return facilityOne;
    }

    public void setFacilityOne(String facilityOne) {
        this.facilityOne = facilityOne == null ? null : facilityOne.trim();
    }

    public String getFacilityTwo() {
        return facilityTwo;
    }

    public void setFacilityTwo(String facilityTwo) {
        this.facilityTwo = facilityTwo == null ? null : facilityTwo.trim();
    }

    public String getFacilityThree() {
        return facilityThree;
    }

    public void setFacilityThree(String facilityThree) {
        this.facilityThree = facilityThree == null ? null : facilityThree.trim();
    }

    public String getFacilityFour() {
        return facilityFour;
    }

    public void setFacilityFour(String facilityFour) {
        this.facilityFour = facilityFour == null ? null : facilityFour.trim();
    }

    public String getFacilityFive() {
        return facilityFive;
    }

    public void setFacilityFive(String facilityFive) {
        this.facilityFive = facilityFive == null ? null : facilityFive.trim();
    }

    public String getFacilitySix() {
        return facilitySix;
    }

    public void setFacilitySix(String facilitySix) {
        this.facilitySix = facilitySix == null ? null : facilitySix.trim();
    }

    public String getFacilityOrther() {
        return facilityOrther;
    }

    public void setFacilityOrther(String facilityOrther) {
        this.facilityOrther = facilityOrther == null ? null : facilityOrther.trim();
    }

}