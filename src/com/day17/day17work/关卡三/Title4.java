package com.day17.day17work.关卡三;

import java.io.File;
import java.util.Scanner;

public class Title4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个文件路径:");
        String path=sc.next();
        File file=new File(path);
        print(file);
    }
    public static void print(File file){
        File[] files=file.listFiles();
        System.out.println(file.getName());
        for(File f:files){
            if(f.isFile()){
                System.out.println(f.getName());
            }else{
                print(f);
            }
        }
    }
}
