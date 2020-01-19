package com.day21.demo5;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Set;

public class Demo1 {
    @Test
    public void demo() throws Exception {
        Properties pro=new Properties();
        pro.load(Demo1.class.getResourceAsStream("/stu.properties"));
        Set<String> set=pro.stringPropertyNames();
        String className=pro.getProperty("className")+".Student";
//        System.out.println(className);
        Class c=Class.forName(className);
        Student stu=(Student) c.newInstance();
//        System.out.println(pro.getProperty("className"));
        for(String str:set){
            if(str.equals("className")){
                continue;
            }
            Field field=c.getDeclaredField(str);
            field.setAccessible(true);
            Class type=field.getType();
            if(type==Integer.class){
                field.set(stu,Integer.valueOf(pro.getProperty(str)));
            }else{
                field.set(stu,pro.getProperty(str));
            }
        }

        System.out.println(stu);
    }
}
