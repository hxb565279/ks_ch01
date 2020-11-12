package com.hxb.dao.impl;

import com.hxb.dao.UserDao;

//userDao实现类
public class UserDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("UserDao调用");
    }
}
