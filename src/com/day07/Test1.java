package com.day07;

public class Test1 {
    public static void main(String[] args) {
        String str="User{name='马云',age='57',sex='男'}";

        String str1=str.substring(5,str.length()-1);
        String str2=str1.replace("'","");
//        System.out.println(str2);
        String[] str3=str2.split(",");
        System.out.println(str3.length);
        for(int i=0;i<str3.length;i++){
            String str4[]=str3[i].split("=");
            System.out.println(str3[i]);
            str3[i]=str4[1];
        }

        for(int i=0;i<str3.length;i++){
            System.out.println(str3[i]);
        }
    }
}
