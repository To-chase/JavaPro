package com.day15.day15;

import com.day15.day15.other.Transmit;

public class Title4 {
    public static void main(String[] args) {
        Transmit t=new Transmit();
        Thread thread=new Thread(t,"线一");

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<12;i++){
                    System.out.println(Thread.currentThread().getName()+":显示画面:"+i);
                }
            }
        }, "线二");
        thread.start();
        thread1.start();

    }
}
