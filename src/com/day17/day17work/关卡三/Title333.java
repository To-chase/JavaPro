package com.day17.day17work.关卡三;

import java.io.File;
import java.util.*;

public class Title333 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个文件路径");
        String path=sc.next();
        File file=new File(path);
        HashMap<String,Integer> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        list=get(list,file);
        System.out.println(list);
        for(String s:list){
            if(map.get(s)==null){
                map.put(s,1);
            }else{
                int count=map.get(s);
                map.put(s,++count);
            }
        }
        Set<String> set=map.keySet();
        for(String s:set){
            System.out.println(s+"---->"+map.get(s));
        }
    }

    public static  List<String> get(List<String> list,File file){

        File[] files=file.listFiles();

        if(files!=null){
            for(File f:files){
                if(f.isFile()){
                    String name=f.getName();
                    String str=name.substring(name.lastIndexOf(".")+1);
                    list.add(str);
                }else{
                    get(list,f);
                }
            }
        }
        return list;
    }
}
