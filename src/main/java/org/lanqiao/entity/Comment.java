package org.lanqiao.entity;

import java.util.Date;

public class Comment {
    private Integer commentId;

    private String message;

    private Date commentDate;

    private Integer userId;

    private Integer houseId;

    private Integer score;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", message='" + message + '\'' +
                ", commentDate=" + commentDate +
                ", userId=" + userId +
                ", houseId=" + houseId +
                ", score=" + score +
                '}';
    }


}