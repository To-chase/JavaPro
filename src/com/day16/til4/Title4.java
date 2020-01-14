package com.day16.til4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Title4 {
    public static void main(String[] args) {
        MyCals myCals=new MyCals();
        MyCals myCals1=new MyCals();
        MyCals myCals2=new MyCals();
        ExecutorService service= Executors.newFixedThreadPool(3);
        service.submit(myCals);
        service.submit(myCals1);
        service.submit(myCals2);

    }
}
