package com.day15;


public class Test4 {
    public static void main(String[] args) {

        MyRunable runnable=new MyRunable();
        Thread thread=new Thread(runnable,"前门");
        Thread thread2=new Thread(runnable,"中间门");
        Thread thread3=new Thread(runnable,"后门");
        thread.start();
        thread2.start();
        thread3.start();
    }
}
