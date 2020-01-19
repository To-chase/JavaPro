package com.day21.demo2;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args)throws Exception {
//        第一种
        Class c=Student.class;

//        System.out.println(c);
//        第二种
//        Student student=new Student();
//        Class c1=student.getClass();
//        System.out.println(c1);

//        第三种
        Class c2=Class.forName("com.day21.demo2.Student");
//        System.out.println(c2);

//        获取public构造方法
        Constructor[] constructor=c.getConstructors();
//        获取private构造方法
        Constructor[] constructors=c.getDeclaredConstructors();
//        Arrays.stream(constructors).forEach(n->{
//            System.out.println(n);
//        });
//        获取单个构造方法
        Constructor<Student> constructor1=c.getConstructor(String.class,Integer.class,String.class);
//        实例化Public修饰的student构造器
//        Student stu=constructor1.newInstance("马云",60,"男");
//        System.out.println(stu.getName()+","+stu.getSex());

        System.out.println("=================================================================");
//        Constructor<Student> constructor2=c.getConstructor(String.class,Integer.class);
        Constructor<Student> constructor3=c.getDeclaredConstructor(String.class,Integer.class);
//       Student s1=(Student)c.getDeclaredConstructor();
        constructor3.setAccessible(true);
        Student s=constructor3.newInstance("lulu",18);
        System.out.println(s.getName()+","+s.getAge());
    }
}
