package com.day07;

public class til3 {
    public static void main(String[] args) {
        String str="HelloWorld广州";
        System.out.println("长度:"+str.length());
        System.out.println("str字符串位2的char值"+str.charAt(2));
        System.out.println("字符串o第一次出现在str字符串中的索引值:"+str.indexOf("o",1));
        System.out.println("截取字符串str,从索引6开始到结束:"+str.substring(6,str.length()));
        System.out.println("截取字符串str,从索引2开始到索引7:"+str.substring(2,7));

    }
}
