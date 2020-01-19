package com.day20.theard;

import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{
        System.out.println("客户端发信息");
        Socket socket=new Socket("localhost",8001);
        OutputStreamWriter osw=new OutputStreamWriter(socket.getOutputStream());
        osw.write("你好吗".toCharArray());
        osw.close();
        socket.close();
    }
}
