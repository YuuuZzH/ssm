package com.yuuu.ssm.mapper;

import com.yuuu.ssm.pojo.Comment;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.mapper
 * @Author:Yuuu。
 * @CreateTime:2023-01-04 15:37
 * @Description:
 * @Version:1.0
 */
public interface CommentMapper {

    /**
     * 获取评论列表
     * @return
     */
    List<Comment> getAllComments();

    /**
     * 根据姓名获取评论
     * @param username
     * @return
     */
    List<Comment> getCommentByUsername(@Param("username") String username);


    /**
     * 发表评论
     * @param userId
     * @param username
     * @param date
     * @param comment
     * @return
     */
    Boolean publishComment(@Param("userId") Integer userId,@Param("username")String username,
                           @Param("date")Date date,@Param("comment")String comment);

    /**
     * 删除评论,只能删除自己的评论
     * @param id
     * @return
     */
    Boolean deleteCommentById(@Param("id") Integer id,@Param("userId") Integer userId);
}
