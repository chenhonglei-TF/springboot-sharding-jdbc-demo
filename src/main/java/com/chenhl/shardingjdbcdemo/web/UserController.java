package com.chenhl.shardingjdbcdemo.web;


import com.chenhl.shardingjdbcdemo.domain.User;
import com.chenhl.shardingjdbcdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping(value = "/all")
    @ResponseBody
    public List<User> queryAll() {
        userService.processUsers();

        System.out.println("=======");

        List<User> users = userService.getUsers();
        return users;
    }

}
