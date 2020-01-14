package com.day17.test2;

import java.io.File;
import java.io.FileFilter;

public class FilterTest {
    public static void main(String[] args) {
        File file=new File("D:\\work\\Question");
        print(file);



    }

    public static void print(File file){
//        File[] files=file.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".jsp")|| pathname.isDirectory();
//            }
//        });
        File[] files=file.listFiles(n->{
            return n.getName().endsWith(".jsp")||n.isDirectory();
        });

        for(File f:files){
            if(f.isFile()){
                System.out.println(f.getAbsolutePath());
            }else {
                print(f);
            }
        }
    }
}
