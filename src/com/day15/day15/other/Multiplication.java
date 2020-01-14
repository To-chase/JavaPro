package com.day15.day15.other;

public class Multiplication implements Runnable {
    private Integer num;

    public Multiplication(Integer num) {
        this.num = num;
    }

    @Override
    public void run() {
        int sum=1;
        for(int i=1;i<=num;i++){
            sum*=i;
        }
        System.out.println(Thread.currentThread().getName()+":"+num+"！="+sum);
    }
}
