package com.xian.spring.service;

import com.xian.spring.dao.Impl.UserDaoImpl;
import com.xian.spring.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Xian
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    //set方法注入
    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/
    //构造方法注入


    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
