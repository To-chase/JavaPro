package com.day17.day17work.关卡二;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Title1 {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个文件路径");
        String str=sc.next();
        File file=new File(str);
        if(!file.exists()){
            file.createNewFile();
//            file.mkdirs();
        }else{
            System.out.println("文件大小:"+file.length());
        }
    }
}
