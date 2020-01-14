package com.day10;

public class Test {
    public static void main(String[] args) {
        final int a=10;
        System.out.println("1"+a);
//        a=20;
        for(int i=0;i<5;i++){
            final int c=i;
            System.out.println(c);
        }

    }
}
