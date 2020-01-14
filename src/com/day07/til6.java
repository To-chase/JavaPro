package com.day07;

import java.util.Scanner;

public class til6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String mgc="奥巴马";
        System.out.println("请输入一个字符串:");
        String str=sc.next();
        if(str.indexOf(mgc)>0){
            System.out.println(str.replace(mgc,"*"));
        }

    }
}
