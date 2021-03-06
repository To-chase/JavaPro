package com.thread.Demo;

public class ShowAll {
    int num=1;

    public void show1() throws InterruptedException {
        for (int i = 0; i <10 ; i++) {

            synchronized (Object.class){
                while (num != 3) {
                    Object.class.wait();
                }
                Thread.sleep(1000);
                System.out.print("犯");
                System.out.print("我");
                System.out.print("中");
                System.out.print("华");
                System.out.print("者");
                System.out.println();
                num = 1;
                Object.class.notifyAll();
            }
        }
    }

    public void show2() throws InterruptedException {
        for (int i = 0; i <10 ; i++) {
            synchronized (Object.class){
                while (num != 2) {
                    Object.class.wait();
                }
                Thread.sleep(1000);
                System.out.print("虽");
                System.out.print("远");
                System.out.print("必");
                System.out.print("诛");
                System.out.println();
                num = 3;
                Object.class.notifyAll();
            }
        }
    }

    public void show3() throws InterruptedException {
        for (int i = 0; i <10 ; i++) {
            synchronized (Object.class){
                while (num != 1) {
                    Object.class.wait();
                }
                Thread.sleep(1000);
                System.out.print("我");
                System.out.print("是");
                System.out.print("中");
                System.out.print("国");
                System.out.print("人");
                System.out.println();
                num =2;
                Object.class.notifyAll();
            }
        }
    }
}
