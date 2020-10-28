package com.chenhl.shardingjdbcdemo.service.impl;

import com.chenhl.shardingjdbcdemo.domain.HealthRecord;
import com.chenhl.shardingjdbcdemo.domain.HealthTask;
import com.chenhl.shardingjdbcdemo.mapper.HealthRecordMapper;
import com.chenhl.shardingjdbcdemo.mapper.HealthTaskMapper;
import com.chenhl.shardingjdbcdemo.service.HealthRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class HealthRecordServiceImpl implements HealthRecordService {

    @Autowired
    HealthRecordMapper healthRecordMapper;

    @Autowired
    HealthTaskMapper healthTaskMapper;


    @Override
    public void processHealthRecords() throws SQLException {

//        List<Long> result = new ArrayList<>(10);
        for (Long i = 1L; i <= 10; i++) {
            HealthRecord healthRecord = insertHealthRecord(i);
            insertHealthTask(i, healthRecord);
//            result.add(healthRecord.getRecordId());
        }
    }


    private HealthRecord insertHealthRecord(final Long i) throws SQLException {
        HealthRecord healthRecord = new HealthRecord();
        healthRecord.setUserId(i);
        healthRecord.setLevelId(i % 5);
        healthRecord.setRemark("Remark" + i);
        healthRecordMapper.insert(healthRecord);
        return healthRecord;
    }

    private void insertHealthTask(final Long i, final HealthRecord healthRecord) throws SQLException {
        HealthTask healthTask = new HealthTask();
        healthTask.setRecordId(healthRecord.getRecordId());
        healthTask.setUserId(i);
        healthTask.setTaskName("TaskName" + i);
        healthTaskMapper.insert(healthTask);
    }
}
