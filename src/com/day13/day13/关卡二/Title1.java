package com.day13.day13.关卡二;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Title1 {
    public static void main(String[] args) {
        // "a","f","b","c","a","d"
        List<String> list=new ArrayList<>();
        Collections.addAll(list, "a","f","b","c","a","d");
//        for(String str:list){
//            System.out.println(str);
//        }
        HashSet<String> set=new HashSet<>();
        Collections.addAll(set, "a","f","b","c","a","d");
        list.clear();
        for(String str:set){
            list.add(str);
        }
        list.stream().forEach(n->{
            System.out.println(n);
        });
    }
}
