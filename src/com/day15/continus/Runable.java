package com.day15.continus;

public class Runable implements Runnable {
    private int num=10;
    @Override
    public synchronized void run() {
//        synchronized (this){

            if(num>0){
                System.out.println(Thread.currentThread().getName()+"开始:num="+num--);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
                System.out.println(Thread.currentThread().getName()+"结束");
//            }
        }
    }

}
