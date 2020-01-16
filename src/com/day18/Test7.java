package com.day18;

public class Test7 {
    public static void main(String[] args) {
//        D:\ccc\aaa.java
//        D:\ccc\ddd.java
//        D:\ccc\dddd\ddd.java
        String path="D:\\ccc\\dddd\\ddd.java";
        String[] str=path.split("\\\\");
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}
