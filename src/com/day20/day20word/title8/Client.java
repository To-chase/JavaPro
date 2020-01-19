package com.day20.day20word.title8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)throws Exception {
        Socket client=new Socket("localhost",8890);
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username=sc.next();
        System.out.println("请输入密码:");
        String password=sc.next();
        String str=username+"="+password;
        BufferedOutputStream bos=new BufferedOutputStream(client.getOutputStream());
        bos.write(str.getBytes());
        bos.flush();
        client.shutdownOutput();
        InputStream is=client.getInputStream();
        byte[] b=new byte[1024];
        int len=is.read(b);
        String msg = new String(b, 0, len);
        System.out.println(msg);
        is.close();
        client.close();

    }
}
