package com.day15;

public class MyRunable implements Runnable {
    private Integer seat=80;
    @Override
    public void run() {
        while(true){
            synchronized (this){
                System.out.println("seat"+seat);
            if (seat <= 0) {
                System.out.println("该班车提没有座位");
                break;
            }
                seat--;
                System.out.println(Thread.currentThread().getName() + "有人上车---还剩余" + seat + "个座位");
            }
        }
    }

}
