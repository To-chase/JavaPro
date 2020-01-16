package com.day19.test4;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        try {
            InputStreamReader ios = new InputStreamReader(new FileInputStream("file_gbk.txt"));
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("file_utf8.txt"));
            char[] chur = new char[1024];
            int len;
            while ((len = ios.read(chur)) != -1) {
                osw.write(chur,0,len);
            }
            osw.flush();
            osw.close();
            ios.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
