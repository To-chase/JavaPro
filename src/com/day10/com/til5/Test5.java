package com.day10.com.til5;

public class Test5 {
    public static void main(String[] args) {
      Player player=new Player();
      String str="武力角色";
    FightAble f=  player.select(str);
        System.out.println("选择:"+str);
     f.commonFight();;
     f.specialFight();
      System.out.println("========================");
      String str1="法力角色";
     FightAble f1= player.select(str1);
        System.out.println("选择:"+str1);
     f1.commonFight();
     f1.specialFight();
    }
}
