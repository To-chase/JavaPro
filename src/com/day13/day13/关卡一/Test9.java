package com.day13.day13.关卡一;

import java.util.ArrayList;
import java.util.Collections;

public class Test9 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Collections.addAll(arr,11,77,88,44,99);
        System.out.println("原集合:"+arr);
        Collections.sort(arr);
        System.out.println("排序后:"+arr);
        Collections.shuffle(arr);
        System.out.println("打乱后:"+arr);
        Collections.reverse(arr);
        System.out.print("反转后:");
        for (Integer n:arr){
            System.out.print(n+" ");
        }
    }
}
