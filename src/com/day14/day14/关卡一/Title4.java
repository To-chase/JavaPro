package com.day14.day14.关卡一;

import java.util.*;

public class Title4 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        //"邓超"->"孙俪", "李晨"->"范冰冰", "刘德华"->"柳岩", “黄晓明”->” Baby”,“谢霆锋”->”张柏 芝”
        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("刘德华","柳岩");
        map.put("黄晓明","Bady");
        map.put("谢霆锋","张柏芝");
        Set<String> set=map.keySet();
        Iterator<String> it=set.iterator();
        while(it.hasNext()){

            String key=it.next();
            String value=map.get(key);
            System.out.println(key+"--->"+value);
        }

    }
}
