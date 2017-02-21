package com.heitian.ssm.controller;

import com.heitian.ssm.model.User;
import com.heitian.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "showUser";
    }

    @RequestMapping("/findUserByPhone")
    public String findUserByPhone(String emailOrPhone,Model model){
        log.info("手机号或者邮箱查询用户信息");
    User user= userService.getUserByPhoneOrEmail(emailOrPhone);
        model.addAttribute("user",user);
        return "findUserByPhone";
    }
    @RequestMapping("/findUserById/{id}")
    public String findUserById(@PathVariable("id") Long id, Model model){
        log.info("ID查询用户信息");
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "findUserById";
    }
    @RequestMapping("/deleteUserById")
    public String deleteUserById(short id, Model model){
        log.info("删除用户");
        if (userService.deleteUserById(id)){
        return "success";}
        return "showUser";
    }
//     <!--这里是insert-->
//    @RequestMapping("/addUser")
//    public String addUser(User user,Model model){
//            log.info("增加用户信息");
//            if (userService.addUser(user)){
//                return "success";
//        }
//                 return "showUser";
//    }
}
