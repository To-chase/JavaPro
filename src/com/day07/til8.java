package com.day07;

public class til8 {
    public static void main(String[] args) {
        String str="javajﬁewjavajﬁowfjavagkljjava";
        String ch="java";
//        System.out.println(str.indexOf("java"));
        System.out.println(getCount(str,ch));

    }

    public static int getCount(String str,String ch){
        int count=0;
        while(str.indexOf(ch)!=-1){
            str=str.substring(str.indexOf(ch)+4,str.length());
            count++;
        }
        return count;
    }
}
