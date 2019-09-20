package org.lanqiao.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Comment {
    private User user;
    private House house;
    private Integer commentId;

    private String message;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date commentDate;

    private House house;

    private Float score;

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

}