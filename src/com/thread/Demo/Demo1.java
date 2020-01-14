package com.thread.Demo;

public class Demo1 {
    public static void main(String[] args) {
        Showa showa=new Showa();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    showa.show1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    showa.show2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }
}
