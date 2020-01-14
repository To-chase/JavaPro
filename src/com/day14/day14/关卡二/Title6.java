package com.day14.day14.关卡二;

import java.util.*;

public class Title6 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("aab");
        list.add("bbh");
        list.add("hhhjkl");
        HashMap<Character,Integer> map=new HashMap<>();
        map=containsChar(map,list);
        Set<Map.Entry<Character,Integer>> set=map.entrySet();
        Iterator<Map.Entry<Character,Integer>> it=set.iterator();
        while(it.hasNext()){
            Map.Entry<Character,Integer> entry=it.next();
            System.out.println("字符"+entry.getKey()+"出现"+entry.getValue()+"次");
        }
    }

    public static HashMap<Character,Integer> containsChar(HashMap<Character,Integer> map, List<String> list){
        for(String str:list){
            char[] ch=str.toCharArray();
            for(int i=0;i<ch.length;i++){
                char ch1=ch[i];
                if(!map.containsKey(ch1)){
                    map.put(ch1,1);
                }else{
                    int count=map.get(ch1);
                    map.put(ch1,++count);
                }
            }

        }
        return  map;
    }
}
