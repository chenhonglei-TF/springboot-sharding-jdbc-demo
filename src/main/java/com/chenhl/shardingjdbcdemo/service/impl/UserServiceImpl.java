package com.chenhl.shardingjdbcdemo.service.impl;

import com.chenhl.shardingjdbcdemo.domain.User;
import com.chenhl.shardingjdbcdemo.mapper.UserMapper;
import com.chenhl.shardingjdbcdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void processUsers() {
        List<Long> result = new ArrayList<>(10);
        for (Long i = 1L; i <= 10; i++) {
            User user = new User();
            user.setUserId(i);
            user.setUserName("user_" + i);
            userMapper.insert(user);
            result.add(user.getUserId());
            System.out.println("Insert User:" + user.getUserId());
        }
    }

    @Override
    public List<User> getUsers()  {
        return userMapper.selectList();
    }
}
