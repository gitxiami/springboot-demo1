package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * @Author wangguang
 * @Date 2020/1/22  9:50
 */
@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    /**
     * 显示用户
     * @param model
     * @return
     */
    @GetMapping("/user/add")
    public String getInsertUser(Model model ){
        return "user_index";
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @PostMapping("/user/addData")
    @ResponseBody
    public Integer postInsertUser(@RequestBody  User user){

        return userMapper.insertUser(user);
    }

    /**
     * 根据ID 查询
     * @param id
     * @return
     */
    @GetMapping("/get")
    public User getUser(Integer id){

        return userMapper.findUserById(id);
    }
}
