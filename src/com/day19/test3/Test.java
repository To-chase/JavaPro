package com.day19.test3;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        try {
            BufferedReader br=new BufferedReader(new FileReader("D:\\a.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt"));
            String line=null;
            while((line=br.readLine())!=null){
                String[] text=line.split("\\.");
                System.out.println(text[0].hashCode());
                System.out.println("3".hashCode());
//                Integer num=Integer.parseInt(text[0]);
//                System.out.println(num);
                map.put(text[0],text[1]);
            }

//            Set<String> set=map.keySet();

            for(int i=1;i<=map.size();i++){
                String key=String.valueOf(i);
                String value=map.get(key);
                String content=key+"."+value;
                bw.write(content);
                bw.newLine();
            }

            bw.close();
            br.close();

//            for(String s:set){
//                System.out.println(s+"-"+map.get(s));
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
