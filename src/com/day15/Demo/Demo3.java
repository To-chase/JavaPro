package com.day15.Demo;

public class Demo3 {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    System.out.println("helloworld"+i);
                }
            }
        };
        Thread t=new Thread(runnable);



        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    System.out.println("goodbye"+i);
                }
            }
        };
        Thread t1=new Thread(runnable1);
        t.setPriority(9);
        t1.setPriority(10);
        t.start();
        t1.start();
    }
}
