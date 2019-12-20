package com.depthmind.mybatis.controller;

import com.depthmind.mybatis.service.UsersService;
import com.depthmind.mybatis.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ctvit
 */
@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/test")
    public String test() {
        return usersService.selectAll().toString();
    }
}
