package com.day20.test5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)throws Exception {
        System.out.print("客户端发消息:");
        Socket client=new Socket("localhost",7777);
        Scanner sc=new Scanner(System.in);
//        OutputStreamWriter ow=new OutputStreamWriter(client.getOutputStream());
        BufferedOutputStream bos=new BufferedOutputStream(client.getOutputStream());
        bos.write(sc.next().getBytes());
//        InputStreamReader ir=new InputStreamReader(client.getInputStream());
        BufferedInputStream bis=new BufferedInputStream(client.getInputStream());
//        char[] ch=new char[1024];
//        int len=ir.read(ch);
        byte[] b=new byte[1024];
        int len=bis.read(b);
        String msg=new String(b,0,len);
        System.out.print("收到服务端发来消息:"+msg);
        bis.close();
        bos.close();
        client.close();
    }
}
