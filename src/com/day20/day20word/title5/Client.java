package com.day20.day20word.title5;

import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args)throws Exception {
        Socket client=new Socket("localhost",8888);
        System.out.println("我是客户端，我要发信息!");
        OutputStreamWriter osw=new OutputStreamWriter(client.getOutputStream());
        osw.write("hello.服务器，我是客户端");
        osw.flush();
        client.shutdownOutput();
        client.close();
    }
}
