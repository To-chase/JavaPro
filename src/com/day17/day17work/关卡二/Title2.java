package com.day17.day17work.关卡二;

import java.io.File;
import java.util.Scanner;

public class Title2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入文件路径:");
        String path=sc.next();
        File file=new File(path);
        if(file.isFile()){
            System.out.println("文件大小:"+file.length());
        }else {
            int n=0;
            File[] files=file.listFiles();
            for(File f:files){
               n+= f.length();
            }
            System.out.println(file.getName()+"文件夹下的大小:"+n);
        }
    }
}
