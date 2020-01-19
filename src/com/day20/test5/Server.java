package com.day20.test5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception{
        System.out.println("服务器开启，开始等待");
        ServerSocket server=new ServerSocket(7777);
        Socket socket=server.accept();
        Scanner sc=new Scanner(System.in);
//        InputStreamReader ir=new InputStreamReader(socket.getInputStream());
        BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
        int len;
//        char[] ch=new char[1024];
//        len=ir.read(ch);
        byte[] b=new byte[1024];
        len=bis.read(b);
        String msg=new String(b,0,len);
        System.out.println("收到客户端发来消息:"+msg);
        System.out.print("服务端发消息:");
        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
        bos.write(sc.next().getBytes());
        bos.close();
        bis.close();
        server.close();

    }
}
