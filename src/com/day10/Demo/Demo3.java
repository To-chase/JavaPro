package com.day10.Demo;


import java.util.Arrays;
import java.util.Comparator;

public class Demo3 {
    public static void main(String[] args) {
        Integer[] arr={1,3,5,7,9,-9};
//        Arrays.sort(arr);
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
        Arrays.sort(arr,(a,b)->{
            return b-a;
        });
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}
