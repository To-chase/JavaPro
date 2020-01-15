package com.day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
    public static void main(String[] args) {
        read1();
    }

    public static void read1() {
        FileInputStream ios = null;//输入流

        try {
            ios = new FileInputStream("a.txt");
            int len;
            byte[] b=new byte[2];
            while ((len = ios.read(b)) != -1) {//每次读两个字节存在字节数组里，读到-1就说明文档已经读完
//                System.out.println(new String(b));
                System.out.println(new String(b,0,len));//把字节数组转成字符串显示出来
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        FileInputStream ios = null;
        try {
            ios = new FileInputStream("a.txt");
            int len;
            while ((len = ios.read()) != -1) {
                System.out.println((char) len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {

        }
    }
}
