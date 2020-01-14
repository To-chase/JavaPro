package com.day16;

import java.util.concurrent.*;

public class Title3 {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(2);
        MyCall myCall=new MyCall();
        FutureTask task=new FutureTask(myCall);
        FutureTask task1=new FutureTask(myCall);
        FutureTask task2=new FutureTask(myCall);

        service.submit(task);
        service.submit(task1);


//        System.out.println("平均数:"+sum);

    }
}
