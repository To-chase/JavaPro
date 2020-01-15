package com.day18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        printOut1();
    }

    public static void printOut1(){
        String str="一起走过的日子";

        try {
            FileOutputStream fos=new FileOutputStream("a.txt",true);
            byte[] b=str.getBytes();
//            iso-8859-1
//            fos.write(b);
            fos.write(b,0,b.length);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void printOut(){
        FileOutputStream fos= null;
        try {
            fos = new FileOutputStream("a.txt");
            fos.write(97);
            fos.write(98);
            fos.write(99);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
