package com.day21.day21.title11;

import java.lang.reflect.Method;

public class MyDemo {
    public static void main(String[] args)throws Exception {
        Class<Title11> c=Title11.class;
        Title11 obj=c.newInstance();
        Method[] m=c.getMethods();
        for(Method method:m){
            if(method.isAnnotationPresent(MyTest.class)){
                method.invoke(obj);
            }
        }
    }

}
