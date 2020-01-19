package com.day20.day20word.title8;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8890);
        Socket socket = server.accept();
        System.out.println("连接成功");
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] b = new byte[1024];
        int len = bis.read(b);
        String str = "";
//        while ((len = ) != -1) {
        str = new String(b, 0, len);
//        }
//        System.out.println(str);
        String[] user = str.split("=");
        BufferedReader br = new BufferedReader(new FileReader("b.txt"));
        String line = null;
        int msg = -1;
        while ((line = br.readLine()) != null) {
            String[] lines = line.split("=");
//            System.out.println(lines[0] + "," + lines[1]);
            if (lines[0].equals(user[0]) && lines[1].equals(user[1])) {
                msg = 1;
                break;
            } else if (lines[0].equals(user[0]) && !lines[1].equals(user[1])) {
                msg = 0;
                break;
            } else if (!lines[0].equals(user[0])) {
                msg = -1;
            }
        }
        System.out.println(msg);
//        br.close();

        OutputStream os = socket.getOutputStream();

        if (msg == 1) {
            os.write("登陆成功".getBytes());
        } else if (msg == 0) {
            os.write("密码有误".getBytes());
        } else {
            BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream("b.txt", true));
            String strs = "\r\n" + str;
            bs.write(strs.getBytes());
            bs.flush();
            BufferedReader br1 = new BufferedReader(new FileReader("b.txt"));
            String lines = null;
            Integer count=0;
            while ((lines = br1.readLine()) != null) {
                if(str.equals(lines)){
                    count=1;
                    break;
                }else{
                   count=0;
                }
//                System.out.println(count);
            }
            if(count==0){
                os.write("注册失败".getBytes());
            }else{
                os.write("注册成功".getBytes());
            }
            socket.shutdownOutput();
            br.close();
            socket.close();

        }


    }
}
