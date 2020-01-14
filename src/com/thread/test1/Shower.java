package com.thread.test1;

public class Shower {
    Object object=new Object();

    int count=0;
    public void show1(){
        for(int i=0;i<10;i++){
            synchronized (object){
                if(count==0){
                    object.notify();
                }
                System.out.print("犯");
                System.out.print("我");
                System.out.print("中");
                System.out.print("华");
                System.out.print("者");
                System.out.println();
                count=1;
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void show2(){
        for(int i=0;i<10;i++){
            synchronized (object){
                if(count==1){
                    object.notify();
                }
                System.out.print("虽");
                System.out.print("远");
                System.out.print("必");
                System.out.print("诛");
                System.out.println();
                count=0;
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
