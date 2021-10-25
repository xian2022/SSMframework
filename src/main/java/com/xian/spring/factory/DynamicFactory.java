package com.xian.spring.factory;

import com.xian.spring.dao.Impl.UserDaoImpl;
import com.xian.spring.domain.User;

public class DynamicFactory {
    public UserDaoImpl getUser(){
        return new UserDaoImpl();
    }
}
