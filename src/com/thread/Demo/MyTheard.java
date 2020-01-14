package com.thread.Demo;

public class MyTheard {
    public static void main(String[] args) {

        Object obj=new Object();
       Thread thread= new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    for(int i=0;i<10;i++){
                        System.out.println("i:"+i);
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
        };
//       thread.setPriority(10);
       thread.start();

        new Thread(){
            @Override
            public void run() {
//                while(true){
                for(int i=0;i<10;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("开始唤醒:"+i);
                        obj.notify();
                    }
                }
            }
        }.start();


    }
}
