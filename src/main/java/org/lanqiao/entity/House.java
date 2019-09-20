package org.lanqiao.entity;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.Set;

@SolrDocument(solrCoreName = "articles")
public class House {
    @Id
    @Field
    private Integer houseId;
    private Set<HouseImg> houseImgSet;

    @Field
    private String houseName;

    @Field
    private Integer housePrice;

    @Field
    private Integer deposit;

    @Field
    private Integer houseNumber;

    @Field
    private String houseAddress;

    @Field
    private String houseArea;
    @Field
    private String houseModel;

    @Field
    private Integer liveNubmer;

    @Field
    private String characterDes;

    @Field
    private String internalSit;

    @Field
    private String trafficSit;

    @Field
    private String surroundingSit;

    @Field
    private String houseImgurl;

    @Field
    private Float longitude;

    @Field
    private Float latitude;

    @Field
    private Facility facility;

    @Field
    private HouseInformation houseInformation;

    @Field
    private Set<Comment> commentSet;

    private Integer houseCommentCount;//额外加的评论数

    public Integer getHouseCommentCount() {
        return houseCommentCount;
    }

    public void setHouseCommentCount(Integer houseCommentCount) {
        this.houseCommentCount = houseCommentCount;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public HouseInformation getHouseInformation() {
        return houseInformation;
    }

    public void setHouseInformation(HouseInformation houseInformation) {
        this.houseInformation = houseInformation;
    }

    public Set<Comment> getCommentSet() {
        return commentSet;
    }

    public void setCommentSet(Set<Comment> commentSet) {
        this.commentSet = commentSet;
    }

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

    public Set<HouseImg> getHouseImgSet() {
        return houseImgSet;
    }

    public void setHouseImgSet(Set<HouseImg> houseImgSet) {
        this.houseImgSet = houseImgSet;
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

    private Integer publisherId;

    private Integer userId;
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
                '}';
    }
}

