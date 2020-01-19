package com.day20.day20word.title9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5555);
        while (true) {
            Socket socket = server.accept();
            System.out.println("连接成功");
            new Thread(){
                @Override
                public void run() {
                    try {
                        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\c.jpg"));
                        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
                        byte[] b = new byte[1024];
                        int len;
                        while ((len = bis.read(b)) != -1) {
                            bos.write(b,0,len);
                        }
                        bos.flush();
                        bos.close();
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
