package com.day19.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            long start=System.currentTimeMillis();
            FileInputStream fis = new FileInputStream("D:\\Lqj\\util\\Git-2.23.0-64-bit.exe");
            FileOutputStream fos = new FileOutputStream("D:\\Lqj\\bise\\Git-2.23.0-64-bit.exe");
            byte[] b = new byte[1024];
            int len;
            while ((len = fis.read(b)) != -1) {
                fos.write(b,0,len);
            }
            fos.close();
            fis.close();
            long end=System.currentTimeMillis();
            System.out.println("字节流用时:"+(end-start));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
