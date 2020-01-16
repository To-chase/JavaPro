package com.day19.test1;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        try {
            long start=System.currentTimeMillis();
            BufferedInputStream bs = new BufferedInputStream(new FileInputStream("D:\\Lqj\\util\\Git-2.23.0-64-bit.exe"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Lqj\\bise\\Git-2.23.0-64-bit.exe"));
            int len;
            byte[] b=new byte[1024];
            while ((len = bs.read(b)) != -1) {
                bos.write(b,0,len);
            }
            bos.close();
            bs.close();
            long end=System.currentTimeMillis();
            System.out.println("缓冲流用时:"+(end-start));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
