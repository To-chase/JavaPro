package com.thread.test3;

public class Product implements Runnable{

    private Steamed steamed;

    public Product(Steamed steamed) {
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
                if(steamed.getFlag()==0){//没包子
                    System.out.println(Thread.currentThread().getName()+",现在没包子，你要等一下");
                    steamed.setFlag(1);
                    //有包子了,叫醒顾客
                    steamed.notify();
                }else{
                    //有包子，等顾客来卖包子
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
