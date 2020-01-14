package com.day07;

import java.util.Scanner;

public class til7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个QQ号:");
        String qq=sc.next();
        boolean flag=checkQQ(qq);
        if(flag){
            System.out.println("此QQ号码正确:"+flag);
        }else{
            System.out.println("此QQ号码正确:"+flag);
        }
    }

    public static boolean checkQQ(String qq){
        boolean flag=false;
        if(qq.length()>5&&qq.length()<12){
            if(qq.charAt(0)!='0'){
                for(int i=0;i<qq.length();i++){
                    char ch=qq.charAt(i);
                    if(ch>'0'&&ch<'9'){
                        flag=true;
                    }
                }
//                flag=true;
            }
        }
        return flag;
    }
}
