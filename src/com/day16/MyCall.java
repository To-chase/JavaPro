package com.day16;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCall implements Callable {
    private Integer sum = 0;
    Random random = new Random();

    @Override
    public Integer call() throws Exception {
            Integer num;
//            synchronized (this) {
                num = random.nextInt(100) + 1;
                System.out.println(num);
//            }
        return num;
    }
}
