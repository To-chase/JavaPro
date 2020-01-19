package com.day21.day21.title5;

import java.lang.reflect.Method;
import java.util.Scanner;

public class TestA {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入类A的全名(包括包名):");
        String className=sc.next();
//        com.day21.day21word.title6.A
        Class c=Class.forName(className);
        A a=(A) c.newInstance();
        Method method=c.getMethod("showString");
        method.invoke(a);

    }
}
