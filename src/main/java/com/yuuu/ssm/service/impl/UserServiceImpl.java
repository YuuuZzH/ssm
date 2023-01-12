package com.yuuu.ssm.service.impl;

import com.yuuu.ssm.mapper.UserMapper;
import com.yuuu.ssm.pojo.User;
import com.yuuu.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.service
 * @Author:Yuuu。
 * @CreateTime:2022-12-14 16:10
 * @Description:
 * @Version:1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User userLogin(String username, String password) {
        User user = userMapper.userLogin(username, password);
        return user;
    }

    @Override
    public boolean addUser(User user) {
        boolean b = userMapper.addUser(user);
        return b;
    }

    @Override
    public User isExistUser(String username) {
        return userMapper.isExistUser(username);
    }
}
