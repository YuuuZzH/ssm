package com.yuuu.ssm.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.yuuu.ssm.pojo.Comment;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.service
 * @Author:Yuuu。
 * @CreateTime:2023-01-04 15:36
 * @Description:
 * @Version:1.0
 */
public interface CommentService {
    List<Comment> getAllComments();
    List<Comment> getCommentByUsername(String username);
    Boolean publishComment(Integer userId,String username,Date date,String comment);
    Boolean deleteCommentById(Integer id,Integer userId);
}
