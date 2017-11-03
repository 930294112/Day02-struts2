package com.lanou.service.impl;

import com.lanou.dao.UserDao;
import com.lanou.dao.impl.UserDaoImpl;
import com.lanou.domain.User;
import com.lanou.service.UserService;

/**
 * Created by dllo on 17/10/11.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public User login(User user) {
        //调用dao层登录方法
        return userDao.login(user);
    }

    @Override
    public User register(User user) {
        //调用dao层注册方法
        return userDao.register(user);
    }
}
