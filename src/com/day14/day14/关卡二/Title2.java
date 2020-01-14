package com.day14.day14.关卡二;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Title2 {
    public static void main(String[] args) {
        Map<String,Double> map=new HashMap<>();
        //柳岩=2100, 张亮=1700, 诸葛亮=1800, 灭绝师太=2600, 东方不败 =3800
        map.put("柳岩",2100d);
        map.put("张亮",1700d);
        map.put("灭绝师太",2600d);
        map.put("东方不败",3800d);

        Double money= map.get("柳岩")+300;
        map.put("柳岩",money);
        Set<String> set=map.keySet();
        for(String str:set){
            System.out.println(str+"--->"+map.get(str));
        }
    }
}
