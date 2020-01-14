package com.day10.Test7;

public class Demo2 {
    public static void main(String[] args) {

        int result=sum(120,130,(int a,int b)->{
            return a+b;
        });
        System.out.println(result);
    }

    public static int sum(int a,int b,Computer computer){
        int result=computer.calc(a,b);
        return result;
    }
}
