package com.xian.spring.domain;

import com.xian.spring.service.UserService;
import com.xian.spring.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        UserService userService = (UserService) new ClassPathXmlApplicationContext("Applicationcontext.xml").getBean("userService");
        userService.save();
    }
}
