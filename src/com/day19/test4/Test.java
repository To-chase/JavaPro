package com.day19.test4;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\b.txt");
            InputStreamReader ior = new InputStreamReader(new FileInputStream("D:\\b.txt"),"GBK");
            int len;
            char[] ch=new char[2];
            while ((len = ior.read(ch)) != -1) {
                System.out.println(new String(ch,0,len));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
