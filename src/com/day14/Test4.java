package com.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str=sc.next();
        Map<Character,Integer> map=get(str);
        Set<Character> set=map.keySet();
        Set<Map.Entry<Character,Integer>> set1=map.entrySet();
        for(Map.Entry<Character,Integer> m:set1){
            System.out.println("字符"+m.getKey()+"出现"+m.getValue()+"次");
        }
    }

    public static Map<Character,Integer> get(String str){

        Map<Character,Integer> map=new HashMap<>();
        char[] ch=str.toCharArray();
        System.out.println("-->"+ch.length);
        for(int i=0;i<ch.length;i++){
            char ch1=ch[i];
            if(!map.containsKey(ch1)){
                map.put(ch1,1);
            }else{
                Integer count=map.get(ch1);
                map.put(ch1,++count);
                 //后++：先赋值后加
                // 加++:先加后赋值
            }
        }

        return map;
    }
}
