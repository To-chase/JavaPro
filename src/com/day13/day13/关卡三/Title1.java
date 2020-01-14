package com.day13.day13.关卡三;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Title1 {
    public static void main(String[] args) {
        ArrayList<String> list=add(33);
        ArrayList<String> list1=add(16);
        HashSet<String> set=new HashSet<>();
//        HashSet<String> set1=new HashSet<>();
        Random random=new Random();
        while(set.size()<6){
           set.add(list.get(random.nextInt(list.size())));
        }
        String s=list1.get(random.nextInt(list1.size()));
        String str=set.toString();
        String strs=s+str;
        System.out.println(strs);
    }

    public static ArrayList<String> add(int n){
        ArrayList<String> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(String.valueOf(i));
        }
        return list;
    }
}
