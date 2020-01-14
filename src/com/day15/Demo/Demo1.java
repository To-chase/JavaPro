package com.day15.Demo;

public class Demo1 {
    public static void main(String[] args) {
        PrintThread p=new PrintThread();
        p.start();

        for(int i=0;i<100;i++){
            Runnable runnable=new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<100;i++){
                        if (i%10==0) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println("oworld"+i);
                    }
                }
            };
            Thread thread=new Thread(runnable);
            thread.start();
        }

//        for(int i=0;i<50;i++){
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("world"+i);
//        }
    }
}
