package com.day13.day13.关卡二;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Title6 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        Random random=new Random();


        while(set.size()<10){
            Integer num=random.nextInt(20)+1;
            set.add(num);
        }
//        set.stream().forEach(n->{
//            System.out.println(n);
//        });
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
