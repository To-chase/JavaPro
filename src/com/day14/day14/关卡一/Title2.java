package com.day14.day14.关卡一;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Title2 {
    public static void main(String[] args) {
        Map<String,String> map=new LinkedHashMap<>();
        map.put("大","小");
        map.put("热","冷");
        map.put("快","慢");

       Set<String> set=map.keySet();
       for(String str:set){
           System.out.println(str);
       }
        System.out.println("------------------------------");
       Iterator<String> it=set.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
    }
}
