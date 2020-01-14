package com.day17.day17work.关卡一;

import java.io.File;
import java.io.IOException;

public class Title7 {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\a.txt");
        File file2=new File("D:\\aaa");
        if(!file.exists()){
            file.createNewFile();
        }
        if(!file2.exists()){
            file2.mkdir();
        }

        if(file.isFile()){
            System.out.println(file.getName()+"是文件");
        }
        if(file2.isDirectory()){
            System.out.println(file.getName()+"不是文件");
        }

    }
}
