package com.day17.test2;

public class Test2 {
    public static void main(String[] args) {
        int sum=sum(5);
//        System.out.println(sum);
        int s=factorial(3);
        System.out.println(s);
    }

    public static int sum(int num){
        if(num==1){
            return num;
        }

        return num+sum(num-1);
    }

    public static int factorial(int num){
        if(num==1){
            return 1;
        }

        return num*factorial(num-1);
    }
}
