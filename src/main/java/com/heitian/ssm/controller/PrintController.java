package com.heitian.ssm.controller;

import com.heitian.ssm.model.Student;
import com.heitian.ssm.service.StudentService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/2/23.
 */
@Controller
@RequestMapping("/print")
public class PrintController {
    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private StudentService studentService;

    @RequestMapping("byID")
    public String byId(String id, Model model) {
        log.info(" 依据ID打印信息");
        //web层调用业务层
        //业务层调model层
        List<Student> list_student = studentService.findInfoByID(id);
        model.addAttribute("info", list_student);
        return "print";
    }
}
