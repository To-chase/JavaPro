package com.day13.day13.关卡二;

import java.util.Iterator;
import java.util.LinkedList;

public class Title3 {
    public static void main(String[] args) {
        String[] str = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> list=new LinkedList<>();
        list.add(str[0]);

//        System.out.println(list.get(0));
        for(int i=0;i<str.length;i++){
            int index=0;
            for (String str1:list){
                if(str[i]==str1){
                    index++;
                }
            }
            if(index==0){
                list.add(str[i]);
            }
        }

//        list.stream().forEach(n->{
//            System.out.println(n);
//        });
        for(String strs:list){
            System.out.println(strs);
        }

        System.out.println("------------------------");
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
