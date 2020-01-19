package com.day20.theard;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) throws Exception{
//        一个服务端连多个客户端
        System.out.println("服务器开启，等待连接");
        ServerSocket server=new ServerSocket(8001);
        ExecutorService service= Executors.newFixedThreadPool(3);
//        获得链接
        while(true){
            Socket socket=server.accept();
            Thread thread=new Thread(){
                @Override
                public void run() {
                    try {
                        InputStreamReader isr=new InputStreamReader(socket.getInputStream());
                        char[] ch=new char[1024];
                        int len=isr.read(ch);
                        String msg=new String(ch,0,len);
                        Thread.sleep(10000);
                        System.out.println(Thread.currentThread().getName()+"服务器收到客户端信息:"+msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
//            thread.start();
            service.submit(thread);
            service.submit(thread);
            service.submit(thread);
            service.submit(thread);
        }
    }
}
