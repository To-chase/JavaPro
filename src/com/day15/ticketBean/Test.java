package com.day15.ticketBean;

public class Test {
    public static void main(String[] args) {
        Ticket ticket=new Ticket("G9527",50);
        TicketBuy buy=new TicketBuy(ticket);
        Thread t1=new Thread(buy,"广州南");
        Thread t2=new Thread(buy,"深圳北");
        Thread t3=new Thread(buy,"武汉");
        t1.start();
        t2.start();
        t3.start();
    }
}
