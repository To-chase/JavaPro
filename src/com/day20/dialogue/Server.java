package com.day20.dialogue;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception{
        System.out.println("服务器开启,等待连接");
        ServerSocket server=new ServerSocket(6666);
//        获得链接
        Socket socket=server.accept();
        while(true){
//        读信息
            InputStream isr=socket.getInputStream();
            byte[] b=new byte[1024];
            int len;
            len=isr.read(b);
            String msg=new String(b,0,len);
            if("end".equals(msg)){
                System.out.println("服务器端收到客户端消息end，结束通信");
                isr.close();
                socket.close();
                return;
            }
            System.out.println("服务器收到客户端发来的信息:"+msg);
            //回信息
            Scanner sc=new Scanner(System.in);
            OutputStream osw=socket.getOutputStream();
            System.out.print("服务端回客户端信息:");
            String answer=sc.next();
            osw.write(answer.getBytes());
            if("end".equals(answer)){
                osw.close();
                socket.close();
                return;
            }
        }
    }
}
