package com.day12.Test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        //第一步 获取54张牌
        //第二部  打乱并发牌
        //第三步 留三张底牌
        List<String> cardList=new ArrayList<>();
        List<String> colorList=new ArrayList<>();
        List<String> numberList=new ArrayList<>();

        for (int i = 2; i <=10 ; i++) {
            numberList.add(String.valueOf(i));
        }
        numberList.add("A");
        numberList.add("J");
        numberList.add("Q");
        numberList.add("K");

        colorList.add("♠");
        colorList.add("♥");
        colorList.add("♣");
        colorList.add("♦");

        for (int i = 0; i <colorList.size() ; i++) {
            for (int j = 0; j <numberList.size() ; j++) {
                cardList.add(colorList.get(i)+numberList.get(j));
            }
        }
        cardList.add("大王");
        cardList.add("小王");
        Collections.shuffle(cardList);
//        System.out.println(cardList);
        //发牌
        List<String> play1=new ArrayList<>();
        List<String> play2=new ArrayList<>();
        List<String> play3=new ArrayList<>();
        List<String> diPai=new ArrayList<>();
        for (int i = 0; i <cardList.size() ; i++) {
            if(i<cardList.size()-3){
            if(i%3==0){
                play1.add(cardList.get(i));
            }else if(i%3==1){
                play2.add(cardList.get(i));
            }else if(i%3==2){
                play3.add(cardList.get(i));
            }
              }else{
                diPai.add(cardList.get(i));
            }
        }

        System.out.println("play1:"+play1);
        System.out.println("play2"+play2);
        System.out.println("play3"+play3);
        System.out.println("底牌:"+diPai);
    }
}
