package com.chenhl.shardingjdbcdemo.service.impl;

import com.chenhl.shardingjdbcdemo.domain.HealthLevel;
import com.chenhl.shardingjdbcdemo.mapper.HealthLevelMapper;
import com.chenhl.shardingjdbcdemo.service.HealthLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class HealthLevelServiceImpl implements HealthLevelService {

    @Autowired
    HealthLevelMapper healthLevelMapper;

    @Override
    public void processLevels() throws SQLException {
        for (int i = 1; i <= 5; i++) {
            healthLevelMapper.insert(new HealthLevel((long)i, "level"+i));
        }
    }
}
