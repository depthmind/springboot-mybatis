package com.depthmind.mybatis.service;

import com.depthmind.mybatis.domain.Users;

import java.util.List;

public interface UsersService{
    List<Users> selectAll();
}
