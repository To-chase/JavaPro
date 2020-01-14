package com.day15;

public class TicketThread extends Thread {
    @Override
    public void run() {
        int ticket=100;
        for(int i=1;i<=100;i++){
            System.out.println("还剩余票数:"+(ticket-i));
        }
    }
}
