package com.day14.day14.关卡三;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Title1 {
    public static void main(String[] args) {
        HashMap<String,String> class1=new HashMap<>();
        HashMap<String,String> class2=new HashMap<>();
        class1.put("001","李晨");
        class1.put("002","范冰冰");
        class2.put("001","马云");
        class2.put("002","马化腾");
        HashMap<String,HashMap<String,String>> map=new HashMap<>();
        map.put("Java基础班",class1);
        map.put("Java就业班",class2);
        Set<String> key= map.keySet();
        for(String str:key){
            System.out.println("班级名称:"+str+",学生信息:"+map.get(str));
        }
        System.out.println("--------------------------------------------");
        Set<Map.Entry<String,HashMap<String,String>>> kvs=map.entrySet();
        Iterator<Map.Entry<String,HashMap<String,String>>> it=kvs.iterator();
        while(it.hasNext()){
            Map.Entry<String,HashMap<String,String>> entry=it.next();
            System.out.println("班级名称:"+entry.getKey()+",学生信息:"+entry.getValue());
        }
    }
}
