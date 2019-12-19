package com.depthmind.mybatis.mapper;

import com.depthmind.mybatis.domain.Users;

import java.util.List;

public interface UsersMapper {
    List<Users> selectAll();
}
