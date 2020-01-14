package com.day15;

public class Test2 {
    public static void main(String ages[]){
        MyRunable mr=new MyRunable();
        Thread t=new Thread(mr,"aaa");
        t.start();
    }
}
