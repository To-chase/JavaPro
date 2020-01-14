package com.day12.day12;

import java.util.Arrays;

public class Test11 {
    public static void main(String[] args) {
        String[] str={"a","b","2","4"};
        String s[]=swap(str,2,3);
        System.out.println(Arrays.toString(s));
        Integer[] num={1,4,5,6,7,8,9,0};
        Integer[] number=swap(num,3,5);
        System.out.println(Arrays.toString(number));
    }

    public static <E> E[] swap(E[] arr,int a,int b){
        E temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
        return  arr;
    }
}
