package com.day15.continus;

public class Demo4 {
    public static void main(String[] args) {
        Runable runable=new Runable();
        for(int i=0;i<10;i++){
            Thread thread=new Thread(runable);
            thread.start();
        }
    }
}
