package com.day15.ticketBean;

public class TicketBuy implements Runnable {
    private Ticket ticket;

    public TicketBuy(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while(true){

            synchronized (ticket){
                Integer num=ticket.getNum();
                if(num<=0){
                    break;
                }
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println("窗口:"+Thread.currentThread().getName()+",票名:"+ticket.getName()+",票号:"+ticket.getNum());
                ticket.setNum(--num);
            }
        }
    }
}
