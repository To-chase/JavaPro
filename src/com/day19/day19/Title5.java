package com.day19.day19;

import java.io.*;

public class Title5 {
    public static void main(String[] args) {
        String str="我爱中国";
        try {
            OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("a.txt"),"UTF-8");
            osw.write(str);
            osw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
