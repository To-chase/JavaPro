package com.day20.test3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("服务器启动,等待连接......");
        ServerSocket server = new ServerSocket(6666);
        //获取连接
        while (true) {
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
                        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(System.currentTimeMillis() + ".jpg"));
                        byte[] b = new byte[1024];
                        int len;
                        while ((len = bis.read(b)) != -1) {
                            bos.write(b,0,len);
                        }
                        System.out.println("back.....");
                        OutputStream out=socket.getOutputStream();
                        byte[] bytes="上传成功".getBytes();
                        out.write(bytes);
                        out.close();
//                        ====================
                        bos.close();
                        bis.close();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
