package com.depthmind.mybatis.controller;

import com.depthmind.mybatis.service.UsersService;
import com.depthmind.mybatis.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;

    public String test() {
        return usersService.selectAll().toString();
    }
}
