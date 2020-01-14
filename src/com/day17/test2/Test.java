package com.day17.test2;

public class Test {
    public static void main(String[] args) {
        b(1);
    }

    public static void b(int i){
        if(i>=5000){
            return;
        }
        b(++i);
        System.out.println(i);
    }
}
