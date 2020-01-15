package com.day18;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test5 {
    public static void main(String[] args) {
        print1();
    }

    public static void print1(){
        try {
            FileReader reader = new FileReader("a.txt");
            int len;
            char[] chur=new char[2];
            while((len=reader.read(chur))!=-1){
//                System.out.println(new String(chur));
                System.out.println(new String(chur,0,len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void print(){
        try {
            FileReader reader = new FileReader("a.txt");
            int len;
            while ((len = reader.read()) != -1) {
                System.out.println((char)len);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
