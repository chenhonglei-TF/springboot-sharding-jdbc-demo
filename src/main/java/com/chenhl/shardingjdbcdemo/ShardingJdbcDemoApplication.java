package com.chenhl.shardingjdbcdemo;

import com.chenhl.shardingjdbcdemo.domain.User;
import com.chenhl.shardingjdbcdemo.hint.HintService;
import com.chenhl.shardingjdbcdemo.service.HealthLevelService;
import com.chenhl.shardingjdbcdemo.service.HealthRecordService;
import com.chenhl.shardingjdbcdemo.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@MapperScan(basePackages = {"com.chenhl.shardingjdbcdemo.mapper"})
@SpringBootApplication
public class ShardingJdbcDemoApplication {

    public static void main(final String[] args) throws SQLException, IOException {
        SpringApplication.run(ShardingJdbcDemoApplication.class, args);
//        try (ConfigurableApplicationContext applicationContext = SpringApplication.run(ShardingJdbcDemoApplication.class, args)) {
//            UserService userService = applicationContext.getBean(UserService.class);
//            userService.processUsers();
//            List<User> users = userService.getUsers();
//            users.forEach(System.out::println);
//
//
//
//            HealthLevelService healthLevelService = applicationContext.getBean(HealthLevelService.class);
//        	healthLevelService.processLevels();
//
//        	HealthRecordService healthRecordService = applicationContext.getBean(HealthRecordService.class);
//        	healthRecordService.processHealthRecords();

//        	HintService hintService = applicationContext.getBean(HintService.class);
//        	hintService.processWithHintValueForShardingDatabases();
//        	hintService.processWithHintValueForShardingDatabasesAndTables();
//        	hintService.processWithHintValueMaster();
//        }
    }

}
