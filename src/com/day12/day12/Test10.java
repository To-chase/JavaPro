package com.day12.day12;

import java.util.ArrayList;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("a");
        int num=frequency(list,"c");
        System.out.println(num);
    }

    public static int frequency(List<String> arr,String key){
        int count=0;
        for (String str:arr) {
            if(str.equals(key)){
                count+=1;
            }
        }
        return count;
    }
}
