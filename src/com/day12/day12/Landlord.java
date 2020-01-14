package com.day12.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Landlord {
    public static void main(String[] args) {
        //第一步 获取54张牌
        //第二部  打乱并发牌
        //第三步 留三张底牌
        List<String> cardList = new ArrayList<>();
        List<String> colorList = new ArrayList<>();
        List<String> numberList = new ArrayList<>();

        for (int i = 2; i <= 10; i++) {
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

        for (String str:colorList) {
            for (String number:numberList) {
                cardList.add(str + number);
            }
        }
        cardList.add("大王");
        cardList.add("小王");
        Collections.shuffle(cardList);
//        System.out.println(cardList);
        //发牌
        List<String> play1 = new ArrayList<>();
        List<String> play2 = new ArrayList<>();
        List<String> play3 = new ArrayList<>();
        List<String> diPai = new ArrayList<>();
        int count=0;
        int index=0;
        for(int i=0;i<cardList.size()-3;i++){
            if(cardList.get(i).equals("大王")){
                count+=1;
                index+=i;
            }
        }
        System.out.println(index);
        if (count>0){
            for (int i = 0; i < cardList.size(); i++) {
                if (i < cardList.size() - 3) {
                    if (i % 3 == 0) {
                        play1.add(cardList.get(i));
                    } else if (i % 3 == 1) {
                        play2.add(cardList.get(i));
                    } else if (i % 3 == 2) {
                        play3.add(cardList.get(i));
                    }
                } else {
                    diPai.add(cardList.get(i));
                }
            }
        }


            if(index<=17){
                for(String str:diPai){
                    play1.add(str);
                }
            }else if(index>17&&index<=34){
                for(String str:diPai){
                    play2.add(str);
                }
            }else{
                for(String str:diPai){
                    play3.add(str);
                }
            }

//        for (int i = 0; i < cardList.size(); i++) {
//            if (i < cardList.size() - 3) {
//                if (i % 3 == 0) {
//                    play1.add(cardList.get(i));
//                } else if (i % 3 == 1) {
//                    play2.add(cardList.get(i));
//                } else if (i % 3 == 2) {
//                    play3.add(cardList.get(i));
//                }
//            } else {
//                diPai.add(cardList.get(i));
//            }
//        }
//        int count;
//        for (String player1:play1){
//            if(player1.equals("大王")){
//
//            }
//        }
//        for (String player2:play2){
//
//        }
//        for (String player3:play3){
//
//        }

        System.out.println("play1:" + play1);
        System.out.println("play2" + play2);
        System.out.println("play3" + play3);
        System.out.println("底牌:" + diPai);
    }
}
