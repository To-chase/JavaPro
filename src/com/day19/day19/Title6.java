package com.day19.day19;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Title6 {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"), "utf-8");
            char[] ch = new char[1024];
            int len;
            while ((len = isr.read(ch)) != -1) {
                System.out.println(new String(ch,0,len));
            }
            isr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
