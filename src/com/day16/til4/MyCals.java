package com.day16.til4;

public class MyCals implements Runnable {
    @Override
    public void run() {
        int sum=1;
        for(int i=1;i<=10;i++){
            sum*=i;
        }
        System.out.println(sum);
    }
}
