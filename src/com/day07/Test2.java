package com.day07;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        String user="[User{name=马云,age=56,money=2500.0},User{name=马化腾,age=56,money=2400.0},User{name=马赛克,age=56,money=2500.0}]";
        String user1=user.substring(1,user.length()-1);
        user1=user1.replace("User{name=","");
        String str[]=user1.split("},");
        ArrayList list= new ArrayList();
       for(int i=0;i<str.length;i++){
           String[] str1=str[i].split(",");
           str[i]=str1[0];
           list.add(str[i]);
       }
        System.out.println(list.toString());
    }
}
