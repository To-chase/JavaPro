package com.day19.test4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test1 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\c.doc"),"gbk");
            osw.write("世界");
            osw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
