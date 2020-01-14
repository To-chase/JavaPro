package com.thread.test1;

public class Test {
    public static void main(String[] args) {
        Shower shower=new Shower();
        new Thread(){
            @Override
            public void run() {
                shower.show1();
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                shower.show2();
            }
        }.start();
    }
}
