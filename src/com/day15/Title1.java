package com.day15;

public class Title1 {
    public static void main(String[] args) {
        MyThread my=new MyThread("广州");
        my.start();
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"开启main线程!"+i);
        }
    }
}
