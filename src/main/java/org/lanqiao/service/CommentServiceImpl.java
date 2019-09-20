package org.lanqiao.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.lanqiao.entity.Comment;
import org.lanqiao.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;

    @Override
    public int insert(Comment record) {
        return commentMapper.insert(record);
    }
    @Override
    public List<Comment> getListByPage(Integer houseId) {
        return commentMapper.getAllComment(houseId);
    }
}
