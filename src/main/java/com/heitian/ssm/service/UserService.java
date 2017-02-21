package com.heitian.ssm.service;

import com.heitian.ssm.model.User;

import java.util.List;

/**
 * Service 定义接口
 */
public interface UserService {

    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone);

    User getUserById(Long userId);
    boolean deleteUserById(Short id);
//     <!--这里是insert-->
//    boolean addUser(User user);
}
