package com.day14.day14.关卡二;

import java.util.*;

public class Title10 {
    public static void main(String[] args) {
        //[黑龙江省,浙江省,江西省,广东省,福建省],第二个数组为:[哈尔滨,杭州,南昌,广州,福州]
        ArrayList<String> arr1=new ArrayList<>();
        ArrayList<String> arr2=new ArrayList<>();
        Collections.addAll(arr1,"黑龙江省","浙江省","江西省","广东省","福建省");
        Collections.addAll(arr2,"哈尔滨","杭州","南昌","广州","福州");
        Map<String,String> map=new HashMap<>();
        for(int i=0;i<arr1.size();i++){
            map.put(arr1.get(i),arr2.get(i));
        }
        Set<String> keys=map.keySet();
        for(String str:keys){
            System.out.println("省:"+str+",省会城市:"+map.get(str));
        }
    }
}
