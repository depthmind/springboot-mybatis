package com.depthmind.mybatis.service.impl;

import com.depthmind.mybatis.domain.Users;
import com.depthmind.mybatis.mapper.UsersMapper;
import com.depthmind.mybatis.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    public List<Users> selectAll(){
        return usersMapper.selectAll();
    }
}
