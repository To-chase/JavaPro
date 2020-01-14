package com.day13.day13.关卡二;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Title9 {
    public static void main(String[] args) {
//        String[] array1 = {"a","b","a","c","d"};
//        String[] array2= "e","f","a","d","g"
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();

        Collections.addAll(list1,"a","b","a","c","d");
        Collections.addAll(list2,"e","f","a","d","g");
        HashSet<String> set=new HashSet<>();
        for(String str:list1){
            set.add(str);
        }
        for(String strs:list2){
            set.add(strs);
        }

        set.stream().forEach(n->{
            System.out.println(n);
        });

    }
}
