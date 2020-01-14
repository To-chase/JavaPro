package com.day14;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("西游记","师徒四人");
        map.put("水浒传","一百零八汉");
        map.put("三国演义","桃园三结义");
//        map.put("红楼梦","");
//        map.put("红楼梦","aaa");
//        map.put("三国演义","三英战吕布");
//        System.out.println(map.put("三国演义","三英战吕布"));
//        System.out.println(map.get("水浒传"));
//        System.out.println(map.remove("西游记"));
         Set<String> set=map.keySet();//值
         Set<Map.Entry<String,String>> set1=map.entrySet();
         Iterator<Map.Entry<String,String>> it=set1.iterator();
         while(it.hasNext()){
             Map.Entry<String,String> entry=it.next();
             System.out.println(entry.getKey());
             System.out.println(entry.getValue());
         }
//        Set<Entry<String,String>> set2=map.entrySet();
//         for(Map.Entry<String,String> entry:set1){
//             String key=entry.getKey();
//             String value=entry.getValue();
//             System.out.println(key+"---->"+value);
//         }
//         set.stream().forEach(n->{
//            System.out.println(n);
//        });
    }
}
