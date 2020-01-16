package com.day18.day18.关卡二;

import java.io.*;

public class Title2 {
    public static void main(String[] args) {
        print();
    }

    public static void print(){
        FileInputStream fis=null;
        FileOutputStream fos=null;
        File file=new File("D:\\d1");
        File[] files=file.listFiles();
        for(File f:files){
            if(f.isFile()){
                String pathName="D:\\d1\\"+f.getName();
                String copyName="D:\\d2\\"+f.getName();
                try {
                    fis=new FileInputStream(pathName);
                    fos=new FileOutputStream(copyName);
                    byte[] b=new byte[2];
                    int len;
                    while((len=fis.read(b))!=-1){
                        fos.write(b,0,len);
                    }
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
    }
}
