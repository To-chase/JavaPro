package com.day17.day17work.关卡一;

public class Title10 {
    public static void main(String[] args) {
        int s=getValue(5);
        System.out.println(s);
    }
    public static int getValue(int n){
       if(n<=0){
           return 1;
       }
       return n*getValue(n-1);
    }
}
