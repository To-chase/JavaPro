package com.day21.day21;

import java.lang.reflect.Constructor;

public class Title3 {
    public static void main(String[] args)throws Exception {
//        第一种
        Class<Student> c=Student.class;
        Student stu=c.newInstance();
        System.out.println(stu);
//        第二种
        Class<Student> c1=Student.class;
        Constructor<Student> constructor=c1.getConstructor(String.class,Integer.class,String.class);
        Student student=constructor.newInstance("马云",50,"男");
        System.out.println(student);
    }
}
