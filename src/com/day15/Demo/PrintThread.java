package com.day15.Demo;

public class PrintThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if(i%10==0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("helloworld"+i);
            }
        }
    }
}
