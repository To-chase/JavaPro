package com.day20.test;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTcp {
    public static void main(String[] args)throws Exception {
        System.out.println("客户端，发送信息");
        // 1.创建 Socket ( ip , port ) , 确定连接到哪里
        Socket client=new Socket("localhost",6666);
        //输出
        OutputStream os=client.getOutputStream();
//        byte[] mes="你好吗？".getBytes();
        os.write("你好吗？".getBytes());
//        ================================
        InputStream is=client.getInputStream();
        byte[] b=new byte[1024];
        int len=is.read(b);
        System.out.println(new String(b,0,len));
        //关闭流  客户端
        is.close();
        os.close();
        client.close();
    }
}
