package com.qs.service;

import com.qs.spring.QsApplicationContext;

public class Test {
    public static void main(String[] args) {
        QsApplicationContext applicationContext = new QsApplicationContext(AppConfig.class);

        UserService userService = (UserService) applicationContext.getBean("userService");
    }
}
