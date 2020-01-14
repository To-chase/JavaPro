package com.day07;

import java.util.ArrayList;
public class til9 {
    public static void main(String[] args) {
        String str1="bcd";
        String str2="bcddf";
        String str3="你好啊";
        String str4="我来啦你干嘛";
        ArrayList<String> list=new ArrayList();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);
        for(int i=0;i<list.size();i++){
            String str=list.get(i);
            if(str.length()>4){
               list.remove(i);
               i--;
            }
        }
        System.out.println(list.toString());
    }
}
