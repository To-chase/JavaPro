package com.day10.Red;

import java.util.ArrayList;
import java.util.List;

public class Common implements OpenMoney {
    @Override
    public List<Integer> faHongbao(Integer money, Integer count) {
        List<Integer> list=new ArrayList<>();
        int leftMoney=money/count;
        for(int i=0;i<count-1;i++){
            list.add(leftMoney);
            money-=leftMoney;
        }
        list.add(money);
        return list;
    }
}
