package com.day15.ticket;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    int ticket=100;
//    @Override
//    public  void run() {
//        while(true){
//            synchronized(this){
//            if(ticket<=0){
//                System.out.println(Thread.currentThread().getName()+"窗口卖完票了");
////                lock.unlock();
//                break;
//            }
////            lock.lock();
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName()+",已售出:"+ticket+"号票");
//                ticket--;
////                lock.unlock();
//            }
//        }
//    }

    ReentrantLock lock=new ReentrantLock();
    @Override
    public  void run() {
        while(true){
            lock.lock();
            if(ticket<=0){
                    System.out.println(Thread.currentThread().getName()+"窗口卖完票了");
                    lock.unlock();
                    break;
                }
            System.out.println(Thread.currentThread().getName()+",已售出:"+ticket+"号票");
                ticket--;
                lock.unlock();
            }
        }

}
