package com.day15.ticket;

import java.util.concurrent.locks.ReentrantLock;

public class Test2 {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            int ticket=1000;
            ReentrantLock lock=new ReentrantLock();
            @Override
            public void run() {
                while(true){
                    lock.lock();
                    if(ticket<=0){
                        System.out.println(Thread.currentThread().getName()+"窗口卖完票了");
                        lock.unlock();
                        break;
                    }
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+",已售出:"+ticket+"号票");
                    ticket--;
                    lock.unlock();
                }
            }
        };
        Thread thread=new Thread(runnable,"广州南");
        Thread thread1=new Thread(runnable,"深圳北");
        Thread thread2=new Thread(runnable,"武汉");
        thread.start();
        thread1.start();
        thread2.start();

    }
}
