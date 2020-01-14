package com.day17.day17work.关卡一;

import java.io.File;

public class Title6 {
    public static void main(String[] args) {
        File file=new File("C:\\aaa\\a.txt");
        //文件名，文件大小，文件的绝对路径，文件的父路径
        System.out.println("文件名:"+file.getName());
        System.out.println("文件大小:"+file.length());
        System.out.println("文件的绝对路径:"+file.getPath());
        System.out.println("文件的父路径:"+file.getParent());
    }
}
