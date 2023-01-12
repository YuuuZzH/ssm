package com.yuuu.ssm.service;

import com.yuuu.ssm.pojo.User;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.service
 * @Author:Yuuu。
 * @CreateTime:2022-12-14 16:09
 * @Description:
 * @Version:1.0
 */
public interface UserService {
    User userLogin(String username, String password);
    boolean addUser(User user);
    User isExistUser(String username);
}
