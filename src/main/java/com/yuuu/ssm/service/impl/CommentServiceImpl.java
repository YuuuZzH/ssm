package com.yuuu.ssm.service.impl;

import com.yuuu.ssm.mapper.CommentMapper;
import com.yuuu.ssm.pojo.Comment;
import com.yuuu.ssm.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.service.impl
 * @Author:Yuuu。
 * @CreateTime:2023-01-04 15:37
 * @Description:
 * @Version:1.0
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;


    @Override
    public List<Comment> getAllComments() {
        List<Comment> allComments = commentMapper.getAllComments();
        return allComments;
    }

    @Override
    public List<Comment> getCommentByUsername(String username) {
        List<Comment> commentByUsername = commentMapper.getCommentByUsername(username);
        return commentByUsername;
    }

    @Override
    public Boolean publishComment(Integer userId, String username, Date date, String comment) {
        return commentMapper.publishComment(userId,username,date,comment);
    }


    @Override
    public Boolean deleteCommentById(Integer id, Integer userId) {
        return commentMapper.deleteCommentById(id,userId);
    }
}
