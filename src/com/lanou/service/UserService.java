package com.lanou.service;

import com.lanou.domain.User;

/**
 * Created by dllo on 17/10/11.
 */
public interface UserService {

    /**
     * 登录
     * @param user 包含要验证的参数对象
     *  @return 登录成功之后的对象
     * **/
    User login(User user);
    /**
     * 注册
     * @param user 包含进行注册的用户信息
     * @return 注册成功之后用户的信息
     * **/
    User register(User user);
}
