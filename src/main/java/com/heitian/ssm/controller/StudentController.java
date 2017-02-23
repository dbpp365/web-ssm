package com.heitian.ssm.controller;

import com.heitian.ssm.model.Student;
import com.heitian.ssm.service.StudentService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/2/22.
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private StudentService studentService;

    @RequestMapping("/addStudent")
    public String addStudent(Student student) {
        log.info("增加用户");
        if (studentService.addStudent(student))
            return "success";
        return "failed";


    }


}
