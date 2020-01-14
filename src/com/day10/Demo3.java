package com.day10;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Demo3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abcd", "bc", "abcd", "abcd","abcd", "jkl");
//        long count = strings.stream().filter(string -> string.equals("abcd")).count();
//        System.out.println(count);
//        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//        Random random = new Random();
//        random.ints().limit(10).forEach(System.out::println);
        long c=strings.stream().filter(String->String.equals("abcd")).count();
        System.out.println(c);
        //ilter 方法用于通过设置的条件过滤出元素。
        List<Integer> list=Arrays.asList(1,8,9,9,9);
//        long c1=list.stream().filter(Integer->Integer==9).count();
//        System.out.println(c1);

//        list.stream().limit(2).forEach(System.out::println);
        list.stream().sorted((a,b)->{
            return b-a;
        }).forEach(System.out::println);
        //
    }
}
