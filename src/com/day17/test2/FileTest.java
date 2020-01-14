package com.day17.test2;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file=new File("D:\\work\\Question");
        printDir(file);
    }

    public static void printDir(File file){
        File[] files=file.listFiles();
        for(File f:files){
            if(f.isFile()){
                System.out.println("文件绝对路径:"+f.getAbsolutePath());
            }else{
                printDir(f);
            }
        }
    }
}
