package com.day18.day18.关卡一;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Title2 {
    public static void main(String[] args) {
        try {
            String str = "hello";
            FileOutputStream fos = new FileOutputStream("D:\\b.txt");
            byte[] b = str.getBytes();
            fos.write(b);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
