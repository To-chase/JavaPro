package com.day19.test2;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        try {
            BufferedReader bf=new BufferedReader(new FileReader("D:\\index.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\a.txt"));

            String line=null;
            while((line=bf.readLine())!=null){
                bw.write(line);
                bw.write("\r\n");
            }
            System.out.println(bf.readLine());
            bw.close();
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
