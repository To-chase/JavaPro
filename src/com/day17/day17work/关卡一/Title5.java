package com.day17.day17work.关卡一;

import java.io.File;
import java.io.IOException;

public class Title5 {
    public static void main(String[] args) {
        //C盘无法访问
        File file=new File("D:\\a.txt");
        file.exists();
        try {
            file.createNewFile();
            file.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file1=new File("D:\\aaa");
        file1.exists();
        file1.mkdir();
        file.delete();

    }
}
