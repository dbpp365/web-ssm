package com.heitian.ssm.service;

import com.heitian.ssm.model.Student;

import java.util.List;

/**
 * Created by Administrator on 2017/2/22.
 */
public interface StudentService {

    boolean addStudent(Student student);

    List<Student> findInfoByID(String id);
}
