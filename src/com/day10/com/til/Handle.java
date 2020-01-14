package com.day10.com.til;

public class Handle implements HandleAble {
    @Override
    public void HandleString(String num) {
        System.out.println("原数字:"+num);
        System.out.println("取整后:"+num.substring(0,num.indexOf(".")));
//        System.out.println("四舍五入后:"+num.);
    }
}
