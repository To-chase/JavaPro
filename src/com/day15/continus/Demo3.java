package com.day15.continus;

public class Demo3 {
    public static void main(String[] args) {
        Runable runable=new Runable();
        Thread t1=new Thread(runable,"线程一");
        Thread t2=new Thread(runable,"线程二");
        t1.start();
        t2.start();

    }
}
