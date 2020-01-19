package com.day20.test4;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        System.out.println("客户端发信息");
        Socket client=new Socket("localhost",8888);
        OutputStream os=client.getOutputStream();
        Scanner sc=new Scanner(System.in);
        os.write(sc.next().getBytes());
        //收消息
        InputStream is=client.getInputStream();
        byte[] b=new byte[1024];
        int len=is.read(b);
        System.out.println("收到服务器发来消息:"+new String(b,0,len));
        is.close();
        os.close();
        client.close();
    }
}
