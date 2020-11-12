package com.hxb.dao.text;

import com.hxb.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//userDao调用方法
public class text {
    public static void main(String[] args) {
        //初始化spring容量,加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
         //获取实例,userDao
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
           userDao.say();
    }
}
