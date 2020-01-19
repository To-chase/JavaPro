package com.day20.day20word.title4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception{
        System.out.println("服务端启动,等待连接");
        ServerSocket server=new ServerSocket(8888);
        Socket socket=server.accept();
        BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
        byte[] b=new byte[1024];
        int len=bis.read(b);
        String data=new String(b,0,len);
        System.out.println("服务端收到客户端的信息:"+data);


//        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
//        bos.write("我很好".getBytes());
//        bos.flush();
////        bos.close();
//        socket.shutdownOutput();
//        bis.close();
        socket.close();
    }
}
