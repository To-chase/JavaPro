package com.day16;

import java.util.*;

public class Title {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(i);
        }
        //list遍历
        list.stream().forEach(System.out::println);
        System.out.println("==============================");
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.stream().forEach(System.out::println);
        System.out.println("==============================");
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"amy");
        map.put(2,"lulu");
        map.put(3,"李四");
        Set<Integer> keys=map.keySet();
        keys.stream().forEach(n->{
            System.out.println(n+"--->"+map.get(n));
        });
    }
}
