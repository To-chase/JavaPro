package com.day20.test4;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception{
        System.out.println("服务器开启,等待连接");
        Scanner sc=new Scanner(System.in);
        ServerSocket server=new ServerSocket(8888);
        Socket socket=server.accept();
        InputStream is=socket.getInputStream();
        byte[] b=new byte[1024];
        int len;
        len=is.read(b);
        System.out.println("收到客户端信息:"+new String(b,0,len));
//        回消息
        OutputStream os=socket.getOutputStream();
        System.out.print("服务端发消息:");
        os.write(sc.next().getBytes());
        os.close();
        is.close();
        socket.close();

    }
}
