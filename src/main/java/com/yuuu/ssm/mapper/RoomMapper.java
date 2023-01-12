package com.yuuu.ssm.mapper;

import com.yuuu.ssm.pojo.Room;

import java.util.List;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.mapper
 * @Author:Yuuu。
 * @CreateTime:2022-12-28 23:11
 * @Description:
 * @Version:1.0
 */
public interface RoomMapper {
    /**
     * 获取所有房间信息
     * @return
     */
    List<Room> getAllRoom();


}
