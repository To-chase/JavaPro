package com.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Map<Student,String> map=new HashMap<>();
        map.put(new Student("amy",18),"广州");
        map.put(new Student("lulu",19),"上海");
        map.put(new Student("lulu",19),"上海");

        Set<Student> set=map.keySet();
        Set<Map.Entry<Student,String>> set1=map.entrySet();
        for(Map.Entry<Student,String> sets:set1){
            System.out.println(sets.getKey());
            System.out.println(sets.getValue());
            System.out.println("-----------------------------");
        }
//        set.stream().forEach(n->{
//            System.out.println(n);
//        });
    }
}
