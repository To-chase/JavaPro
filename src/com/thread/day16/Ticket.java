package com.thread.day16;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    private Integer num;

    public Ticket(Integer num) {
        this.num = num;
    }

    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            synchronized (this){
//            lock.lock();
            if (num <= 0) {
                System.out.println("票已卖完");
//                lock.unlock();
                break;
            }
            int index = num - 1;
            System.out.println(Thread.currentThread().getName() + "买了一张票,剩余票数为" + index);
            num--;
//            lock.unlock();
            }
        }
    }
}
