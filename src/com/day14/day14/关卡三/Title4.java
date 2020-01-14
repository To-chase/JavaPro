package com.day14.day14.关卡三;

import java.util.*;

public class Title4 {
    public static void main(String[] args) {
        HashMap<Integer, String> cardList = cardList();
        ArrayList<Integer> list = shuff(cardList);
//        System.out.println(list);
        HashMap<Integer, String> player1 = new HashMap<>();
        HashMap<Integer, String> player2 = new HashMap<>();
        HashMap<Integer, String> player3 = new HashMap<>();
        HashMap<Integer, String> diPai = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Integer index = list.get(i);
            String card = cardList().get(index);
            if (i < list.size() - 3) {
                if (i % 3 == 0) {
                    player1.put(index, card);
                } else if (i % 3 == 1) {
                    player2.put(index, card);
                } else if (i % 3 == 2) {
                    player3.put(index, card);
                }
            } else {
                diPai.put(index, card);
            }
        }
        System.out.print("玩家1:");
        print(sort(player1));
        System.out.print("玩家2:");
        print(sort(player2));
        System.out.print("玩家3:");
        print(sort(player3));
        System.out.print("底牌:");
        print(diPai);


    }

    //生成牌
    public static HashMap<Integer, String> cardList() {
        HashMap<Integer, String> cardList = new HashMap<>();
        List<String> colorList = new ArrayList<>();
        List<String> numberList = new ArrayList<>();
        numberList.add("2");
        numberList.add("A");
        numberList.add("k");
        numberList.add("Q");
        numberList.add("J");
        for (int i = 10; i > 2; i--) {
            numberList.add(String.valueOf(i));
        }
        colorList.add("♠");
        colorList.add("♥");
        colorList.add("♣");
        colorList.add("♦");
        int count = 1;
        cardList.put(count, "大王");
        cardList.put(++count, "小王");
        for (int i = 0; i < numberList.size(); i++) {
            for (int j = 0; j < colorList.size(); j++) {
                String card = colorList.get(j) + numberList.get(i);
                cardList.put(++count, card);
            }
        }
        return cardList;
    }

    //打乱牌
    public static ArrayList<Integer> shuff(HashMap<Integer, String> map) {
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> key = map.keySet();
        list.addAll(key);
        Collections.shuffle(list);
        return list;
    }

    //遍历牌
    public static void print(HashMap<Integer, String> map) {
        Set<Integer> key = map.keySet();
        for (Integer num : key) {
            System.out.print(map.get(num)+" ");
        }
        System.out.println();
    }
    //把玩家的牌排序  由大到小
    public static LinkedHashMap<Integer,String> sort(HashMap<Integer, String> play){
        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        Set<Integer> key=play.keySet();
        ArrayList<Integer> list=new ArrayList<>();
        for(Integer num:key){
            list.add(num);
        }
        Collections.sort(list);
        for(Integer number:list){
            String str=play.get(number);
            map.put(number,str);
        }
        return map;
    }
}
