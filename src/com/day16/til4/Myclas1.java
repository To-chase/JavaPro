package com.day16.til4;

public class Myclas1 implements Runnable {
    @Override
    public void run() {
        int sum=1;
        for(int i=1;i<=5;i++){
            sum*=i;
        }
        System.out.println(sum);
    }
}
