package com.day15.ticket;

public class Test1 {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        Thread thread=new Thread(ticket,"广州南");
        Thread thread2=new Thread(ticket,"深圳北");
        Thread thread3=new Thread(ticket,"武汉");
        thread.start();
        thread2.start();
        thread3.start();

    }
}
