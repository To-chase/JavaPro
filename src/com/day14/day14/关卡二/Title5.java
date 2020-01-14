package com.day14.day14.关卡二;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Title5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer> map=new HashMap<>();
        while(true){
            System.out.println("请输入一个字符串(输入-1结束程序):");
            String str=sc.nextLine();
            if(!str.equals("-1")){
                map=countingKey(map,str);
                Set<Character> set=map.keySet();
                System.out.println("集合的key----->value");
                for(Character ch:set){
                    System.out.println(ch+"------>"+map.get(ch));
                }
            }else{
                break;
            }

        }
//        String str=sc.nextLine();
//        map=countingKey(map,str);
//        Set<Character> set=map.keySet();
//        for(Character ch:set){
//            System.out.println(ch+"------>"+map.get(ch));
//        }
    }

    public static HashMap<Character,Integer> countingKey(HashMap<Character,Integer> map,String str){
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            char ch1=ch[i];
            if(!map.containsKey(ch1)){
                map.put(ch1,1);
            }else{
                int count=map.get(ch1)+1;
                map.put(ch1,count);
            }
        }
        return map;
    }
}
