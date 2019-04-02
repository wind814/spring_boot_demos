package com.wind.controller;

import com.wind.entity.UserEntity;
import com.wind.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUser")
    public String getUser(){
        List<UserEntity> userEntityList =  userMapper.getAll();
        return "";
    }
}
