package com.heitian.ssm.service.impl;

import com.heitian.ssm.dao.UserDao;
import com.heitian.ssm.model.User;
import com.heitian.ssm.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Service 接口实现
 * 例：@Service("userService")注解是告诉spring，
 * 当Spring要创建UserServiceImpl的的实例时，
 * bean的名字必须叫做"userService"，这样当Action需要使用UserServiceImpl的的实例时,
 * 就可以由Spring创建好的"userService"，然后注入给Action。
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    //@Resource 按照名称-》字段-》类型的先后顺序来进行装配
    @Resource
    private UserDao userDao;

    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }
    
    public User getUserByPhoneOrEmail(String emailOrPhone) {
        return userDao.selectUserByPhoneOrEmail(emailOrPhone);
    }
    
    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }
    public boolean deleteUserById(Short id){
       if(userDao.deleteUserById(id)){
           System.out.printf("删除成功");
           return true;
       }
       else{
           System.out.printf("删除失败");
           return  false;
       }

    }
//     <!--这里是insert-->
//    public boolean addUser(User user){
//       return userDao.addUser(user);
//
//    }
}
