package com.day20.day20word.title3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class PersonTil {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds=new DatagramSocket(3000);
        String str="hello world";//要发送的数据
        /**
         *
         * 创建一个要发送的数据包，数据包包括发送的数据，数据的长度，接收端的ip地址和端口号
         *
         */
        DatagramPacket dp=new DatagramPacket(str.getBytes(),
                str.length(), InetAddress.getByName("localhost"),8801);
        System.out.println("发送信息");
        ds.send(dp);
        ds.close();

    }
}
