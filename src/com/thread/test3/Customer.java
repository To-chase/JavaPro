package com.thread.test3;

public class Customer implements Runnable {
    private Steamed steamed;

    public Customer(Steamed steamed) {
        this.steamed = steamed;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (steamed){
                if(steamed.getFlag()==1){
                    System.out.println(Thread.currentThread().getName()+":有包子,快过来买");
                    //卖完了
                    steamed.setFlag(0);
                    //生产包子
                    steamed.notify();
                }else{
                    //顾客等一下
                    try {
                        steamed.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
