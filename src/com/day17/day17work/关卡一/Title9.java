package com.day17.day17work.关卡一;

public class Title9 {
    public static void main(String[] args) {
       int sum= sum(100);
        System.out.println(sum);
    }

    public static int sum(int n){
        if(n<=0){
            return 0;
        }
        return n+sum(n-1);
    }
}
