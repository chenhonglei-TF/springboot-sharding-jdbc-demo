package com.chenhl.shardingjdbcdemo.web;


import com.chenhl.shardingjdbcdemo.domain.User;
import com.chenhl.shardingjdbcdemo.service.HealthLevelService;
import com.chenhl.shardingjdbcdemo.service.HealthRecordService;
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

    @Autowired
    HealthLevelService healthLevelService;

    @Autowired
    HealthRecordService healthRecordService;


    @GetMapping(value = "/all")
    @ResponseBody
    public List<User> queryAll() {
        userService.processUsers();

        System.out.println("====保存用户完成===");

        List<User> users = userService.getUsers();

        System.out.println("====查询用户完成===");

        healthLevelService.processLevels();

        System.out.println("====处理健康级别完成===");
        return users;
    }

}
