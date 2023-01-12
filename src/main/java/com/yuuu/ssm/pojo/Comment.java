package com.yuuu.ssm.pojo;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.pojo
 * @Author:Yuuu。
 * @CreateTime:2023-01-04 15:32
 * @Description:
 * @Version:1.0
 */
public class Comment {
    private Integer id;
    private Integer userId;
    private String username;
    private Date date;
    private String comment;

    public Comment() {
    }

    public Comment(Integer id, Integer userId, String username, Date date, String comment) {
        this.id = id;
        this.userId = userId;
        this.username = username;
        this.date = date;
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userId=" + userId +
                ", username='" + username + '\'' +
                ", date=" + date +
                ", comment='" + comment + '\'' +
                '}';
    }
}
