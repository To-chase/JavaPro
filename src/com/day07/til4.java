package com.day07;

public class til4 {
    public static void main(String[] args) {
        String str="HelloWorld";
        char[] ch=str.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            System.out.println(ch[i]);
        }

        System.out.println("将str字符串转换成小写:"+str.toLowerCase());
        System.out.println("将str字符串转换成大写:"+str.toUpperCase());
        System.out.println("将str字符串o替换成'6':"+str.replace('o','6'));
        System.out.println("将str字符串ll替换成LL:"+str.replace("ll","LL"));


    }
}
