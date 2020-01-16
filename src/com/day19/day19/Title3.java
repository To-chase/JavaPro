package com.day19.day19;

import java.io.*;

public class Title3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\c.jpg");
            BufferedInputStream bf = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream("D:\\a\\c.jpg");
            BufferedOutputStream bof = new BufferedOutputStream(fos);
            byte[] b = new byte[1024];
            int len;
            while ((len = bf.read(b)) != -1) {
                bof.write(b,0,len);
            }
            bof.close();
            fos.close();
            bf.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
