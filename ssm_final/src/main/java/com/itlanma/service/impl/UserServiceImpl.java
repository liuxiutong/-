package com.itlanma.service.impl;

import com.itlanma.domain.User;
import com.itlanma.mapper.UserMapper;
import com.itlanma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 张生祥
 * @date 2019/06/27 17:00
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUser(String username, String password) {
        User user = null;
        try {
            user = userMapper.findUser(username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
