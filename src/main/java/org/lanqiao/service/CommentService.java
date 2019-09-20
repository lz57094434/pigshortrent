package org.lanqiao.service;

import com.github.pagehelper.Page;
import org.lanqiao.entity.Comment;

import java.util.List;

public interface CommentService {

    public int insert(Comment record);

    public List<Comment> getListByPage(Integer houseId);
}
