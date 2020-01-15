package com.day17.day17work.关卡三;

import java.io.File;
import java.io.FileFilter;

public class Title1 {
    public static void main(String[] args) {
        File file=new File("D:\\aaa");
        cals(file);
    }

    public static void cals(File file){
        File[] files=file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.length()<=200;
            }
        });

        for(File f:files){
            if(f.isFile()){
                System.out.println(f.getName());
            }else{
                cals(f);
            }
        }

    }
}
