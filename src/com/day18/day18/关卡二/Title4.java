package com.day18.day18.关卡二;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Title4 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        FileReader fis = null;
        FileWriter fos = null;

        try {
            fis = new FileReader("D:\\score.txt");
            int len;
            while ((len = fis.read()) != -1) {
                prop.load(fis);
            }
            Set<String> keys = prop.stringPropertyNames();
            for(String s:keys){
                if(s.equals("lisi")){
                    prop.setProperty(s,"100");
                }
            }
            String contend="";
            for(String s:keys){
                contend+=s+"="+prop.getProperty(s)+"\r\n";
            }
            fos = new FileWriter("D:\\score.txt");
            fos.write(contend);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
