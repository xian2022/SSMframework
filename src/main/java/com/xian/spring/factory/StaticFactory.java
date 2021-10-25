package com.xian.spring.factory;

import com.xian.spring.dao.Impl.UserDaoImpl;

public class StaticFactory {
    public static UserDaoImpl getUser(){
        return new UserDaoImpl();
    }
}
