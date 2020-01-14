package com.day14.day14.关卡二;

import java.util.*;

public class Title8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
        Random random=new Random();
        while(map.size()<5){
            System.out.println("请输入姓名:");
            String name=sc.next();

            Integer score=random.nextInt(101);
            map.put(name,score);
            System.out.println(score);
        }
        Set<String> names=map.keySet();
        Iterator<String> it=names.iterator();
        String key=it.next();
        Integer max=map.get(key);
        Integer min=map.get(key);
        Integer sum=0;
        for(String str:names){
            if(max<map.get(str)){
                max=map.get(str);
            }
            if(min>map.get(str)){
                min=map.get(str);
            }
            sum+=map.get(str);
        }
        System.out.println("最高分"+max);
        System.out.println("最低分"+min);
        System.out.println("总分"+sum);
        System.out.println("平均分"+(sum/map.size()));
    }
}
