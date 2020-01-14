package com.day15.day15.other;

public class Ticket implements Runnable {
    private Integer num;

    public Ticket(Integer num) {
        this.num = num;
    }

    @Override
    public void run() {
        while(true){
            synchronized (num){
                if(num<=0){
                    System.out.println("票已卖完");
                    break;
                }
                int index=num-1;
                System.out.println(Thread.currentThread().getName()+"买了一张票,剩余票数为"+index);
                num--;
            }
        }
    }
}
