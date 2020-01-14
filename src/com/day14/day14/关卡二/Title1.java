package com.day14.day14.关卡二;

import java.util.*;

public class Title1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,String> map=new HashMap<>();
        while(map.size()<5){
            System.out.println("请输入姓名年龄(姓名,年龄):");
            String str=sc.next();
            String[] strs=get(str);
            map.put(strs[0],strs[1]);
        }

        Set<Map.Entry<String,String>> set=map.entrySet();
        Iterator<Map.Entry<String,String>> it=set.iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry=it.next();
            System.out.println(entry.getKey()+"----》"+entry.getValue());
        }
    }
    public static String[] get(String str){
        String strs[]=str.split(",");
        return strs;
    }
}
