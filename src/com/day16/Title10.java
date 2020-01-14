package com.day16;

import java.util.Scanner;

public class Title10 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                while(true){
                    Scanner sc=new Scanner(System.in);
                    System.out.println("请输入姓名");
                    String name=sc.next();
                    System.out.println("请输入性别");
                    String sex=sc.next();
                    Person person=new Person(name,sex);
                    System.out.println(person);
                }
            }
        }.start();
    }
}
