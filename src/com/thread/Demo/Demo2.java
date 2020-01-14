package com.thread.Demo;

public class Demo2 {
    public static void main(String[] args) {
        ShowAll showa=new ShowAll();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    showa.show3();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

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
