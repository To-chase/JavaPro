package com.day17.day17work.关卡二;

import java.io.File;
import java.io.FileFilter;

public class Title4 {
    public static void main(String[] args) {
        File file=new File("D:\\aaa");
        File[] files=file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java")||pathname.isDirectory();
            }
        });


            for(File f:files){
                if(f.isFile()){
                    System.out.println(f.getName());
                }
            }


    }
}
