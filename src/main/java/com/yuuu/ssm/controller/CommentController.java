package com.yuuu.ssm.controller;

import com.yuuu.ssm.pojo.Comment;
import com.yuuu.ssm.pojo.User;
import com.yuuu.ssm.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.controller
 * @Author:Yuuu。
 * @CreateTime:2023-01-04 15:35
 * @Description:
 * @Version:1.0
 */
@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public String getAllComments(Model model,HttpSession session){
        List<Comment> list = commentService.getAllComments();
        User user = (User) session.getAttribute("user");
        model.addAttribute("list",list);
        model.addAttribute("user",user);
        return "comment_list";
    }

    @GetMapping("/comment/per")
    public String inPersonal(Model model,HttpSession session){
        User user = (User) session.getAttribute("user");
        List<Comment> commentByUsername = commentService.getCommentByUsername(user.getUsername());
        model.addAttribute("person",commentByUsername);
        model.addAttribute("user",user);
        return "comment_person";
    }

    @PostMapping("/comment/add")
    public String publishComment(String comment,HttpSession session){
        User user = (User) session.getAttribute("user");
        Date date1 = new Date();
        long time = date1.getTime();
        java.sql.Date date = new java.sql.Date(time);
        commentService.publishComment(user.getUserId(),user.getUsername(),date,comment);
        return "redirect:/comments";
    }

    @GetMapping("/comment/del/{id}")
    public String deleteComment(@PathVariable("id") Integer id,HttpSession session){
        User user = (User) session.getAttribute("user");
        commentService.deleteCommentById(id,user.getUserId());
        return "redirect:/comment/per";
    }
}
