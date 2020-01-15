package com.day17.day17work.关卡二;

import java.io.File;
import java.util.Scanner;

public class Title6 {
    public static void main(String[] args) {
        long s=0;
        Scanner sc=new Scanner(System.in);
        String path=sc.next();
        File file=new File(path);

        long sum=calculate(s,file);
        System.out.println(sum);
    }

    public static long calculate(long s,File file){
        File[] files=file.listFiles();

        for(File f:files){
            if(f.isFile()){
                s+=f.length();
            }else{
                calculate(s,f);
            }
        }
        return s;
    }
}
