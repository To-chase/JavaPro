package com.day13.day13.关卡二;

import java.util.ArrayList;
import java.util.HashSet;

public class Test5 {
    public static void main(String[] args) {
        String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
        HashSet<String> set=new HashSet<>();

        for (String str:arr){
            set.add(str);
        }
        ArrayList<String> list=new ArrayList<>();
        for(String strs:set){
            list.add(strs);
        }

        list.stream().forEach(n->{
            System.out.println(n);
        });
    }
}
