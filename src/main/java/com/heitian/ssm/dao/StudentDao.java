package com.heitian.ssm.dao;

import com.heitian.ssm.model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/2/22.
 */

@Repository
public interface StudentDao {

    boolean addStudent(@Param("student") Student stu);

    List<Student> findInfoByID(@Param("ID") String id);
}
