package com.yuuu.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.yuuu.ssm.pojo.Employee;
import com.yuuu.ssm.pojo.Room;
import com.yuuu.ssm.service.RoomService;
import com.yuuu.ssm.service.impl.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.controller
 * @Author:Yuuu。
 * @CreateTime:2022-12-28 23:14
 * @Description:
 * @Version:1.0
 */
@Controller
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/room/page/1")
    public String showRoomInfo(Model model){
        List<Room> rooms = roomService.getAllRoom();
        model.addAttribute("room",rooms);
        return "room_list";
    }
}
