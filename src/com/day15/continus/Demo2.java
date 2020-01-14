package com.day15.continus;

public class Demo2 {
    public static void main(String[] args) {

        Runnable runnable=new Runnable() {
            private int num=10;
            @Override
            public void run() {
             if(num>0){
                 System.out.println(Thread.currentThread().getName()+"开始:num="+num--);
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 System.out.println("结束");
             }
            }
        };
        Thread t1=new Thread(runnable,"一");
        Thread t2=new Thread(runnable,"二");
        t1.start();
        t2.start();
    }
}
