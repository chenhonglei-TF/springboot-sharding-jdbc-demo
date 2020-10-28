package com.chenhl.shardingjdbcdemo.mapper;

import com.chenhl.shardingjdbcdemo.domain.User;

import java.util.List;

public interface UserMapper {

    List<User> selectList();

    void insert(User user);
}
