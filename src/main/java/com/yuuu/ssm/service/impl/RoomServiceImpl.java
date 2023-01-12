package com.yuuu.ssm.service.impl;

import com.yuuu.ssm.mapper.RoomMapper;
import com.yuuu.ssm.pojo.Room;
import com.yuuu.ssm.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.service.impl
 * @Author:Yuuu。
 * @CreateTime:2022-12-28 23:15
 * @Description:
 * @Version:1.0
 */
@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomMapper roomMapper;

    @Override
    public List<Room> getAllRoom() {
        List<Room> allRoom = roomMapper.getAllRoom();
        return allRoom;
    }
}
