package com.yuuu.ssm.pojo;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.pojo
 * @Author:Yuuu。
 * @CreateTime:2022-12-14 15:53
 * @Description:
 * @Version:1.0
 */
public class User {
    private Integer userId;
    private String username;
    private String password;
    private Integer balance;

    public User() {
    }

    public User(Integer userId, String username, String password, Integer balance) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.balance = balance;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
