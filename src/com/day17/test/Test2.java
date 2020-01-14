package com.day17.test;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
//        File file=new File("homework.imi");
//        System.out.println("相对路径"+file.getPath());
//        System.out.println("绝对路径:"+file.getAbsolutePath());
        File file=new File("D:\\a\\a.txt");
//        System.out.println(file.exists());
//        file.createNewFile();
//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile());
//        System.out.println(file.isAbsolute());

//        File file1=new File("D:\\b\\c\\a");
//
//        System.out.println(file1.mkdirs());
//        file1.delete();//只能删除空文件

        File file1=new File("D:\\work\\Question");
        String[] arrStr=file1.list();
//        for(String s:arrStr){
//            System.out.println(s);
//        }
//
        File[] files=file1.listFiles();
        for(File f:files){
//            System.out.println(f);
            if(f.isDirectory()){
                if(f.exists()){
                    File[] files1=f.listFiles();
                    for(File f1:files1){
                        System.out.println(f1);
                    }
                }
            }
            System.out.println("-----------------------------------------");
        }

    }
}
