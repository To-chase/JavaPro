package com.day20.day20word.title9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost", 5555);
        BufferedInputStream bis = new BufferedInputStream(client.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(System.currentTimeMillis() + ".jpg"));
        byte[] b = new byte[1024];
        int len;
        while ((len = bis.read(b)) != -1) {
            bos.write(b,0,len);
        }
        bos.flush();
        client.shutdownOutput();
        bis.close();
        client.close();
    }
}
