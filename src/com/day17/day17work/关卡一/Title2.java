package com.day17.day17work.关卡一;

import java.io.File;
import java.io.IOException;

public class Title2 {
    public static void main(String[] args) {
//        检查C盘下是否存在文件a.txt,如果不存在则创建该文件
//        C盘拒绝访问
        File file=new File("D:\\a.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
