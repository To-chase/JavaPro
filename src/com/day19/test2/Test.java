package com.day19.test2;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            Reader rd = new FileReader("D:\\index.txt");
            BufferedReader bf=new BufferedReader(rd);
            int len;
            String line=null;
            while ((line = bf.readLine()) !=null) {
                System.out.println(line);
            }
            bf.close();
            bf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
