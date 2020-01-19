package com.day20.day20word.title4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{
        System.out.println("客户端发信息!");
        Socket socket=new Socket("127.0.0.1",8888);
        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
        bos.write("你好吗".getBytes());
        bos.flush();
        socket.shutdownOutput();
//        BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
//        byte[] b=new byte[1024];
//        int len=bis.read(b);
//        System.out.println("客户端接收信息:"+new String(b,0,len));
//        bis.close();
//        bos.close();
        socket.close();
    }
}
