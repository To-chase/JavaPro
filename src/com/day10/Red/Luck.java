package com.day10.Red;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Luck implements OpenMoney {
    @Override
    public List<Integer> faHongbao(Integer money, Integer count) {
        List<Integer> list=new ArrayList<>();
        int sum=0;
        for(int i=0;i<count-1;i++){
            Random random=new Random();

            int leftMoney=random.nextInt(money/count*2)+1;
            money-=leftMoney;
//            System.out.println("count--->:"+count);
//            System.out.println("money>>>>:"+money);
            list.add(leftMoney);
             sum+=leftMoney;
//            System.out.println((i+1)+"运气红包:"+leftMoney);
            count--;
        }
        System.out.println("sum"+sum);
        list.add(money);
        return list;
    }
}
