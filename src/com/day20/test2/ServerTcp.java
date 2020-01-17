package com.day20.test2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTcp {
    public static void main(String[] args) throws Exception {
        System.out.println("服务器启动，等待连接......");
        ServerSocket server = new ServerSocket(6666);
        //链接
        Socket socket = server.accept();
        //接收信息
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\ppp.jpg"));
        byte[] b = new byte[1024];
        int len;
        while ((len = bis.read(b)) != -1) {
            bos.write(b,0,len);
        }
        bos.close();
        bis.close();
        server.close();
        System.out.println("上传接收成功，已保存");
    }
}
