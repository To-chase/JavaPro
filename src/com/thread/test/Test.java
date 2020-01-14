package com.thread.test;

public class Test {
    public static void main(String[] args) {
        Entry entry=new Entry();
        MyRun1 myRun1=new MyRun1(entry);
        MyRun2 myRun2=new MyRun2(entry);
        Thread t1=new Thread(myRun1);
//        t1.setPriority(6);
        Thread t2=new Thread(myRun2);
        t1.start();
        t2.start();
    }
}
