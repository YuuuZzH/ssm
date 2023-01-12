package com.yuuu.ssm.mapper;

import com.yuuu.ssm.pojo.Employee;
import com.yuuu.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.mapper
 * @Author:Yuuu。
 * @CreateTime:2022-12-14 16:08
 * @Description:
 * @Version:1.0
 */
public interface UserMapper {
    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    User userLogin(@Param("username") String username, @Param("password") String password);

    /**
     * 用户注册
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 判断用户名是否能使用
     * @param username
     * @return
     */
    User isExistUser(String username);
}
