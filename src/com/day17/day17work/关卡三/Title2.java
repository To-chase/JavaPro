package com.day17.day17work.关卡三;

import java.io.File;
import java.util.Scanner;

public class Title2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个文件路径");
        String path=sc.next();
        File file=new File("D:\\aaa1");
        del(file);
    }

    public static void del(File file){
       File[] files= file.listFiles();
       for(File f:files){
           if(f.isFile()){
               f.delete();
           }else{
               del(f);
               f.delete();
           }
       }
    }
}
