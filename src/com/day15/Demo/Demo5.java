package com.day15.Demo;

public class Demo5 {
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
                    if(i==50){
                        Thread.yield();
                    }
                }
            }
        };
        Thread t1=new Thread(runnable1);
        t.start();
        t1.start();

    }
}
