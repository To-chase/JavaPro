package com.day15.day15.other;

import java.util.List;

public class Montain implements Runnable {
    private List<Person> people;
    public Montain(List<Person> people){
        this.people=people;
    }

    @Override
    public void run() {

        while(true){
            synchronized (people){
                int num=people.size();
//                System.out.println(people);
                if(num<=0){
                    System.out.println("已经没有人过山洞了");
//                    System.out.println(people.size());
                    break;
                }
                int index=num-1;
                System.out.println(Thread.currentThread().getName()+","+people.get(index).getName()+"已经过完山洞");
                people.remove(index);
                num--;
            }
        }
    }
}
