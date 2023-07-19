package com.mySpring.springComponents.ioc;


import java.util.HashMap;

//容器类
public class ApplicationContext {
    private Class configClass;
    HashMap<String,Object> map = new HashMap<>();
    //容器
    public ApplicationContext(Class configClass){
        this.configClass = configClass;
    }
    public Object getBean(String name){

        return null;
    }
}
