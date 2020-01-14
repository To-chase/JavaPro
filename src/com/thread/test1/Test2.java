package com.thread.test1;

public class Test2 {
    public static void main(String[] args) {
        Show show=new Show();
        new Thread(){
            @Override
            public void run() {
                show.show1();
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                show.show2();
            }
        }.start();
    }
}
