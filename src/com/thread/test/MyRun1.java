package com.thread.test;

public class MyRun1 implements Runnable {
    private Entry entry;

    public MyRun1(Entry entry) {
        this.entry = entry;
    }

    @Override
    public void run() {

          synchronized (entry){
              for(int i=0;i<10;i++){
//                  System.out.println("进入等待状态");

                  System.out.println("i:"+i);
                  try {
//                      Thread.sleep(1000);
//                      entry.wait(2000);
                      entry.wait();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
//                  System.out.println("被唤醒");
              }
          }
    }
    }

