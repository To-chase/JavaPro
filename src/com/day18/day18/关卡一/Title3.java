package com.day18.day18.关卡一;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Title3 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream("D:\\c.txt",true);
            String str="I love java";
            byte[] b=str.getBytes();
            for(int i=0;i<5;i++){
                fos.write(b,0,b.length);
                fos.write("\r\n".getBytes());
            }
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
