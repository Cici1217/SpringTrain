package com.mySpring.testFile;

import com.mySpring.springComponents.ioc.ApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext(TestConfig.class);
        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService);
    }
}
