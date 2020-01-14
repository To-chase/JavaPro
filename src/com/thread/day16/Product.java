package com.thread.day16;

public class Product implements Runnable{

    private Steamed steamed;

    public Product(Steamed steamed) {
        this.steamed = steamed;
    }

    @Override
    public void run() {
//        for(int i=0;i<10;i++){
        while(true){
            synchronized (steamed){
                Integer num=steamed.getNum();
              if(num<10){
                  System.out.println("库存:"+num+",小二生产一个包子");
                  steamed.setNum(++num);
                  steamed.notify();//叫醒顾客
              }else {
                  try {
                      steamed.wait();//小二等待
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
            }
        }
    }
}
