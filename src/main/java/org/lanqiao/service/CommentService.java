package org.lanqiao.service;

import org.lanqiao.entity.Comment;

import java.util.List;

public interface CommentService {
    public List<Comment> getListByPage(Integer houseId);
}
