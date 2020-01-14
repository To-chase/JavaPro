package com.day10.com.til;

public class Test1 {
    public static void main(String[] args) {

        String num="23.23456789";
//        Handle handle=new Handle();
//        handle.HandleString(num);
        HandleAble handleAble=new HandleAble() {
            @Override
            public void HandleString(String num) {
                System.out.println("原数字:"+num);
                System.out.println("取整后:"+num.substring(0,num.indexOf(".")));
                Double d=Double.parseDouble(num);
                double d1=Math.round(d*10000);
                double result=d1/10000;
                System.out.println("四舍五入后:"+result);
            }
        };
        handleAble.HandleString(num);
    }
}
