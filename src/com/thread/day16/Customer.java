package com.thread.day16;

public class Customer implements Runnable {
    private Steamed steamed;

    public Customer(Steamed steamed) {
        this.steamed = steamed;
    }

    @Override
    public void run() {
//        for(int i=0;i<10;i++){
        while(true){
            synchronized (steamed){
                int num=steamed.getNum();
                if(num>5){
                    System.out.println("包子库存:"+num+",客官点了一个包子");
                    steamed.setNum(--num);
                    steamed.notify();//叫醒小二
                }else {
                    try {
                        steamed.wait();//顾客等待
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
