package com.day15.day15.other;

public class Transmit implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<15;i++){
            System.out.println(Thread.currentThread().getName()+":播放背景音乐:"+i);
        }
    }
}
