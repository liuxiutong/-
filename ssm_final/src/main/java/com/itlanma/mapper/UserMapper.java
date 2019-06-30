package com.itlanma.mapper;

import com.itlanma.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author 张生祥
 * @date 2019/06/27 17:22
 */
public interface UserMapper {
    /**
     * 根据用户名密码查询
     * @param username
     * @param password
     * @return
     */
    User findUser(@Param("username") String username, @Param("password") String password);
}
