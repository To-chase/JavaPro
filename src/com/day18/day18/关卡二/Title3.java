package com.day18.day18.关卡二;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Title3 {
    public static void main(String[] args) {
        char ch = 'o';
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\test.txt");
            int len;
            int count = 0;
            while ((len = fis.read()) != -1) {
                count=count(count,ch,(char)len);
            }
            System.out.println(ch+"出现了"+count+"次");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Integer count(Integer count, char ch,char chs) {
        if(ch==chs){
            count++;
        }
        return count;
    }
}
