package com.day14.day14.关卡二;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Title7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一句英语(用空格间隔单词):");
        String str=sc.nextLine();
        HashMap<String,Integer> map=new HashMap<>();
        map=containsStr(map,str);
        Set<String> set=map.keySet();
        for(String strs:set){
            System.out.println("字符串:"+strs+"出现了"+map.get(strs));
        }
//        set.stream().forEach(n->{
//            System.out.println("字符串:"+n+"出现了"+map.get(n));
//        });
        //If you wantto change your fate I think you must come to the dark horse to learnjava
    }

    public static HashMap<String,Integer> containsStr(HashMap<String,Integer> map,String str){
        String[] strs=str.split(" ");
        System.out.println(strs.length);
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            if(!map.containsKey(s)){
                map.put(s,1);
            }else{
                Integer count=map.get(s);
                map.put(s,++count);
            }
        }
        return map;
    }
}
