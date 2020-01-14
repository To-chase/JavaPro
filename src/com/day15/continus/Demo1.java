package com.day15.continus;

import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
//        String s1="s1";
//        String s2="s2";
        Random s1=new Random();
        Random s2=new Random();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (s1){
                        System.out.println(Thread.currentThread().getName()+":"+s1+"!");
                        synchronized (s2){
                            System.out.println(Thread.currentThread().getName()+":s2"+"!");
                        }
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (s2){
                        System.out.println(Thread.currentThread().getName()+":"+s2+"?");
                        synchronized (s1){
                            System.out.println(Thread.currentThread().getName()+":s1"+"?");
                        }
                    }
                }
            }
        }).start();

    }
}
