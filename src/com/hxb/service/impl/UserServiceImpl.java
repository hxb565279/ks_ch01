package com.hxb.service.impl;

import com.hxb.dao.UserDao;
import com.hxb.service.UserService;

public class UserServiceImpl implements UserService {
    //依赖注入
    private UserDao userDao;

    //构造方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void say() {
        this.userDao.say();
        System.out.println("UserService调用");
    }
}
