package com.day20.day20word.title6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)throws Exception {
        Socket client=new Socket("localhost",6666);
        while(true){
            System.out.print("客户端发送的信息:");
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            Scanner sc=new Scanner(System.in);
            String msg=sc.next();
            bw.write(msg);
            bw.newLine();
            if("exit".equals(msg)){
                bw.close();
                client.close();
                return;
            }
            bw.flush();
//            client.shutdownOutput();

//            =====================================
            BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
            String answer=br.readLine();
            if("exit".equals(answer)){
                br.close();
                client.close();
                return;
            }
            System.out.println("服务端收到客户端的信息:"+msg);

        }

    }
}
