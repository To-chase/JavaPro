package com.thread.test1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Show {
    Condition c1;
    Condition c2;
    ReentrantLock lock=new ReentrantLock();
    int count=0;
    public Show(){
        c1=lock.newCondition();
        c2=lock.newCondition();
    }
    public void show1(){
        for(int i=0;i<10;i++){
            lock.lock();
            if(count==0){
                c2.signal();
            }
            System.out.print("犯");
            System.out.print("我");
            System.out.print("中");
            System.out.print("华");
            System.out.print("者");
            System.out.println();
            count=1;
            try {
                c1.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.unlock();
        }
    }

    public void show2(){
        for(int i=0;i<10;i++){
            lock.lock();
            if(count==1){
                c1.signal();
            }
            System.out.print("虽");
            System.out.print("远");
            System.out.print("必");
            System.out.print("诛");
            System.out.println();
            count=0;
            try {
                c2.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.unlock();
        }

    }
}
