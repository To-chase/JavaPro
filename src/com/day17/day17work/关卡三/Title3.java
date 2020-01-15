package com.day17.day17work.关卡三;

import java.io.File;
import java.util.*;

public class Title3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个文件路径");
        String path=sc.next();
        File file=new File(path);
        HashMap<String,Integer> map=new HashMap<>();
        map=get(map,file);

        Set<String> set=map.keySet();
        for(String s:set){
            System.out.println(s+"---->"+map.get(s));
        }
    }

    public static  HashMap<String,Integer> get(HashMap<String,Integer> map,File file){

        File[] files=file.listFiles();
//        HashMap<String,Integer> map=new HashMap<>();
        if(files!=null){
            for(File f:files){
                if(f.isFile()){
                    String name=f.getName();
                    String str=name.substring(name.lastIndexOf(".")+1);
                    if(!map.containsKey(str)){
                        map.put(str,1);
                    }else{
                        int count=map.get(str)+1;
                        map.put(str,count);
                    }
                }else{
                    get(map,f);
                }
            }
        }
        return map;
    }
}
