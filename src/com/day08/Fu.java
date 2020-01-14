package com.day08;

public class Fu {
     int age;
     static {
         System.out.println("我是fu类的静态代码块");//1
     }

    public Fu(){
        System.out.println("我是Fu类的无参构造函数");//3
    }

    public Fu(int age){
        System.out.println("我是Fu类的有参构造函数");
    }
//    public void eat(){
//        System.out.println("fu类的eat");
//    }
{
    System.out.println("FU");
}
}
