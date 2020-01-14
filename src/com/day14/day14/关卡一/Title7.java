package com.day14.day14.关卡一;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Title7 {
    public static void main(String[] args) {
        Map<Student,String> map=new HashMap<>();
        map.put(new Student("amy",14),"上海");
        map.put(new Student("amy1",15),"广州");
        map.put(new Student("amy2",18),"北京");
        map.put(new Student("amy2",18),"北京");

        Set<Student> set=map.keySet();
        Set<Map.Entry<Student,String>> set1=map.entrySet();
        for(Student student:set){
            System.out.println(student+">>>"+map.get(student));
        }
        Iterator<Map.Entry<Student,String>> it=set1.iterator();
        while(it.hasNext()){
            Map.Entry<Student,String> entry=it.next();
            System.out.println(entry.getKey()+"---->"+entry.getValue());
        }

    }
}
