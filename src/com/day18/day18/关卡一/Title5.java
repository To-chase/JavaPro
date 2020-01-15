package com.day18.day18.关卡一;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Title5 {
    public static void main(String[] args) {
         FileInputStream fis=null;
        try {
            fis=new FileInputStream("D:\\a.txt");
            byte[] b=new byte[2];
            int len;
            while((len=fis.read(b))!=-1){
                System.out.println(new String(b,0,len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
