package com.day21.demo3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        Class c=Student.class;
        Constructor<Student> constructor=c.getConstructor(String.class,Integer.class);
        Student stu=constructor.newInstance("马云",60);
//        System.out.println(stu.getAge());
//        Method method=c.getMethod("eat",String.class);
//        method.invoke(stu,stu.getName());
//        ----------------------------------------------------------------
        Constructor<Student> constructor1=c.getDeclaredConstructor(String.class);
        constructor1.setAccessible(true);
        Student student=constructor1.newInstance("李四");
        Method method=c.getDeclaredMethod("sleep",String.class);
        method.setAccessible(true);
        method.invoke(student,student.getName());
    }

    public static void test() throws Exception {
        Class c=Student.class;
        Student student=(Student) c.newInstance();
        //获取所有Public方法与父类方法，
        Method[] methods=c.getMethods();
        //获取实现类所有方法，
        Method[] methods1=c.getDeclaredMethods();
//        Arrays.stream(methods1).forEach(n->{
//            System.out.println(n);
//        });

        Method method=c.getMethod("eat");
        Method method1=c.getMethod("eat",String.class);
//        method1.invoke(student,"马云");

        Method method2=c.getDeclaredMethod("sleep");
        Method method3=c.getDeclaredMethod("sleep",String.class);
        method3.setAccessible(true);
//        method3.invoke(student,"张无忌");
    }
}
