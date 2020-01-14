package com.day14;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        Map<String,String> map=new LinkedHashMap<>();
        map.put("大","小");
        map.put("热","冷");
        map.put("快","慢");

        Set<Map.Entry<String,String>> set=map.entrySet();
        set.stream().forEach(n->{
            System.out.println(n.getKey());
            System.out.println(n.getValue());
        });
    }
}
