package com.day13.day13.关卡二;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Title7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str=sc.next();
        char[] ch=str.toCharArray();
        LinkedHashSet<String> set=new LinkedHashSet<>();
        for(char strs:ch){
            set.add(String.valueOf(strs));
        }

        for(String strss:set){
            System.out.println(strss);
        }
    }
}
