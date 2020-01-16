package com.day19.day19;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Title4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        while (true){
            System.out.println("请输入要录入的验证码(三个):");
            String str=sc.next();
            list.add(str);
            if(list.size()>=3){
                break;
            }
        }
        //输出流
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("data.txt"));
            for(String s:list){
                char[] ch=s.toCharArray();
                bw.write(ch,0,ch.length);
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("请输入验证码:");
        String strs=sc.next();
        try {
            BufferedReader br=new BufferedReader(new FileReader("data.txt"));
            String line=null;
            int count=0;
            while((line=br.readLine())!=null){
                if(line.equals(strs)){
                    System.out.println("验证成功");
                }else{
                    count++;
                }
            }
            if(count==3){
                System.out.println("验证失败");
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
