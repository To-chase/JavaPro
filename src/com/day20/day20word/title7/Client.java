package com.day20.day20word.title7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost", 8807);
        FileInputStream is = new FileInputStream("a.txt");
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
        byte[] b = new byte[1024];
        int len;
        while ((len = bis.read(b)) != -1) {
            bos.write(b,0,len);
        }
        bos.flush();
        bos.close();
        bis.close();
        is.close();
        client.close();

    }
}
