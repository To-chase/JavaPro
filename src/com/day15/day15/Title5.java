package com.day15.day15;

import com.day15.day15.other.Montain;
import com.day15.day15.other.Person;

import java.util.ArrayList;
import java.util.List;

public class Title5 {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            String name="amy"+i;
            list.add(new Person(name));
        }
        Montain montain=new Montain(list);
        Thread t=new Thread(montain,"线程一");
        Thread t1=new Thread(montain,"线程二");
        t.start();
        t1.start();

    }
}
