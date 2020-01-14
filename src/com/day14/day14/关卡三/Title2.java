package com.day14.day14.关卡三;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Title2 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("及时雨","宋江");
        map.put("玉麒麟","卢俊义");
        map.put("智多星","吴用");
        map.remove("玉麒麟");
        map.put("入云龙","公孙胜");
        map.put("豹子头","林冲");
        map.remove("及时雨");
        map.put("呼保义","宋江");
        Set<String> set=map.keySet();
        for(String key:set){
            if(key.equals("智多星")){
                map.put("智多星",null);
            }
            System.out.println(key+"=="+map.get(key));
        }
    }
}
