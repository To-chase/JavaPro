package com.day21.day21;

import java.lang.reflect.Method;
import java.util.Properties;

public class Title8 {
    public static void main(String[] args) throws Exception {
        Properties pro=new Properties();
        pro.load(Title8.class.getResourceAsStream("/com/day21/day21/every.properties"));
        Class c=Class.forName(pro.getProperty("className"));
        DemoClass demoClass=(DemoClass) c.newInstance();
        Method method=c.getMethod("run");
        method.invoke(demoClass);
    }
}
