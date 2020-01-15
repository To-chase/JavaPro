package com.day18.day18.关卡一;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Title1 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
             fos=new FileOutputStream("D:\\a.txt");
            fos.write(97);
            fos.write(98);
            fos.write(99);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
