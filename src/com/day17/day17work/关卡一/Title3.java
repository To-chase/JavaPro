package com.day17.day17work.关卡一;

import java.io.File;

public class Title3 {
    public static void main(String[] args) {
        //C盘拒绝访问
        File file=new File("D:\\aaa");
        file.mkdir();
    }
}
