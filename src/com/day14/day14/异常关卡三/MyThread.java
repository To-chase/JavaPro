package com.day14.day14.异常关卡三;

import java.util.Random;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Random random=new Random();
        int sum=0;
        for(int i=0;i<10;i++){
            int num=(random.nextInt(9)+1)*100;
            System.out.println("第"+(i+1)+"个随机数是"+num);
            sum+=num;
            System.out.println((i+1)+"个数之和"+sum);
            System.out.println("-------------------------------");
        }
    }
}
