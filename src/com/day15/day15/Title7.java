package com.day15.day15;

import java.util.concurrent.locks.ReentrantLock;

public class Title7 {
    public static void main(String[] args) {

        Runnable runnable=new Runnable() {
            private Integer seat=80;
            ReentrantLock lock=new ReentrantLock();
            @Override
            public void run() {

                while(true){

                    lock.lock();
                        if(seat<=0){
                            System.out.println("该班车提没有座位");
                            lock.unlock();
                            break;
                        }
                        int index=seat-1;
                        System.out.println(Thread.currentThread().getName()+"有人上车---还剩余"+index+"个座位");
                        seat--;
                        lock.unlock();
                    }
                }

        };
        Thread thread=new Thread(runnable,"前门");
        Thread thread2=new Thread(runnable,"中间门");
        Thread thread3=new Thread(runnable,"后门");
        thread.start();
        thread2.start();
        thread3.start();
    }
}
