package com.day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.UUID;

public class Test4 {
    public static void main(String[] args) {
        try {
            String pathName="";
            File file=new File("D:\\aaa\\a.txt");
            FileReader reader = new FileReader(file);
            pathName= "D:\\bbb\\"+UUID.randomUUID().toString()+"_"+file.getName();
            FileWriter writer = new FileWriter(pathName);

            int len;
            char[] chars=new char[2];
            while ((len = reader.read(chars)) != -1) {
                writer.write(chars,0,len);
                writer.flush();
            }
            writer.flush();
            writer.close();
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
