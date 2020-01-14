package com.day15.day15;

import com.day15.day15.other.Ticket;

public class Title8 {
    public static void main(String[] args) {
        Ticket ticket=new Ticket(20);
        Thread thread=new Thread(ticket,"窗口一");
        Thread thread1=new Thread(ticket,"窗口二");
        thread.start();
        thread1.start();
    }
}
