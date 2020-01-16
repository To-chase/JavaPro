package com.day19.day19;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Title2 {
    public static void main(String[] args) {
        try {
            BufferedOutputStream bf=new BufferedOutputStream(new FileOutputStream("D:\\c.txt"));
            byte[] b="I love java".getBytes();
            bf.write(b);
            bf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
