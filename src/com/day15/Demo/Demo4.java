package com.day15.Demo;

public class Demo4 {
    public static void main(String[] args) {

        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    System.out.println("goodbye"+i);

                }
            }
        };
        Thread t1=new Thread(runnable1);
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    System.out.println("helloworld"+i);
                    if(i==500){
                        try {
                            t1.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        Thread t=new Thread(runnable);
        t1.start();
        t.start();
    }
}
