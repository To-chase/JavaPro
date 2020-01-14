package com.day14.day14.关卡二;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Title3 {
    public static void main(String[] args) {
        //1. 将map集合中的所有信息显示到控制台上
        //{1="张三丰",2="周芷若",3="汪峰",4="灭绝师太"}
        // 2. 向该map集合中插入一个编码为5姓名为李晓红的信息
        //3. 移除该map中的编号为1的信息
        // 4. 将map集合中编号为2的姓名信息修改为"周林

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"张三丰");
        map.put(2,"周芷若");
        map.put(3,"汪峰");
        map.put(4,"灭绝师太");
        Set<Integer> set=map.keySet();
        for(Integer num:set){
            System.out.println(num+"---->"+map.get(num));
        }
        System.out.println("===============================");
        map.put(5,"李晓红");

        map.remove(1);
        map.put(2,"周林");
//        Set<Integer> set=map.keySet();
        for(Integer num:set){
            System.out.println(num+"---->"+map.get(num));
        }

    }
}
