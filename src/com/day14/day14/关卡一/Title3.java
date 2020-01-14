package com.day14.day14.关卡一;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Title3 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("大","小");
        map.put("热","冷");
        map.put("快","慢");
        Set<Map.Entry<String,String>> set=map.entrySet();

        for(Map.Entry<String,String> s:set){
            System.out.println(s.getKey()+">>>"+s.getValue());
        }
        Iterator<Map.Entry<String,String>> it=set.iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry=it.next();
            String str=entry.getKey();
            String strs=entry.getValue();
            System.out.println(str);
            System.out.println(strs);
        }
    }
}
