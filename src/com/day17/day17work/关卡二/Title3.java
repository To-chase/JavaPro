package com.day17.day17work.关卡二;

import java.io.File;

public class Title3 {
    public static void main(String[] args) {
        File file=new File("C:\\Program Files (x86)");
        print(file);
    }

    public static void print(File file){
        File[] files=file.listFiles();
            for(File f:files){
                if(f.isFile()){
                    System.out.println(f.getAbsolutePath());
                }else{
                    print(f);
                }

        }
    }
}
