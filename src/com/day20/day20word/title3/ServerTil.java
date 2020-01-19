package com.day20.day20word.title3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServerTil {
    public static void main(String[] args) throws Exception{
        byte[] buf=new byte[1024];
        DatagramSocket socket=new DatagramSocket(8801);
        DatagramPacket packet=new DatagramPacket(buf,1024);

        System.out.println("等待数据");
        socket.receive(packet);
        String str = new String(packet.getData(), 0, packet.getLength())+"from:"+packet.getAddress().getHostAddress()+":"+packet.getPort();
        System.out.println(str);
        socket.close();

    }
}
