package com.day20.test2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.Socket;

public class ClientTcp {
    public static void main(String[] args) throws Exception {
        System.out.println("发信息");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\c.jpg"));
        Socket client = new Socket("localhost", 6666);
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
        byte[] b = new byte[1024];
        int len;
        while ((len = bis.read(b)) != -1) {
            bos.write(b,0,len);
        }
        bos.close();
        bis.close();
        client.close();
        System.out.println("上传成功");
    }
}
