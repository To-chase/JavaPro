package com.day15;

public class Test3 {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
              for(int i=0;i<10;i++){
                  System.out.println("helloworld"+i);
              }
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();

        Thread thread1=new Thread(()->{
            for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"world-->"+i);
        }
        },"线程一");
        thread1.start();

        for(int i=0;i<10;i++){
            System.out.println("day"+i);
        }
    }
}
