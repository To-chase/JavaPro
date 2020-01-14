package com.day17.day17work.关卡一;

import java.io.File;

public class Title1 {
    public static void main(String[] args) {
        //绝对路径
        File file=new File("D:\\a\\1.txt");
        String fileParent="D:\\a";
        String fileChild="1.txt";
        File file1=new File(fileParent,fileChild);
    }
}
