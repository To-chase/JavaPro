package com.day14.day14.关卡一;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Title6 {
    public static void main(String[] args) {
        Map<String,Student> map=new HashMap<>();
        map.put("上海",new Student("amy",14));
        map.put("广州",new Student("amy1",15));
        map.put("北京",new Student("amy2",18));

        Set<String> set=map.keySet();
        Set<Map.Entry<String,Student>> set1=map.entrySet();

        for(String str:set){
            Student student=map.get(str);
            System.out.println(str+"--->"+student);
        }

        Iterator<Map.Entry<String,Student>> it=set1.iterator();
        while(it.hasNext()){
            Map.Entry<String,Student> entry=it.next();
            System.out.println(entry.getKey()+">>>"+entry.getValue());
        }

    }
}
