package com.day19.day19;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Title1 {
    public static void main(String[] args) {
        try {
            BufferedOutputStream bf=new BufferedOutputStream(new FileOutputStream("D:\\c.txt"));
            bf.write("a".getBytes());
            bf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
