package com.heitian.ssm.dao;

import com.heitian.ssm.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Repository、对应存储层Bean
 * @Service、 对应业务层Bean
 * @Controller，对应展示层Bean。
 *  @Component 对那些比较中立的类进行注释。
 *  @Param("参数名"),表示给参数命名,名称就是括号中的内容
 */

@Repository

public interface UserDao {
    //这里的@Param（“userId”） 是指在持久层，和Mapper文件对应
    User selectUserById(@Param("userId") Long userId);

    User selectUserByPhoneOrEmail(@Param("phoneOrEmail") String phoneOrEmail);

    List<User> selectAllUser();
    boolean deleteUserById(@Param("userId") short id);
//     这里是insert
//    boolean addUser(@Param("user") User user);
}
