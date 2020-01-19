package com.day21.demo4;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Demo {
    @Test
    public void test() throws Exception {
//        获取所有字段
        Class<Student> c=Student.class;
        Student stu=c.newInstance();
        Field[] fields=c.getDeclaredFields();
//        获取public字段
        Field[] fields1=c.getFields();
//        Arrays.stream(fields1).forEach(n->{
//            System.out.println(n);
//        });
//        获取单个字段
        Field field=c.getDeclaredField("name");
        field.setAccessible(true);
        field.set(stu,"马云");
//        Object obj=field.get(stu);
        String name=field.getName();
        System.out.println(name);
    }
}
