package com.day14.day14.关卡三;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Title3 {
    public static void main(String[] args){
        HashMap<String,String> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        map.put("12345678","西瓜");
        map.put("12345679","香蕉");
        map.put("12345670","苹果");
        map.put("12345687","橘子");
        while(true){
            System.out.println("请输入商品号(输-1结束):");
            String str=sc.next();
            if(!str.equals("-1")){
                if(map.containsKey(str)){
                    System.out.println("根据商品号："+str+",查询到对应的商品为："+map.get(str));
                }else{
                    System.out.println("查无商品");
                }
            }else{
                break;
            }

        }
    }
}
