package com.day16;

public class Title7 {
    public static void main(String[] args) {
        invokeCalc(130,120,(a,b)->{
            return a-b;
        });
    }
    private static void invokeCalc(int a,int b,Calculator calculator){
        int result = calculator.calc(a,b);
       System.out.println("结果是："+result);
    }
}
