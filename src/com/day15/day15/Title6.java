package com.day15.day15;

public class Title6 {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            int glass=100;
            @Override
            public void run() {
                int index=1;
                while(true){
                    synchronized (this){
                        if(index>100){
                            System.out.println("实体店已售完水杯");
                            break;
                        }
                        System.out.println(Thread.currentThread().getName()+"卖出第"+index+"个,"+"总共剩余"+(glass-index)+"个");
                        index++;
                    }
                }

            }
        };
        Thread thread=new Thread(runnable,"实体店");
//        Thread thread1=new Thread(runnable,"实体店1");
        thread.start();
//        thread1.start();
    }
}
