package com.day20.test;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTcp {
    public static void main(String[] args) throws Exception {
        OutputStream os=null;
        InputStream is=null;
        System.out.println("客户端，发送信息");
        // 1.创建 Socket ( ip , port ) , 确定连接到哪里
        while(true){
            Socket client = new Socket("localhost", 8888);
            Scanner sc=new Scanner(System.in);
            //输出
            os = client.getOutputStream();
//        byte[] mes="你好吗？".getBytes();
            os.write(sc.next().getBytes());
//        ================================
            is = client.getInputStream();
            byte[] b = new byte[1024];
            int len;
//        while ((len = is.read(b)) != -1) {
            len=is.read(b);
            System.out.println("收到服务端的消息:"+new String(b, 0, len));
            is.close();
            os.close();
            client.close();
        }

//        }
        //关闭流  客户端
    }
}
