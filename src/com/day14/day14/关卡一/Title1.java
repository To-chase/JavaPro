package com.day14.day14.关卡一;

import java.util.HashMap;
import java.util.Map;

public class Title1 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("西游记","师徒四人");
        map.put("水浒传","一百零八汉");
        map.put("西游记","九九八十一难");
        System.out.println(map.get("西游记"));
        System.out.println(map.remove("水浒传"));
    }
}
