package com.day20.test3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("发送信息");
        Socket socket = new Socket("localhost", 6666);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\c.jpg"));
        byte[] b = new byte[1024];
        int len;
        while ((len = bis.read(b)) != -1) {
            bos.write(b,0,len);
        }
        //关闭输出流，通知服务端，信息写出成功
        socket.shutdownOutput();
        System.out.println("文件发送成功");
        InputStream is=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int lens;
        lens=is.read(bytes);
        System.out.println(new String(bytes,0,lens));
        is.close();
        bis.close();
        bos.close();
        socket.close();
    }
}
