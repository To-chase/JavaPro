package com.day20.day20word.title6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket server=new ServerSocket(6666);
        Socket socket=server.accept();
        while(true){
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg=br.readLine();
            if("exit".equals(msg)){
                br.close();
                socket.close();
                return;
            }
            System.out.println("服务端收到客户端的信息:"+msg);

//            ====================================
            System.out.print("服务端要发送的信息:");
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            Scanner sc=new Scanner(System.in);
            String answer=sc.next();
            bw.write(answer);
            bw.newLine();
            if("exit".equals(answer)){
                bw.close();
                socket.close();
                return;
            }
            bw.flush();
//            socket.shutdownOutput();
        }
    }
}
