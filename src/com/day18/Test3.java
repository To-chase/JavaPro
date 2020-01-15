package com.day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {


    }

    public static void txt() {
        //输入流读入txt
        //输出流写出txt
        FileInputStream ios = null;
        FileOutputStream fos = null;
        try {
            ios = new FileInputStream("D:\\aaa\\a.txt");
            fos = new FileOutputStream("D:\\bbb\\a.txt");
            byte[] b = new byte[10];
            int len;
            while ((len = ios.read(b)) != -1) {
                fos.write(b,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
                ios.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void photo() {
        //输入流读入图片
        //输出流写出图片
        FileInputStream ios = null;
        FileOutputStream fos = null;
        try {
            ios = new FileInputStream("D:\\aaa\\1.jpg");
            fos = new FileOutputStream("D:\\bbb\\pander.jpg");
            //一次读1024
            byte[] b = new byte[1024];
            int len;
            while ((len = ios.read(b)) != -1) {
                fos.write(b, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //先开后关，后开先关
            //关闭流
            try {
                fos.close();
                ios.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
