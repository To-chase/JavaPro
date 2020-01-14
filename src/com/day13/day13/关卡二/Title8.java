package com.day13.day13.关卡二;

import java.util.HashSet;
import java.util.Scanner;

public class Title8 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while (true) {
            System.out.println("请输入一个数字(-1结束):");
            int num = sc.nextInt();
            if(num!=-1){
                set.add(num);
            }else{
                for(Integer nums:set){
                    sum+=nums;
                }
                break;
            }
        }

        System.out.println("总数:"+sum);
        System.out.println(set.size());
        System.out.println("平均数:"+(sum/set.size()));

    }
}
