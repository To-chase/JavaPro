package com.day17.test;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\zhiyun\\Desktop\\coverage-error.log");

        String parentPath="C:\\Users\\zhiyun\\Desktop";
        String childPath="coverage-error.log";
        File file1=new File(parentPath,childPath);

        File file3=new File("C:\\Users\\zhiyun\\Desktop");
        String child="coverage-error.log";
        File file2=new File(file3,child);

        System.out.println("绝对路径:"+file1.getAbsolutePath());
        System.out.println("构造路径:"+file1.getPath());
        System.out.println("目录名称:"+file1.getName());
        System.out.println("文件长度:"+file1.length());


    }
}
