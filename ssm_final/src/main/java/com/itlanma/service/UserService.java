package com.itlanma.service;

import com.itlanma.domain.User;

/**
 * @author 张生祥
 * @date 2019/06/27 17:00
 */
public interface UserService {

    User findUser(String username, String password);
}
