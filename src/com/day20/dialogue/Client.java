package com.day20.dialogue;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 6666);
        while (true) {
            System.out.print("客户端发消息:");
//            发消息
            Scanner sc = new Scanner(System.in);
            OutputStream osw = socket.getOutputStream();
            String answer=sc.next();
            osw.write(answer.getBytes());
            if("end".equals(answer)){
                osw.close();
                socket.close();
                return;
            }
//            收消息
            InputStream isr = socket.getInputStream();
            byte[] b = new byte[1024];
            int len;
            len = isr.read(b);
            String msg = new String(b, 0, len);
            if ("end".equals(msg)) {
                System.out.println("客户端端收到服务端消息end，结束通信");
                isr.close();
                socket.close();
                return;
            }
            System.out.println("客户端收到服务器发来的信息:" + msg);
        }
    }
}
