package com.day20.test;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTcp {
    public static void main(String[] args) throws Exception {
        /*
        1. 【服务端】启动,创建ServerSocket对象，等待连接。
        2. 【客户端】启动,创建Socket对象，请求连接。
        3. 【服务端】接收连接,调用accept方法，并返回一个Socket对象。
        4. 【客户端】Socket对象，获取OutputStream，向服务端写出数据。
        5. 【服务端】Scoket对象，获取InputStream，读取客户端发送的数据。
         */
        //1
        System.out.println("服务端启动，等待连接");
        ServerSocket server = new ServerSocket(6666);
        //获取连接 accept
        Socket socket = server.accept();
        //获取输入流
        InputStream is = socket.getInputStream();
        byte[] b = new byte[1024];
        int len=is.read(b);
        String meg=new String(b,0,len);
        System.out.println(meg);
        OutputStream os=socket.getOutputStream();
        os.write("我很好，你呢？".getBytes());
//        System.out.println("==============================");
        os.close();
        is.close();
        server.close();
    }
}
