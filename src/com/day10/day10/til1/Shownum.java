package com.day10.day10.til1;

public class Shownum implements HandleAble {
    @Override
    public void HandleString(String num) {
        System.out.println("原数:"+num);
        String str1= num.substring(0,num.indexOf("."));
        int index=num.indexOf(".");
        String str2=num.substring(index+1,index+5);
        System.out.println("取整:"+str1);
        System.out.println("保留:"+str2);

    }
}
