package com.day15.Demo;

public class Demo2 {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5000;i++){
                    System.out.println("helloworld"+i);
                }
            }
        };
        Thread t=new Thread(runnable);



        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<500;i++){
                    System.out.println("goodbye"+i);
                }
            }
        };
        Thread t1=new Thread(runnable1);
        t.setDaemon(true);
        t.start();
        t1.start();
    }
}
