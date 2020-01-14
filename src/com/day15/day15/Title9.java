package com.day15.day15;

import com.day15.day15.other.Multiplication;

public class Title9 {
    public static void main(String[] args) {
        Multiplication m1=new Multiplication(10);
        Multiplication m2=new Multiplication(5);
        Multiplication m3=new Multiplication(8);
        Thread t1=new Thread(m1,"线程一");
        Thread t2=new Thread(m2,"线程二");
        Thread t3=new Thread(m3,"线程三");
        t1.start();
        t2.start();
        t3.start();

    }
}
