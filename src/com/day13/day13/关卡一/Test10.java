package com.day13.day13.关卡一;

import java.util.ArrayList;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {
        List<String> list=add("a","b","c","d");
        for(String str:list){
            System.out.println(str);
        }
    }
    public static ArrayList add(String...str){
        ArrayList<String> list=new ArrayList<>();
        for(String s:str){
            list.add(s);
        }
        return list;
    }
}
