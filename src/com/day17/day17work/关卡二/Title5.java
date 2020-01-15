package com.day17.day17work.关卡二;

import java.io.File;
import java.util.Scanner;

public class Title5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入文件路径:");
        String path=sc.next();
        //D:\test
        File file=new File(path);
        printDir(file);
        file.delete();
    }

    public static void printDir(File file){
        File[] files=file.listFiles();

            for(File f:files){
                if(f.isFile()){
                    f.delete();
                }else{
                    printDir(file);
                }
            }


    }
}
