package com.day20.day20word.title7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8807);
        while (true) {
            Socket socket = server.accept();
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            String name = String.valueOf(System.currentTimeMillis());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\aaa\\" + name+".txt"));
            byte[] b = new byte[1024];
            int len;
            while ((len = bis.read(b)) != -1) {
                bos.write(b,0,len);
            }
            bos.flush();
        }
    }
}
