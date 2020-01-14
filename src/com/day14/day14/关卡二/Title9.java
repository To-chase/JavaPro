package com.day14.day14.关卡二;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Title9 {
    public static void main(String[] args) {
        Map<String,Double> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);

        while(map.size()<5){
            System.out.println("请输入书名与价格(格式:书名=价格):");
            String books=sc.next();
            String[] str=books.split("=");
            map.put(str[0],Double.parseDouble(str[1]));
        }
        map.remove("C++");
        Set<String> keys=map.keySet();
        for(String key:keys){
            if(key.equals("java")){
                map.put(key,38.5d);
            }
            System.out.println("书名:"+key+",价格:"+map.get(key));
        }
        System.out.println("----------------------------------");
        Set<Map.Entry<String,Double>> kv=map.entrySet();
        Iterator<Map.Entry<String,Double>> it=kv.iterator();
        while(it.hasNext()){
            Map.Entry<String,Double> kvs=it.next();
            System.out.println("书名:"+kvs.getKey()+",价格:"+kvs.getValue());
        }
    }
}
