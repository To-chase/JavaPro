package com.thread.test;

public class MyRun2 implements Runnable {

    private Entry entry;

    public MyRun2(Entry entry) {
        this.entry = entry;
    }
    @Override
    public void run() {

        for(int i=0;i<50;i++) {
//        while(true){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            synchronized (entry){
                    System.out.println("---->"+i);
                    entry.notify();
                }
            }
    }

//    @Override
//    public void run() {
//            synchronized (entry){
//                for(int i=0;i<10;i++) {//当该线程抢到资源，要执行完锁里的代码才能释放锁，然而该线程死亡
//                System.out.println("---->"+i);
//                entry.notify();
//            }
//        }
//    }
}
