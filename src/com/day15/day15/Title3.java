package com.day15.day15;

import com.day15.day15.other.MyThread;
import com.day15.day15.other.MyRunable;

public class Title3 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread("继承方法实现的线程");
        MyRunable myRunable=new MyRunable();
        Thread thread=new Thread(myRunable,"接口方法实现的线程");
        myThread.start();
        thread.start();
    }
}
