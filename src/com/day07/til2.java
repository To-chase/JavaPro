package com.day07;

public class til2 {
    public static void main(String[] args) {
        String str1="hello";
        String str2=new String("hello");
        String str3="Hello";
        System.out.println("str1和str2内容是否相等"+str1.equals(str2));
        System.out.println("str1和str3内容是否相等"+str1.equals(str3));
        System.out.println("忽略str1和str3大小写"+str1.equalsIgnoreCase(str3));
        System.out.println("str1是否以He前缀开头"+"He".equals(str1.substring(0,2)));
        System.out.println("str1是否以abc前缀开头"+"abc".equals(str1.substring(0,4)));
        System.out.println("str1是否以0后缀结尾"+"o".equals(str1.substring(str1.length()-1)));
        System.out.println("str1是否以l后缀结尾"+"1".equals(str1.substring(str1.length()-1)));
    }
}
