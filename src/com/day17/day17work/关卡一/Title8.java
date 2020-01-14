package com.day17.day17work.关卡一;

import java.io.File;

public class Title8 {
    public static void main(String[] args) {
        File file=new File("C:\\Windows");
        File[] files=file.listFiles();
        for(File f:files){
            System.out.println(f.getAbsolutePath());
        }
    }
}
