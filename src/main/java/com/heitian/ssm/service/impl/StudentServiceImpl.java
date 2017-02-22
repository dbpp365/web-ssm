package com.heitian.ssm.service.impl;

import com.heitian.ssm.dao.StudentDao;
import com.heitian.ssm.model.Student;
import com.heitian.ssm.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/2/22.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    public boolean addStudent(Student student) {
        return studentDao.addStudent(student);
    }
}
