package org.lanqiao.service;

import org.lanqiao.entity.Comment;
import org.lanqiao.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    CommentMapper commentMapper;

    @Override
    public List<Comment> getListByPage(Integer houseId) {
        return commentMapper.getAllComment(houseId);
    }
}
